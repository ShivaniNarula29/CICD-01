def call() {
    stage('Code Checkstyle') {
        steps {
            sh 'mvn checkstyle:checkstyle'  // Run Maven checkstyle check
        }
    }
}
