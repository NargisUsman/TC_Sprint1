package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class YTO_Page extends BasePage {

    By enterThis = By.xpath("(//a[@id='enter-orders'])[2]");
    By yto = By.xpath("(//li[@id='your-teacher-order'])[1]");

    public void enterOrders() {
        mouseHover(enterThis);
        waitASec();
    }

    public void goToYTO() {
        clickThis(yto);
    }
}
