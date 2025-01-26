def call() {
    pipeline {
        agent any
        
        stages {
          stage('Code Checkout') {
            steps {
                script {
                    // Call the checkoutRepo function with repository URL and branch
                   checkoutRepo('https://github.com/ShivaniNarula29/CICD-01.git', 'main')   // Checkout code using the function from checkoutStage.groovy
                }
            }
          }
          
      }
    }
}
