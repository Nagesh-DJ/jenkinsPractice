package pack2;

import org.testng.annotations.Test;

public class CreateOrgTest {
@Test(groups = "SmokeTesting")
public void createOrgTest()
	{
	String Browser=System.getProperty("browser");
	String url=System.getProperty("url");
	String username=System.getProperty("username");
	String password=System.getProperty("password");
	System.out.println("browser: "+Browser);
	System.out.println("url: "+url);
	System.out.println("username: "+username);
	System.out.println("password: "+password);

	System.out.println("execute createOrgTest");
	}

@Test(groups = {"RegressionTesting"})
public void modifyOrgTest()
	{
	System.out.println("execute modifyOrgTest");
	}


}
