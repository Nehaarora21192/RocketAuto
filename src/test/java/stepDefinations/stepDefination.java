package stepDefinations;

import Utility.BaseClass;
import WebsitePages.CommonContentValidationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;

import java.io.IOException;


public class stepDefination extends BaseClass {

    @Given("^Initialize the browser$")
    public void initializeTheBrowser() {
        driver = browserUtil.getDriver();
    }

    @Given("^Go to the website \"([^\"]*)\"$")
    public void goToTheWebsite(String url) throws IOException {
        System.out.println("Webpage = " + url);
        driver.get(environmentUtil.getEnvProperty(url));
    }

    @Then("^User views the RocketAuto Logo$")
    public void userViewsTheRocketAutoLogo() {
        CommonContentValidationPage commonContentValidationPage = new CommonContentValidationPage();
        Assert.assertTrue(commonContentValidationPage.rocketAutoImageisdisplayed());
        System.out.println("isDiaplayed = " + commonContentValidationPage.rocketAutoImageisdisplayed());

    }

    @And("^Close the browser$")
    public void closeTheBrowser() {
        driver.close();
    }

}
