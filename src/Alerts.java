import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sid\\eclipse-workspace\\SeleniumConcepts\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		
		
		WebElement simpleAlert = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
		simpleAlert.click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
	
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		
		WebElement confirmAlert = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[1]"));
		confirmAlert.click();
		Thread.sleep(3000);
		alert.dismiss();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(3000);
		
		
		WebElement promptAlert = driver.findElement(By.xpath("(//button[@class='btn btn-default btn-lg'])[2]"));
		promptAlert.click();
		Thread.sleep(3000);
		alert.sendKeys("prompt demo");
		alert.accept();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
		
		driver.close();
			
	}

}
