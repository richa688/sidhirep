package selenumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) {
		
		//browsersetup
		WebDriverManager.chromedriver().setup();	
		
		// open browser
		WebDriver driver = new ChromeDriver();
		
		// Redirect to google
		driver.get("https://www.google.com/");
		
		//findElement
		//WebElement textbox=driver.findElement(By.id("APjFqb"));
		//WebElement textbox=driver.findElement(By.className("gLFyf"));
		//WebElement textbox=driver.findElement(By.tagName("textarea"));
		//WebElement textbox=driver.findElement(By.cssSelector("textarea.gLFyf"));
		//WebElement textbox=driver.findElement(By.cssSelector("textarea#APjFqb"));
		//WebElement textbox=driver.findElement(By.cssSelector("textarea[title=\"Search\"]"));
		//WebElement textbox=driver.findElement(By.cssSelector("textarea.gLFyf[title=\"Search\"]"));
		//WebElement textbox=driver.findElement(By.cssSelector("textarea.gLFyf[title=\"Search\"][name=\"q\"]"));
		//WebElement textbox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/textarea"));		
		//WebElement textbox=driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
		WebElement textbox=driver.findElement(By.xpath("//textarea[@title=\"Search\" or @name=\"q\"]"));
		
		textbox.sendKeys("Selenium");
		//driver.findElement(By.linkText("Business")).click();
		//driver.findElement(By.partialLinkText("How Search")).click();
		//WebElement button =driver.findElement(By.name("btnK"));
		//button.click();
		driver.findElement(By.name("btnK")).submit();
		//driver.close();

	}

}
