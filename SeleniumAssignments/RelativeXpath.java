package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.xpath("(//textarea)[1]")).sendKeys("India");
		Thread.sleep(1000);
		driver.close();

	}

}
