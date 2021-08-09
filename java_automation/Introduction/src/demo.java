import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;        



public class demo {

	public static void main(String[] args) {
    //create driver object
		
		
		//webDriver driver = new chromeDriver();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noisyboy\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("hhtps://www.google.com");
		 System.out.println(driver.getTitle());		
		
		
		
	}

}
