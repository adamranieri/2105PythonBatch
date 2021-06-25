## Testing Pyramid
![Testing Pyramid](https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQO68xY4s_Hm3gQyHudhvem300aR8moKOCCwFAo222cp633Dk7XG03GMW0AgrwtneeRSbMcKdcyXjigJg&usqp=CAU)
- The majority of your tests should be unit tests.
    - Unit tests are small
    - Atomic pieces of functionality
    - Unit tests would pass before you expect integration tests to work
- Middle tier integration
    - Testing a service that uses an actual DAO
    - Multiple piceces of software must be working for it to work
- System/E2E
    - System and E2E tests are tests that require the application to work in order for the test to pass
    - Cucumber/selenium

## Testing Mindset
- What makes a good test? How do we cover an application?
- The more tested and testable you make code the more scalable your application is
- What makes good tests for a feature?
    - Positive tests
        - Correct inputs
    - Negative tests
        - incorrect inpts
    - Edge cases or extreme values
        - 0
        - no input i.e. empty string ""
        - name 500 characters long
    - Avoiding redundant test
        - A slighty different input is probably not going to change anything

- System Testing is often used synonomous with E2E testing.
    - Sometimes called UI testing in full stack applications

- Smoke Testing
    - A simple test done to see that the application is even in a state worth testing
    - Just see if a database connection is created
    - Does the front page load
## Quality
- Quality is a measurement of the functionality, efficiency and structure of an application
    - functionality
        - does it work?
    - Efficiency
        - Does it handle my user stories in timely manner without excessive resources.
    - Structure
        - Is it well tested?
        - Is the code scalable?
        - Good coding practices

- Quality Assurance
    - proactive philosphy an approach
    - Designing the application with quality gates and standards
        - Coding standards
            - All python methods must be type annotated
        - Testing standards
            - Every method must have 3 tests proving it works
        - Documention standards
            - All methods must have a Java Doc comment explaining how to use it
    - All code must be programmed to interfaces, all methods must have a positive and negative test and a senior must sign off an all code merges
- Quality Control
    - A reactive process
    - There are lot of bugs and they need to be stamped out
    - Shortcuts need to be revisted and edited

- Behvaior vs State Verification
    - Behavior
        - You got the correct response
        - As an end user it seemed to work correclty
    - State 
        - Checking the values in the program or database to see that it worked correctly
        - Maybe editing username only affected something temporary on the web page vs actually
        changing the value in the database

### Selenium and Cucumber in Java
- Selenium works very similar in Java as in Python
- Cucumber as the testing framework as opposed to behave
- Both use Gherkin feature files
- Features
    - Gherkin feature files
- Glue code (glue files)
    - Step Implementations
- Runners
    - Java classes that connect features to glue code
    - Often contain evironment setup
```java
@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "dev.ranieri.steps")
public class BasicRunner {
    }
```
# REST Constraints
- Something is RESTful if it follows these 6 constraints
1. Client Server architecture
    - You should not be sending back HTML which if custom fitted for a specific front end
    - Your application should be able to be hooked up to any front end
2. Stateless
    - There is no session management on the server
    - Nothing in memory keeping track of users
3. Cacheable
    - You can OPTIONALLY maintain database information on the server to increasese efficiency
    - If a certain record is being requested 100 a minute you CAN cache it in memory
4. Layered
    - RESTful web services can call other RESTful web services 
    - Not uncommon to have a server call another server then give back a response
5. Code on Demand (Optional)
    - You can send back executable code
6. Uniform Interface
    - URI's are used to get resources
    - Resources are respresented in a universal format (JSON, XML, Plain Text)
    - HTTP requests should be self sufficient
        - No two part requests
        - One request with the authentication info and login information
        - NOT two seperate requests
    - HATEOAS (Hypermedia As the Engine of the Application State)
        - You should send back links to related resources



