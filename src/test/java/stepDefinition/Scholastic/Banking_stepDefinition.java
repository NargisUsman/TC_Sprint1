package stepDefinition.Scholastic;


import Pages.Scholistic.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Banking_stepDefinition {

    AddBank_Page bPage = new AddBank_Page();
    ReviewCart_Page rPage = new ReviewCart_Page();
    SFO_Page sfPage = new SFO_Page();
    ShipPayment_Page spPage = new ShipPayment_Page();
    OrderComplete_Page ordPage = new OrderComplete_Page();


    @When("^I type my email (.+)$")
    public void typeEmail(String email) {
        bPage.typeEmail(email);

    }

    @When("^I type my password (.+)$")
    public void typePassword(String password) {
        bPage.typePassWord(password);

    }

    @When("^I sign in$")
    public void signIn() {
        bPage.clickSignIn();

    }
    @When("^I click the popUp$")
    public void clickPopUp() {
        bPage.clickOnPopUp();

    }

    @When("^I click on MyAccount button$")
    public void clickMyAccountB() {
        bPage.clickOnMyAccount();

    }

    @When("^I click on Profile button$")
    public void clickProfile() {
        bPage.clickOnProfile();

    }

    @When("^I click the addCard$")
    public void clickAddCard() {
        bPage.clickTheAddCard();

    }

    @When("^I scroll down$")
    public void scrollDown() {
      bPage.scrollDown();
    }

    @When("^I type new card number (.+)$")
    public void typeCardNumber(String num) {bPage.typeNewCard(num);}

    @When("^I select expiration month (.+)$")
    public void selectExpMonth(String month){
        bPage.selectExpMonth(month);
    }

    @When("^I select expiration year (.+)$")
    public void selectExpYear(String year){
        bPage.selectExpYear(year);
    }

    @When("^I type the cvn (.+)$")
    public void typeCVN(String cvnCode) {
        bPage.typeCVN(cvnCode);
    }
    @When("^I type firstname (.+)$")
    public void typeFirstName(String name) {
        bPage.typeFirstName(name);
    }

    @When("^I type lastname (.+)$")
    public void typeLastName(String name) {
        bPage.typeLastName(name);
    }

    @When("^I type billing address (.+)$")
    public void typeBillingAddress(String address) {
        bPage.typeBillingAddress(address);
    }

    @When("^I select country United States$")
    public void selectCountry() {
        bPage.selectCountry();
    }

    @When("^I type the (.+)$")
    public void typeZipCode(String zipCode) {
        bPage.typeZipCode(zipCode);
    }

    @When("^I select city (.+)$")
    public void selectCity(String city) {
        bPage.selectCity(city);
    }

    @When("^I select the state (.+)$")
    public void selectState(String state) {
        bPage.selectState(state);
    }

    @When("^I type phone number (.+)$")
    public void typePhoneNumber(String number) {
        bPage.typePhoneNumber(number);
    }

    @When("^I click save$")
    public void clickSave() {
        bPage.clickSave();
    }

    @When("^I click add new Card$")
    public void clickAddNewCard() {
        bPage.clickAddNewCard();
    }

    @Then("^I verify the 'You can only store three credit cards' error msg$")
    public void verifyTheErrorMsg() {
       Assert.assertTrue(bPage.verifyErrorMsg(), "Else the msg is not present");
    }

    //TC15
    @Then("^click continue checkout$")
    public void contCheckOut() {
        rPage.continueCheckOut();
    }

    @Then("^click Ship To MySchool$")
    public void clickShipToMySchool() {
        spPage.clickShipToMySchool();
    }


    @Then("^click Select Payment Method$")
    public void clickPaymentMethod() {
        spPage.selectPaymentMethod();
    }

    @Then("^enter a new credit card number '(.+)'$")
    public void enterCreditCardInfo(String data) {
        spPage.creditCardInfo(data);
    }

    @Then("^click enter expiration date$")
    public void enterExpirationDate() {
        spPage.expDate();
    }

    @Then("^enter CVN code '(.+)'$")
    public void enterCVN(String data) {
        spPage.enterSecurityCode(data);
    }

    @Then("^enter first name '(.+)'$")
    public void enterFirstName(String data) {
        spPage.enterFirstN(data);
    }

    @Then("^enter last name '(.+)'$")
    public void enterLastName(String data) {
        spPage.enterLastN(data);
    }

    @Then("^type address1 '(.+)'$")
    public void enterAddress(String data) {
        spPage.enterAddress(data);
    }

    @Then("^enter zipcode (.+)'$")
    public void enterZipCode(String data) {
        spPage.enterZipCode(data);
    }

    @Then("^enter phone number (.+)'$")
    public void enterPhoneNumber(String data) {
        spPage.enterPhone(data);
    }

    @Then("^click CheckOut and submit$")
    public void contCheckOutSecTime() {
        spPage.continueCheckOutSecTime();
    }

    @Then("^Verify if Thank you message is displayed$")
    public void thankYouIsDisp() {
        ordPage.isDisplayedThankYou();
    }

    @Then("^Verify if Order Receipt Reference number is displayed$")
    public void referenceIsDisp() {
        ordPage.isDisplayedReferenceNumber();
    }

    @When("^I select the student name, Item numbers and Qty$")
    public void selectTheStudentItemQty() {
        sfPage.selectItemQtyStudent();
        sfPage.clickReview();
    }
}
