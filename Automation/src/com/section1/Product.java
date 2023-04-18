package com.section1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Product 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.cssSelector("._2KpZ6l._2doB4z")).click();
		
		driver.findElement(By.cssSelector("._3704LK")).sendKeys("iphonex");
		Thread.sleep(2000);
		
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(2000);
		
		
		String pname1 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Silver, 64 GB)']")).getText();
		String pprice1 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Silver, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname1+"   ---->   "+pprice1);
		
		
		String pname2 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Space Gray, 64 GB)']")).getText();
		String pprice2 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Space Gray, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname2+"   ---->   "+pprice2);
		

		String pname3 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Space Gray, 256 GB)']")).getText();
		String pprice3 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Space Gray, 256 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname3+"   ---->   "+pprice3);
		
		
		String pname4 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Silver, 256 GB)']")).getText();
		String pprice4 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone X (Silver, 256 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname4+"   ---->   "+pprice4);
		
		
		String pname5 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (White, 128 GB)']")).getText();
		String pprice5 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (White, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname5+"   ---->   "+pprice5);
		
		
		String pname6 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Black, 128 GB)']")).getText();
		String pprice6 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Black, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname6+"   ---->   "+pprice6);
		
		
		String pname7 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (White, 64 GB)']")).getText();
		String pprice7 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (White, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname7+"   ---->   "+pprice7);
		
		
		String pname8 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Black, 64 GB)']")).getText();
		String pprice8 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Black, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname8+"   ---->   "+pprice8);
		
		String pname9 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Red, 64 GB)']")).getText();
		String pprice9 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Red, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname9+"   ---->   "+pprice9);
		
		String pname10 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Red, 128 GB)']")).getText();
		String pprice10 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Red, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname10+"   ---->   "+pprice10);
		
		String pname11 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Pink, 128 GB)']")).getText();
		String pprice11 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Pink, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname11+"   ---->   "+pprice11);
		
		
		String pname12 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Purple, 64 GB)']")).getText();
		String pprice12 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Purple, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname12+"   ---->   "+pprice12);
		

		String pname13 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Starlight, 128 GB)']")).getText();
		String pprice13 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Starlight, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname13+"   ---->   "+pprice13);
		
		
		String pname14 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Midnight, 128 GB)']")).getText();
		String pprice14 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Midnight, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname14+"   ---->   "+pprice14);
		
		
		String pname15 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Green, 128 GB)']")).getText();
		String pprice15 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Green, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname15+"   ---->   "+pprice15);
		
		
		String pname16 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Green, 128 GB)']")).getText();
		String pprice16 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Green, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname16+"   ---->   "+pprice16);
		
		
		String pname17 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']")).getText();
		String pprice17 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 ((PRODUCT)RED, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname17+"   ---->   "+pprice17);
		
		
		String pname18 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Purple, 128 GB)']")).getText();
		String pprice18 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Purple, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname18+"   ---->   "+pprice18);
		
		String pname19 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (Blue, 64 GB)']")).getText();
		String pprice19 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (Blue, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname19+"   ---->   "+pprice19);
		
		String pname20 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Green, 64 GB)']")).getText();
		String pprice20 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (Green, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname20+"   ---->   "+pprice20);
		
		String pname21 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Blue, 128 GB)']")).getText();
		String pprice21 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Blue, 128 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname21+"   ---->   "+pprice21);
		
		
		String pname22 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (White, 64 GB)']")).getText();
		String pprice22 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (White, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname22+"   ---->   "+pprice22);
		

		String pname23 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Midnight, 256 GB)']")).getText();
		String pprice23 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 13 (Midnight, 256 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname23+"   ---->   "+pprice23);
		
		
		String pname24 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (Black, 64 GB)']")).getText();
		String pprice24 = driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 12 Mini (Black, 64 GB)']/../../div[2]/div[1]/div[1]/div")).getText();
		System.out.println(pname24+"   ---->   "+pprice24);
		
		
	}

}
