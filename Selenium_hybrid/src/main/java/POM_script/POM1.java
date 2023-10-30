package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_Script.Base_page;

public class POM1 extends Base_page {
	@FindBy(id="email")
	private WebElement untxt;
	@FindBy(id="pass")
	private WebElement pwdtxt;
	@FindBy(name="login")
	private WebElement logbtn;
	
	public POM1(WebDriver driver)
	{
		super(driver);
	}

	public void un( String email)
	{
		untxt.sendKeys(email);
	}
	public void pwd( String pass) { 
		pwdtxt.sendKeys(pass);
	}
	public void press()
		{
		logbtn.click();
	}

}
