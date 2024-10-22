package selenumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Command {

	public static void main(String[] args) {
		//browsersetup
		WebDriverManager.chromedriver().setup();	
		
		// open browser
		WebDriver driver = new ChromeDriver();
		
		// Redirect to google
		driver.get("https://www.google.com/");
        WebElement textbox=driver.findElement(By.xpath("//textarea[@title=\"Search\" or @name=\"q\"]"));
        System.out.println("Title : "+textbox.getAttribute("title"));
		Dimension d=textbox.getSize();
		System.out.println("Height "+d.getHeight());
		System.out.println("Width "+d.getWidth());
        
        textbox.sendKeys("Selenium");
		
		Point p=textbox.getLocation();
		System.out.println("X "+p.getX());
		System.out.println("Y "+p.getY());
		
		driver.findElement(By.name("btnK")).submit();
		
		String data=driver.findElement(By.name("q")).getAttribute("value");
		System.out.println("data "+data);
		
	}

}
