pipeline {
    agent any
    
    environment {
        NODE_VERSION = '14'
    }

    stages {
        stage('Install Dependencies') {
            steps {
                script {
                    // Update NVM installation script
                    // sh 'curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.38.0/install.sh | bash'
                    sh 'export MYHOME=/home/JankinsVm'
                    // Source the NVM script explicitly
                    // sh 'export NVM_DIR="$MYHOME/.nvm"'
                    // sh '[ -s "$NVM_DIR/nvm.sh" ] && source "$NVM_DIR/nvm.sh"'

                    // Verify environment variables
                    sh 'env'

                    // Install Node.js and Playwright dependencies
                    // sh "nvm install ${NODE_VERSION}"
                    // sh "nvm use ${NODE_VERSION}"
                    // sh 'export PATH="$PATH:/home/JankinsVm/.nvm/versions/node/v14.21.3/bin/"'
                    // sh '/home/JankinsVm/.nvm/versions/node/v14.21.3/bin/npm install'
                    // sh '/home/JankinsVm/.nvm/versions/node/v14.21.3/bin/npx playwright install'
                }
            }
        }

        stage('Run Playwright Tests') {
            steps {
                script {
                    sh 'echo $MYHOME'

                    // Source nvm.sh directly
                    // sh 'export NVM_DIR="$MYHOME/.nvm" && [ -s "$NVM_DIR/nvm.sh" ] && source "$NVM_DIR/nvm.sh"'

                    // Run Playwright tests
                    sh '/home/JankinsVm/.nvm/versions/node/v14.21.3/bin/npx playwright test --project=chromium'
                }
            }
        }
    }
}
