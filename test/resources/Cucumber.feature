
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: Title of your scenario
    Given User enter into Homepage and click add customer
    When user enters required fields and click submit
    |Manish|Vinay|Manishvinay003@gmail.com|Trichy|9092879766|
    Then User navigates into next page and verify it\
    
  @tag2
  Scenario Outline: Title of your scenario outline
    Given User enter into Homepage and click add customer
    When User enters required fields and click submit "<Firstname>" "<Lastname>""<Email>""<Address>""<Phone>"
    Then I verify the <status> in step

    Examples: 
      | Firstname  | Lastname   | Email                |  Address     | Phone       |
      | Manish     |    Karthi  |     Manish@gmailcom  |       Covai  | 9092879711  |
      | Vinay      |     Ganesh |     Viany@gmail.com  |  Madurai     | 9092879733  |
      |Kasel       |    Dinesh  |Kasel@gmail.com       |Trichy        |9092879755   |
