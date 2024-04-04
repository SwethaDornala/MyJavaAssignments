package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PerformClickWithoutClickMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://google.com");
				driver.manage().window().maximize();
				WebElement Gmail=driver.findElement(By.linkText("Gmail"));
				Actions a1=new Actions(driver);
				a1.moveToElement(Gmail).perform();
				Gmail.sendKeys(Keys.ENTER);
				driver.close();

	}

}
