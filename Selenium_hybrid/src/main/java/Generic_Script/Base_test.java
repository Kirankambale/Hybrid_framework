package Generic_Script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Framework_constant {
    public WebDriver driver;

    @BeforeMethod
    public void openAppn() {
        System.setProperty(gecko_key, gecko_value);
        driver = new FirefoxDriver();
        driver.get(baseURL);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void closeAppn(ITestResult res) throws IOException {
        if (res.getStatus() == ITestResult.FAILURE) {
            Generic_screenshot.getPhoto(driver);
        }
        driver.close();
    }
}
