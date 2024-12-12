package pack1;

import org.testng.annotations.Test;

public class CreateContactTest {
@Test(groups = "RegionalRegressionTesting")
public void createContactTest()
	{
	String Browser=System.getProperty("browser");
	String url=System.getProperty("url");
	String username=System.getProperty("username");
	String password=System.getProperty("password");
	System.out.println("browser: "+Browser);
	System.out.println("url: "+url);
	System.out.println("username: "+username);
	System.out.println("password: "+password);

	System.out.println("execute createContactTest");
	}
@Test(groups = "SmokeTesting")
public void modifyContactTest()
	{
	System.out.println("execute modifyContactTest");
	}

@Test
public void deleteContactTest()
{
	System.out.println("deleteContactTest");
}
}
