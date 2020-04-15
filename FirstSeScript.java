package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeScript {

	public static void main(String[] args) throws Exception 
	{
	
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("actiTIME");
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(500);
		driver.get("https://online.actitime.com/slk4/login.do");
		driver.findElement(By.name("username")).sendKeys("ritu.15ec089@citech.edu.in");
		driver.findElement(By.name("pwd")).sendKeys("aVAhANup");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		
		
		//time track
		
		//enter time track
		driver.findElement(By.id("guiNotificationContentCloseBtn")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"spent_135_0\"]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"spent_138_0\"]")).sendKeys("0");
		driver.findElement(By.xpath("//*[@id=\"spent_95_0\"]")).sendKeys("0");
		driver.findElement(By.id("SubmitTTButton")).click();
		driver.findElement(By.xpath("//*[@id=\"DiscardChangesButton\"]")).click();
		Thread.sleep(1000);  
		
		//view time track
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[2]/a")).click();	
		Thread.sleep(1000);
		
		//lock time track
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[3]/a")).click();		
		Thread.sleep(1000);
		
		//approve time track
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[2]/td[2]/div[4]/a")).click();		
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);
		
		driver.close();

	}

}
