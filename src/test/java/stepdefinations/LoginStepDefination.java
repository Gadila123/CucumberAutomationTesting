package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.junit.Assert;

public class LoginStepDefination {

	public static WebDriver driver;
	String baseURL = "https://qa-fake.herokuapp.com/";

	@Given("^user is already on Login Page$")
	public void user_is_already_on_login_page() {
	
		System.setProperty("webdriver.chrome.driver",
				"G:\\All Softwares\\ChromeDriver's\\chromedriver_89\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
	}

	@When("^title of login page is QA Fake$")
	public void title_of_login_page_is_qa_fake() {
		String loginpage_title = driver.getTitle();
		System.out.println(loginpage_title);
		Assert.assertEquals("QA Fake", loginpage_title);

	}

	@Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) {
		WebElement usname = driver.findElement(By.id("username"));
		usname.clear();
		usname.sendKeys(username);
		WebElement pword = driver.findElement(By.id("password"));
		pword.clear();
		pword.sendKeys(password);
	}

	@Then("^user checked rember me$")
	public void user_checked_rember_me() {
		WebElement remeber_me = driver.findElement(By.id("rememberme"));
		remeber_me.click();
//		WebElement login=driver.findElement(By.xpath("//button[text()='Login']"));
//		Assert.assertTrue(login.isEnabled());

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {

		WebElement login = driver.findElement(By.xpath("//button[text()='Login']"));
		Assert.assertTrue(login.isEnabled());
		login.click();

	}

	@Then("user get the secret string on home screen")
	public void user_get_the_secret_string_on_home_screen() {

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement result_secret = driver.findElement(By.id("result"));
		result_secret.isDisplayed();
	}

	@Then("Close the browser")
	public void close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

}
