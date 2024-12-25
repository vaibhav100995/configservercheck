# configservercheck
Repository related to config server code in spring boot

Below are the steps to create a Sprint cloud config server project
1. Create a Spring boot project
2. In build.gradle add 'org.springframework.cloud:spring-cloud-config-server' dependency
3. In Main class add @EnableConfigServer annotation
4. In application.properties file add 'spring.cloud.config.server.git.uri' key and provide github url from where you want to read config properties



Steps to create a yml/properties file where we need to maintain data:
1. Create a folder or repository
2. In that repository/folder create a yml file
3. That repository url we need to provide in our cloud config server project(above at step 4)
