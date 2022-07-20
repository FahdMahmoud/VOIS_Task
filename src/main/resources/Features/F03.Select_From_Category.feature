Feature: Select from Category

  Background:
    Given user Open the browser navigate to Home page to Register
    And user click on sign In button
    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And  enter valid password which is "123456"
    And  Click on Sign In Button

    Scenario:  Select Item from Subcategory Blouses

      Given Click on Women Main Category
      And Click on Tops Category
      When Click on Blouses subcategory
      Then user directed to Blouses Subcategory

