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
    By itemNum = By.xpath("//a[text()='12S5']");
    By itemNum1 = By.xpath("//a[text()='10S5']");
    By itemNum2 = By.xpath("//a[text()='2S5']");
    By nameHarry = By.xpath("(//td[@class=' studentName'])[2]");
    By reviewButton = By.xpath("//button[@class='secondary']");
    By qtyBox = By.xpath("(//input[@value='1'])[1]");
    By qtyBox1 = By.xpath("(//input[@value='1'])[2]");
    By qtyBox2 = By.xpath("(//input[@value='1'])[3]");
    By qtyBox4 = By.xpath("(//input[@value='1'])[4]");
    By qtyBox5 = By.xpath("(//input[@value='1'])[5]");
    By qtyBox6 = By.xpath("(//input[@value='1'])[6]");
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
        enterThis(itemNumber, "12S5");
        clickThis(addButton);
        enterThis(itemNumber, "10S5");
        clickThis(addButton);
        sleep();
        moveToElement(itemNumber);
        enterThis(itemNumber, "2S5");
        clickThis(addButton);
        sleep();
        moveToElement(qtyBox);
        enterThis(qtyBox, "3");
        enterThis(qtyBox1, "2");
        enterThis(qtyBox2, "5");
    }

    public void verifyNameItemAdded() {
        Assert.assertEquals(getText(itemNum), "12S5", "Not the same item");
        Assert.assertEquals(getText(itemNum1), "10S5", "Not the same item");
        Assert.assertEquals(getText(itemNum2), "2S5", "Not the same number");
        Assert.assertEquals(getText(nameHarry), "Harry","Not the same student");
    }

    public void clickReview() {
        waitASec();
        scrollDown(250);
        clickThis(reviewButton);
    }

    public void selectStudentNameItemAndQty() {
        scrollDown(350);
        waitASec();
        enterThis(studentName, "Harry");
        enterThis(itemNumber, "10S5");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "12S5");
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

    public void selectOnStudentNameItemAndQty() {
        scrollDown(350);
        waitASec();
        enterThis(studentName, "Harry");
        enterThis(itemNumber, "17S5");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "42J4");
        clickThis(addButton);
        sleep();
        enterThis(studentName, "John");
        enterThis(itemNumber, "20S5");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "19S5");
        clickThis(addButton);
        sleep();
        enterThis(studentName, "Michael");
        enterThis(itemNumber, "18S5");
        clickThis(addButton);
        moveToElement(itemNumber);
        enterThis(itemNumber, "34B4");
        clickThis(addButton);
        sleep();
        enterThis(qtyBox, "5");
        enterThis(qtyBox1, "1");
        sleep();
        enterThis(qtyBox2, "2");
        enterThis(qtyBox4, "2");
        enterThis(qtyBox5, "4");
        sleep();
        enterThis(qtyBox6, "10");
    }

    public void selectItemQtyStudent() {
        scrollDown(350);
        waitASec();
        enterThis(studentName, "Harry");
        enterThis(itemNumber, "17S5");
        clickThis(addButton);
        sleep();
        enterThis(studentName, "John");
        enterThis(itemNumber, "20S5");
        clickThis(addButton);
        sleep();
        enterThis(qtyBox, "1");
        enterThis(qtyBox1, "2");
    }




}
