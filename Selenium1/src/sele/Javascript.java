package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//pradeep changed file
public class Javascript {

	public static void main(String[] args) throws AWTException, InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "./soft/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
//		driver.get("https:www.instagram.com");
//		Robot rb=new Robot();
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_T);
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_T);
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//		 
//		Set<String> a=driver.getWindowHandles();
//		ArrayList<String>ax=new ArrayList<>(a);
//		
//		String val=ax.get(1);
//		driver.switchTo().window(val);
//		driver.get("https://www.facebook.com");
		
		
//      	driver.get("file:///C:/Users/User/Documents/ok/bha.html");
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("document.getElementById('a').value='success'");
//		Thread.sleep(3000);
//		js.executeScript("document.getElementById('a').value=' '");
		
		
//		driver.get("file:///C:/Users/User/Documents/ok/bha.html");
//		JavascriptExecutor js=(JavascriptExecutor)driver;	
//		WebElement dis=driver.findElement(By.xpath("//input[@type='text']"));
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].value='success'",dis);
//		Thread.sleep(3000);
//	    js.executeScript("arguments[0].value=' '",dis);
		
		
//		driver.get("https://www.facebook.com");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement el=driver.findElement(By.id("email"));
//		js.executeScript("arguments[0].value='username'", el);
//		WebElement el1=driver.findElement(By.name("login"));
//		js.executeScript("arguments[0].click();", el1);
		
		
		
//		driver.get("https://www.facebook.com");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		WebElement signup=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
//		driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
//		js.executeScript("arguments[0].click();", signup);
//		WebElement hidden=driver.findElement(By.name("custom_gender"));
//		js.executeScript("arguments[0].value='success'", hidden);
//		
//		driver.findElement(By.xpath("//label[.='Custom']")).click();
//		Thread.sleep(3000);
//		js.executeScript("arguments[0].value=' '", hidden);
		
		
		
//		driver.get("https://www.amazon.in");
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)","");
//		Thread.sleep(3000);
//		js.executeScript("window.scrollBy(0,-500)","");
		
		
		driver.get("https://www.amazon.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		for(int i=1;i<=3;i++)
		{
		js.executeScript("window.scrollBy(0,500)","");
		}
		Thread.sleep(3000);
		for(int i=1;i<=3;i++)
		{
		js.executeScript("window.scrollBy(0,-500)","");
		}
		
	}
}





