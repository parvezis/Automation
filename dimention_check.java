package Konnect;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class dimention_check {
	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://konnect.creativesofttechnology.com");
		driver.manage().window().maximize();
		Dimension Size = driver.manage().window().getSize();
		System.out.println("The Size of the Window is   " + Size);
		int Height = driver.manage().window().getSize().getHeight();
		System.out.println("The Height of the Window is:    " + Height);
		int Width = driver.manage().window().getSize().getWidth();
		System.out.println("The Width of the Window is:    " + Width);
		driver.manage().window().setSize(new Dimension(1300,700));
}
}

