pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                echo 'Checking out...'
                checkout([
                    $class: 'GitSCM', 
                    branches: [[name: '*/main']], 
                    doGenerateSubmoduleConfigurations: false, 
                    extensions: [], 
                    submoduleCfg: [], 
                    userRemoteConfigs: [[url: 'git@github.com:isabel-law/Jenkins.git']]
                ])
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
                sh '/Users/isabellaw/Desktop/apache-maven-3.9.6/bin/mvn clean install'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing...'
                sh '/Users/isabellaw/Desktop/apache-maven-3.9.6/bin/mvn test'
            }
        }
        stage('Results') {
            steps {
                echo 'Publishing results...'
                // Your results publishing steps go here
            }
        }
    }
}
