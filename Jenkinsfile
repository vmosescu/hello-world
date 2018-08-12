pipeline {
    agent any
    stages {
        stage("Unit test") {
            environment { 
                JAVA_HOME = '/docker-java-home' 
                M2_HOME = '/opt/maven'
            }
            steps {
                sh "/opt/maven/bin/mvn test"
            }
        }
    }
}