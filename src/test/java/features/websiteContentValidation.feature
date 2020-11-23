Feature: Website Content Validation

  Scenario Outline: Validate the RocketAuto Logo on all the web pages
    Given Initialize the browser
    Given Go to the website "<url>"
    Then User views the RocketAuto Logo
    And Close the browser

    Examples:
      | url                 |
      | homepageurl         |
      | sellorTradepageUrl  |
      | savedVehiclepageUrl |
      | shopNowUrl          |
      | fordUrl             |
      | toyUrl              |
      | chevyUrl            |
      | hondaUrl            |
      | nissanUrl           |
      | allMfrUrl           |
      | sedanUrl            |
      | suvUrl              |
      | pickupUrl           |
      | coupeUrl            |
      | wagonUrl            |
      | convUrl             |
      | hatchbkUrl          |
      | miniVanUrl          |









