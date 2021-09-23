package week3.day2.assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		driver.findElement(By.xpath("//input[@id ='chkSelectDateOnly']")).click();
		
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MDU", Keys.ENTER);
		
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("PER", Keys.ENTER);
		//sleep to wait till the results get loaded on page.
		Thread.sleep(2000);
		List<WebElement> trainName = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//td[2]"));
		int size = trainName.size();
		System.out.println("The no. of trains listed: "+size);
		
		//Converting WebElement list to String List in order to use in sort method.
		ArrayList<String> strTrainName = new ArrayList<String>();
		// adding the train name to a string list.
		for(int i=0; i<size; i++)
		{
			String tname = trainName.get(i).getText();
			strTrainName.add(tname);
			
		}
		//for each to get the text of the webelement throws Stale Element reference exception but for loop works.
		/*for(WebElement wTN : trainName) {
			Thread.sleep(2000);
			String tname = wTN.getText();
			strTrainName.add(tname);
			System.out.println(i++ +". "+strTrainName);
		}*/
		
		//printing the unsorted list.
		int a=1;
		System.out.println("The train name list: ");
		for(String unsortedTN : strTrainName) {
			System.out.println(a++ +". "+unsortedTN);
		}	
		
		Collections.sort(strTrainName);
		
		//printing the sorted list.
		int j=1;
		System.out.println("The sorted train name list: ");
		for(String sTN : strTrainName) {
			System.out.println(j++ +". "+sTN);
		}
		
	} 

}
