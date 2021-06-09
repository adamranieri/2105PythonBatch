# BDD Behavior Driven Development
- When we build software we are building it for people.
    - End users do not know how it works.
    - End users are concerned with usablity, ease of use not tech specifications
- BDD (Behavior Driven Development)
    - design applications from the perspective of users.
    - Avoid over designing our applications
        - writing features no one really wanted
        - Really common problem (wastes time)
    - Focus on the most important features
    - Gauge and see usablity before writing the code
    - Gain insight into the purpose of the feautre
        - Understanding what a feature is for is important to good software
- Steps to BDD
    1. User Stories
        - featurettes, small features of the application 
        - written from the perspective of a type of user
    2. Write Acceptance Criteria
        - AC are the actual step by step instructions to fulfill a User story
            - We will be using cucumber syntax for our acceptance criteria
        - Usually accompanied with visuals like web page layouts
    3. Write automated tests to fulfuil these acceptance criteria
        - Use Selenium and cucumber to walk through the acceptance criteria
        - If the tests pass the Acceptance criteria then the feature is complete
- Gherkin 
    - language/syntax for writing acceptance criteria
    - NOT A PROGRAMMING LANGUAGE
    - Feature
        - A brief description of user story (general user story)/ feature
    - Scenario
        - A brief descripiton of a more specific user story
    - Scenario Outline
        - Like scenario except parameterized
    - Examples
        - a table of values for your Scenario Outline
    - Given
        - Some state of the application or user
        - Examples
            - Given the customer is on the menu page
            - Given the employee is logged in
    - When 
        - Some action performed by the user
        - has an action verb
        - Examples
            - When the customer clicks view all pizzas
            - When the employee clicks on sort by time
    - Then
        - Some confirmation that something has happened
        - has a "should"
        - Examples
            - Then a pop up with a list of speciality pizzas is hown
            - Then the employee is redirected the the order review page
    

## Cucumber
- Cucumber is a BDD framework
1. we write our BDD tests/acceptance criteria in feature files in the Gherkin syntax
2. we write step implementation for each acceptance criteria step
3. cucumber will run our acceptance critera and match them to the step implementations
4. we can execute our acceptance criteria
- Cucumber has no real link to selenium
    - You could write cucumber tests for any software application possible
        - You write the AC in Gherkin
        - The step implemenations are just Python code to execute
        - Theoretically you could write AC in Gherkin for a video game and the step implemenation is some really compliced bots set up to play the game
- Cucumber is peanut butter and Selenium is chocolate
    - They have no relation to each other BUT work extremely well together
    - You could use only Pytest and selenium to do front end testing
        - pytest lacks the nice features of cucumber
        - No auto generatting test tubs
        - No automatically ordering and reusing your code
        - No ability to naturally blend your human AC into step implementations
