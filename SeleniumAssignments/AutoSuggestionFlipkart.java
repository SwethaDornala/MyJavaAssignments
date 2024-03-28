package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		driver.manage().window().maximize();
		WebElement searchtextbox=driver.findElement(By.xpath("//input[@name='q']"));
		searchtextbox.sendKeys("Shoe");
		Thread.sleep(1000);
		List<WebElement> autosuggestions=driver.findElements(By.xpath("//div/form/ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li"));
		Thread.sleep(1000);
	    autosuggestions.get(3).click();
	    driver.close();
	}

}
