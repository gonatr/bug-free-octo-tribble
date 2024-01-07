@GlobalTest
Feature: test Login function

  @Test
  Scenario: Success login with valid username
    Given saya sudah berada dihome page sfa
    When saya input username "admin", password "test" dan klik button sign in
    Then Saya sudah berada di dashboard