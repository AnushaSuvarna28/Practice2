package com.section2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri1 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Anchu\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/nlogin/login");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//p[contains(text() , '  I have work experience')]")).click();
		driver.findElement(By.className("uploadResume")).click();
		Thread.sleep(2000);
		StringSelection path = new StringSelection("D:\\cv\\CV-Anusha.pdf");
	    Clipboard cb = Toolkit.getDefaultToolkit().getSystemClipboard();
	    cb.setContents(path,null);
	    Robot r = new Robot();
	    r.keyPress(KeyEvent.VK_CONTROL);
	    r.keyPress(KeyEvent.VK_V);
	    r.keyRelease(KeyEvent.VK_CONTROL);
	    r.keyRelease(KeyEvent.VK_V);
	    r.keyPress(KeyEvent.VK_ENTER);
	    r.keyRelease(KeyEvent.VK_ENTER);
	    
	}

}
