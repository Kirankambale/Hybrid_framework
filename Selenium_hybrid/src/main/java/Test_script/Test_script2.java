package Test_script;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Generic_Script.Base_test;
import POM_script.POM2;

public class Test_script2 extends Base_test {
	@Test(dataProvider = "testData")
	public void test1 (String un,String pwd) throws InterruptedException
	{
	POM2 p=new POM2(driver);	
	p.fn( "kiran");
	p.ln("Kiran");
	p.email("kiran@gmail.com");
	p.pwd("kiran@123");
	p.press();
	driver.navigate().refresh();
	}
	
	@DataProvider(name = "testdata")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "Kiran", "admin" }, 
	   { "Daru", "krishna"},
	   { "email", "kiran@gmail.com" }, 
	   { "pwd", "kiran@123"},
	 };
}

}
