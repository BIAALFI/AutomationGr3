package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.BasePage;
import pages.LogInPage.LogInPage;
import pages.RegisterPage.RegisterPage;
import pages.SignInPage.SignInPage;
import pages.SwitchToPage.SwitchToAlertPage;
import pages.SwitchToPage.SwitchToFramesPage;
import pages.SwitchToPage.SwitchToWindowPage;

public class BaseTest {

    public SignInPage signInPage = SignInPage.getInstance();
    public RegisterPage registerPage = RegisterPage.getInstance();
    public SwitchToAlertPage switchToAlertPage = SwitchToAlertPage.getInstance();
    public LogInPage logInPage=LogInPage.getInstance();
    public SwitchToWindowPage switchToWindowPage = SwitchToWindowPage.getInstance();
    public SwitchToFramesPage switchToFramesPage = SwitchToFramesPage.getInstance();

    @BeforeSuite
    public void init() {
        BasePage.setUp();
    }

    @AfterSuite
    public void tearDown() {
        BasePage.tearDown();
    }

}