package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // Launch the browser
		driver.get("https://demo.opencart.com.gr/"); // Launch the URL
		String title = driver.getTitle(); // Capture the title of the webpage
		System.out.println("Title of the page is : " + title);
		String url = driver.getCurrentUrl(); // Capture the CurrentURL of the application
		System.out.println("URL of the page is :" + url);
		String pageSource = driver.getPageSource(); // Capture the source code of the application
		System.out.println("Page source :" + pageSource);
	}

}
