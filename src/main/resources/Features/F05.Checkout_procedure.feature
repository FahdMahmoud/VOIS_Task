Feature: Checkout Procedure

    Background:
      Given user Open the browser navigate to Home page to Register
      And user click on sign In button
      When enter valid Email address which is "fahd.tiger202@gmail.com"
      And  enter valid password which is "123456"
      And  Click on Sign In Button
      And Click on Women Main Category
      And Click on Tops Category
      And Click on Blouses subcategory
      And Click on Resulted blouse
      And Click on Add to cart Button
      And Click on Proceed to checkout button


  # test scenario 1 ( Invalid )
  Scenario: Buy the selected product and ( leave agree on terms )

    Given Click on Proceed to Checkout Button in summary page

    When Click on Proceed to Checkout Button in address page
    And Click on Proceed to Checkout Button in shipping page

    Then Checkout process is stopped

  # test scenario 2 ( Valid )
  Scenario: Buy the selected product

    Given Click on Proceed to Checkout Button in summary page

    When Click on Proceed to Checkout Button in address page
    And Check agree on terms check box
    And Click on Proceed to Checkout Button in shipping page

    Then user will directed to step number.5 payment page
