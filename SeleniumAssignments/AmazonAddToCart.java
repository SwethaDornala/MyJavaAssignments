package GetWindowHandles;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement Searchtextbox = driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Shoe");
		WebElement Searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		Searchbutton.click();
		WebElement FirstShoe = driver.findElement(By.xpath("((//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20'])[1]//a)[1]"));
		FirstShoe.click();
		Set<String> BrowserIds = driver.getWindowHandles();
		Iterator<String> windows = BrowserIds.iterator();
		String parentwindow = windows.next();
		String childwindow = windows.next();
		driver.switchTo().window(childwindow);
		WebElement AddtoCart = driver.findElement(By.id("add-to-cart-button"));
		AddtoCart.click();
		WebElement proceedtobuy = driver.findElement(By.name("proceedToRetailCheckout"));
		proceedtobuy.click();
		driver.close();

	}

}
