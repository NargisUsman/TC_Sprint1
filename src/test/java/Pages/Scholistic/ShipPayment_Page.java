package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ShipPayment_Page extends BasePage {

    By shipToMySchool = By.xpath("//input[@id='checkboxShipToHome']");
    By paymentMethod = By.xpath("//div[@class='selected-option']");
    By creditCard = By.xpath("//li[@class='custom-option CREDIT_CARD']");
    By cardType = By.xpath("//div[@class='custom-select credit']");
    By addANewCard = By.xpath("//span[text()='Add a New Card']");
    By creditCardNumber = By.xpath("//input[contains(@id,'creditCard_number')]");
    By expDateMonth = By.xpath("//div[@id='scrollbar-3']/preceding::div[contains(text(),'--')]");
    By month = By.xpath("//li[@data-label='01']");
    By expDateYear = By.xpath("//select[@id='dwfrm_billing_paymentMethods_creditCard_year']/preceding::div[contains(text(),'--')]");
    By year = By.xpath("//li[@data-label='2022']");
    By cvn = By.id("dwfrm_billing_paymentMethods_creditCard_cvn");
    By firstName = By.id("dwfrm_billing_billingAddress_addressFields_firstName");
    By lastName = By.id("dwfrm_billing_billingAddress_addressFields_lastName");
    By address1 = By.id("dwfrm_billing_billingAddress_addressFields_address1");
    By zipcode = By.id("dwfrm_billing_billingAddress_addressFields_postal");
    By phone = By.id("dwfrm_billing_billingAddress_addressFields_phone");
    By conCheckOut = By.xpath("//button[@name='dwfrm_billing_save']//span[text()='Continue Checkout']");
    By submit = By.xpath("//div[@class='row sec-rco-content sec-rco-content-top']/preceding::button[@value='Submit Order']");


    public void clickShipToMySchool() {
        clickThis(shipToMySchool);
    }


    public void selectPaymentMethod() {
        waitUntilClickable(paymentMethod);
        clickThis(paymentMethod);
        waitUntilElementVisible(creditCard);
        scrollUpTo(creditCard);
        clickThis(creditCard);
        waitUntilElementVisible(cardType);
        clickThis(cardType);
        waitUntilElementVisible(addANewCard);
        clickThis(addANewCard);
    }

    public void creditCardInfo(String data) {
        enterThis(creditCardNumber, data);
    }

    public void expDate() {
        clickThis(expDateMonth);
        scrollUpTo(month);
        clickThis(month);
        clickThis(expDateYear);
        clickThis(year);
    }

    public void enterSecurityCode(String data) {
        enterThis(cvn, data);
    }

    public void enterFirstN(String data) {
        enterThis(firstName, data);
    }

    public void enterLastN(String data) {
        enterThis(lastName, data);
    }

    public void enterAddress(String data) {
        enterThis(address1, data);
    }

    public void enterZipCode(String data) {
        enterThis(zipcode, data);
    }

    public void enterPhone(String data) {
        enterThis(phone, data);
    }


    public void continueCheckOutSecTime() {
        clickThis(conCheckOut);
        sleep();
        clickThis(submit);
    }
}
