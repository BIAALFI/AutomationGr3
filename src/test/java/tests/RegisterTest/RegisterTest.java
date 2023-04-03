package tests.RegisterTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import tests.BaseTest;

import static pages.BasePage.driver;
import static pages.BasePage.getBaseUrl;

public class RegisterTest extends BaseTest {
    private String newUrl = getBaseUrl() + "Register.html";
    private static final Logger LOG = LoggerFactory.getLogger(RegisterTest.class);


    @Test
    public void register() {
        driver.get(newUrl);

        String firstName = "Bianca";
        String lastName = "Mircea";
        String language = "Romanian";
        String adress = "Cluj, Strada Gutinului, Nr 23";
        String email = "Automation@domain.com";
        String phone = "07234456654";
        String skills = "Java";
        String country = "India";
        String year = "1992";
        String month = "August";
        String day = "26";
        String password = "1234";
        String secondPassword = "12345";

        LOG.info("Check title");
        Assert.assertTrue(registerPage.isTitleDisplayed(), "Title is not displayed");

        LOG.info("Check formTitle");
        Assert.assertTrue(registerPage.IsFormTitleDisplayed(), "Form Title is not displayed");

        LOG.info("Type in FullName");
        registerPage.typeInFirstName(firstName);
        registerPage.typeInLastName(lastName);

        LOG.info("Type in Adress");
        registerPage.typeInAdress(adress);

        LOG.info("Type Email Adress");
        registerPage.typeInEmailAdress(email);

        LOG.info("Type Phone Number");
        registerPage.typeInPhoneNumber(phone);

        LOG.info("Select a Language");
        registerPage.selectLanquage(language);

        LOG.info("Select Male Gender");
        registerPage.setMaleGender();

        LOG.info("Select Female Gender");
        registerPage.setFemaleGender();

        LOG.info("Select Cricket Hobby");
        registerPage.selectHobbyOne();

        LOG.info("Select Movie Hobby");
        registerPage.selectHobbyTwo();

        LOG.info("Select Hockey Hobby");
        registerPage.selectHobbyThree();

        LOG.info("Select Skills");
        registerPage.selectSkills(skills);

        LOG.info("Select Country");
        registerPage.setSelectCountry(country);

        LOG.info("Select Date Of Birth");
        registerPage.setDateOfBirth(year, month, day);

        LOG.info("First Password");
        registerPage.setPassword(password, secondPassword);

        LOG.info("Choose a picture");
        registerPage.selectImage();

        LOG.info("Click the submit button");
        registerPage.clickSubmitButton();


    }

}

