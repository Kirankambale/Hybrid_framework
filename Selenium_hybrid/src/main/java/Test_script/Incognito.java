package Test_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Incognito {
	@Test
	public void testc() {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	  ChromeOptions opt=new ChromeOptions();
	  opt.addArguments("--incognito");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.google.com");

}
}
