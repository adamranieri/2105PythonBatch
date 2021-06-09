Feature: Multiple Languages should be supported

  Scenario: Navigate to English Wikipedia
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on English
    Then The Guest should be on the English Home Page

  Scenario: Navigate to Spanish Wikipedia
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on Spanish
    Then The Guest should be on the Spanish Home Page

  Scenario: Navigate to Italian Wikipedia
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on Italian
    Then The Guest should be on the Italian Home Page

  Scenario: Person Loves to quickly navigate between pages
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on Italian
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on Spanish
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on English
    Given The Guest is on the Wikipedia Home Page
    When The Guest clicks on Spanish