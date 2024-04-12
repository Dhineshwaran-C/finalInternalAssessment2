package finalAssessment.finalAssessment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AppTest 
{
	public static WebDriver driver;
	
	@Test
	public static void openBrowser() {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		System.out.println("Browser Opened");
	}
	 @Test
	 public static void register_signup()
	 { 
		 driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("8220202736");
		 driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("dhinesh@02");
		 driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
		 System.out.println("Logged in Successfully");
	 }
	  
	 @Test
	 public static void addToCart() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("pendrive");
		 driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"a-autoid-3-announce\"]")).click();
		 System.out.println("Item Added To Cart");
	 }
	  
	 @Test
	 public static void click_Checkout() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input")).click();
		 Thread.sleep(5000);
		 System.out.println("Item Checked Out");
	 }
	  
	 @Test
	 public static void logout() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 driver.navigate().back();
		 WebElement logoutHover = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span/span"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(logoutHover).perform();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span")).click();
		 System.out.println("Logged out");
	 }

	 @Test
	 public static void closeBrowser()
	 {
	 driver.quit();
	 }
	
}
