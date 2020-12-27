package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class AddBank_Page extends BasePage {


        By emailBox = By.id("dwfrm_login_username__embed");
        By passwBox = By.id("dwfrm_login_password__embed");
        By signIn = By.xpath("//div[@class='signin_icon']");
        By popUp = By.xpath("//span[@class='header-message']");
        //By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
        //By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");
        By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
        By profile = By.xpath("//a[@title='Profile']");
        By addCard = By.xpath("//div[@class='link link-credit-card']");
        By enterCardNum = By.xpath("//input[@class='input-text numericonly positivenumber no-mouseflow required']");
        By expMonthBox = By.xpath("//div[text()='Month']");
        By monthList = By.xpath("//li[@data-label='month']/following-sibling::li");
        By expYear = By.id("//div[text()='Year']");
        By yearList = By.id("//li[@data-label='year']/following-sibling::li");
        By cvn = By.xpath("//input[@id='dwfrm_paymentinstruments_creditcards_newcreditcard_cvn']");
        By firstName = By.id("dwfrm_paymentinstruments_creditcards_address_firstname");
        By lastName = By.id("dwfrm_paymentinstruments_creditcards_address_lastname");
        By addressBox = By.id("dwfrm_paymentinstruments_creditcards_address_address1");
        By countryDropDown = By.id("dwfrm_paymentinstruments_creditcards_address_country");
        By zipCode = By.id("dwfrm_paymentinstruments_creditcards_address_postal");
        By cityBox = By.id("dwfrm_paymentinstruments_creditcards_address_city");
        By stateDropDown = By.id("dwfrm_paymentinstruments_creditcards_address_states_stateUS");
        By phoneNum = By.id("dwfrm_paymentinstruments_creditcards_address_phone");
        By saveButton = By.xpath("//button[@id='applyBtn']");
        By errorMsg = By.xpath("//div[@class='tooltipster-body']");

        public void typeEmail(String email) {
            enterThis(emailBox, email);
        }

        public void typePassWord(String password) {
            enterThis(passwBox, password);
        }

        public void clickSignIn() {
            clickThis(signIn);
            sleep();

        }

        public void clickOnPopUp() {
            mouseHover(popUp);
            clickThis(popUp);
            sleep();

            /**WebElement seeFirst = Web.getDriver().findElement(popUp);
             boolean isAcct = seeFirst.isDisplayed();
             if (isAcct) {
             clickThis(closePopUp);
             }
             **/
        }

        public void clickOnMyAccount() {
            mouseHover(myAccount);
            clickThis(myAccount);
        }

        public void clickOnProfile() {
            clickThis(profile);
        }

        public void clickTheAddCard() {
            sleep();
            clickThis(addCard);
        }

        public void scrollDown() {
            sleep();
            scrollDown(350);
        }

        public void typeNewCard(String num) {
            mouseHover(enterCardNum);
            sleep();
            clickThis(enterCardNum);
            waitASec();
            enterThis(enterCardNum, num);
            waitASec();

        }

        public void selectExpMonth(String month) {
            clickThis(expMonthBox);
            selectFromAutoSuggestion(monthList, month);
        }

        public void selectExpYear(String year) {
            clickThis(expYear);
            selectFromAutoSuggestion(yearList, year);
        }

        public void typeCVN(String cvnCode) {
            enterThis(cvn, cvnCode);
        }

        public void typeFirstName(String name) {
            enterThis(firstName, name);
        }

        public void typeLastName(String name) {
            enterThis(lastName, name);
        }

        public void typeBillingAddress(String address) {
            enterThis(addressBox, address);
        }

        public void selectCountry() {
            clickThis(countryDropDown);
        }

        public void typeZipCode(String postoleCode) {
            enterThis(zipCode, postoleCode);
        }

        public void selectCity(String city) {
            selectByVisibleText(cityBox, city);
        }

        public void selectState(String state) {
            selectByVisibleText(stateDropDown, state);
        }

        public void typePhoneNumber(String number) {
            waitASec();
            enterThis(phoneNum, number);
        }

        public void clickSave() {
            waitASec();
            clickThis(saveButton);
        }

        public void clickAddNewCard() {
            clickThis(addCard);
            waitASec();
        }

        public boolean verifyErrorMsg() {
            return isDisplayed(errorMsg);
        }

        /**
         boolean isMsgPresent = true;
         if(Web.getDriver().getPageSource().contains("You can only store three credit cards")) {
         System.out.println("Text is present");
         } else {
         System.out.println("Text is not present");
         }
         return  isMsgPresent;
         **/


}
