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
                    sh "${nodejsInstallation}/bin/npm install"
                    // def playwrightInstallation = tool 'NodeJS'
                    // sh "${playwrightInstallation}/bin/npm install"
                    
                }
            }
        }

        stage('Run Tests') {
            steps {
                // Use NodeJS installation defined in Jenkins
                script {
                    def playwrightInstallation = tool 'NodeJS'
                    sh "${playwrightInstallation}/bin/npx playwright test"
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
