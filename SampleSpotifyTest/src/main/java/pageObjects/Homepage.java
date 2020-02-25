package pageObjects;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class Homepage {
	
	@AndroidFindBy(xpath= "//*[@id=\"main\"]/div/div[4]/div[3]/footer/div")
	public WebElement playingButton;

}
