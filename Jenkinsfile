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
        stage("Code coverage") {
            environment { 
                JAVA_HOME = '/docker-java-home' 
                M2_HOME = '/opt/maven'
            }
            steps {
			    publishHTML (target: [
					reportDir: 'target/site/jacoco',
					reportFiles: 'index.html',
					reportName: "JaCoCo Report"
				])
                sh "/opt/maven/bin/mvn org.jacoco:jacoco-maven-plugin:check@jacoco-check"
            }
        }
		stage("Package") {
			steps {
				sh "/opt/maven/bin/mvn package"
			}
		}
		stage("Docker build") {
			steps {
				sh "docker build -t calculator ."
			}
		}
    }
}