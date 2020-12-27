package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class SFO_Page extends BasePage {

    By enterThis = By.xpath("(//a[@id='enter-orders'])[2]");
    By sfo = By.xpath("(//li[@id='student-flyer-orders'])[1]");
    By studentName = By.xpath("//input[@id='student-name']");
    By itemNumber = By.xpath("//input[@id='item-number']");
    By addButton = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");

    public void enterOrders() {
        mouseHover(enterThis);
        waitASec();
    }

    public void enterStudentFlyerOrd() {
        clickThis(sfo);
    }

    public void enterStudentsName(String name) {
        enterThis(studentName, name);
        waitASec();
    }

    public void enterItemNum(String num) {
        enterThis(itemNumber, num);
    }

    public void clickAddButton() {
        clickThis(addButton);
        waitASec();
    }

    public String verifyErrorMsg() {
        return getText(errorMsg);
    }
}
