package Pages;

import DriverWrapper.Web;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

public class BasePage {


    Alert alert;

    public void scrollDown(int y) {
        //if input needs to be converted to String --> String intToString = String.valueOf(y)
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        js.executeScript("scroll(0," +y+");");
    }

    public void scrollUpTo(By locator) {
        JavascriptExecutor js = (JavascriptExecutor)Web.getDriver();
        WebElement elm = Web.getDriver().findElement(locator);
        js.executeScript("arguments[0].scrollIntoView(true);", elm);
    }

    public void waitASec(){
        Web.getDriver().manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    public void waitMin(){
        Web.getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
    }

    public void sleep() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void moveToElement(By locator) {
        WebElement wB = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(wB);
        act.perform();
    }

    public void mouseHover(By locator) {
        WebElement element = Web.getDriver().findElement(locator);
        Actions act = new Actions(Web.getDriver());
        act.moveToElement(element).perform();
        //act.moveToElement(element).build().perform();
    }

    public void selectFromAutoSuggestion(By locator, String word) {
        List<WebElement> suggestions = Web.getDriver().findElements(locator);
        for(WebElement suggestion: suggestions) {
            if (suggestion.getText().equalsIgnoreCase(word)) {
                suggestion.click();
                break;
            }
        }
    }

    public WebElement findElementUsingFluentWait(final By locator) {
        Wait fWait = new FluentWait(Web.getDriver())
                .withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoAlertPresentException.class)
                .ignoring(NoSuchElementException.class)
                .withMessage("Element is not found after 30 seconds of wait");

        WebElement element = (WebElement) fWait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(locator);
            }
        });
        return element;
    }

    public void clearThis(By locator) {
        findElementUsingFluentWait(locator).clear();
    }

    public void clickThis(By locator) {
        findElementUsingFluentWait(locator).click();
    }

    public void enterThis(By locator, String text) {
       findElementUsingFluentWait(locator).sendKeys(text);
    }

    public String getPageTitle() {
        return  Web.getDriver().getTitle();
    }

    public String getText(By locator) {
        return findElementUsingFluentWait(locator).getText();
    }

    public void selectByVisibleText(By locator, String text){
        Select select = new Select(Web.getDriver().findElement(locator));
        select.selectByVisibleText(text);
    }
    public void isEnabled(By locator) {
        findElementUsingFluentWait(locator).isEnabled();
    }

    public boolean isDisplayed(By locator) {
        return findElementUsingFluentWait(locator).isDisplayed();
    }

    public void switchToFrame (By locator) {
        WebElement myFrame = findElementUsingFluentWait(locator);
        Web.getDriver().switchTo().frame(myFrame);
    }

    public void switchToAlert() {
        alert = Web.getDriver().switchTo().alert();
        
    }

    public void clickOnPositiveAlert() {
        alert.accept();
    }

    public void clickOnNegativeAlert() {
        alert.dismiss();
    }

    public void typeOnAlert(String data) {
        alert.sendKeys(data);
    }






}
