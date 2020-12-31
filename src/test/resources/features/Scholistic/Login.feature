@regression @sanity
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
  Scenario:  Verify teacher gets error for invalid item number in SFO (Student Flyer Order) TC6

    #When I login
    When I go to Enter Orders
     And I select Student Flyer Orders
     And I select Student Name: Harry
     And I select Item number: 111
     And I click on ADD button
    Then I verify the Expected error msg: Please enter a valid item number.
  @smoke
  Scenario:  Verify YTO-By Flyer jumper TC11

    #When I login
    When I go to Enter Orders
     And I select YOUR TEACHER ORDER
     And I go to BY FLYER tab and click on Price-QTY box
    Then I verify Teacher sees a jumper right above the box with heading: IMPORTANT
     And I verify Teacher sees a jumper right above the box with message: All student paper flyer orders MUST be entered in the Student Flyer Orders tab.

    When I enter 1 in the clicked Price-QTY box and click on X on the jumper
     And I click on another Price-QTY box
    Then I verify Teacher does NOT see any jumper

  @smoke
  Scenario:  Verify teacher can add multiple books for a student in SFO  TC7

     #When I login
    When I go to Enter Orders
     And I select Student Flyer Orders
     And I select Student Name: Harry
     And I select Item numbers and Qty
    Then Verify correct student name, item number added under SFO
     And I click on Review Cart
     And Verify if correct Student-total amount, items and quantity and SFO Total

  @smoke
  Scenario:  Verify teacher can add multiple books for multiple students in SFO  TC8

    #When I login
    When I go to Enter Orders
     And I select Student Flyer Orders
     And I select student name, Item numbers and Qty
    Then Verify correct student Name, Qty and Item number added under SFO

  @smoke
  Scenario:  Verify zero tax for only SFO order in the checkout  TC9

    #When I login
    When I go to Enter Orders
     And I select Student Flyer Orders
     And I select student name, Item numbers and Qty
     And I click on Proceed to CheckOut
    Then I verify the tax amount is: $0.00

