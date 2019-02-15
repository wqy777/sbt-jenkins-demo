pipeline {
  agent any

  tools {
    jdk '8'
  }

  stages {
    stage('clean') {
      steps {
        sh 'sbt clean'
      }
    }

    stage('test') {
      steps {
        sh 'sbt test'
      }
    }
  }

  post {
    always {
      junit testResults: 'target/test-reports/*.xml'
    }
  }
}