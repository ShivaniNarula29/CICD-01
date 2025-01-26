def call() {
    stage('Code Compilation') {
        steps {
            sh 'mvn clean compile'  // Run Maven compile command
        }
    }
}
