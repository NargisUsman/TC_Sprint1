package Pages.Scholistic;

import Pages.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;

public class MyAccount_Page extends BasePage {

    By classCodeOnProfile = By.xpath("//div[@class='classcode']"); //h3[contains(text(),'Class Code')]
    By teachersNameOnProfile = By.xpath("//h3[contains(text(),'Name')]");
    By schoolAddressOnProfile = By.xpath("//span[contains(text(), '557 BROADWAY')]"); //h3[contains(text(),'School']/div
    By schoolSelectedOnCreatePage = By.xpath("//div[@class='school-selection']");



    public boolean classCodeIsDisplayed() {
        return isDisplayed(classCodeOnProfile);
    }

    public String isSameTeacherNamePresent() {
        return getText(teachersNameOnProfile);
    }

    public void isSameSchoolNamePresent() {
        String schoolNameOnProf = getText(schoolAddressOnProfile);
        String schoolNameOnCrtPage = getText(schoolSelectedOnCreatePage);
        Assert.assertEquals(schoolNameOnProf, schoolNameOnCrtPage, "Schools name doesnt match");
    }
}
