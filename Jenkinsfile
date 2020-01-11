node('worker_node1') {
    stage('Mvn Compile') {
        withMaven(maven:'Maven_3_6_3') {
            sh 'mvn clean test'
            }
        }

stage('CleanUp') {
        cleanWs ()
        }
}