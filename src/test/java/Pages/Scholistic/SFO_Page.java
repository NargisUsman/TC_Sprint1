package Pages.Scholistic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SFO_Page extends BasePage {

    WebDriverWait eWait = new WebDriverWait(Web.getDriver(), 5);
    By enterThis = By.xpath("(//a[@id='enter-orders'])[2]");
    By sfo = By.xpath("(//li[@id='student-flyer-orders'])[2]");
    By studentName = By.xpath("//input[@id='student-name']");
    By itemNumber = By.xpath("//input[@id='item-number']");
    By addButton = By.xpath("//button[@id='btn-add']");
    By errorMsg = By.xpath("//span[@id='error-message-tooltip']");
    By itemNum = By.xpath("//a[text()='35J3']");
    By itemNum1 = By.xpath("//a[text()='16B3']");
    By itemNum2 = By.xpath("//a[text()='74B4']");
    By nameHarry = By.xpath("(//td[@class=' studentName'])[2]");
    By reviewButton = By.xpath("//button[@class='secondary']");
    By qtyBox = By.xpath("(//input[@value='1'])[1]");
    By qtyBox1 = By.xpath("(//input[@value='1'])[2]");
    By qtyBox2 = By.xpath("(//input[@value='1'])[3]");
    By qtyBox4 = By.xpath("(//input[@value='1'])[4]");
    By qtyBox5 = By.xpath("(//input[@value='1'])[5]");
    By closeQTYBox = By.xpath("(//i[@class='fa fa-times-circle remove'])[1]");
    By closeYesButton = By.xpath("(//button[@class='grey removeYes'])[1]");

    public void enterOrders() {
        mouseHover(enterThis);
    }

    public void enterStudentFlyerOrd() {
        sleep();
        moveToElement(sfo);
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

    public void selectItemAndQty() {
        scrollDown(350);
        waitASec();
        enterThis(itemNumber, "35J3");
        clickThis(addButton);
        waitASec();
        enterThis(itemNumber, "16B3");
        clickThis(addButton);
        waitASec();
        enterThis(itemNumber, "74B4");
        clickThis(addButton);
        sleep();
        enterThis(qtyBox, "3");
        enterThis(qtyBox1, "2");
        waitASec();
        enterThis(qtyBox2, "5");
    }

    public void verifyNameItemAdded() {
        Assert.assertEquals(getText(itemNum), "35J3", "Not the same item");
        Assert.assertEquals(getText(itemNum1), "16B3", "Not the same item");
        Assert.assertEquals(getText(itemNum2), "74B4", "Not the same number");
        Assert.assertEquals(getText(nameHarry), "Harry","Not the same student");
    }

    public void clickReview() {
        waitASec();
        scrollDown(100);
        clickThis(reviewButton);
    }

    public void selectStudentNameItemAndQty() {
        scrollDown(350);
        waitASec();
        enterThis(studentName, "Harry");
        enterThis(itemNumber, "16B3");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "35J3");
        clickThis(addButton);
        sleep();
        enterThis(studentName, "John");
        enterThis(itemNumber, "14S4");
        clickThis(addButton);
        sleep();
        enterThis(studentName, "Michael");
        enterThis(itemNumber, "74B4");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "15S4");
        clickThis(addButton);
        sleep();
        enterThis(qtyBox, "5");
        enterThis(qtyBox1, "1");
        sleep();
        enterThis(qtyBox2, "2");
        enterThis(qtyBox4, "4");
        sleep();
        enterThis(qtyBox5, "10");
    }




}
