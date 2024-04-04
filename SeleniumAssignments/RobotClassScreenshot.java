package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class RobotClassScreenshot {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
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
		//Thread.sleep(2000);
		TakesScreenshot s1=     driver;
		File source=s1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Admin\\eclipse-workspace\\Seleniumclass\\scb\\one"+new RobotClassScreenshot().getClass()+"_"+new Date().getTime()+".png");
		FileHandler.copy(source,destination);
		driver.close();

	}

}
