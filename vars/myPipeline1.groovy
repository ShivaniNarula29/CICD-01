// vars/myPipeline.groovy

def call() {
    pipeline {
        agent any

        stages {
            stage('Checkout') {
                steps {
                    echo "Checking out the repository..."
                    checkoutRepo('https://github.com/ShivaniNarula29/CICD-01.git', 'main')
                }
            }

            stage('Compile') {
                steps {
                    echo "Compiling code..."
                    compileStage()
                    // Add your compile steps here (e.g., mvn clean install or javac)
                }
            }

            stage('Checkstyle') {
                steps {
                    echo "Running checkstyle..."
                    // Add your checkstyle steps here (e.g., mvn checkstyle:check)
                }
            }

            stage('Build') {
                steps {
                    echo "Building the application..."
                    // Add your build steps here (e.g., mvn package)
                }
            }
        }
    }
}
