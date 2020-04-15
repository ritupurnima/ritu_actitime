package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class users {

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
		Thread.sleep(1000);

		//click on users
		driver.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[6]/a")).click();
		Thread.sleep(1000);
		//click on new user
		driver.findElement(By.xpath("//*[@id=\"pageBody\"]/tbody/tr[1]/td[3]/div/div[3]/div[1]")).click();
		Thread.sleep(1000);
		//entering user information
		driver.findElement(By.xpath("//*[@id=\"createUserPanel_firstNameField\"]")).sendKeys("Smitha");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"createUserPanel_lastNameField\"]")).sendKeys("KC");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"createUserPanel_emailField\"]")).sendKeys("ritu.15ec089@citech.edu.in");
		Thread.sleep(1000);
		
		//click on department drop down
		driver.findElement(By.xpath("//*[@id=\"createUserPanel_accountInformationSection\"]/div/div[3]/div[2]/div/div[2]/div/div[1]")).click();
		Thread.sleep(1000);
		
		//click on quality control
		driver.findElement(By.xpath("//*[@id=\"createUserPanel_accountInformationSection\"]/div/div[3]/div[2]/div/div[2]/div/div[2]/div/div[1]/div[2]/div[5]")).click();
		Thread.sleep(1000);
		
		//click on save information
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[3]/div/div[3]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		
		//close
		driver.findElement(By.xpath("//*[@id=\"createUserPanel\"]/div[2]/div[1]/div[5]/span")).click();
		Thread.sleep(1000);
		
		//logout
		driver.findElement(By.id("logoutLink")).click();
		Thread.sleep(1000);
		
		driver.close();
	}
}
