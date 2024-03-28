package Seleniumbrowser;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTextMobiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("(//span[.='Mobiles'])[2]")).click();
		driver.quit();

	}

}
