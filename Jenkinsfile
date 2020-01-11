pipeline {
    agent any
        stages {
            stage('Mvn Compile') {
                withMaven(maven:'Maven_3_6_3') {
                    sh 'mvn clean test'
                }
            }
        }
    post {
        always{cleanWs ()
        }
}