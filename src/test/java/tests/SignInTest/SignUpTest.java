package tests.SignInTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;


public class SignUpTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SignUpTest.class);
    private String newUrl = getBaseUrl()+ "Index.html";


    @Test
    public void signUp() {

        LOG.info("Navigate to Sign up page");
        driver.get(newUrl);
        Assert.assertTrue(signInPage.isLogoDisplayed(),"Logo is not displayed");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(),"Email is not displayed");
        Assert.assertTrue(signInPage.isSignInButtonDisplayed(),"Sign in is not displayed");
        Assert.assertTrue(signInPage.isSkipSignInButtonDisplayed(),"Skip Sign in is not displayed");
        signInPage.clickSignInButton();
    }
}