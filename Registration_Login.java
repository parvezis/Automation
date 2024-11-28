package Konnect;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebElement;

public class Registration_Login {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	    driver.get("https://konnect.creativesofttechnology.com/");
	    driver.navigate().to("https://konnect.creativesofttechnology.com/student/login");
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/ul/div[2]/a[2]")).click();
	    driver.findElement(By.name("name")).sendKeys("Arian");
	    driver.findElement(By.name("phone_number")).sendKeys("01958839777");
	    driver.findElement(By.name("password")).sendKeys("123456");
	    driver.findElement(By.name("password_confirmation")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"nav-profile\"]/form/button")).click();
	    try {
	    	driver.findElement(By.xpath("//*[@id=\"quiz\"]/div/div/strong/span"));
	    	System.out.println("Pass");
	    }
	    catch (Exception e) {
	    	System.out.println("Fail");
	    }
	   
	    driver.findElement(By.xpath("//*[@id=\"dropdownMenuButton1\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div/div[2]/ul/li[2]/a")).click();
	    driver.findElement(By.xpath("//*[@id=\"nav-home-tab\"]")).click();
	    driver.findElement(By.name("login_phone_number")).sendKeys("01952012888");
	    driver.findElement(By.name("login_password")).sendKeys("123456");
	    driver.findElement(By.xpath("//*[@id=\"nav-home\"]/form/button")).click();
	    
	    try {
	        Thread.sleep(20000);
	    } catch (InterruptedException ea) {
	        ea.printStackTrace();
	    }
	    try {
	    	driver.findElement(By.xpath("//*[@id=\"quiz\"]/div/div/strong/span"));
	    	System.out.println("Pass");
	    }
	    catch (Exception ea) {
	    	System.out.println("Fail");
	    	
	    }
	    driver.quit();
	    

	}}

