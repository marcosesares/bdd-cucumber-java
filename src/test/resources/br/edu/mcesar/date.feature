Feature: Learn Cucumber
  As a student
  I must learn cucumber
  so that I can automate acceptance criteria

  Scenario: Must execute specification
    Given my date of birth is 17/08/1981
    When I get the date 01/07/1929
    Then difference in days must be -16
    Then difference in months must be -1
    Then difference in years must be -52
