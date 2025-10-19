package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlesDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/register");
		WebElement day = driver.findElement(By.id("day"));
		Select select = new Select(day);
		select.selectByValue("2");
		List<WebElement> allOptions = select.getOptions();
		System.out.println(allOptions.size());

		for (WebElement options : allOptions) {
			if(options.getText().equals("2"))
			System.out.println(options.getText());
		}
	}

}
