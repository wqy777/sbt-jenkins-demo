pipeline {
  agent {
        docker { image ' hseeberger/scala-sbt:8u222_1.2.8_2.12.8' }
    }

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
