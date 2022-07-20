Feature: Login

    Background:
      Given user Open the browser navigate to Home page to Register
      And user click on sign In button

  # test scenario 1 ( Invalid )
  Scenario: Login With Valid email address and wrong password

    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And enter Invalid password which is "111"
    And Click on Sign In Button

    Then Login Fail Error Message will appeared Invalid password.

  # test scenario 2 ( Invalid )
  Scenario: Login With  Invalid  Email address

    When enter Invalid Email address which is "ggg@gmail"
    And  enter valid password which is "123456"
    And  Click on Sign In Button

    Then Login Fail Error Message will appeared Invalid email address.

      # test scenario 3 ( Invalid )
  Scenario: Login With Missing mandatory field password

    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And  Click on Sign In Button

    Then Login Fail Error Message will appeared Password is required.


          # test scenario 4 ( Invalid )
  Scenario: Login with valid data ( Email / Password ) not registered Email in D.B

    When enter valid Email address which is "fahd.tiger2@gmail.com"
    And  enter valid password which is "123456"
    And  Click on Sign In Button

    Then Login Fail Error Message will appeared Authentication failed.


          # test scenario 5 ( Valid )
  Scenario: Login with valid data ( Email / Password )

    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And  enter valid password which is "123456"
    And  Click on Sign In Button

    Then Login Success