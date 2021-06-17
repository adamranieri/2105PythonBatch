# REST (REpresentational State Transfer)
- Type of Web Service
    - A service is not to be directly used by humans
    - Inputs and outputs are in machine friendly formats
        - JSON, XML, bytes
- What does Representational mean?
    - When you send or recive objects/resource from a REST service you ar sending representations of the object NOT the object iteself.
        - Sending JSON not Python objects or Java Object
- REST constraints are the 6 core features of an RESTful web service that must be applied to qualify as a *true* RESTful web service.
    - Uniform Interface
        - Standard convention for interacting with Web Service
            - URI is used to identify resources
            - HTTP verbs are used to perform specific actions
        - GET /restaraunts/90 => returns a single restaraunt with id of 90
    - Client - Server
        - A REST server is NOT a completed application. Does not send back html
        or is a completed software package for a human to use.
        - RESTful web service should not be explicty tied to another piece of software.
    - Stateless
        - RESTful web services DO NOT keep track of users using in memory sessions
    - Cacheable
        - Can cache information from the database into memory for optimization
    - Layered System
        - RESTful web services can call other RESTful web services
    - Code on Demand (Optional)
        - Send back executable code
- There is nothing explicitly tying JSON to RESTful services

## HTTP verbs in depth
- GET
    - Retrive infromation
    - Gets do not have a body
- PUT
    - replacement of an object
- POST
    - Create an object
- DELETE
    - delete an object
- PATCH
    - Some update/edit to an object

## Status Codes
- 100's
    - infomration 
    - 100 continue
- 200's
    - successes
    - 200 general success
    - 201 successfully created an object/resource
    - 204 success but there is no information to give back
- 300's
    - redirects
    - Not really seen in RESTful services that often
- 400's
    - client errors (http request is wrong)
    - 400 general bad request
    - 401 unauthorized
    - 403 forbidding
    - 404 not found
    - 405 method not permitted for this endpoint
    - 422 Unprocessable but syntacically correct
- 500's
    - server error
    - 500 internal server error








