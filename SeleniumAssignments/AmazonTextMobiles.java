package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTextMobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver c=new ChromeDriver();
		c.get("https://www.amazon.in");
		c.manage().window().maximize();
		c.findElement(By.xpath("//a[.='Mobiles']")).click();
		c.close();

	}

}