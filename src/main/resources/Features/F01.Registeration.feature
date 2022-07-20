
Feature: Registration

  /* here we can hold all repeated steps to be written ones
 This two steps are executed before any test case */
  Background:
    Given user Open the browser navigate to Home page to Register
    And user click on sign In button

   # test scenario 1 (Invalid )
  Scenario: Registration with Invalid Email address

    When user enter Invalid Email which is "AA@yahoo"
    And user click on create an account button
    Then user Registration Fail

       # test scenario 2 (Invalid )
  Scenario: Registration without provide Email address

    And user click on create an account button
    Then user Registration Fail


     # test scenario 3 (Invalid )
  Scenario: user register with one or more missing mandatory fields data

    And user enter valid and not used Email which is "FFA@gmail.com"
    And user click on create an account button

    When user enter valid data, first name is "Fahd" , last name is "Mahmoud", Password is "", Company is "VOIS" , address is "15 ss.st- Haram"
    And city is "Cairo" and state is "Colorado" and postal_code is "00202" , country is "United States"
    And mobile is "01000573212" and address alias is "My address"
    And user click on Register Button

    Then user Registration Fails

           # test scenario 4 (Invalid )
  Scenario: Registration with Existing Email address

    When user enter existing Email which is "fahd.tiger202@gmail.com"
    And user click on create an account button
    Then user Registration will Fail

 # test scenario 5 (Valid )
  Scenario: user register with valid data


    And user enter valid and not used Email which is "FZF2@gmail.com"
    And user click on create an account button

    When user enter valid data, first name is "Fahd" , last name is "Mahmoud", Password is "123456", Company is "VOIS" , address is "15 ss.st- Haram"
    And city is "Cairo" and state is "Colorado" and postal_code is "00202" , country is "United States"
    And mobile is "01000575219" and address alias is "My address"
    And user click on Register Button

    Then user Registration Successfully

