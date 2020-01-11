node('worker_node1') {
stage('Source') {
 withMaven(maven:'Maven_3_6_3', mavenLocalRepo: '.repository') {
      sh 'mvn clean install'
  }
  }
}