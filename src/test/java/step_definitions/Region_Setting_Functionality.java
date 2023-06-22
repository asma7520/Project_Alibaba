package step_definitions;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Region_Setting_Functionality extends Base{
	@Given("I am in landing page")
	public void i_am_in_landing_page() {
		navigateURL(host);
	}

	@When("I input data into scarch box {int}")
	public void i_input_data_into_scarch_box(Integer rowNum) {
		String s = testData.get(rowNum).get("productName");
		sendkeys(By.xpath("//input[@class='search-bar-input']"),s);
	}

	@Then("I click on scarch button")
	public void i_click_on_scarch_button() {
		click(By.xpath("//input[@class='search-bar-input']/following-sibling::button"));
	    
	}
	
	@Then("I get back to the landing page")
	public void i_get_back_to_the_landing_page() {
		driver.navigate().back();
	}

	
	/*
	 * @When("I mouseHover on region setting") public void
	 * i_mouseHover_on_region_setting() throws InterruptedException {
	 * Thread.sleep(2000); mousehover(By.xpath("//div[2]/span[2]")); }
	 */


}
//div[2]/span[2]