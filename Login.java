package Konnect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://konnect.creativesofttechnology.com/");
	    driver.navigate().to("https://konnect.creativesofttechnology.com/student/login");
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/div[2]/a[2]")).click();
	    driver.findElement(By.xpath("//*[@id=\"nav-home-tab\"]")).click();
	    driver.findElement(By.name("login_phone_number")).sendKeys("01982059051");
	    driver.findElement(By.name("login_password")).sendKeys("123456");
	    
	    driver.findElement(By.xpath("//*[@id=\"nav-home\"]/form/button")).click();
	    
	    try {
	        Thread.sleep(3000);
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
