# RESTful Spring with JWT

##About
An example of using **JWT (JSON Web Token)** with **Spring Security** and
**Spring Boot**.
 
 
##Requirements
Built with with Maven 3 and Java 1.8.
 

##Spring Security basics :
### 1. add dependency : spring-boot-starter-security.
       entire app is protected via basic auth. The username is **user and the password is a string randomly generated when app starts.
        It will say something like
        Using default security password: 740954d0-4b93-49f8-a9e1-eb296ab74ab7
        curl -u user:740954d0-4b93-49f8-a9e1-eb296ab74ab7 http://localhost:8080/persons
##Inspired by  
Re-jigging
https://github.com/szerhusenBC/jwt-spring-security-demo

INTEGRATING SPRING SECURITY WITH SPRING BOOT WEB:
https://justinrodenbostel.com/2014/05/30/part-5-integrating-spring-security-with-spring-boot-web/

### Setup and preload database for spring integration/functional tests:
https://www.leveluplunch.com/java/tutorials/022-preload-database-execute-sql-spring-testing/

## For Banner text :
http://patorjk.com/software/taag/#p=display&f=Graffiti&t=Chatty