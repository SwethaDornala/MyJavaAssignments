package DropDownhandle;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CountNoOfOptionsInDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://amazon.in");
				driver.manage().window().maximize();
				WebElement searchdropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
				Select s1=new Select(searchdropdown);
				List<WebElement> getoptions=s1.getOptions();
				int count=getoptions.size();
				System.out.println(count);
				driver.close();
				

	}

}
