package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonanchortagnyTagname {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement linkcomponent=driver.findElement(By.tagName("a"));
		Thread.sleep(2000);
		System.out.println(linkcomponent.getTagName());
		linkcomponent.click();
		Thread.sleep(1000);
		driver.close();
	}

}
