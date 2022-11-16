package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ChooseLanguage extends BaseClass {

	@FindBy(xpath = "//android.view.ViewGroup[@index=3]")
	private MobileElement hindi;

	@FindBy(xpath = "//android.view.ViewGroup[@index=4]")
	private MobileElement english;

	@FindBy(xpath = "//android.view.ViewGroup[@index=5]")
	private MobileElement nextButton;

	public ChooseLanguage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectLanguage(String lang) {
		if (lang.toLowerCase().contains("eng")) {
			english.click();
		} else {
			hindi.click();
		}

		nextButton.click();

//		Thread.sleep(5000);
	}

}
