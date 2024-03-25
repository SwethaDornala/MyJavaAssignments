package Seleniumbrowser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClassRightClickOptionSelection {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.com");
		driver.manage().window().maximize();
		WebElement gmaillink=driver.findElement(By.xpath("//a[.='Gmail']"));
		Actions a1=new Actions(driver);
		a1.contextClick(gmaillink).perform();
		Thread.sleep(1000);
		Robot r1=new Robot();
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_DOWN);
		r1.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		driver.close();

	}

}
