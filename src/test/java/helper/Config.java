package helper;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Config {

	public static WebDriver driver ;
	public static Actions action ;
	
	public static void ConfigChrome() {
		System.setProperty("webdriver.chrome.driver","c:/chromedriver.exe");
		driver= new ChromeDriver();
	}
	
	public static void maximazeWindow() {
		driver.manage().window().maximize();
	}
	
	public static void attente (long s) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(s));
	}
	
	
	public static void navigate(String url) {
		driver.get(url);
	}
		
}
