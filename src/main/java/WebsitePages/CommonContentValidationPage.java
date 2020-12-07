package WebsitePages;

import Utility.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CommonContentValidationPage extends BaseClass {

    private By rocketAutoImg = By.xpath("//img[contains(@src,'/_nuxt/img/rocket-auto-logo')]");
    public List<WebElement> headerList = driver.findElements(By.xpath("//ul[@class='nav']/li"));

    public Boolean rocketAutoImageisdisplayed() {
        return driver.findElement(rocketAutoImg).isDisplayed();
    }

    }



