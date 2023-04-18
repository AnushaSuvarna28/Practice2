package com.section1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class Demo1
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver", "D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://demo.actitime.com/login.do");
	driver.findElement(By.cssSelector("#username")).sendKeys("admin");
	driver.findElement(By.cssSelector(".textField.pwdfield")).sendKeys("manager");
	driver.findElement(By.cssSelector("#keepLoggedInCheckBox")).click();
	driver.findElement(By.cssSelector("#loginButton")).click();
	driver.findElement(By.id("container_tasks")).click();
	driver.findElement(By.xpath("//table[@class = 'headerRowTable']/tbody/tr/td")).click();
	driver.findElement(By.cssSelector(".delete.button")).click();
	WebElement msg = driver.findElement(By.xpath("//div[contains(text(),'You are about to delete')]"));
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(msg));
	System.out.println(msg.getText());
}
}
