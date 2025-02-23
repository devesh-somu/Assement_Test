Feature: To perform signup and login action
  I want to use this template for my feature file


  Scenario: Perform signup action
    Given Launch Browser
    When Navigate to the signup page
    Then Fill user details with email <email> , password <password>, confirmPassowrd <confirmPassowrd>, firstName <firstName> and LastName <LastName>
    And  Perform logout action
    Then  Perorm login action with email <email> and password <password> 
    

    Examples: 
      | email                         | password           | confirmPassowrd |  firstName        |   LastName      |
      | HelloUserdummyTestUserw@gm.co |1234abcd@      | 1234abcd@       |  HelloTestDummy   |  LastNameDummy  |    
    
