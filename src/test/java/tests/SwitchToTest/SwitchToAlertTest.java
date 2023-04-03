package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;
import tests.RegisterTest.RegisterTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToAlertTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Alerts.html";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);

    @Test
    public void checkAlerts() {
        driver.get(newUrl);

        String data = "mesaj";

        LOG.info("Trigger Alert and  Ok Button");
        switchToAlertPage.clickalertTabWithOk();

        LOG.info("Trigger Alert and  Cancel Button");
        switchToAlertPage.clickalertTabWithOk();

        LOG.info("Trigger Alert and send data");
        switchToAlertPage.clickAlertTabWithTextBox(data);

    }
}
