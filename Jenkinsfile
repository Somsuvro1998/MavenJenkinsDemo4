pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Build'
            }
        }
           stage('Test') {
            steps {
                echo 'Test'
            }
        }
           stage('Deploy') {
            steps {
                echo 'Build'
            }
        }
        
    }
    post {
        always {
            emailext body: 'Please find the pipeline url ', subject: 'Pipeline Status', to: 'palz.somsuvro@gmail.com'
        }
    }
}
