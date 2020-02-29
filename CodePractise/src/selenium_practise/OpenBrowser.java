package selenium_practise;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowser {


	    public static void main(String[] args)
	    {
	    	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application.exe");
	    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Adinesh\\Downloads\\chromedriver_win32.exe");
	    	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Adinesh\\Downloads\\geckodriver-v0.26.0-win32.exe");
	        //WebDriver driver = new ChromeDriver();
	    	WebDriver driver = new FirefoxDriver();
	      driver.get("https://www.selenium.dev/");
	    }
	}