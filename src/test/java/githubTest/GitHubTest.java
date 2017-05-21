package githubTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class GitHubTest {
	
	@Test
	public void googleTest() throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\webdriverTest\\folder\\geckodriver.exe");
		WebDriver wd=new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("https://www.flipkart.com/");
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(src, new File("F:\\Testing_Materials\\Vmetrics_Selenuim\\SelenuimWorkSpace\\WebDriverTest\\Screenshots\\google.jpg"));
		FileUtils.copyFile(src, new File("G:\\workspace\\GitHubTest\\ScreenShoot\\Flipkart.jpg"));
		wd.quit();
	}
	

}
