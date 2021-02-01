package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditPage {
	public WebDriver driver;

	public EditPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		driver.get("https://letcode.in/edit");
	}

	@FindBy(id = "fullName")
	WebElement editFullName;
	@FindBy(id = "join")
	WebElement editAppendText;
	@FindBy(id = "getMe")
	WebElement editInsideTextBox;
	@FindBy(id = "clearMe")
	WebElement editClearMe;
	@FindBy(id = "noEdit")
	WebElement editNoEdit;

	public WebElement setFullName() {
		return editFullName;
	}

	public WebElement setJoin() {
		return editAppendText;
	}

	public WebElement setGetMe() {
		return editInsideTextBox;
	}

	public WebElement setClearMe() {
		return editClearMe;
	}

	public WebElement setNoEdit() {
		return editNoEdit;
	}

}
