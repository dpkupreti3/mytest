pipeline{
	agent any
	stages {
		stage('Compile stg'){
			steps{
				withMaven(maven : 'maven_3_6_3'){
				bat 'mvn clean compile'
				}
			}
		}
		
		stage('Testing stg'){
            steps{
                withMaven(maven : 'maven_3_6_3'){
                bat 'mvn test'
                }
            }
        }
        
        stage('Deploy stg'){
            steps{
                withMaven(maven : 'maven_3_6_3'){
                bat 'mvn deploy'
                }
            }
        }
	}
}
				
			
