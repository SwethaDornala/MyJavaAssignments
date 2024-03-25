package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLinkTextMobiles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver c=new ChromeDriver();
		//c.get("https://www.amazon.om/?ref_=nav_ya_signin&");
		c.get("https://www.amazon.in");
		c.manage().window().maximize();
		//c.manage().window().minimize();
		Thread.sleep(7000);
		c.findElement(By.linkText("Mobiles")).click();
		c.close();

	}

}
