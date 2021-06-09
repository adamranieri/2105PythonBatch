Feature: Search for articles


  Scenario Outline: Search for US States
    Given The Guest is on the Wikipedia Home Page
    When The Guest types <word> into the search bar
    When The Guest clicks on the search button
    Then The title should be <title>

    Examples:
      | word | title |
      | Florida | Florida - Wikipedia |
      | florida | Florida - Wikipedia |
      | Oregon | Oregon - Wikipedia |
      | California | California - Wikipedia |