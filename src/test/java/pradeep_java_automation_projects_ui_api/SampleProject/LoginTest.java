package pradeep_java_automation_projects_ui_api.SampleProject;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pageObjects.LoginPageObject;

public class LoginTest extends BaseTest{
	
	@Test
	public void login() {
		LoginPageObject login = new LoginPageObject(driver);
		login.inputUserName("validUsername");
		login.inputPassword("validPassword");
		login.clickLoginButton();
		String dashboardUsername = login.verifyDashboard();
		Assert.assertEquals(dashboardUsername, "dashBoardUsername");
	}

}
