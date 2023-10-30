package POM_script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Generic_Script.Base_page;

public class POM2 extends Base_page {
	@FindBy(name="firstname")
	private WebElement fntxt;
	@FindBy(name="lastname")
	private WebElement lntxt;
	@FindBy(name="reg_email__")
	private WebElement emailbtn;
	@FindBy(name="reg_passwd__")
	private WebElement pass;
	@FindBy(name="websubmit")
	private WebElement signup;
	
	public POM2(WebDriver driver)
	{
		super(driver);
	}

	public void fn( String firstname)
	{
		fntxt.sendKeys(firstname);
	}
	public void ln( String lastname) 
	{ 
		lntxt.sendKeys(lastname);
	}
	public void email( String email)
		{
		emailbtn.sendKeys(email);
	}
	public void pwd(String pwd)
	{
		pass.sendKeys(pwd);
	}
	public void press()
	{
	signup.click();
}


}
