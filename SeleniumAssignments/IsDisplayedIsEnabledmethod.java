package Seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedIsEnabledmethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement searchtextbox=driver.findElement(By.xpath("//textarea[@name='q']"));
		searchtextbox.sendKeys("India");
		Thread.sleep(1000);
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div[@id='Alh6id']/div/div/ul[@role='listbox']/li"));
		WebElement googlesearch=driver.findElement(By.xpath("//input[@name='btnK']"));
		if(googlesearch.isDisplayed() == true && googlesearch.isEnabled() == true)
		{
			Thread.sleep(1000);
			googlesearch.click();
			Thread.sleep(1000);
		}
		driver.close();
	}

}
