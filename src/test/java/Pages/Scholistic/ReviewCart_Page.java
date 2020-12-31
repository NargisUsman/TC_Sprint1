package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class ReviewCart_Page extends BasePage {

    By itemNum = By.xpath("//a[text()='35J3']");
    By itemNum1 = By.xpath("//a[text()='16B3']");
    By itemNum2 = By.xpath("//a[text()='74B4']");
    By nameHarry = By.xpath("//i[text()='Harry']");
    By checkOut = By.xpath("//form[@class='cart-action-checkout']");
    By proceedCheckOut = By.xpath("(//form[@id='checkout-form'])[2]");

    public void verifyStudentAndSFOTotal() {
        waitASec();
        scrollDown(150);
    }

    public void proceedToCheckOut() {
        scrollDown(800);
        clickThis(checkOut);
        waitASec();
        mouseHover(proceedCheckOut);
        clickThis(proceedCheckOut);
    }


}
