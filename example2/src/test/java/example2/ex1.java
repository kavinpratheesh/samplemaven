package example2;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ex1 {
 
	 /*static WebDriver driver;
	    public WebDriver setDriver() {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\Documents\\example2\\drivers\\chromedriver\\chromedriver.exe");
			WebDriver driver1=new ChromeDriver();
			driver1.get("https://webapps.tekstac.com/SoftwareLicence/");
	    	return driver;
	    }
	    
	    public void setName(String name) {
	    	Select sel=new Select(driver.findElement(By.id("licenceName")));
	    	sel.selectByVisibleText(name);
	    }
	    
	    public void setQuantity(String quantity) {
	    	driver.findElement(By.id("quantity")).sendKeys(quantity);
	    }
	    
	    public String getLicenseDetails() {
	    	String msg=driver.findElement(By.id("result")).getText();
	    	return msg;
	    }
	    public void closeBrowser() {
	    	driver.quit();
	    }
		public static void main(String[] args) {
			ex1 kav=new ex1();
			driver=kav.setDriver();
			kav.setName("Eclipse Public License");
			kav.setQuantity("2");
	        String msg=kav.getLicenseDetails();
	        System.out.println(msg);
	        kav.closeBrowser();
		}*/
	static WebDriver driver;
	public WebDriver setupDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kavin\\Documents\\example2\\drivers\\chromedriver\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.google.com/");
		return driver1;
	}

	public void setElements() throws Exception
	{
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Royal Enfield");
		driver.findElement(By.xpath("//input[@name='btnK']")).sendKeys(Keys.RETURN);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),'Images')]")).click();
		//a[contains(text(),'Images')]
	   /*driver.findElement(By.id("txtUsername")).sendKeys("Admin");
       driver.findElement(By.name("txtPassword")).sendKeys("admin123");
       driver.findElement(By.id("btnLogin")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("menu_admin_viewAdminModule")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[@id='menu_admin_Qualifications']")).click();
       driver.findElement(By.xpath("//a[@id='menu_admin_viewSkills']")).click();
       driver.findElement(By.id("btnAdd")).click();
       driver.findElement(By.id("skill_name")).sendKeys("Testing");
       driver.findElement(By.id("skill_description")).sendKeys("Software Testing");
       driver.findElement(By.id("btnSave")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),'Testing')]//parent::td//preceding-sibling::td//child::input")).click();
       Thread.sleep(2000);
       driver.findElement(By.id("btnDel")).click();
      /* driver.findElement(By.name("username")).sendKeys("john jebin");
       //Select sel=new Select(driver.findElement(By.id("licenceName")));
       //sel.selectByVisibleText("Chennai");
       driver.findElement(By.name("password")).sendKeys("123");
       driver.findElement(By.name("phonenumber")).sendKeys("9876543210");
       driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
         */
       
	}
	
	public static void main(String[] args) throws Exception
	{
	    ex1 reg=new ex1();
	    driver=reg.setupDriver();
	    reg.setElements();
	}


	
}
