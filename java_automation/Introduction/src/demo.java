import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class demo {

	public static void main(String[] args) {
    //create driver object
		
		
		//webDriver driver = new chromeDriver();
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Noisyboy\\Documents\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		 System.out.println(driver.getTitle());		
		driver.close();
		
		
	}

}
