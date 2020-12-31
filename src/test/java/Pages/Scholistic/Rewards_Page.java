package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Rewards_Page extends BasePage {

    By salesTax = By.xpath("(//span[text()='$0.00'])[2]");

    public String verifyTax() {
        return getText(salesTax);
    }
}
