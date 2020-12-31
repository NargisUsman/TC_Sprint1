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
