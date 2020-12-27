package Pages.Scholistic;


import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class HomePage extends BasePage {

    By classCode = By.xpath("//div[text()='View & Submit']/preceding::div[@class='value']"); //div[text()='ZXWKH']
    By popUp = By.xpath("//span[@class='header-message']");
    By myAccount = By.xpath("//span[@class='hide-mobile user-account-name']");
    By profile = By.xpath("//a[@title='Profile']");


    public void closePopUpPage() {
        clickThis(popUp);
    }

    public boolean isClassCodePresent() {
        return isDisplayed(classCode);
    }

    public void clickMyAccount() {
        clickThis(myAccount);
        clickThis(profile);
    }


}

