package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttributeValue {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.get("https://demo.vtiger.com/vtigercrm/");
		driver.get("https://demo.nopcommerce.com/login?ReturnUrl=%2Fvendor%2Fapply");
		WebElement searchStore = driver.findElement(By.id("small-searchterms"));
		String text = searchStore.getText();
		System.out.println("Result from getText()" + text);
		String texts = searchStore.getAttribute("id");
		System.out.println("Result from getAttribute()" + texts);
		WebElement getText = driver.findElement(By.xpath("//button[text()='Search']"));
		System.out.println("getText ():" + getText.getText());
	}
}
//WebElement username = driver.findElement(By.id("username"));
//username.clear();
//username.sendKeys("Thakur");
//String value = username.getAttribute("placeholder");
//System.out.println(value);
