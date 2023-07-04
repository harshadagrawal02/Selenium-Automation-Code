package autobookmyshow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		 driver.get("https://in.bookmyshow.com/explore/home/");
		 
		 WebElement bangloreCity = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[3]/div/div"));
		 bangloreCity.click();
		 
		 WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]"));
		 signInButton.click();
		 
		 WebElement emailBtn = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/div"));
		 emailBtn.click();
		 
		    WebElement emailField = driver.findElement(By.id("emailId"));
	        emailField.sendKeys("testusersel@yopmail.com");
	        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button"));
	        continueButton.click();
	        
	        driver.get("http://www.yopmail.com/en/");
	        WebElement yopmailEmailField = driver.findElement(By.id("login"));
	        yopmailEmailField.sendKeys("testusersel@yopmail.com");
	        WebElement checkInboxButton = driver.findElement(By.id("refreshbut"));
	        checkInboxButton.click();
	        
	 
	    
	        
	       
	            
	 
	    }
}