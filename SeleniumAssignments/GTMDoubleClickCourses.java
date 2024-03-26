package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTMDoubleClickCourses {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com");
		driver.manage().window().maximize();
		WebElement courses=driver.findElement(By.xpath("(//a[.='Courses'])[1]"));
		Actions a1=new Actions(driver);
		a1.doubleClick(courses).perform();
		Thread.sleep(3000);
		driver.close();

	}

}
