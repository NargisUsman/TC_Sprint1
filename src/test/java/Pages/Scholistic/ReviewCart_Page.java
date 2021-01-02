package Pages.Scholistic;

import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class ReviewCart_Page extends BasePage {

    By harryTotal = By.xpath("//li[@class='std-total-price stdPriceTotal']");
    By harrysTotal = By.xpath("(//li[@class='std-total-price stdPriceTotal'])[1]");
    By michaelTotal = By.xpath("//li[@class='std-total-price stdPriceTotal'])[3]");
    By johnTotal = By.xpath("//li[@class='std-total-price stdPriceTotal'])[2]");
    By totalOrder = By.xpath("//div[@class='each-review-order']");
    By checkOut = By.xpath("//form[@class='cart-action-checkout']");
    By proceedCheckOut = By.xpath("(//form[@id='checkout-form'])[2]");
    By qtyBoxTotal = By.xpath("//span[@class='total-qty sfoSubTotalQty']");
    By qtyBoxTotal1 = By.xpath("(//span[@class='total-qty stdPriceQty'])[1]");
    By qtyBoxTotal2 = By.xpath("(//span[@class='total-qty stdPriceQty'])[2]");
    By qtyBoxTotal3 = By.xpath("(//span[@class='total-qty stdPriceQty'])[3]");


    public void verifyStudentAndSFOTotal() {
        waitASec();
        scrollDown(150);

        List<WebElement> total = Web.getDriver().findElements(totalOrder);
        Assert.assertEquals(total.size(), 1, " The student total order is incorrect");
        Assert.assertEquals(getText(harryTotal), "$97.00", "Students total is incorrect");
        Assert.assertEquals(getText(qtyBoxTotal), "10", "The qty box total is incorrect");
    }

    public void verifyAllAddedStudentsItemQty() {
        scrollDown(350);
        List<WebElement> total = Web.getDriver().findElements(totalOrder);
        Assert.assertEquals(total.size(), 3, " The student total order is incorrect");
        String h = getText(harrysTotal);
        String m = getText(michaelTotal);
        String j = getText(johnTotal);
        int hTotal = Integer.parseInt(h);
        int mTotal = Integer.parseInt(m);
        int jTotal = Integer.parseInt(j);
        int allStudentsTotal = hTotal+mTotal+jTotal;
        String allTotal = Integer.toString(allStudentsTotal);

        waitASec();
        Assert.assertEquals(allTotal, "$212.00" ,"The Total is incorrect");

        String hr = getText(qtyBoxTotal1);
        String ml = getText(qtyBoxTotal2);
        String jn = getText(qtyBoxTotal3);
        int qty1 = Integer.parseInt(hr);
        int qty2 = Integer.parseInt(ml);
        int qty3 = Integer.parseInt(jn);
        int qtyBox = qty1+qty2+qty3;

        Assert.assertEquals(qtyBox, 22, "The qty box total is incorrect");

    }

    public void proceedToCheckOut() {
        scrollDown(800);
        clickThis(checkOut);
        waitASec();
        mouseHover(proceedCheckOut);
        clickThis(proceedCheckOut);
    }


}
