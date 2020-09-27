node {
   // This is to demo github action	
  // def sonarUrl = 'sonar.host.url=http://172.31.30.136:9000'
  // def mvn = tool (name: 'maven3', type: 'maven') + '/bin/mvn'
   stage('SCM Checkout'){
    // Clone repo
	bat 'git https://github.com/dpkupreti3/mytest'
   
   }
   
   
   stage('Mvn Package'){
	   // Build using maven
	bat 'mvn clean install'
   }
		
		
	
}
				
			
