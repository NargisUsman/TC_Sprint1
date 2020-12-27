package Pages.Scholistic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class BankingPage  {

    By emailBox = By.id("dwfrm_login_username__embed");
    By passwBox = By.id("dwfrm_login_password__embed");
    By signIn = By.xpath("//div[@class='signin_icon']");
    By popUp = By.xpath("//span[@class='header-message']");
    //By toolTips = By.xpath("//div[@class='tooltipster-box']//div//span[2]");
    //By ClassCodeInMain=By.xpath("//div[@class='sec-top-boxes']//div[1]//div[2]//div");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profile = By.xpath("//a[@title='Profile']");
    By addCard = By.xpath("//div[@class='link link-credit-card']");
    //By cardNumBox = By.xpath("//div[@class='form-row newnumber cc-num required']");
    By enterCardNum = By.xpath("//input[@class='input-text numericonly positivenumber no-mouseflow required']");
    By expMonthBox = By.xpath("//div[text()='Month']");
    By monthList = By.xpath("//li[@data-label='month']/following-sibling::li");
    By expYear = By.id("dwfrm_paymentinstruments_creditcards_newcreditcard_year");
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



}
