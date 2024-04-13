package GetWindowHandles;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_GetWindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersracp=22636");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement GoogleSignIn=driver.findElement(By.xpath("//span[.='Google']"));
		GoogleSignIn.click();
		Set<String> Browsers=driver.getWindowHandles();
		Iterator<String> ParentChild=Browsers.iterator();
		String ParentBrowser=ParentChild.next();
		String ChildBrowser=ParentChild.next();
		driver.switchTo().window(ChildBrowser);
		driver.manage().window().maximize();
		driver.close();

	}

}
