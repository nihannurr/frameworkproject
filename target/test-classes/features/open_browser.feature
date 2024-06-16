Feature: Open Browser

  Scenario: Open Google
    Given Open the Chrome browser
    When Navigate to "https://www.google.com"
    Then Check title for "Google"
