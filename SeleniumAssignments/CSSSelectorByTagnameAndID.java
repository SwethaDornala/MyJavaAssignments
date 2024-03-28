package CSSSelectors;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorByTagnameAndID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement searchtextfield=driver.findElement(By.cssSelector("textarea#APjFqb"));
		searchtextfield.sendKeys("India");
		searchtextfield.sendKeys(Keys.ENTER);
		driver.close();
	}

}
