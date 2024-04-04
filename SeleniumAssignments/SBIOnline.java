package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBIOnline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ChromeDriver driver=new ChromeDriver();
      driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
      driver.manage().window().maximize();
      WebElement continueLogin=driver.findElement(By.linkText("CONTINUE TO LOGIN"));
      continueLogin.click();
      WebElement username= driver.findElement(By.id("username"));
      username.sendKeys("dornalaswetha1@gmail.com");
      WebElement password= driver.findElement(By.name("password"));
      password.sendKeys("swetha123");
      WebElement captcha=driver.findElement(By.name("loginCaptchaValue"));
      captcha.sendKeys("12345");
      WebElement loginbutton=driver.findElement(By.id("Button2"));
      loginbutton.click();
      System.out.println(driver.getTitle());
      driver.close();
	}

}
