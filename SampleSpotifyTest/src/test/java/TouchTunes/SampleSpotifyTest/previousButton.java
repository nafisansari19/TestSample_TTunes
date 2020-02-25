package TouchTunes.SampleSpotifyTest;

import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class previousButton extends baseChrome {
	
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement>  driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		TouchAction t=new TouchAction(driver);
		WebElement expandList=driver.findElementByXPath("//android.widget.ToggleButton[@text='previous']");
		t.tap(tapOptions().withElement(element(expandList))).perform();

}
}