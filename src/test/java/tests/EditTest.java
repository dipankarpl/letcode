package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.EditPage;

public class EditTest extends TestBase {

	@Test
	public void editPageTest1() {
		EditPage ep = new EditPage(driver);
		ep.setFullName().sendKeys("Dipankar Paul");
	}

	@Test
	public void editPageTest2() {
		EditPage ep = new EditPage(driver);
		ep.setJoin().sendKeys(" added text");
		ep.setJoin().sendKeys(Keys.TAB);
	}

	@Test
	public void editPageTest3() {
		EditPage ep = new EditPage(driver);
		Assert.assertEquals(ep.setGetMe().getAttribute("value"), "ortonikc", "text not expected");
	}

	@Test
	public void editPageTest4() {
		EditPage ep = new EditPage(driver);
		ep.setClearMe().clear();
	}

	@Test
	public void editPageTest5() {
		EditPage ep = new EditPage(driver);
		Assert.assertEquals(ep.setNoEdit().isEnabled(), false, "field is enabled");
	}

	@Test
	public void editPageTest6() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String script = "return document.getElementById('dontwrite').readOnly";
		System.out.println(js.executeScript(script));
	}

}
