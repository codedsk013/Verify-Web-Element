package VerifyElement.VerifyWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyElementOnWebPage {
	
	public static void main(String[] args) throws InterruptedException {
		
		 //Browser launcher
		System.setProperty("webdriver.chrome.driver", "E:\\Software\\chromedriver_win32 (3)/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//Login with FaceBook Button
		boolean isElementDisplayed = driver.findElement(By.xpath("/html/body/div[1]/section/main/div/div/div[1]/div[2]/form/div[1]/button")).isDisplayed();
		//SignUp Button
		boolean isElementDisabled = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[7]/div")).isEnabled();
		
		//Validation FaceBook button Displayed
		if (isElementDisplayed) {
			System.out.println("Button is Displayed");
		}else {
			System.out.println("Button is Not Displayed");
		}
		
		//Validation SignUp Button Disabled
		if (isElementDisabled) {
			System.out.println("Button is Disabled");
		}else {
			System.out.println("Button is Not Disabled");
		}
		
		//Mobile Number or Email
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[3]/div/label/input")).sendKeys("1234567890");
		
		//Full Name
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[4]/div/label/input")).sendKeys("Test1");
		
		//User Name
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[5]/div/label/input")).sendKeys("TestUser");
		
		//Password
		driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[6]/div/label/input")).sendKeys("P@ssword1!");
		
		boolean isElementEnabled = driver.findElement(By.xpath("//*[@id=\"react-root\"]/section/main/div/div/div[1]/div[2]/form/div[7]/div")).isEnabled();
		
		//Validation SignUp Button Enabled
				if (isElementDisabled) {
					System.out.println("Button is Enabled");
				}else {
					System.out.println("Button is Not Enabled");
				}
		
	}

}
