package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Reports {

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
		
		//to click on reports section
		driver.findElement(By.xpath("//*[@id=\"container_reports\"]")).click();
		Thread.sleep(1000);
		//click on drop-down
		driver.findElement(By.xpath("//*[@id=\"ext-gen15\"]/td[2]/em")).click();
		Thread.sleep(1000);
		//click on by report name
		driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]")).click();
		Thread.sleep(1000);
		//click on create chart
		driver.findElement(By.xpath("//*[@id=\"ext-comp-1158\"]/span")).click();
		Thread.sleep(2000);	
		//display horizontal chart
		driver.findElement(By.id("HORIZONTAL_BAR")).click();
		Thread.sleep(2000);
		//display as pie chart
		driver.findElement(By.id("PIE_CHART")).click();
		Thread.sleep(2000);
		//cancel the task
		driver.findElement(By.id("createChartLightbox_cancelBtn")).click();
		Thread.sleep(2000);
		
		//create new report
		driver.findElement(By.xpath("//*[@id=\"ext-comp-1017\"]/span")).click();
		Thread.sleep(1000);
		//configure report parameters
		driver.findElement(By.xpath("//*[@id=\"createReportLightBox_content\"]/div[2]/div[1]/div/div[2]/div/div[4]")).click();
		Thread.sleep(1000);
		//click on current month drop down
		driver.findElement(By.xpath("//*[@id=\"ext-comp-1019\"]/tbody/tr/td[1]")).click();
		Thread.sleep(1000);
		//choose previous month
		driver.findElement(By.id("ext-gen428")).click();
		Thread.sleep(1000);
		//click on data grouping
		driver.findElement(By.xpath("//*[@id=\"ext-gen98\"]")).click();
		Thread.sleep(1000);
		//click on week
		driver.findElement(By.xpath("//*[@id=\"ext-gen240\"]")).click();
		Thread.sleep(1000);
		//to generate HTML
		driver.findElement(By.xpath("//*[@id=\"applyReportConfiguration\"]/span")).click();
		Thread.sleep(1000);
		//logout
		driver.findElement(By.id("logoutLink")).click();

	}

}
