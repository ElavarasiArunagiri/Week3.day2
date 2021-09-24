package week3.day2.assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AJIO {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.ajio.com/");
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String results = driver.findElement(By.className("length")).getText();
		System.out.println("search found result: "+results);
		
		List<WebElement> brandNameList = driver.findElements(By.xpath("//div[@class = 'brand']"));
		System.out.println("The Brand Name List: " +brandNameList.size());
				for(WebElement brandName : brandNameList) {
			
			System.out.println(brandName.getText());
		}
				
		List<WebElement> bagNameList = driver.findElements(By.xpath("//div[@class = 'name']"));
		System.out.println("The Bag Name List: "+bagNameList.size());
		for(WebElement bagName : bagNameList) {
			System.out.println(bagName.getText());
		
		}
			
		
		
	}

}
