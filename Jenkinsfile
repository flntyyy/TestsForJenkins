pipeline {
    agent any
        stages {
            stage('Mvn Compile') {
                steps{
                    withMaven(maven:'Maven_3_6_3') {
                        sh 'mvn clean test'
                    }
                }
            }
        }
    post {
        always {
            cleanWs ()
        }
    }
}