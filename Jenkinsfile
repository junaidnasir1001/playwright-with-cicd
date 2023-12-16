pipeline {
    agent any
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