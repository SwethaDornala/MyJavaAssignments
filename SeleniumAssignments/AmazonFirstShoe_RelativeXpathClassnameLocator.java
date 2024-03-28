package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFirstShoe_RelativeXpathClassnameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement Searchtextbox=driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Shoe");
		WebElement Searchbutton =driver.findElement(By.id("nav-search-submit-button"));
        Searchbutton.click();
      WebElement FirstShoe =driver.findElement(By.xpath("((//div[@class='sg-col-4-of-24 sg-col-4-of-12 s-result-item s-asin sg-col-4-of-16 AdHolder sg-col s-widget-spacing-small sg-col-4-of-20'])[1]//a)[1]"));
    	FirstShoe.click();
        driver.close();
	}

}
