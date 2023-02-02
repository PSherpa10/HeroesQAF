package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.GoogleBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class GoogleSearch extends GoogleBase {
	HomePage P;

	@Given("I am on google homepage")
	public void i_am_on_google_homepage() {
		getDriver();

	}

	@When("I enter search {string}")
	public void i_enter_search(String term) {
		// WebElement searchBox;
		// searchBox = driver.findElement(By.name("q"));
		// searchBox.sendKeys(term);
		P = new HomePage(driver);
		P.entersearch(term);

	}

	@When("I click on google search button")
	public void i_click_on_google_search_button() {
		// WebElement searchBtn;
		// searchBtn = driver.findElement(By.name("btnK"));
		// searchBtn.click();
		P.entersearchbtn();

	}

	@Then("I receive related search result")
	public void i_receive_related_search_result() {
		WebElement results = driver.findElement(By.id("result-stats"));
		System.out.println(results);

		driver.close();

	}

}
