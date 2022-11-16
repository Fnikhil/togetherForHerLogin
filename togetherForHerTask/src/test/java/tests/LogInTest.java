package tests;

import org.testng.annotations.Test;

import pages.BaseClass;
import pages.ChooseLanguage;
import pages.LogInPage;
import pages.SelectMonth;
import pages.SignIn;

public class LogInTest extends BaseClass {
	
	ChooseLanguage language = new ChooseLanguage(driver);
	LogInPage logInPage = new LogInPage(driver);
	SelectMonth selectMonth = new SelectMonth(driver);
	SignIn signIn = new SignIn(driver);

	@Test
	public void logInToTogether() {
		
		language.selectLanguage("English");
		logInPage.enterName("NAME OF PERSON");
		selectMonth.chooseMonth("2");
		signIn.signIn();
		
	}
}
