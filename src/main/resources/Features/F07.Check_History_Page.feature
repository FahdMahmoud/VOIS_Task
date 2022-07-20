Feature: Confirm Order Added

  Background:
    Given user Open the browser navigate to Home page to Register
    And user click on sign In button
    When enter valid Email address which is "fahd.tiger202@gmail.com"
    And  enter valid password which is "123456"
    And  Click on Sign In Button
    And Get orders count from History Page
    And Click on Women Main Category
    And Click on Tops Category
    And Click on Blouses subcategory
    And Click on Resulted blouse
    And Click on Add to cart Button
    And Click on Proceed to checkout button
    And Click on Proceed to Checkout Button in summary page
    And Click on Proceed to Checkout Button in address page
    And Check agree on terms check box
    And Click on Proceed to Checkout Button in shipping page
    And Click on Pay by bank wire Button in payment page
    And Press on I Confirm My Order Button

  Scenario: Confirm Order Was Added

    Given Click on Back to Orders
    Then Orders Count Increased by One



