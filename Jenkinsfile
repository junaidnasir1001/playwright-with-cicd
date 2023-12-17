pipeline {
    agent any
    
    environment {
        NODE_VERSION = '14'
    }

    stages {
        

        // stage('Install Dependencies') {
        //     steps {
        //         script {
        //             // Install Node.js using nvm
        //             sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash'
        //             sh 'source ~/.nvm/nvm.sh'
        //             sh "nvm install ${NODE_VERSION}"
        //             sh "nvm use ${NODE_VERSION}"

        //             // Install Playwright dependencies
        //             sh 'npm install'
        //             sh 'npx playwright install'
        //         }
        //     }
        // }

        stage('Install Dependencies') {
            steps {
                script {
                    // Update NVM installation script
                    sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash'

                    // Append export lines to NVM script
                    sh 'echo \'export NVM_DIR="$HOME/.nvm"\' >> "$HOME/.nvm/nvm.sh"'
                    sh 'echo \'[ -s "$NVM_DIR/nvm.sh" ] && \. "$NVM_DIR/nvm.sh"\' >> "$HOME/.nvm/nvm.sh"'
                    
                    // Verify environment variables
                    sh 'env'
                }
            }
        }


        stage('Run Playwright Tests') {
            steps {
                script {
                    sh '. "$HOME/.nvm/nvm.sh"'
                    // Run Playwright tests
                    sh 'npx playwright test --project=chromium'
                }
            }
        }
    }
}
