package TouchTunes.SampleSpotifyTest;

import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;

import org.openqa.selenium.WebElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.offset.ElementOption;

public class scrollBar extends baseChrome {
	
	public static void main(String[] args) throws MalformedURLException {
		
		
		AndroidDriver<AndroidElement>  driver= capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		 WebElement seek_bar=driver.findElementByClassName("android.widget.SeekBar");
         // get start co-ordinate of seekbar
         int start=seek_bar.getLocation().getX();
         //Get width of seekbar
         int end=seek_bar.getSize().getWidth();
         //get location of seekbar vertically
         int y=seek_bar.getLocation().getY();

     // Select till which position you want to move the seekbar
     TouchAction t=new TouchAction(driver);

     //Move it will the end
     t.longPress(longPressOptions().withElement(element(start,y)).withDuration(ofSeconds(2))).moveTo(element(end,y)).release().perform();

     //Move it 40%
     int moveTo=(int)(end*0.4);
     t.longPress(longPressOptions().withElement(element(start,y)).withDuration(ofSeconds(2))).moveTo(element(moveTo,y)).release().perform();
  
		
		

}

	private static ElementOption element(int start, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	}
