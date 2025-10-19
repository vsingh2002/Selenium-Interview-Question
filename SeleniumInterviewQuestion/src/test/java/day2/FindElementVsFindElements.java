package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		// findElement() -> Return the single element
		WebElement searchStore = driver.findElement(By.xpath("//input[@placeholder='Search store']"));
		searchStore.sendKeys("ABC");
		// findElements () -> Returns the multiple web elements
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(allLinks.size());
		List<WebElement> allImage = driver.findElements(By.tagName("img"));
		System.out.println("All images :" + allImage.size());
		List<WebElement> allL = driver.findElements(By.tagName("l"));
		System.out.println("All L :" + allL.size());

	}

}
