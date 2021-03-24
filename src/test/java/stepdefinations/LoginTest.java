package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {

	public static WebDriver driver;
	String baseURL = "https://www.facebook.com/";

	@Given("^user navigate to facebook homepage$")
	public void user_navigate_to_facebook_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"G:\\All Softwares\\ChromeDriver's\\chromedriver_87\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}

	@When("^user enters username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
	public void user_enters_username_as_and_password_as(String username, String password) throws Throwable {
		WebElement usname = driver.findElement(By.id("username"));
		usname.clear();
		usname.sendKeys(username);
		WebElement pword = driver.findElement(By.id("password"));
		pword.clear();
		pword.sendKeys(password);
	}

//	@When("^user clicks on login button$")
//	public void user_clicks_on_login_button() throws Throwable {
//		WebElement loginButton = driver.findElement(By.name("login"));
//		loginButton.click();
//
//	}

	@Then("^user should be login into facebook successfuly$")
	public void user_should_be_login_into_facebook_successfuly() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		System.out.println("devlocal2");
	}

}
