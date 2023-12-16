pipeline {
    agent any
    tools {
        // Specify the Node.js tool configured in Jenkins
        nodejs 'NodeJS'
    }
    stages {
        stage('Install Dependencies') {
            steps {
                script {
                    sh '"npx" playwright install-deps'
                }
            }
        }

        stage('Run Tests') {
            steps {
                script {
                    // Install project dependencies
                    sh 'npm install'
                    
                    // Run Playwright tests
                    sh 'npm run testCase'
                }
            }
        }
    }
}
