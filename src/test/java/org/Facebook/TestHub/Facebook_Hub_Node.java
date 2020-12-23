package org.Facebook.TestHub;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;



public class Facebook_Hub_Node {

	public static void main(String[] args) throws MalformedURLException{
		String nodeURL="http://192.168.43.156:4444/wd/hub";
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		
		System.setProperty("webdriver.chrome.driver","D:\\JAVA\\New Workplace\\FacebookHubNode\\Driver\\chromedriver.exe");
		
		WebDriver driver=new RemoteWebDriver(new URL(nodeURL),cap);
		
		driver.get("https://www.facebook.com/");
		
	}
	
}
