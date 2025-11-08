pipeline {
    agent any

    environment {
        JAVA_HOME = '/usr/lib/jvm/java-17-openjdk-amd64'
        PATH = "${JAVA_HOME}/bin:${env.PATH}"
    }

    tools {
        maven 'maven3'  // Match this to your Jenkins Maven tool name
        jdk 'jdk17'     // Match this to your Jenkins JDK tool name
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Cloning source code from GitHub...'
                git branch: 'main', url: 'git@github.com:srinivasedugutta/employee-management-webapp.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building the Maven project...'
                sh 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh 'mvn test'
            }
        }
        stage('Archive') {
            steps {
                echo 'Archiving build artifacts...'
                archiveArtifacts artifacts: 'target/*.war', fingerprint: true
            }
        }
    }
    post {
        success {
            echo 'Build succeeded and artifacts archived.'
        }
        failure {
            echo 'Build failed. Please check the console output.'
        }
    }
}
