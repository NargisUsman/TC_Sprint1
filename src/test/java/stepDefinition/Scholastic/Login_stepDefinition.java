package stepDefinition.Scholastic;

import Pages.Scholistic.AddBank_Page;
import Pages.Scholistic.AddBook_Page;
import Pages.Scholistic.SFO_Page;
import Pages.Scholistic.YTO_Page;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Login_stepDefinition {

        AddBook_Page aPage = new AddBook_Page();
        SFO_Page sfPage = new SFO_Page();
        YTO_Page yPage = new YTO_Page();

    @Given("^I type email (.+)$")
    public void typeEmail(String email) {
        aPage.typeMyEmail(email);
    }

    @Given("^I type password (.+)$")
    public void typePassword(String password) {
        aPage.typeMyPassWord(password);
    }

    @Given("^I login$")
    public void login() {
        aPage.clickLogIn();
    }

    @When("^I click on popUp$")
    public void clickPopUp() {
        aPage.clickOnPopUp();
    }

    @When("^I search for (.+)$")
    public void searchForHarry(String book) {
        aPage.searchForHarry(book);
    }

    @When("^I click on Quick Look on a book from results$")
    public void clickQuickLook() {
        aPage.quickView();
    }

    @When("^I click on Recommend$")
    public void clickRecommend() {
        aPage.clickRecommend();
    }

    @When("^I select Recommendations to Students from options$")
    public void selectRecommendToStudents() {
        aPage.selectRecommendToStudents();
    }

    @When("^I click on My Lists$")
    public void clickMyLists() {
        aPage.myLists();
    }

    @Then("^I verify the item is added in Recommendations to Students Lists under My Lists$")
    public void verifyAddedOptionIsOnMyList() {
        aPage.verifyTheItemAdded();
    }

    @When("^I go to Enter Orders$")
    public void clickEnterOrders() {
        sfPage.enterOrders();
        yPage.enterOrders();
    }

    @When("^I select Student Flyer Orders$")
    public void selectSFO() {
        sfPage.enterStudentFlyerOrd();
    }

    @When("^I select Student Name: (.+)$")
    public void enterStudentsName(String name) {
        sfPage.enterStudentsName(name);
    }

    @When("^I select Item number: (.+)$")
    public void selectItemNumber(String num) {
        sfPage.enterItemNum(num);
    }

    @When("^I click on ADD button$")
    public void clickAdd() {
        sfPage.clickAddButton();
    }

    @Then("^I verify the Expected error msg: (.+)$")
    public void verifyExpectedErrorMsg(String msg) {
       Assert.assertEquals(sfPage.verifyErrorMsg(), msg, "Expected msg is not valid");
    }

    @When("^I select YOUR TEACHER ORDER$")
    public void selectYTO() {
        yPage.goToYTO();
    }

    @When("^I go to BY FLYER tab$")
    public void moveMouseToByFlyer() {
        yPage.goToYTO();
    }

    @When("^I click on Price-QTY box$")
    public void clickPriceQTY() {

    }

    @Then("^I verify Teacher sees a jumper right above the box with message:$")
    public void verifyTeacherSeesJumper() {

    }
}
