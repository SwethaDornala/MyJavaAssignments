package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement Searchtextbox=driver.findElement(By.id("twotabsearchtextbox"));
		Searchtextbox.sendKeys("Shoe");
		WebElement Searchbutton =driver.findElement(By.id("nav-search-submit-button"));
        Searchbutton.click();
        WebElement FirstShoe =driver.findElement(By.xpath("//div[@data-index='3']//a"));
        w.until(ExpectedConditions.visibilityOf(FirstShoe));
        FirstShoe.click();
        driver.quit();

	}

}
