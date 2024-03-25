package Seleniumbrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/learningHTML2.html");
		driver.manage().window().maximize();
		driver.switchTo().alert().accept();
		Thread.sleep(1000);

	}

}
