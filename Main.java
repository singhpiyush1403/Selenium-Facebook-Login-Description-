
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Variable {

	public static void main(String[] args) {
		
		String username = "Admin";
		String password = " Admin";
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("Http://Facebook.com");
		driver.manage().window().maximize();
	    driver.findElement( By.xpath("//*[@id=\"email\"]")).sendKeys("username");
	    
	    driver.findElement(By.id("pass")).sendKeys("password");
	   
	    driver.findElement(By.name("login")).click();
	    
	    System.out.println(driver.getTitle());
	    System.out.println(driver.getCurrentUrl());
	    
	    driver.close();
	    
	}
}
