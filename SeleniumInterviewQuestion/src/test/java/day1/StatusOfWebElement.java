package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusOfWebElement {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		// isDisplayed() isEnabled()
		WebElement searchStore = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean status1 = searchStore.isDisplayed();
		boolean status2 = searchStore.isEnabled();
		System.out.println("Is displayed or not :" + status1);
		System.out.println("Is Enabled or not :" + status2);

		// isSelected()

		WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
		System.out.println(male.isSelected());// False
		System.out.println(female.isSelected());// False
		male.click();
		System.out.println(male.isSelected()); // True
		System.out.println(female.isSelected()); // False
		female.click();
		System.out.println(male.isSelected());// False
		System.out.println(female.isSelected()); // True
	}

}
