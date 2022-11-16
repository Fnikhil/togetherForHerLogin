package pages;

import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SignIn extends BaseClass {

	@FindBy(xpath = "//android.widget.TextView[@text='Sign in with Google']")
	private MobileElement logInUsingGoogle;

	public SignIn(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	public void signIn() {
		logInUsingGoogle.click();

//		Thread.sleep(5000);
	}

}
