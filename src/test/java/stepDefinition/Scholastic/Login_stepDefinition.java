package stepDefinition.Scholastic;

import Pages.Scholistic.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class Login_stepDefinition {

        AddBook_Page aPage = new AddBook_Page();
        SFO_Page sfPage = new SFO_Page();
        YTO_Page yPage = new YTO_Page();
        ReviewCart_Page rPage = new ReviewCart_Page();
        Rewards_Page rwPage = new Rewards_Page();

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
    public void verifyExpectedErrorMsg(String errorMsg) {
       Assert.assertEquals(sfPage.verifyErrorMsg(), errorMsg, "Error msg does not match");
    }

    @When("^I select YOUR TEACHER ORDER$")
    public void selectYTO() {
        yPage.selectTheYTO();
    }

    @When("^I go to BY FLYER tab and click on Price-QTY box$")
    public void clickPriceQtyBox() {
        yPage.clickPriceQty();
    }

    @Then("^I verify Teacher sees a jumper right above the box with heading: IMPORTANT$")
    public void verifyTheHeader() {
        Assert.assertTrue(yPage.verifyJumperHeader(),"It is not displayed");
    }

    @Then("^I verify Teacher sees a jumper right above the box with message: All student paper flyer orders MUST be entered in the Student Flyer Orders tab.$")
    public void verifyTheErrorMsg() {
        Assert.assertTrue(yPage.verifyJumperMsg(), "It is not Displayed");
    }

    @When("^I enter (.+) in the clicked Price-QTY box and click on X on the jumper$")
    public void enterQTYInBox(String num) {
        yPage.enterQty(num);
    }

    @When("^I click on another Price-QTY box$")
    public void clickQtyBox() {
       yPage.clickOnQtyBox();
    }

    @Then("^I verify Teacher does NOT see any jumper$")
    public void isJumperDisplayed() {
       Assert.assertFalse(yPage.isErrorMsgDisplayed(),"The Error msg is not Displayed");
    }

    @When("^I select Item numbers and Qty$")
    public void selectItemNumbersAndQty() {
        sfPage.selectItemAndQty();
    }

    @Then("^Verify correct student name, item number added under SFO$")
    public void verifyNameQtyItem() {
        sfPage.verifyNameItemAdded();
    }

    @When("^I click on Review Cart$")
    public void clickReviewCart() {
        sfPage.clickReview();
    }

    @Then("^Verify if correct Student-total amount, items and quantity and SFO Total$")
    public void verifyStudentsTotalAndSFOTotal() {
        rPage.verifyStudentAndSFOTotal();
    }

    @When("^I select student name, Item numbers and Qty$")
    public void selectStudentName() {
        sfPage.selectStudentNameItemAndQty();
        sfPage.clickReview();
    }

    @Then("^Verify correct student Name, Qty and Item number added under SFO$")
    public void verifyAddedItemQty() {
       rPage.verifyAllAddedStudentsItemQty();
    }

    @When("^I click on Proceed to CheckOut$")
    public void proceedCheckout() {
        rPage.proceedToCheckOut();
    }

    @Then("^I verify the tax amount is: (.+)$")
    public void verifyTaxAmount(String amount) {
        Assert.assertEquals(rwPage.verifyTax(), amount, "Tax amount is incorrect");
    }


}
