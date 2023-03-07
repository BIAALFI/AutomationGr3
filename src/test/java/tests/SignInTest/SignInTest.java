package tests.SignInTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class SignInTest extends BaseTest {

    @Test
    public void checkIfLogoIsDisplayed(){
        String email = "grupa3@automation.com";

//        Log.info("Verify if Logo is displayed");
        Assert.assertTrue(signInPage.isLogoDisplayed(), "Logo is not displayed");

//        Log.info("Complete the email field");
        Assert.assertTrue(signInPage.isEmailFieldDisplayed(), "Email field is not displayed");
        signInPage.typeInEmailField(email);

//        Log.info("Click the Next button");
        signInPage.clickNextButton();
    }
}