

## Spring WebFlux
        
        1. Uses Spring Web API      ( Servlet API )
        2. Non Blocking IO          ( Spring MVC is Blocking IO )
        3. Uses Netty as Web Server ( Spring MVC uses Tomcat )

## Configuring MongoDB

    https://hub.docker.com/r/bitnami/mongodb
    docker pull bitnami/mongodb
    docker run --name mongodb bitnami/mongodb:latest
    Set spring.mongodb.embedded.version=3.5.5 ( need to set this property )


    Stores data in BSON format ( Binary-Encoded, Flexible, JSON like format )

## Spring Rest EndPoints exposed for Angular Front End

        GET     -   /room/v1/reservation/{id}
        POST    -   /room/v1/reservation
        PUT     -   /room/v1/reservation/{id}{id}
        DELETE  -   /room/v1/reservation/{id}

    Returns Mono and Flux types instead of a ResponseEntity

## Cross Origin

    Need to have @CrossOrigin annotation added in Controller class to have
    Angular Front end and Spring Reactive to work together, as both are running in 
    different port


## Shortcuts

    command + option + l  - Formatting
    option + return - Import
    command + n - Generate getters and Setters