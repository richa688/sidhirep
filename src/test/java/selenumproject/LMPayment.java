package selenumproject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class LMPayment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Connecting driver with script
		//WebDriverManager.edgedriver().setup();
		WebDriverManager.chromedriver().setup();
		//it will open browser
		//WebDriver driver =new EdgeDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.lamarquisejewellery.com/");
		//Thread.sleep(3000);
		
		//Scenario 1
		WebElement shop = driver.findElement(By.xpath("//*[@id=\"menu-item-884\"]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(shop).perform();

        WebElement newArrivals = driver.findElement(By.xpath("//*[@id=\"menu-item-3523\"]/a"));
        newArrivals.click();
        
        
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromViewport(10, 10);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 600)
                .perform();
        
        WebElement Ivr = driver.findElement(By.xpath("//*[@id=\"0\"]/div[2]/div/a"));
        Ivr.click();
        System.out.println(driver.getCurrentUrl());
        
        //Thread.sleep(1000);
        driver.findElement(By.id("size_val")).click();
        //Thread.sleep(1000);
        
        System.out.println("clicked");
            
		  Select select = new Select(driver.findElement(By.id("23321")));
		  select.selectByIndex(1);
		  /*
        WebElement addBag = driver.findElement(By.xpath("//*[@id=\"product-23321\"]/div[1]/div[34]/div[1]/form/div[34]/div[2]/button"));
        addBag.click();
        
        WebElement checkout = driver.findElement(By.xpath("//*[@id=\"modalShoppingCart\"]/div/div[1]/div[5]/a"));
        checkout.click();
        
        WebElement checkbtn = driver.findElement(By.xpath("//*[@id=\"gest_checkout\"]"));
        checkbtn.click();
        
        //Shipping address
       // dropdown ms 
        Select title = new Select(driver.findElement(By.id("shipping_title")));
        title.selectByVisibleText("Mr.");
        
        WebElement firstName =driver.findElement(By.xpath("//*[@id=\"shipping_first_name\"]"));
        firstName.sendKeys("Preha");
        
        WebElement lastName =driver.findElement(By.xpath("//*[@id=\"shipping_last_name\"]"));
        lastName.sendKeys("Thakkar");
        
        Select countryCode=new Select(driver.findElement(By.id("//*[@id=\\\"shipping_country_code_val\\\"]")));
        countryCode.selectByVisibleText("(+971)UNITED ARAB EMIRATES");

        
        WebElement contactNo = driver.findElement(By.xpath("//*[@id=\"shipping_contact\"]")); 
        contactNo.sendKeys("6388872938");
        
        WebElement Address = driver.findElement(By.xpath("//*[@id=\"shipping_address_1\"]"));
        Address.sendKeys("124 Al Wuheida St - Hor Al Anz East - Dubai - United Arab Emirates");
        
        WebElement street = driver.findElement(By.xpath("//*[@id=\"street_no_login\"]"));
        street.sendKeys("124");
        
        WebElement House = driver.findElement(By.xpath("//*[@id=\"shipping_address_2\"]"));
        House.sendKeys("AI Hor");
        
        WebElement PoBox = driver.findElement(By.xpath("//*[@id=\"shipping_city\"]"));
        PoBox.sendKeys("123");
        
        WebElement area = driver.findElement(By.xpath("//*[@id=\"shipping_city\"]"));
        area.sendKeys("Herao");
        
        WebElement emirate = driver.findElement(By.xpath("//*[@id=\"shipping_state\"]"));
        emirate.sendKeys("PPT");
        
        Select country = new Select(driver.findElement(By.id("shipping_country")));
        country.selectByValue("United Arab Emirates");
        
        WebElement addressType = driver.findElement(By.xpath("//*[@id=\"billing_address_type_field\"]/span/label[2]/span"));
        addressType.click();
        
        WebElement btnContinue = driver.findElement(By.xpath("//*[@id=\"continue_btn\"]"));
        btnContinue.click();
        
        WebElement cardNo = driver.findElement(By.xpath("//*[@id=\"Field-numberInput\"]"));
        cardNo.sendKeys("1234 1234 1234 1234");
        WebElement cardNo1 = driver.findElement(By.xpath("//*[@id=\"Field-numberInput\"]"));
        cardNo1.sendKeys("1234 1234 1234 1234");
        
        WebElement expirationDate = driver.findElement(By.xpath("//*[@id=\"Field-expiryInput\"]"));
        expirationDate.sendKeys("09/28");
        
        WebElement securityCode = driver.findElement(By.xpath("//*[@id=\"Field-cvcInput\"]"));
        securityCode.sendKeys("693");
        
        Select countryCode1=new Select(driver.findElement(By.id("gest_country_code_val")));
        countryCode1.selectByVisibleText("(+971)UNITED ARAB EMIRATES");

        
        WebElement contactNo1 = driver.findElement(By.xpath("//*[@id=\"gest_contact\"]"));
        contactNo1.sendKeys("6388872938");
        
        WebElement Email = driver.findElement(By.xpath("//*[@id=\"guest_email_field\"]"));
        Email.sendKeys("prehathakkar76@gmail.com");
        
        WebElement placeOrder = driver.findElement(By.xpath("//*[@id=\"place_order\"]"));
        placeOrder.click();
        
           */     

	}

}
