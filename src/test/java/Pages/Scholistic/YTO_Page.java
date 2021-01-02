package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.sql.SQLOutput;

public class YTO_Page extends BasePage {

    By enterThis = By.xpath("(//a[@id='enter-orders'])[2]");
    By yto = By.xpath("(//li[@id='your-teacher-order'])[2]");
    By qtyBox = By.xpath("//input[@class='itm-qty-usd input-qty numericenteronly error']");
    By qtyBox1 = By.xpath("//input[@data-itemid='1S5']");
    By qtyBox2 = By.xpath("//input[@data-itemid='2S5']");
    By errorMsg = By.xpath("//div[@class='info-modal-hd']");
    By errorContent = By.xpath("//div[@class='info-modal-content']");
    By closeJumper = By.xpath("//i[@class='fa fa-times info-modal-close']");
    By qty = By.xpath("//input[@data-itemid='1S4']");
    By reviewCart = By.xpath("//button[text()='Review Cart']");
    By byFlyer = By.xpath("//ul[@class='yto-by-item-default']/preceding::a[text()='By Flyer']");

    public void enterOrders() {
        mouseHover(enterThis);
        waitASec();
    }

    public void selectTheYTO() {
        clickThis(yto);
    }

    public void clickYTO() {
        mouseHover(enterThis);
        clickThis(yto);
    }

    public void clickPriceQty() {
        waitASec();
        scrollDown(350);
        clickThis(qtyBox1);
    }

    public boolean verifyJumperMsg() {
        waitASec();
        String jumperContent = getText(errorContent);
        System.out.println("The jumper content " + jumperContent);
        return isDisplayed(errorContent);
    }

    public boolean verifyJumperHeader() {
        waitASec();
        String jumperMsg = getText(errorMsg);
        System.out.println("This is the error msg " + jumperMsg);
        return isDisplayed(errorMsg);
    }

    public void enterQty(String num) {
        waitASec();
        enterThis(qtyBox1, num);
        moveToElement(closeJumper);
        waitASec();
        clickThis(closeJumper);
    }

    public void clickOnQtyBox() {
        clickThis(qtyBox2);
        waitASec();
    }

    public boolean isErrorMsgDisplayed() {
        return isDisplayed(errorMsg);
    }

    public void addQuantityAndClickReview(String data) {
        waitASec();
        enterThis(qty, data);
        scrollUpTo(reviewCart);
        clickThis(reviewCart);
    }
}
