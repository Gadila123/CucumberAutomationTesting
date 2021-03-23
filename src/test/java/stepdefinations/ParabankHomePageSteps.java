package stepdefinations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import Pages.ParabankHomePage;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ParabankHomePageSteps {

	WebDriver driver;
	String baseURL = "https://parabank.parasoft.com/parabank/index.htm";
	ParabankHomePage homepage = new ParabankHomePage(driver);

	@Given("user is on parabank home page")
	public void user_is_on_home_page_of_parabank() {
		System.setProperty("webdriver.chrome.driver",
				"G:\\All Softwares\\ChromeDriver's\\chromedriver_89\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}

	@When("user clicks on contact button")
	public void user_clicks_on_contact_button() {
		ParabankHomePage homepage = new ParabankHomePage(driver);
		homepage.ClickOnContactButton();
	}

	@Then("user enter customer form")
	public void user_enter_customer_form() {
		ParabankHomePage homepage = new ParabankHomePage(driver);
		homepage.submittingCustomerCareForm();
	}

	@Then("user can see the error")
	public void user_can_see_error() {
		ParabankHomePage homepage = new ParabankHomePage(driver);
		homepage.customerFromSubmissionError();

	}

	@After
	public void teardown() {
		driver.quit();
	}

}
