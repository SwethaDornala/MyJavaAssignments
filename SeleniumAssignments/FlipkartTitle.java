package Seleniumbrowser;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		String title=driver.getTitle();
		System.out.println(title);
		driver.quit();

	}

}
