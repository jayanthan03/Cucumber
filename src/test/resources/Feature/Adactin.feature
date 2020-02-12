Feature: Verifying the adactin web page

  Scenario Outline: Verifying the login  with valid credentials
    Given user is on adactin login page
    When user should enter the "<userName>" and "<userPassword>"
    And user should click the login button
    Then user verify sucess message

    Examples: 
      | userName    | userPassword |
      | Jayanthan | password123    |

  Scenario Outline: Verifying the search hotel page
    When user select the "<location>" and "<hotel>" and "<roomType>" and "<noOfRooms>" and "<adultPerRoom>" and "<childrenPerRoom>"
    And user should click search button
    
    Examples:
      | location | hotel       | roomType | noOfRooms | adultPerRoom | childrenPerRoom |
      | Sydney   | Hotel Creek | Standard | 1 - One   | 1 - One      | 1 - One         |

  Scenario: Verifying the select hotel page
    When user should click checkbox
    Then user should click continue button

  Scenario Outline: Verifying the search hotel page
    When user enter the "<firstName>" and "<lastName>","<address>","<creditCardNo>","<cardType>","<expiryMonth>" , "<expiryyear>" "<cvvNo>",
    Then user should click book now button

    Examples: 
      | firstName | lastName | address | creditCardNo     | cardType | expiryMonth | expiryyear | cvvNo |
      | Jayanthan     | Chandran   | Chennai | 7535345345353567 | VISA     | January     |       2022 |   345 |