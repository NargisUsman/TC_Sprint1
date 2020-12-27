package stepDefinition.Scholastic;

import Pages.Scholistic.HomePage;
import Pages.Scholistic.CreateAccountPage;
import Pages.Scholistic.MyAccount_Page;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class CreateAccount_stepDefinition {

    CreateAccountPage lpage = new CreateAccountPage();
    HomePage hpage = new HomePage();
    MyAccount_Page mpage = new MyAccount_Page();

    @When("^I create new account$")
    public void createNewAccount() throws InterruptedException {
        lpage.createAccount();
    }

    @When("^I select the title$")
    public void selectTitle()  {
        lpage.clickSelectTitle();
    }

    @When("^I enter first name (.+)$")
    public void enterFirstName(String firstName){
        lpage.typeFirstName(firstName);
    }

    @When("^I enter last name(.+)$")
    public void enterLastName(String lastName) {
        lpage.typeLastname(lastName);
    }

    @When("^I enter email (.+)$")
    public void enterEmail(String email) {
        lpage.typeEmail(email);
    }

    @When("^I enter password (.+)$")
    public void enterPassword(String password) {
        lpage.enterPassword(password);
    }

    @When("^I accept the terms and click next$")
    public void acceptTermsAndClickNext() {
        lpage.acceptTerms();
    }

    @When("^I search by zip code (.+)$")
    public void searchByZipCode(String zip)  {
       lpage.searchZipCode(zip);
    }

    @When("^I type (.+) partial school name$")
    public void typePartialSchoolName(String partialSchoolName) {
        lpage.typePartialSchoolName(partialSchoolName);
    }

    @When("^I select school name (.+)$")
    public void selectSchoolName(String schoolName) {
         lpage.selectSchool(schoolName);
    }

    @When("^I click next$")
    public void clickNext() {
        lpage.clickNext();
    }


    @When("^I select Role Teacher \\(by Grade\\)$")
    public void selectTeacher() {
        lpage.selectRole();
    }

    @When("^I select the grade 1st Grade$")
    public void selectGrade() {
        lpage.selectGrade();
    }

    @When("^I enter students number (.+)$")
    public void enterNumStudents(String num) {
        lpage.enterStudentsQuantity(num);
    }

    @When("^I select from Preferred Reading Level System: Guided Reading Level \\(GRL\\)$")
    public void selectPreferredReading() {
        lpage.selectPreferredReading();
    }

    @When("^I close the header$")
    public void closeHeader(){
        hpage.closePopUpPage();
    }

    @When("^I click MyAccount Page$")
    public void clickMyAccount() {
        hpage.clickMyAccount();
    }

    @Then("^I verify there is a CLASS CODE allocated to the teacher is present on Home-Page$")
    public void verifyClassCode() {
         Assert.assertTrue(hpage.isClassCodePresent(), "The code is not present");
    }

    @Then("^I verify there is a CLASS CODE allocated to the teacher is present on MyAccount Page$")
    public void verifyClassCodeOnMyAccount() {
        Assert.assertTrue(mpage.classCodeIsDisplayed(), "The Class code is not present");
    }

    @Then("^I verify Same Teacher name is present on My Account$")
    public void verifyTeachersName(String name) {
        Assert.assertEquals(mpage.isSameTeacherNamePresent(), name, "The teachers name does not match on profile page");
    }

    @Then("^I verify same school address is present as selected while creating the account$")
    public void verifyIsSchoolAddressSame() {
        mpage.isSameSchoolNamePresent();
    }

    @When("^I select by state (.+)$")
    public void selectByState(String state) {
        lpage.selectByState(state);
    }

    @When("^I select the city (.+)$")
    public void selectTheCity(String city) {
        lpage.selectCity(city);
    }

}
