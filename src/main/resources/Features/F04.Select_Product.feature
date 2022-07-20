Feature: Add Selected Item To Cart

  Background:
    Given user Open the browser navigate to Home page to Register
    And user click on sign In button
    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And  enter valid password which is "123456"
    And  Click on Sign In Button
    And Click on Women Main Category
    And Click on Tops Category
    And Click on Blouses subcategory

  Scenario:  Select blouse from Subcategory Blouses

    Given Click on Resulted blouse

    When Click on Add to cart Button

    Then Add to cart confirmation appeared



