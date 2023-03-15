package tests.LogInPageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

public class LoginPageTests extends BaseTest {

    @Test
    public void checkIfLogInElementsAreDisplayed(){
        signInPage.clickSignInButton();
        logInPage.isLogInElementsDisplayed();
    }

    @Test
    public void checkIErrorMessageIsDisplayed(){
        signInPage.clickSignInButton();
        logInPage.typeInEmailField("bbb@yahoo.com");
        logInPage.typeInPasswordField("1234");
        logInPage.clickOnEnterButton();
        Assert.assertTrue(logInPage.isErrorMessageDisplayed());





    }


}
