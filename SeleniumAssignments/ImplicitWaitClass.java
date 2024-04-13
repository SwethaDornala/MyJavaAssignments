package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement Searchtextbox=driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Shoe");
		WebElement Searchbutton =driver.findElement(By.id("nav-search-submit-button"));
        Searchbutton.click();
      WebElement FirstShoe =driver.findElement(By.xpath("//div[@data-index='3']//a"));
        FirstShoe.click();
        driver.quit();
	}


}
