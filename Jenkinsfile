pipeline {
    agent any
    stages {
        stage('Mvn clean and test') {
            //tools {
            //    jdk "JDK8"}
            steps {
                withMaven(maven: 'Maven_3_6_3') {
                    sh 'mvn clean'
                }
                withMaven(maven: 'Maven_3_6_3') {
                    sh 'mvn test'
                }
            }
        }
    }
    post {
        always {
            cleanWs()
        }
    }
}