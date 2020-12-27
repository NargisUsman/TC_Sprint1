package Pages.Scholistic;


import Pages.BasePage;
import org.openqa.selenium.By;

public class AddBook_Page  extends BasePage {

    By emailBox = By.id("dwfrm_login_username__embed");
    By passwBox = By.id("dwfrm_login_password__embed");
    By signIn = By.xpath("//div[@class='signin_icon']");
    By popUp = By.xpath("//span[@class='header-message']");
    By searchBox = By.xpath("//input[@class='custom-placeholder valid']");
    By moveMouseTo = By.xpath("//div[text()='Harry and the Hot Lava']");
    By clickSearch = By.xpath("//button[@type='submit']//i");
    By quickView = By.xpath("//a[@title='Harry Potter and the Order of the Phoenix']/following-sibling::a[@class='quickview']");
    By starButton = By.xpath("//span[@class='icon-button-icon']//i[contains(@class,'star')]");
    By checkBox = By.xpath("//input[@value='recommended']");
    By closeRecommendBox = By.xpath("//span[@class='tooltipster-close ']");
    By closeQuickView = By.xpath("//span[@class='ui-button-icon ui-icon ui-icon-closethick']");
    By myList = By.xpath("//span[text()='My Lists']");
    By recommendList = By.xpath("//li[@class='recommend']");
    By addedItem = By.xpath("//span[text()='1 item']");
    By bookImage = By.xpath("//img[@title='Harry Potter and the Order of the Phoenix']");

    public void typeMyEmail(String email) {
        enterThis(emailBox, email);
    }

    public void typeMyPassWord(String password) {
        enterThis(passwBox, password);
    }

    public void clickLogIn() {
        clickThis(signIn);
        sleep();

    }

    public void clickOnPopUp() {
        //mouseHover(popUp);
        clickThis(popUp);
        sleep();
    }

    public void searchForHarry(String text) {
        mouseHover(searchBox);
        enterThis(searchBox, text);
        waitASec();
        mouseHover(moveMouseTo);
        waitASec();
        clickThis(clickSearch);
    }

    public void quickView() {
        scrollDown(350);
        moveToElement(bookImage);
        waitASec();
        clickThis(quickView);
        waitASec();
    }

    public void clickRecommend() {
        clickThis(starButton);
    }

    public void selectRecommendToStudents() {
        clickThis(checkBox);
        waitASec();
        clickThis(closeRecommendBox);
        mouseHover(closeQuickView);
        waitASec();
        clickThis(closeQuickView);
    }

    public void myLists() {
        scrollUpTo(myList);
        waitASec();
        clickThis(myList);
    }

    public String verifyTheItemAdded() {
        clickThis(recommendList);
        return getText(addedItem);
    }



}
