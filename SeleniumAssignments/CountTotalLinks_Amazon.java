package Seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTotalLinks_Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		int count=all_links.size();
		System.out.println(count);
		driver.close();
	}

}
