package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTMregistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("swethareddydornala@gmail.com");
		driver.findElement(By.id("password")).sendKeys("swethareddy");
		driver.findElement(By.id("Present-Address")).sendKeys("Banglore Kaikondralli");
		driver.findElement(By.id("Permanent-Address")).sendKeys("Thangallapally");
		driver.findElement(By.id("Female")).click();
		driver.findElement(By.id("Country")).sendKeys("India");
		driver.findElement(By.id("Skills")).sendKeys("Technical Skills");
		driver.findElement(By.id("Pincode")).sendKeys("560031");
		Thread.sleep(10000);
		//driver.findElement(By.className("btn btn-primary")).click();
	}

}
