package Pages.Scholistic;

import Pages.BasePage;
import org.openqa.selenium.By;

public class Rewards_Page extends BasePage {

    public double taxNum;

    By estTax = By.xpath("//div[@class='tooltip-salestax-help hide']/following-sibling::span[@class='or-inner-data']");
    By salesTax = By.xpath("(//span[text()='$0.00'])[2]");

    public String verifyTax() {
        return getText(salesTax);
    }

    public void yourEstimateTax() {
        String tax = getText(estTax);
        String taxWithOut$ = tax.substring(1);
        taxNum = Double.valueOf(taxWithOut$);

    }

}
