package Seleniumbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GTMDragandDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement soursepath=driver.findElement(By.xpath("(//div[@id='div1'])[7]"));
		WebElement destinationpath=driver.findElement(By.xpath("//div[@id='div2']"));
		Actions a1=new Actions(driver);
		a1.dragAndDrop(soursepath, destinationpath).perform();
		Thread.sleep(2000);
		a1.dragAndDrop(destinationpath,soursepath).perform();
		Thread.sleep(2000);
		driver.close();

	}

}
