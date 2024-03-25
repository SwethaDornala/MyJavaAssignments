package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("swethareddydornala@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("swethareddy");
		Thread.sleep(1000);
		WebElement genderradiobutton=driver.findElement(By.id("Female"));
		if(genderradiobutton.isSelected() == false)
		{
		genderradiobutton.click();
		}
		else
			System.out.println("Already selected");
		WebElement presentaddress=driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("Banglore Kaikondralli");
		Thread.sleep(10000);
		driver.close();
	}

}
