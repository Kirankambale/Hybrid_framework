package Test_script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_test;
import POM_script.POM1;

public class Test_script1 extends Base_test 
{
	@Test(dataProvider = "testData")
	public void test1 (String un,String pwd) throws InterruptedException
	{
	POM1 p=new POM1(driver);	
	p.un( "kiran");
	p.pwd("Kiran");
	p.press();
	driver.navigate().refresh();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Kiran", "admin" }, 
	   { "Daru", "krishna"},
	 };
}
}
