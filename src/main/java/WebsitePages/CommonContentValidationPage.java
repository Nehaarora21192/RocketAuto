package WebsitePages;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonContentValidationPage extends BaseClass {

    private By rocketAutoImg = By.xpath("//img[contains(@src,'/_nuxt/img/rocket-auto-logo')]");


    public Boolean rocketAutoImageisdisplayed(){

        return  driver.findElement(rocketAutoImg).isDisplayed();
    }


}
