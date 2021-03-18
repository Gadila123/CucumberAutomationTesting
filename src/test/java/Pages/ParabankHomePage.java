package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ParabankHomePage {

	WebDriver driver;

	public ParabankHomePage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.CSS, using = "input[name='username']")
	private WebElement Username;

	@FindBy(how = How.CSS, using = "input[name='Password']")
	private WebElement Password;

	@FindBy(how = How.CSS, using = "div[class='login']")
	private WebElement Login;

	@FindBy(how = How.XPATH, using = "//a[text()='contact']")
	private WebElement ContactButton;

	@FindBy(how = How.CSS, using = "input[id='name']")
	private WebElement Name;

	@FindBy(how = How.CSS, using = "input[id='email']")
	private WebElement Email;

	@FindBy(how = How.CSS, using = "input[id='phone']")
	private WebElement Phone;

	@FindBy(how = How.CSS, using = "textarea[id='message']")
	private WebElement Message;

	@FindBy(how = How.CSS, using = "input[type='submit']")
	private WebElement SubmitFormButton;

	@FindBy(how = How.CSS, using = "p[class='error']")

	private WebElement cuctomerSubmitformError;

	public void userLogin(String username, String password) {

		Username.sendKeys(username);
		Password.sendKeys(password);
		Login.click();
	}

	public void ClickOnContactButton() {
		ContactButton.click();

	}

	public void submittingCustomerCareForm() {

		Name.sendKeys("Venkatesh");
		Email.sendKeys("venkie1010@gmail.com");
		Phone.sendKeys("12345677777");
		Message.sendKeys("hello I am venkatesh and I am haing issues");
		SubmitFormButton.click();

	}
	public void customerFromSubmissionError() {
		
		String errortext=cuctomerSubmitformError.getText();
		System.out.println("++++++++++++++++++++++++"+errortext+"+++++++++++++++++++++++++++++++");
	}
	
	

}
