package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToWindowTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToWindowTest.class);
    private String newUrl = getBaseUrl() + "Windows.html";

    @Test
    public void checkWindows() {
        driver.get(newUrl);

        LOG.info("Trigger Tabbed window");
        switchToWindowPage.clickWindowTabbed();
        switchToWindowPage.switchToNewTabWindow();

        LOG.info("Trigger Seperate window");
        switchToWindowPage.clickWindowSeperate();
        switchToWindowPage.switchToNewTabWindow();

        LOG.info("Trigger Tabbed window");
        switchToWindowPage.clickWindowMultiple();
        switchToWindowPage.switchToNewTabWindow();
    }
}
