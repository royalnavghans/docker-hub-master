pipeline {
    agent any
    tools{
        maven 'maven'
    }
    stages{
        stage('Build Maven'){
            steps{
               checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/royalnavghans/docker-hub-master']])
                bat 'mvn clean install'
            }
        }
          stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t royalnavghan/royal-integeration .'
                }
            }
        }
         stage('Push image to Hub'){
            steps{
                script{
                  withCredentials([string(credentialsId: 'royaldocker-pwd', variable: 'royaldockerpwd')])  {
                   bat 'docker login -u royalnavghan -p Vichu@1998'

}
                   bat 'docker push royalnavghan/royal-integeration'
                }
            }

                }
            }