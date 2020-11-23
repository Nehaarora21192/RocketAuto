package Utility;

import org.apache.commons.lang3.SystemUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;


public class BrowserUtil {
    public WebDriver getChromeDriver() {
        if (SystemUtils.IS_OS_MAC) {
            System.setProperty("webdriver.chrome.driver", Paths.get("src","main","resources", "browserBinaries/chromedriver_Mac").toString());
        }
        if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.chrome.driver", Paths.get("src","main","resources", "browserBinaries/chromedriver_Linux").toString());
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            System.setProperty("webdriver.chrome.driver", Paths.get("src", "main", "resources", "browserBinaries/chromedriver.exe").toString());
        }
        ChromeDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getFirefoxDriver() {
        if (SystemUtils.IS_OS_MAC) {
            System.setProperty("webdriver.gecko.driver", Paths.get("src", "main", "resources", "browserBinaries/geckodriver_mac").toString());
        }
        if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.gecko.driver", Paths.get("src", "main", "resources", "browserBinaries/geckodriver_linux").toString());
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            System.setProperty("webdriver.gecko.driver", Paths.get("src", "main", "resources", "browserBinaries/geckodriver.exe").toString());
        }
        FirefoxDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getEdgeDriver() {
        if (SystemUtils.IS_OS_MAC) {
            System.setProperty("webdriver.edge.driver", Paths.get("src", "main", "resources", "browserBinaries/MicrosoftWebDriver_mac").toString());
        }
        if (SystemUtils.IS_OS_LINUX) {
            System.setProperty("webdriver.edge.driver", Paths.get("src", "main", "resources", "browserBinaries/MicrosoftWebDriver_linux").toString());
        }
        if (SystemUtils.IS_OS_WINDOWS) {
            System.setProperty("webdriver.edge.driver", Paths.get("src", "main", "resources", "browserBinaries/MicrosoftWebDriver.exe").toString());
        }
        EdgeDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }

    public WebDriver getDriver() {
        switch (System.getProperty("browser").toLowerCase()) {
            case "firefox":
                return getFirefoxDriver();
            case "chrome":
                return getChromeDriver();
            case "edge":
                return getEdgeDriver();

            default:
                System.out.println("DID NOT RECOGNIZE BROWSER. STARTING CHROME INSTEAD!");
                return getChromeDriver();
        }
    }

}
