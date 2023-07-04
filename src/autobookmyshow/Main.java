package autobookmyshow;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Main {
 
	public static void main(String[] args) {

		// Setting chrome driver
		
        	System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver_win32\\chromedriver.exe");

		// Opening chrome tab
		
		WebDriver driver = new ChromeDriver();

		// Maximizing tab 
		driver.manage().window().maximize();

		// Opening bookmyshow url
		 driver.get("https://in.bookmyshow.com/explore/home/");

		// Getting xpath for setting banglore city and setting it 
		 WebElement bangloreCity = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div[2]/ul/li[3]/div/div"));
		 bangloreCity.click();

		// Getting xpath for signin button and clicking it 
		 WebElement signInButton = driver.findElement(By.xpath("//*[@id=\"super-container\"]/div[2]/header/div[1]/div/div/div/div[2]/div[2]/div[1]"));
		 signInButton.click();

		// Getting xpath for email button and clicking it 
		 WebElement emailBtn = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/div"));
		 emailBtn.click();

		// Getting email placeholder by id and setting email 
		WebElement emailField = driver.findElement(By.id("emailId"));
	        emailField.sendKeys("testusersel@yopmail.com");

		// Getting xpath for continue button and clicking it 
	        WebElement continueButton = driver.findElement(By.xpath("//*[@id=\"modal-root\"]/div/div/div/div/div[2]/form/div[2]/button"));
	        continueButton.click();

		// Opening yopmail url
	        driver.get("http://www.yopmail.com/en/");
	        WebElement yopmailEmailField = driver.findElement(By.id("login"));

		// Getting email placeholder by id and setting email 
	        yopmailEmailField.sendKeys("testusersel@yopmail.com");

		// Getting xpath for submit button and clicking it 
	        WebElement checkInboxButton = driver.findElement(By.id("refreshbut"));
	        checkInboxButton.click();
	        
	 
	    
	        
	       
	            
	 
	    }
}
