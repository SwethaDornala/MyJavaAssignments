package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		WebElement hoveroverlogin = driver.findElement(By.xpath("//span[.='Login']"));		
		Actions a1=new Actions(driver);
		a1.moveToElement(hoveroverlogin).perform();
		WebElement signup=driver.findElement(By.xpath("//span[.='Sign Up']"));
	    signup.click();
	    WebElement mobilenumber=driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
	    mobilenumber.sendKeys("9502297757");
	    WebElement continuebutton= driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		continuebutton.click();
	    driver.close();
	}

}
