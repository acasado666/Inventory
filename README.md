# INVENTORY


## About

This is an example project that illustrates creating a RESTful API in Spring Boot.
Clone project locally and run maven project.

#### Technologies used:

- Spring Boot
- Spring REST

#### Miscellaneus:
 
- Swagger Doc.
- Validation
- Integration Testing (SpringBootTest)

    
### HAL Browser
HAL, is a simple format that gives a consistent and easy way to hyperlink between resources in our API. 
Including HAL within our REST API makes it much more explorable to users as well as being essentially self-documenting.
This mvn dependency generates a javascript-html page on the fly.

    http://localhost:8080/browser/index.html#/


### Health Check (Actuator)
In essence, Actuator brings production-ready features to our application.

Monitoring our app, gathering metrics, understanding traffic or the state of our database becomes trivial with this dependency.

The main benefit of this library is that we can get production grade tools without having to actually implement these features ourselves.

Checks and monitor Controllers at different levels.

    http://localhost:8080/actuator


