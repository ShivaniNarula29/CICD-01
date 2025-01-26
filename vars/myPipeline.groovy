def call() {
    pipeline {
        agent any
        triggers {
            pollSCM('* * * * *')  // Polling SCM every minute for changes
        }
         
        stages {
          stage('Code Checkout') {
            steps {
                script {
                    // Call the checkoutRepo function with repository URL and branch
                   checkoutRepo('https://github.com/ShivaniNarula29/CICD-01.git', 'main')   // Checkout code using the function from checkoutStage.groovy
                }
            }
          }
          stage('other steps') {
            compileStage()    // Compile code using the function from compileStage.groovy
            checkstyleStage() // Run checkstyle using the function from checkstyleStage.groovy
            // buildStage()      // Build code using the function from buildStage.groovy
            // testStage()       // Run tests using the function from testStage.groovy
           }
      }
    }
}
