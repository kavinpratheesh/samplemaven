package example2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class Cc {
   /* static WebDriver driver;
    public WebDriver setDriver() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\Documents\\example2\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://webapps.tekstac.com/Users/");
    	return driver;
    }
    
    public void setName(String nameValue) {
    	driver.findElement(By.xpath("//input[contains(@id,'name')]")).sendKeys(nameValue);
    }
    
    public void setAddress(String addressValue) {
    	driver.findElement(By.xpath("//textarea[contains(@id,'address')]")).sendKeys(addressValue);
    }public void setMobile(String mobileValue) {
    	driver.findElement(By.xpath("//input[contains(@id,'mobile')]")).sendKeys(mobileValue);
    }
    public void setEmail(String emailValue) {
    	driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys(emailValue);
    }
    public void submit() {
    	
    	driver.findElement(By.xpath("//button[contains(@id,'Submit')]")).click();
    }
    
    public String getLicenseDetails() {
    	System.out.println("yes");
    	By resu=By.xpath("//div[contains(@id,'result')]");
    	WebElement ele=driver.findElement(resu);
    	String msg=ele.getText();
    	return msg;
    }
    public void closeBrowser() {
    	driver.quit();
    }*/
	public static void main(String[] args) {
		System.out.println("Hello");
		/*Cc kav=new Cc();
		driver=kav.setDriver();
		kav.setName("abc");
		kav.setAddress("bcd");
		kav.setMobile("9876543210");
		kav.setEmail("abc@gmail.com");
		kav.submit();
        String msg=kav.getLicenseDetails();
        System.out.println(msg);
        kav.closeBrowser();*/
	}
}
