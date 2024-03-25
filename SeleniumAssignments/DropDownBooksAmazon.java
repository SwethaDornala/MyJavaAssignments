package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownBooksAmazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement searchdropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select s1=new Select(searchdropdown);
		s1.selectByVisibleText("Books");
		WebElement searchtextbox=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		searchtextbox.sendKeys("World");
		searchtextbox.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		driver.close();
		

	}

}
