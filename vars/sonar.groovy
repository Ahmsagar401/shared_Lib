def call() {
       // Your SonarQube scan steps go here
      // sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://18.206.244.145:9000 -Dsonar.java.binaries=target/classes'
         sh 'mvn sonar:sonar -Dsonar.projectKey=sonar -Dsonar.host.url=http://18.206.244.145:9000 -Dsonar=sonar.exclusions*/.java'
   }
return this
