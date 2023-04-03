package tests.SwitchToTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class SwitchToFramesTest extends BaseTest {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToFramesTest.class);
    private String newUrl = getBaseUrl() + "Frames.html";

    @Test
    public void checkFrames() {
        driver.get(newUrl);
        String data = "Vine Primavara!";
        String data2 = "Vine Vara!";

        LOG.info("Send Key in Iframe single");
        switchToFramesPage.clickSingleFrame(data);

        LOG.info("Send Key in Iframe Multiple");
        switchToFramesPage.clickMultipleFrame(data2);

    }
}
