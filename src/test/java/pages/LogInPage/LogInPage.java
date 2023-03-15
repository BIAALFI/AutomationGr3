package pages.LogInPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import pages.BasePage;

public class LogInPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(LogInPage.class);
    public static LogInPage instance;

    private LogInPage() {
    }

    public static LogInPage getInstance() {
        if (instance == null) {
            instance = new LogInPage();
        }
        return instance;
    }

    private final By logInLogo = By.id("logo");
    private final By emailField = By.xpath("//input[@ng-model='Email']");
    private final By passwordField = By.xpath("//input[@ng-model='Password']");
    private final By enterButton = By.id("enterbtn");
    private final By errorMessage = By.id("errormsg");


    public void isLogInElementsDisplayed() {
        LOG.info("Verify if Log In page elements are displayed");
        Assert.assertTrue(driver.findElement(logInLogo).isDisplayed());
        Assert.assertTrue(driver.findElement(emailField).isDisplayed());
        Assert.assertTrue(driver.findElement(passwordField).isDisplayed());
        Assert.assertTrue(driver.findElement(enterButton).isDisplayed());
    }

    public void typeInEmailField(String email){
        LOG.info("Type in email field");
        driver.findElement(emailField).sendKeys(email);
    }
    public void typeInPasswordField(String password){
        LOG.info("Type in password field");
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickOnEnterButton(){
        LOG.info("Click on enter button");
        driver.findElement(enterButton).click();
    }
    public boolean isErrorMessageDisplayed(){
        LOG.info("Verify if error message is displayed");
        return driver.findElement(errorMessage).isDisplayed();
    }
//    public void clickBack(){
//        LOG.info("Clicking back in browser");
//        driver.navigate().back();
//    }


}


