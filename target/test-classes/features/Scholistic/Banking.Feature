@regression @sanity
Feature: Banking


  Scenario: Verify teacher can add only 3 credit cards under My Credit Cards in My Accounts

    When I type my email sasha@mail.ru
     And I type my password Nana1234
     And I sign in
     And I click the popUp
     And I click on MyAccount button
     And I click on Profile button
     And I click the addCard
     And I scroll down
     And I type new card number 4012888888881881
     And I select expiration month 02
     And I select expiration year 2021
     And I type the cvn 123
     And I type firstname Sasha
     And I type lastname Nana
     And I type billing address 2043 19ST
     And I select country United States
     And I type the zipcode
     And I select city New York
     And I select the state New York
     And I type phone number 3478406323
     And I click save
     And I click add new Card
    Then I verify the 'You can only store three credit cards' error msg

 Scenario: TC12 - Verify zero tax for SFO-YTO orders in the checkout for teacher with non-tax state school

    When I click Sign In
     And type email address username 'mmjmmkju@gmail.com'
     And type password 'poiu0987'
     And click Sign in
     And I go to Enter Orders
     And I select Student Flyer Orders
     And I select on student name, Item numbers and Qty
    Then I click Your Teacher Order and click By Flyer
     And add quantity for one book '3' and click Review Cart
     And click proceed to checkout second time click proceed to checkout
    Then Verify if Your Estimated Tax is zero for non-tax State school

 Scenario: TC15 - Verify user can place an order by adding a new credit card

   When I click Sign In
    And type email address username 'zxcza@gmail.com'
    And type password 'poiu0987'
    And click Sign in
    And I click the popUp
    And I go to Enter Orders
    And I select Student Flyer Orders
    And I select the student name, Item numbers and Qty
    And click proceed to checkout second time click proceed to checkout
    And click continue checkout
    And click Ship To MySchool
    And click Select Payment Method
    And enter a new credit card number '4222222222222'
    And click enter expiration date
    And enter CVN code '345'
    And enter first name 'Zhenya'
    And enter last name 'Kirova'
    And type address1 '443 Broadway ave'
    And enter zipcode '10012'
    And enter phone number '4433222345'
    And click CheckOut and submit
    And Verify if Thank you message is displayed
   Then Verify if Order Receipt Reference number is displayed
