package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrowDownGoogle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		WebElement searchtextbox=driver.findElement(By.xpath("(//textarea)[1]"));
		searchtextbox.sendKeys("India");
		for(int i=0;i<4;i++)
		{
		searchtextbox.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(1000);
		System.out.println(i);
		}
		searchtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();

	}

}
