package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class SelectMonth extends BaseClass {

	@FindBy(xpath = "//android.view.ViewGroup[@index=0]")
	private MobileElement nextButton;

	public SelectMonth(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(driver, this);
	}

	public void chooseMonth(String currentMonth) {

		List<MobileElement> months = new ArrayList<MobileElement>();
		months = driver.findElements(By.xpath("//android.widget.TextView"));
		for (WebElement month : months) {
			if (month.getText().equals(currentMonth)) {
				month.click();
				break;
			}

		}

		nextButton.click();

//		Thread.sleep(5000);
	}
}
