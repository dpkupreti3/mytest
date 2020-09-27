pipeline{
	agent any
	stages {
		stage('Compile stg'){
			steps{
				withMaven(maven : 'maven-3_6_3'){
				sh 'mvn clean compile'
				}
			}
		}
		
		stage('Testing stg'){
            steps{
                withMaven(maven : 'maven-3_6_3'){
                sh 'mvn test'
                }
            }
        }
        
        stage('Deploy stg'){
            steps{
                withMaven(maven : 'maven-3_6_3'){
                sh 'mvn deploy'
                }
            }
        }
	}
}
				
			