package all_about_locators_Alibaba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locator_Practice_Alibaba {

	public static void main(String[] args) throws InterruptedException {

		// setup chromedriver setup
		WebDriverManager.chromedriver().setup();

		// create a object and instatntiate
		WebDriver driver = new ChromeDriver();

		// Maximize window
		driver.manage().window().maximize();

		// get url
		driver.get("https://www.alibaba.com");

		// mousehober on ship to
		Thread.sleep(2000);
		WebElement webelement = driver.findElement(By.xpath("//span[text()='Ship to: ']"));
		Actions act = new Actions(driver);
		act.moveToElement(webelement).build().perform();

		Thread.sleep(2000);

		// div[@class='input-container ship-to-country']

		WebElement webelement2 = driver.findElement(By.xpath("//div[@class='input-container ship-to-country']"));
		String s = webelement2.getTagName();
		System.out.println(s);

		webelement2.click();

	}

}