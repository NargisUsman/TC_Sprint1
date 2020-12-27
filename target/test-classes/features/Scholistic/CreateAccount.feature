@regression
Feature: Create New Account

 @sanity
  Scenario: User can create a new teacher account in taxable state using Zip Code

     When I create new account
      And I select the title
      And I enter first name Sasha
      And I enter last name Masha
      And I enter email hlhs@mail.ru
      And I enter password Smhs1234
      And I accept the terms and click next
      And I search by zip code 10012
      And I type Scholastic+Book+Club partial school name
      And I select school name Scholastic+Book+Clubs
      And I click next
      And I select Role Teacher (by Grade)
      And I select the grade 1st Grade
      And I enter students number 10
      And I select from Preferred Reading Level System: Guided Reading Level (GRL)
      And I close the header
    Then I verify there is a CLASS CODE allocated to the teacher is present on Home-Page
     And I click MyAccount Page
     And I verify there is a CLASS CODE allocated to the teacher is present on MyAccount Page
     And I verify Same Teacher name is present on My Account
     And I verify same school address is present as selected while creating the account
         #refer snippets.

  @sanity
  Scenario: User can create a new teacher account in taxable state using School Search

    When I create new account
     And I select the title
     And I enter first name Masha
     And I enter last name Flower
     And I enter email mposha@mail.ru
     And I enter password Masha1234
     And I accept the terms and click next
     And I select by state New York
     And I select the city New York
     And I type Scholastic+Book+Club partial school name
     And I select school name Scholastic+Book+Clubs
     And I click next
     And I select Role Teacher (by Grade)
     And I select the grade 1st Grade
     And I enter students number 10
     And I select from Preferred Reading Level System: Guided Reading Level (GRL)
     And I close the header
    Then I verify there is a CLASS CODE allocated to the teacher is present on Home-Page
     And I click MyAccount Page
     And I verify there is a CLASS CODE allocated to the teacher is present on MyAccount Page
     And I verify Same Teacher name is present on My Account
     And I verify same school address is present as selected while creating the account
         #refer snippets.

    @sanity
    Scenario: User can create a new teacher account in non-taxable state using Zip Code

      When I create new account
       And I select the title
       And I enter first name Dasha
       And I enter last name Sasha
       And I enter email dfsha@mail.ru
       And I enter password ulsha1234
       And I accept the terms and click next
       And I search by zip code 99518
       And I type Ada partial school name
       And I select school name Adak School
       And I click next
       And I select Role Teacher (by Grade)
       And I select the grade 1st Grade
       And I enter students number 10
       And I select from Preferred Reading Level System: Guided Reading Level (GRL)
       And I close the header
      Then I verify there is a CLASS CODE allocated to the teacher is present on Home-Page
       And I click MyAccount Page
       And I verify there is a CLASS CODE allocated to the teacher is present on MyAccount Page
       And I verify Same Teacher name is present on My Account
       And I verify same school address is present as selected while creating the account
           #refer snippets.









