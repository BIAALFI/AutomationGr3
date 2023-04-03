package pages.SwitchToPage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class SwitchToAlertPage extends BasePage {
    private static final Logger LOG = LoggerFactory.getLogger(SwitchToAlertPage.class);
    public static SwitchToAlertPage instance;

    private By alertTabWithOk = By.xpath("//a[@href='#OKTab']");
    private By triggerOkAlert = By.xpath("//button[@class='btn btn-danger']");
    private By alertTabWithCancel = By.xpath("//a[@href='#CancelTab']");
    private By triggerCancelAlert = By.xpath("//button[@class='btn btn-primary']");
    private By alertTabWithTextBox = By.xpath("//a[@href='#Textbox']");
    private By triggerTextBoxAlert = By.xpath("//button[@class='btn btn-info']");


    private SwitchToAlertPage() {
    }

    public static SwitchToAlertPage getInstance() {
        if (instance == null) {
            instance = new SwitchToAlertPage();
        }
        return instance;

    }

    public void clickalertTabWithOk() {
        LOG.info("Click Alert With Ok");
        driver.findElement(alertTabWithOk).click();
        driver.findElement(triggerOkAlert).click();
        driver.switchTo().alert().accept();
    }

    public void clickalertTabWithCancel() {
        LOG.info("Click Alert With Cancel");
        driver.findElement(alertTabWithCancel).click();
    }

    public void clickAlertTabWithTextBox(String data) {
        LOG.info("Click on alert tab and textbox");
        driver.findElement(alertTabWithTextBox).click();
        driver.findElement(triggerTextBoxAlert).click();
        driver.switchTo().alert().sendKeys(data);
        driver.switchTo().alert().accept();


    }


}
