package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tasks {

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
		
		driver.findElement(By.xpath("//*[@id=\"container_tasks\"]")).click();
		Thread.sleep(1000);
		//Type exam in search bar
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[1]/div[2]/div[2]/div[1]/div/table/tbody/tr/td[1]/div/input")).sendKeys("Exams");
		Thread.sleep(1000);
		//click on radio button
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/div")).click();
		Thread.sleep(1000);
		//click on copy to
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[2]")).click();
		Thread.sleep(1000);
		//cancel
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[6]/div[1]/div[1]/div[8]/div[2]")).click();
		Thread.sleep(1000);
		//click on move to
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[3]")).click();
		Thread.sleep(1000);
		//cancel
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[5]/div[1]/div[1]/div[8]/div[2]")).click();
		Thread.sleep(1000);
		//click on assign to
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[4]")).click();
		Thread.sleep(1000);
		//click on assign
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[3]/div[1]/div[1]/div/div[3]/div[1]/div/span")).click();
		Thread.sleep(1000);
		//enable exams radio button
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[1]/div/div[1]/div[1]/div[1]/div[2]/table/tbody/tr/td[1]/div")).click();
		Thread.sleep(1000);
		//click on change status
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[5]")).click();
		Thread.sleep(1000);
		//click on apply
		driver.findElement(By.xpath("//*[@id=\"taskManagementPage\"]/div[2]/div[4]/div[1]/div[1]/div/div[3]/div[2]")).click();
		Thread.sleep(1000);
		//click on clear section
		driver.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[4]/div/div/div[1]/div/div[7]/span")).click();
		Thread.sleep(1000);
		
		//logout
		driver.findElement(By.id("logoutLink")).click();
	}

}
