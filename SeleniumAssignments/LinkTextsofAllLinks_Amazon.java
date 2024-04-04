package Seleniumbrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextsofAllLinks_Amazon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		List<WebElement> all_links=driver.findElements(By.tagName("a"));
		int count=all_links.size();
		int sum=0;
		for(int i=0;i<count;i++)
		{
			String a_linktext=all_links.get(i).getText();
			//WebElement aLinkText=all_links.get(i);
			String a_href=all_links.get(i).getAttribute("href");
			System.out.println("Link text of tag "+a_linktext);
			System.out.println("href of tag "+a_href);
			if(a_linktext.isEmpty()==true)
			{
				sum=sum+1;
			}
		}
		System.out.println("count of all anchor tags "+count);
		System.out.println("count of all Emptyanchor tags "+sum);
		driver.close();
	}

}
