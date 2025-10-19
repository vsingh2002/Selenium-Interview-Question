package day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropdown);
		// select.selectByIndex(1);
		// select.selectByVisibleText("Purple");
		// select.selectByValue("9");
		List<WebElement> allOptions = select.getOptions();
		for (WebElement options : allOptions) {
			// System.out.println(options.getText());
			if (options.getText().equals("Purple")) {
				options.click();
				break;
			}
		}
	}
}
