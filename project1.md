# Project 1

## Expense Reimbursement System
You are tasked with creating an expense reimbursement system. For a small company/group. This program will allow employees to create reimbursement requests.All Managers can view these requests and approve or deny them. When they approve/deny they
can optionally leave a message.

### key features
- Employee
    - An employee can login to see their own reimbursements, past and pending
    - An employee can submit a reimbursement with an amount and a reason
        - Bonus allow for file upload
- Manager
    - A Manager can view all reimbursements past and pending
    - A Manager can appove or deny any reimbursement
    - Managers can view a 'statistics' page. That includes information like what employee spends the most money, mean expenditure cost etc...

### Key Notes
- you do not have to allow for the creation of employees or managers.
    - You can have these already in the database.
- You do not need to have implement security for application. You can assume that a later security team is responsible for making the applicaiton secure.
    - API routes do not need to be protected
    - Passwords do not have to be encrpted

### Technical and testing requirements
- Backend developed in Flask
- Backend should be a RESTful web service
    - You may have to a make a non-REST compliant endpoint for login. This is normal.
- AWS postgres RDS used to persist information
- All DAO methods should have a test
- All Service methods with logic should have a test
    - use mocking when applicable
- There should be logging in the application
- All user stories and acceptance criteria must be written out
- completed E2E tests using gherkin and selnium for all user stories.


    
