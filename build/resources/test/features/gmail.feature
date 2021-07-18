#actor: Leidy

@stories
Feature: Academy Choucair
  As a user, I want check to me inbox for search  email called Hermana

  @scenario1
  Scenario: Search email Hermana

    Given than Leidy wants to find email called  in the inbox
    |strUser                |strPassword|
    |lsgomez@unimayor.edu.co|silvana1081594494|
    When He search for the email  in the inbox
    |strNameMail|
    |Destacados    |
    Then he finds the email called
      |strNameMail|
      |Destacados|