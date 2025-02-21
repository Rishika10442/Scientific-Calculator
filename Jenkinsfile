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
          stage('Send Test Email') {
                    steps {
                        script {
                           emailext (
                                                  subject: "Jenkins Test Email",
                                                  body: "This is a test email from Jenkins pipeline.",
                                                  to: "Rishika.Gupta@iiitb.ac.in",
                                                  from: "10442rishika@gmail.com,
                                                  mimeType: 'text/plain',
                                                  attachLog: true,
                                                  recipientProviders: [[$class: 'DevelopersRecipientProvider']],
                                                  debug: true
                                              )
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
//            emailext
//                     subject: "Build SUCCESS: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
//                     body: "Good news! The build passed successfully. Check Jenkins for details.",
//                     to: "Rishika.Gupta@iiitb.ac.in"
       }
       failure {
           echo 'Build or tests failed!'
//            emailext
//                     subject: "Build FAILED: ${env.JOB_NAME} #${env.BUILD_NUMBER}",
//                     body: "Oops! The build failed. Check the logs for details.",
//                     to: "Rishika.Gupta@iiitb.ac.in"
       }
   }


}
