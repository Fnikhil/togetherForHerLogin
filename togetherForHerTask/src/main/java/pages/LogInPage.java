package pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class LogInPage extends BaseClass {

	@FindBy(xpath = "//android.widget.EditText[@index=2]")
	private MobileElement nameTab;

	@FindBy(xpath = "//android.view.ViewGroup[@index=3]")
	private MobileElement nextButton;

	public LogInPage(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	public void enterName(String name) {
		nameTab.sendKeys(name);
		nextButton.click();
//		Thread.sleep(5000);
	}

}
