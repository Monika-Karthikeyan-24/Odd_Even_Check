
pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build and Test') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Run Program') {
            steps {
                bat 'java -cp target/classes com.example.App'
            }
        }
    }

    post {
        success {
            echo 'Even-Odd project completed successfully!'
        }
        failure {
            echo 'Build or test failed!'
        }
    }
}
