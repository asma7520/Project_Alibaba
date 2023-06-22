package step_definitions;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Language_and_currency extends Base{
	@Given("We are on the  landing page")
	public void we_are_on_the_landing_page() {
	    navigateURL(host);
	}

	@When("We mousehover on region setting")
	public void we_mousehover_on_region_setting() {
		mousehover(By.xpath("//div[@class='sc-hd-right sc-hd-float-r']/div[5]/div/div/div/label")) ; 
	}

	@When("We click on language dropdown menu")
	public void we_click_on_language_dropdown_menu() {
	    click(By.xpath("//div[@id='J_SC_header']//div[@class='sc-hd-row sc-hd-link']//div[@class='input-container'][1]//div[@class='ellipsis']"));
	}

	@When("We click on Hindi language")
	public void we_click_on_Hindi_language() throws InterruptedException {
		Thread.sleep(2000);
	    click(By.xpath("//div[@class='sc-hd-row sc-hd-link']/div/div[3]/div[5]/div/div/div[2]/div[2]/div/div/div[2]/ul/li/ul/li[7]"));
	    //div[@class='sc-hd-right sc-hd-float-r']//div[@class='sc-hd-lan']//div[@class='header-language-currency ready']//div[@class='droplist ']//ul/li[@class='no-label']/ul/li[7]
	}
	

	@When("We click on currency dropdown menu")
	public void we_click_on_currency_dropdown_menu() throws InterruptedException {
		mousehover(By.xpath("//div[@class='sc-hd-right sc-hd-float-r']/div[5]/div/div/div/label"));
		List<WebElement> c = driver.findElements(By.xpath("//div[@class='sc-hd-right sc-hd-float-r']//div[@class='sc-hd-lan']//div[@class='header-language-currency ready']//div[@class='droplist has-filter']//ul/li[@style='display: list-item;'][2]/ul/li"));
		
		for(WebElement a : c) {
			String i = a.getText();
			if (i.contains("INR")) {
				a.click();
				break;
		}
			}

	}


	/*
	 * @When("We select INR") public void we_select_INR() {
	 * 
	 * mousehover(By.
	 * xpath("//div[@class='sc-hd-right sc-hd-float-r']/div[5]/div/div/div/label"));
	 * }
	 */

	@Then("We click on save button")
	public void we_click_on_save_button() {
		click(By.xpath("//div[@id='J_SC_header']/header/div/div/div[3]/div[5]/div/div/div[2]/div[5]/button"));
	}
 
	

	@Then("We verify the new language")
	public void we_verify_the_new_language() {
		  String actualLan = getElementText(By.xpath("//div[@id='root']/div[1]/div[2]/div[2]/a/div/div/div[1]"));
		    Assert.assertEquals("Ready to Ship", actualLan);
		    System.out.println("Verification�done");
		}


	 
	}




