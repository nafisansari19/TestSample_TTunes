package TouchTunes.SampleSpotifyTest;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;


public class baseChrome {
    
	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>  driver;
		DesiredCapabilities cap= new DesiredCapabilities();

	     cap.setCapability(MobileCapabilityType.DEVICE_NAME, "nafisemulator");
	     cap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");

	    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	    
	    driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://open.spotify.com/");
	    driver.findElementByClassName("android.widget.Button").click();
	    driver.findElementByClassName("android.widget.EditText").sendKeys("nafisansari0319@gmail.com");
	    driver.findElementByXPath("//*[@id=\'login-password\']").sendKeys("nafis12345");
	    driver.findElementByXPath("//*[@id=\'login-button\']").click();
	   
	    return driver;    
	    

	}
    

}
