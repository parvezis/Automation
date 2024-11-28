package Konnect;
		 import org.openqa.selenium.WebDriver;
		 import org.openqa.selenium.firefox.FirefoxDriver;


		 public class tite_check {

		 	public static void main(String[] args) {
		 		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		 	    WebDriver driver = new FirefoxDriver();
		 	    driver.manage().window().maximize();
		 	    driver.get("https://konnect.creativesofttechnology.com/");
		 	    if(driver.getTitle().equals("Konnect-CHT"))
		 	    {
		 	    	System.out.println("Title is Correct");
		 	    }
		 	    else
		 	    {
		 	    	System.out.println("Title is not Correct");
		 	    }   
		 	}
		 }
		 	