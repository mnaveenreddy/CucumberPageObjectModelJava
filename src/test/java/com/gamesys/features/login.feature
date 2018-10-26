Feature: login
  Scenario Outline: login
    Given I open "<browser>" browser
   When I naviagte to "<url>" url
    And I enter "<email>" into the email field
    And I enter "<password>" into the password field

    Examples:
      |browser|url					    |email			|password|
      |chrome|https://en-gb.facebook.com/|aa1@gmail.com|xyzwkkk|
