package Konnect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Navigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.google.co.uk/");
	    driver.navigate().to("https://konnect.creativesofttechnology.com/student/login");
				driver.navigate().back();
				try {
			        Thread.sleep(4000);
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }
				driver.navigate().forward();
				try {
			        Thread.sleep(4000);
			    } catch (InterruptedException e) {
			        e.printStackTrace();
			    }
				driver.quit()
;			}
		}
