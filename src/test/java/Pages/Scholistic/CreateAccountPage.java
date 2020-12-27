package Pages.Scholistic;


import DriverWrapper.Web;
import Pages.BasePage;
import org.openqa.selenium.By;

public class CreateAccountPage extends BasePage {


    By createAccountButton = By.xpath("(//a[@class='create-account-trigger'])[1]");
    By accountTeacher = By.xpath("//label[@for='acccountTeacther']");
    By nextButton = By.className("button-next");
    By titleDropDown = By.xpath("//div[@class='selected-option input-select profile-title required']");
    By selectMr  = By.xpath("//li[@data-label='mr.']");
    By firstNameBox = By.id("dwfrm_profile_customer_firstname");
    By lastNameBox = By.id("dwfrm_profile_customer_lastname");
    By emailBox = By.id("dwfrm_profile_customer_email");
    By passwordBox = By.id("dwfrm_profile_login_password");
    By acceptTermsBox = By.id("dwfrm_registration_termsofuseteacher");
    By profileNextButton = By.name("dwfrm_profile_confirm");
    By zipCodeBox = By.id("dwfrm_myschool_schoolzip");
    By searchButton = By.xpath("//button[@name='dwfrm_myschool_search']");
    By school = By.xpath("//span[@class='ui-menu-item-wrapper']");
    By adakSchool = By.xpath("//span[text()='adak']");
    By searchSchoolNameBox = By.id("dwfrm_searchschool_schoolvalue");
    By schoolSelectedOnCreatePage = By.xpath("//div[@class='school-selection']");
    By mySchoolNextButton = By.xpath("//button[@name='dwfrm_searchschool_findnext']");
    By  role = By.xpath("//div[@class='selected-option input-select primaryrole required']");
    By selectRole = By.xpath("//span[text()='Teacher (by Grade)']");
    By roleDropDown = By.className("selected-option input-select primaryrole required");
    //By selectRole = By.xpath("//div[@class='custom-scrollbar']//li[2]");
    By gradeDropDown = By.xpath("//div[@class='selected-option input-select noscroll']");
    By grade = By.xpath("//li[@data-label='1st grade']");
    By numberOfStudentsBox = By.id("dwfrm_myrole_students");
    By gradeNextButton = By.xpath("//button[@class='next-button button-continue']");
    By preferredReadingBox = By.xpath("//div[@class='selected-option input-select required']");
    By guidedLevel= By.xpath("//span[text()='Guided Reading Level (GRL)']");
    By continueButton = By.xpath("//button[@class='button-continue']");
    By selectStateDropDown = By.className("//li[@class='custom-option select-option']");
    By statesDropDown = By.xpath("//div[@class='selected-option input-select']");
    By newYork = By.xpath("//li[@data-label='new york']");
    By selectCity = By.id("dwfrm_myschool_schoolcity");
    By city = By.xpath("//span[@class='ui-menu-item-wrapper']//span[@class='auto-matches']");
    By searchButtonAfterCity = By.xpath("//button[@name='dwfrm_myschool_searchone']");



    public void createAccount() throws InterruptedException {
        clickThis(createAccountButton);
        clickThis(accountTeacher);
        Thread.sleep(1000);
        clickThis(nextButton);
    }

    public void clickSelectTitle() {
        clickThis(titleDropDown);
        clickThis(selectMr);
    }

    public void typeFirstName(String fistName){
        enterThis(firstNameBox, fistName);
    }
    public void typeLastname(String  lastName){
        enterThis(lastNameBox,lastName);
    }
    public void typeEmail(String email){
        enterThis(emailBox,email);
    }

    public void enterPassword(String password) {
        enterThis(passwordBox, password);
    }

    public void acceptTerms() {
        clickThis(acceptTermsBox);
        clickThis(profileNextButton);
    }

    public void searchZipCode(String zip) {
        enterThis(zipCodeBox, zip);
        clickThis(searchButton);
    }

    public void typePartialSchoolName(String partialName) {
        enterThis(searchSchoolNameBox, partialName);
        sleep();
    }

    public void selectSchool(String schoolN) {
        selectFromAutoSuggestion(school, schoolN);
        sleep();
    }

    public void clickNext()  {
        clickThis(mySchoolNextButton);
        sleep();
    }


    public void selectRole()  {
        clickThis(role);
        clickThis(selectRole);

    }

    public void selectGrade() {
        clickThis(gradeDropDown);
        sleep();
        clickThis(grade);
    }

    public void enterStudentsQuantity(String num) {
        enterThis(numberOfStudentsBox, num);
        clickThis(gradeNextButton);
    }

    public void selectPreferredReading() {
        clickThis(preferredReadingBox);
        clickThis(guidedLevel);
        waitASec();
        clickThis(continueButton);
        sleep();
    }

    public void selectByState(String nyState) {
        clickThis(statesDropDown);
        waitASec();
        scrollUpTo(newYork);
        selectFromAutoSuggestion(selectStateDropDown, nyState);
        waitASec();
    }

    public void selectCity(String cityNY) {
        enterThis(selectCity, cityNY);
        waitASec();
        selectFromAutoSuggestion(city, cityNY);
        waitASec();
        clickThis(searchButtonAfterCity);
    }


    /**
   public boolean isSearchButtonEnabled() {
       return Web.getDriver().findElement(searchButton).isEnabled();
     or create a genetic method for isEnabled(); and than use it like --> isEnabled(searchButton);
   }

   public void selectCheckInDate(String checkInDate) {
       clickThis(checkInCalendar);
       List<WebElement> dates = Web.getDriver().findElements(allCalendarDate);
       for(WebElement date: dates) {
           if(date.getText().equalsIgnoreCase(checkInDate)) {
               date.click();
               break;
           }
       }

   }

   public void selectCheckOutDate(String checkOutDate) {
       clickThis(checkoutCalendar);
       List<WebElement> dates = Web.getDriver().findElements(allCalendarDate);
       for(WebElement date: dates) {
           if(date.getText().equalsIgnoreCase(checkOutDate)) {
               date.click();
               break;
           }
       }
   }
     List<WebElement> states = Web.getDriver().findElements(By.xpath("//ul[@class='content-scrollbar']"));
     for(WebElement state: states) {
     if(state.getText().equalsIgnoreCase(nyState)) {
     state.click();
     break;
     }
     }

   public String getBriefcaseText() {
       return getText(locator);
   }
     **/
}

