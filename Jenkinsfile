pipeline {
    agent any
    
    environment {
        NODE_VERSION = '14'
    }

    stages {
        

        stage('Install Dependencies') {
            steps {
                script {
                    // Install Node.js using nvm
                    sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash'
                    sh 'source ~/.nvm/nvm.sh'
                    sh "nvm install ${NODE_VERSION}"
                    sh "nvm use ${NODE_VERSION}"

                    // Install Playwright dependencies
                    sh 'npm install'
                    sh 'npx playwright install'
                }
            }
        }

        stage('Run Playwright Tests') {
            steps {
                script {
                    // Run Playwright tests
                    sh 'npx playwright test --project=chromium'
                }
            }
        }
    }
}
