
stage('Source') {
node {
 withMaven(maven:'Maven_3_6_3', mavenLocalRepo: '.repository') {
      sh 'mvn clean install'
  }
  }
}