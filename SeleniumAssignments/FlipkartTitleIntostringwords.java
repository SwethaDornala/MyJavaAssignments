package Seleniumbrowser;

import java.util.Arrays;

import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartTitleIntostringwords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://flipkart.com");
		String title=driver.getTitle();
		System.out.println(title);
		char a=' ';
		String arr[]=new String[title.length()];
		int j=0;
		int stindex=0;
		for(int i=0;i<title.length();i++)
		{
			a=title.charAt(i);
			if(!(Character.isAlphabetic(a) ==true || Character.isDigit(a) ==true))
			{
				if(stindex!=i)
				{
				arr[j]=title.substring(stindex, i);
				j++;
				}
				stindex=i+1;
				
			}
		}
		System.out.println(Arrays.toString(arr));
		driver.quit();

	}

}
