import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import static java.time.Duration.ofSeconds;
import io.appium.java_client.android.AndroidElement;

public class gestures extends base {
	
	public static void main(String[] args) throws MalformedURLException {
		AndroidDriver<AndroidElement> driver = capabilities();
		TouchAction touch = new TouchAction(driver);
		WebElement weViews = driver.findElementByAndroidUIAutomator("text(\"Views\")");
		touch.tap(tapOptions().withElement(element(weViews))).perform();
		WebElement weViewsExpandList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")");
		touch.tap(tapOptions().withElement(element(weViewsExpandList))).perform();
		WebElement weViewsExpandListFirst = driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")");
		touch.tap(tapOptions().withElement(element(weViewsExpandListFirst))).perform();
		WebElement weViewsExpandListFirstPeopleNames = driver.findElementByAndroidUIAutomator("text(\"People Names\")");
		touch.longPress(longPressOptions().withElement(element(weViewsExpandListFirstPeopleNames)).withDuration(ofSeconds(2))).release().perform();
		
	}
	 
}
