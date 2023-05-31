package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jio.com/");
         driver.findElement(By.linkText("Mobile")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("True 5G")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("JioFiber")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Business")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Shop")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Apps")).click();
         Thread.sleep(2000);
         driver.findElement(By.linkText("Support")).click();
	
	}

}
