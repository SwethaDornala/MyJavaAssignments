package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("email")).sendKeys("swethareddydornala@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("swethareddy");
		driver.findElement(By.name("login")).click();
		driver.close();
		

	}

}
