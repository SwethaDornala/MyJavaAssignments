package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GTMregistration_CtrlCV {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement presentaddress=driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("Banglore Kaikondralli");
		presentaddress.sendKeys(Keys.CONTROL+"A");
		presentaddress.sendKeys(Keys.CONTROL+"C");
		WebElement permanenttaddress=driver.findElement(By.id("Permanent-Address"));
		permanenttaddress.sendKeys(Keys.CONTROL+"V");
		Thread.sleep(1000);
		driver.close();
	}

}
