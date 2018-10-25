Feature:  Registration

  Scenario Outline: Registration
    Given I open "<browser>" browser
    When I naviagte to "<url>" url
    Given I enter "<firstname>" into the firstname field
    When I enter "<lastname>" into the lastname field
    Examples:
      |browser|url					    |firstname			|lastname|
      |chrome|https://en-gb.facebook.com/|aa@gmail.com|xyzwkkk|