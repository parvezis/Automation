package Konnect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Registration {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://konnect.creativesofttechnology.com/");
	    driver.navigate().to("https://konnect.creativesofttechnology.com/student/login");
	    driver.findElement(By.name("name")).sendKeys("Parvez");
	    driver.findElement(By.name("phone_number")).sendKeys("01813000190");
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("password_confirmation")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/button")).click();
	
	    try {
	        Thread.sleep(4000);
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	    try {
	    	driver.findElement(By.xpath("//*[@id=\"quiz\"]/div/div/strong/span"));
	    	System.out.println("Pass");
	    }
	    catch (Exception e) {
	    	System.out.println("Fail");
	    	
	    }
	    driver.quit();
	    

	}}

