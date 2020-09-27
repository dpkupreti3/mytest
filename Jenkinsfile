pipeline{
	agent any
	stages {
		stage('Compile stg'){
			steps{
				withMaven(maven : 'maven_3_6_3'){
				bat 'mvn clean install'
				}
			}
		}
		
		
	}
}
				
			
