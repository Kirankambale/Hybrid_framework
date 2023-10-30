package Facebook_login;




import org.testng.Assert;
import org.testng.annotations.Test;

public class ListenerRunnerclass {
	@Test
	public void test1()
	{
		System.out.println("hello india");
		
	}
	@Test(dependsOnMethods = "test1")
	public void test2()
	{
		System.out.println("hello asia");
		Assert.fail();
		
	}
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("hello bengaluru");
		
	}
}
