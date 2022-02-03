Feature:Login
  @nahsen
  Scenario Outline: User can login with credential username and password
    Given User is on the login page
    When User types the credential "<username>" and "<password>"
    Then User can login


    Examples:
      | username | password    |
      | IntQA19  | Me13357691. |


