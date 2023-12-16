pipeline {
    agent any

    tools {
        // Specify the Node.js tool configured in Jenkins
        nodejs 'NodeJS'
    }

    stages {
        stage('Install Dependencies') {
            steps {
                sh 'npm install -g playwright'
                sh 'npx playwright install-deps'
            }
        }

        stage('Run Tests') {
            steps {
                sh 'npm install'
                sh 'npm run testCase'
            }
        }
    }
}