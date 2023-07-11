pipeline {
    agent any
    tools{
        maven 'MAVEN_HOME'
        
    }
    stages{
        stage('Build Maven'){
            steps
            {
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/cbbloxxxindore/employeerepo']]])
                sh 'mvn clean install'
            }
        }
    }
}
