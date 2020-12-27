@regression
Feature: Login

  Background:
    Given I type email sasha@mail.ru
      And I type password Nana1234
      And I login
      And I click on popUp

  @smoke
  Scenario: Teacher can add books in Recommendations List from Quick View

     When I search for Harry
      And I click on Quick Look on a book from results
      And I click on Recommend
      And I select Recommendations to Students from options
      And I click on My Lists
     Then I verify the item is added in Recommendations to Students Lists under My Lists

  @smoke
  Scenario:  Verify teacher gets error for invalid item number in SFO (Student Flyer Order)

    #When I login
    When I go to Enter Orders
     And I select Student Flyer Orders
     And I select Student Name: Harry
     And I select Item number: 111
     And I click on ADD button
    Then I verify the Expected error msg: Please enter a valid item number

  Scenario:  Verify YTO-By Flyer jumper

    #When I login
    When I go to Enter Orders
     And I select YOUR TEACHER ORDER
     And I go to BY FLYER tab
     And I click on Price-QTY box
    Then I verify Teacher sees a jumper right above the box with message:
     And I verify Heading - IMPORTANT
     And I verify Message - All student paper flyer orders MUST be entered in the Student Flyer Orders tab.

    When I enter data in the clicked Price-QTY box
     And I click on X on the jumper.
     And I click on another Price-QTY box
    Then I verify Teacher does NOT see any jumper.