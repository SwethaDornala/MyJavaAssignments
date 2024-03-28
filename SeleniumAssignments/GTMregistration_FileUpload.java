package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GTMregistration_FileUpload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("swethareddydornala@gmail.com");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("swethareddy");
		WebElement presentaddress = driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("Banglore Kaikondralli");
		WebElement permanenttaddress = driver.findElement(By.id("Permanent-Address"));
		permanenttaddress.sendKeys("Thangallapally");
		WebElement genderradiobutton = driver.findElement(By.id("Female"));
		genderradiobutton.click();
		WebElement CountryDropdown = driver.findElement(By.id("Country"));
		Select s1 = new Select(CountryDropdown);
		s1.selectByVisibleText("India");
		WebElement SkillsDropdown = driver.findElement(By.id("Skills"));
		Select s2 = new Select(SkillsDropdown);
		s2.selectByVisibleText("Technical Skills");
		WebElement pincode = driver.findElement(By.id("Pincode"));
		pincode.sendKeys("560031");
		Thread.sleep(1000);
		WebElement choosefile = driver.findElement(By.id("file"));
		// xpath("//input[@id='file']"));
		// Thread.sleep(1000);
		// choosefile.click();
		// Thread.sleep(1000);
		choosefile.sendKeys("C:\\Users\\Admin\\Documents\\Ok.png");
		// driver.findElement(By.className("btn btn-primary")).click();
	}

}
