pipeline {
    agent any

    environment {
        // Specify the NodeJS installation defined in Jenkins
        nodejsInstallation = 'NodeJS'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the code from your Git repository
                checkout scm
            }
        }

        stage('Install Dependencies') {
            steps {
                // Use NodeJS installation defined in Jenkins
                script {
                    def nodejsInstallation = tool 'NodeJS'
                    // Ensure that Node.js and npm are in the PATH
                    sh "export PATH=${nodejsInstallation}/bin:\$PATH && node --version && npm --version"
                    // Install dependencies
                    sh "export PATH=${nodejsInstallation}/bin:\$PATH && npm install"
                }
            }
        }

        stage('Run Tests') {
            steps {
                // Use NodeJS installation defined in Jenkins
                script {
                    def playwrightInstallation = tool 'NodeJS'
                    sh "export PATH=${playwrightInstallation}/bin:\$PATH && npx playwright test"
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Add deployment steps here if needed...'
                // Example: Deploy to a hosting platform
                // sh 'npm run deploy'
            }
        }
    }

    post {
        always {
            // Clean up any resources, notify, etc.
            echo 'Pipeline completed.'
        }
    }
}
