pipeline {
    agent any

    environment {
        MAVEN_HOME = "/usr/share/maven"
    }

    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/Rishika10442/Scientific-Calculator.git'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'  // Captures test results
                }
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deployment step here (e.g., Copy JAR, run app, or use Ansible)'
            }
        }
    }

   post {
       success {
           echo 'Build and tests passed successfully!'
            mail to: 'Rishika.Gupta@iiitb.ac.in',
            subject: "SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
             body: "The build passed successfully!",

       }
       failure {
           echo 'Build or tests failed!'
            mail to: 'Rishika.Gupta@iiitb.ac.in',
                    subject: "Build FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
                    body: "Oops! The build failed. Check the logs for details.",

       }
   }


}
