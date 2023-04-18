package com.section1;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class rxpath {

	public static void main(String[] args) throws InterruptedException {
		Random r = new Random();
		int num= r.nextInt(10000);
		String expcname = "Anusha";
		expcname = expcname+num;
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//a[contains(@	id,'login')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id = 'container_tasks']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class = 'inputFieldWithPlaceholder newNameField inputNameField']")).sendKeys(expcname);
		driver.findElement(By.xpath("//textarea[@placeholder='Enter Customer Description']")).sendKeys("Diploma holder in Computer Science and Engineering");
		driver.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		Thread.sleep(2000);
		String actcname = driver.findElement(By.cssSelector(".titleEditButtonContainer>.title")).getText();
		System.out.println(actcname);
		if (expcname.equals(actcname))
		{
			System.out.println("TC is Pass");
		}
		else
		{
			System.out.println("TC is Failed");
		}
		

	}

}
