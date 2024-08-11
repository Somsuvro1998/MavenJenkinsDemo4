package mjd4_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoParametrsTest1 {
	@Test
	public void demoParametersTest()
	{
	String BROWSER = System.getProperty("browser");	
	String URL = System.getProperty("url");
	System.out.println(BROWSER);
	System.out.println(URL);
	
	WebDriver driver;
	
	if(BROWSER.equalsIgnoreCase("Chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("Edge"))
	{
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	else
	{
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
	}
	driver.manage().window().maximize();
	driver.get(URL);
	driver.close();
	}

}
