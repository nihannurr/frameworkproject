Feature: Google Search

  Scenario: Verify Google search functionality
    Given Set the base URL to "https://www.google.com"
    When Send a GET request to "/"
    Then the response status code should be 200
