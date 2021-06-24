# Types of Testing

### Manual Testing
- Going through test cases by hand
    - A human being sits down at a computer and walks through the feature
    - Steve just mimics being a real user and sits down and clicks as a human
- pro
    - Takes no time to write a manual. Minimal setup
    - Some things can only be manually tested (was user experience good)
- Negatives
    - Takes a LONG time to execute
        - Selenium can automate your test cases and run though them way faster than a human
    - In the long run automated tests save time
    - Humans are prone to errors
    - Is more expensive (people are the most expensive part of software development)
    - Human beings have lives. You cannot run manual tests on Christmas or after work etc

### Automated Testing
- Using softare and testing frameworks to go through test cases
    - JUnit
    - Cucumber/behave
- pro
    - Automated can be run at any time
    - Much faster than manual tests
    - Machines don't make mistakes like humans
- negatives
    - Really hard to find people who know how to do automation
    - Not everything can be reasonably automated
        - User Experience
        - Some applications might not lend themselves to machine testing
            - Video game or photoshop
    - There is an intial time investment in setting up and writing automated tests

### Acceptance Testing (UAT User Acceptance Tesing)
- Human beings test an application friendliness/Usability
    - Is intuitive?
    - Is aestheticlly good to look at?
- Has to be done manually
- Alpha Testing
    - The developers of an application do UAT
- Beta Testing
    - Actual end users of the application test and use your application
    - Accountants try to use the application
    - As a developer you are probably not the target audience of the application
    - There tends to be a bias that what was designed is intuitive 

### Functional Testing
- Testing that a feature or a function works
    - You are concerned that given a certain input you get expected output
    - You do not care how long it takes or efficiency
### Performance Testing
- Testing the efficiency of an application
    - Can be several different aspects of the application
        - Time
        - Memory
        - Processing Power
- Load Testing
    - Testing an application by emulating a bunch of user using it at once
    - Usuaally mimics the expected traffic that the application is expected to handle
    - Often you up the load until the application breaks. (find a max or see when too slow)
- Stress Testing
    - Trying to break an application by abusing the application or setting up weird scenarios.
    - What if 10,000 users decided to login in the same minute
- Endurance Testing
    - Load testing + time
    - Spotting problems that might take days or weeks to occur
        - maybe there is a small memory leak
        - A log file gets too full and throws an error that crashes the server
- Spike Testing
    - Emulating a massive sudden influx in users/requests
    - Tests how well your application can quickly scale
        - Most modern apps perform auto-scaling where as users increase or decrease
        the amount of servers to handle requests increase or decrease.

### Regression Testing
- Every time **NEW** code is added to an applicaiton testing the application to make sure older features still work correctly
    - Prevent any new code from breaking something that worked previously
### Retesting
- Tested a feature again
    - You write some code for Feature A. Test fails. Write new code fore Feature A then retest.

### Positive Testing
- Testing that something works as it should
    - With the correct credentials, you can log in.

### Negative Testing
- Testing that something fails as it
    - With the incorrect credentials, you cannot log in.

### White Box
- Testing where you can see the code you are testing

### Black Box
- Testing where you cannot see the code you are testing


