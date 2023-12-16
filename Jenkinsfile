pipeline {
    agent any
    stages {
        stage('Install Dependencies') {
            steps {
                script {
                    // Install Playwright without global flag
                    sh 'npm install playwright'
                    
                    // Install browser dependencies
                    sh 'npx playwright install-deps'
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
