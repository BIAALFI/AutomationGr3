package pages.RegisterPage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pages.BasePage;

public class RegisterPage extends BasePage {
    public static final Logger LOG = LoggerFactory.getLogger(RegisterPage.class);
    public static RegisterPage instance;

    private By title = By.xpath("//div[h1='Automation Demo Site ']");
    private By formTitle = By.xpath("//div[h2='Register']");
    private By inputFirstName = By.xpath("//input[@ng-model='FirstName']");
    private By inputLastName = By.xpath("//input[@ng-model='LastName']");
    private By inputAdress = By.xpath("//textarea[@ng-model='Adress']");
    private By inputEmailAdress = By.xpath("//input[@ng-model = 'EmailAdress']");
    private By inputPhoneNumber = By.xpath("//input[@ng-model = 'Phone']");
    private By maleGender = By.xpath("//input[@value='Male']");
    private By femaleGender = By.xpath("//input[@value='FeMale']");
    private By hobbyOne = By.xpath("//input[@value='Cricket']");
    private By hobbyTwo = By.xpath("//input[@value='Movies']");
    private By hobbyThree = By.xpath("//input[@value='Hockey']");
    private By languageField = By.id("msdd");
    String selectLanguage = "//a[contains(text(), '%s')]";
    private By skillsField = By.id("Skills");
    private By selectCountry = By.xpath("//span[@role='combobox']");
    private By enterCountry = By.xpath("//input[@role='textbox']");


    private RegisterPage() {
    }

    public static RegisterPage getInstance() {
        if (instance == null) {
            instance = new RegisterPage();
        }
        return instance;
    }

    public boolean isTitleDisplayed() {
        LOG.info("Verify if title is displayed");
        return driver.findElement(title).isDisplayed();
    }

    public boolean IsFormTitleDisplayed() {
        LOG.info("Verify is title form title  is displayed");
        return driver.findElement(formTitle).isDisplayed();
    }

    public void typeInFirstName(String fName) {
        LOG.info("Type in FirstName");
        driver.findElement(inputFirstName).sendKeys(fName);
    }

    public void typeInLastName(String lName) {
        LOG.info("Type in LastName");
        driver.findElement(inputLastName).sendKeys(lName);
    }

    public void typeInAdress(String adress) {
        LOG.info("Type in Adress");
        driver.findElement(inputAdress).sendKeys(adress);


    }

    public void typeInEmailAdress(String emailadress) {
        LOG.info("Type in EmailAdress");
        driver.findElement(inputEmailAdress).sendKeys(emailadress);
    }

    public void typeInPhoneNumber(String phoneNumber) {
        LOG.info("Type phone number");
        driver.findElement(inputPhoneNumber).sendKeys(phoneNumber);
    }

    public void selectLanquage(String language) {
        LOG.info("Select language");
        driver.findElement(languageField).click();
        driver.findElement(By.xpath(String.format(selectLanguage, language))).click();

    }

    public void setMaleGender() {
        LOG.info("Click the Male radio button");
        driver.findElement(maleGender).click();

    }

    public void setFemaleGender() {
        LOG.info("Click the Female radio button");
        driver.findElement(femaleGender).click();
    }

    public void selectHobbyOne() {
        LOG.info("Click Cricket radio button");
        driver.findElement(hobbyOne).click();
    }

    public void selectHobbyTwo() {
        LOG.info("Click Movie radio button");
        driver.findElement(hobbyTwo).click();
    }

    public void selectHobbyThree() {
        LOG.info("Click Hockey radio button");
        driver.findElement(hobbyThree).click();
    }

    public void selectSkills(String skills) {
        LOG.info("Select Skill");
        Select newSkill = new Select(driver.findElement(skillsField));
        newSkill.selectByValue(skills);
    }
    public void setSelectCountry(String country){
        LOG.info("Select Country");
        driver.findElement(selectCountry).click();
        driver.findElement(enterCountry).sendKeys(country);
        driver.findElement(selectCountry).sendKeys(Keys.ENTER);
    }



}
