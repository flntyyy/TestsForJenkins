node('worker_node1') {
stage('Source') {
 withMaven(maven:'Maven_3_6_3') {
      sh 'mvn clean -Dtest=Tests test'
  }
  }
}