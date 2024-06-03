package in.redbus;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookATrip {
	
	public static WebDriver driver;
	
	@BeforeClass
	public static void method1(){
		WebDriverManager.edgedriver().setup();
		EdgeOptions options = new EdgeOptions();
		options.addArguments("disable-notifications");
		options.addArguments("disable-popups");
		options.addArguments("start-maximized");
		driver = new EdgeDriver(options);
		driver.get("https://www.redbus.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	@Test
	public void method2() {
	driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
	driver.findElement(By.xpath("//text[text()='Chennai']")).click();
	}
	@Test
	public void method3() {
	driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Madurai");
	driver.findElement(By.xpath("//text[text()='Madurai']")).click();
		}
	@Test
	public void method4() {
	driver.findElement(By.xpath("//span[text()='30' and contains(@class,'bwoYtA')]")).click();
		}
	@Test
	public void method5() {
	driver.findElement(By.xpath("//button[@id='search_button']")).click();
	}
	
	@Test
	public void method6() {
		List<WebElement> elements= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
		List<WebElement> elements1 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
		List<WebElement> elements2 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
		List<WebElement> elements3 = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
		int size = elements.size();
		for (int i = 0; i < elements.size(); i++) {
			

//			WebElement webElement = elements.get(i);
//			WebElement webElement1 = elements1.get(i);
//			WebElement webElement2 = elements2.get(i);
//			WebElement webElement3= elements3.get(i);	
//			String text = webElement.getText();
//			String text1 = webElement1.getText();
//			String text2 = webElement2.getText();
//			String text3 = webElement3.getText();
//			 System.out.println(text);
//			 System.out.println(text1);
//			 System.out.println(text2);
//			 System.out.println(text3);
			
//			String text = elements.get(i).getText();
//			String text1 = elements1.get(i).getText();
//			String text2 = elements2.get(i).getText();
//			String text3 = elements3.get(i).getText();
//			System.out.println(text+text1+text2+text3);
			
			if(i==elements.size()-1) {
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].scrollIntoView(true)", elements.get(i));
				elements= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
				elements1 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
				elements2 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
				elements3 = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
				size = elements.size();
			}else {
				String text = elements.get(i).getText();
				String text1 = elements1.get(i).getText();
				String text2 = elements2.get(i).getText();
				String text3 = elements3.get(i).getText();
				System.out.println("Bus Name : " +text+ "Departure Time : " +text1+ "Arrival Time : " +text2+ "Bus Fare : " +text3);
			}
		}
		
			List<WebElement> elements4= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
			List<WebElement> elements5 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
			List<WebElement> elements6 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
			List<WebElement> elements7 = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
			int size1 = elements4.size();
			for (int j = 0; j < elements4.size(); j++) {
				if(j==elements4.size()-1) {
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView(true)", elements4.get(j));
					elements4= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
					elements5 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
					elements6 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
					elements7 = driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
					size1 = elements4.size();
				}else {
					String text4 = elements4.get(j).getText();
					String text5 = elements5.get(j).getText();
					String text6 = elements6.get(j).getText();
					String text7 = elements7.get(j).getText();
					System.out.println("Bus Name : " +text4+ "Departure Time : " +text5+ "Arrival Time : " +text6+ "Bus Fare : " +text7);
				}
			}
			List<WebElement> elements8= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
			List<WebElement> elements9 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
			List<WebElement> elements10 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
			List<WebElement> elements11= driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
			int size2 = elements8.size();
			for (int k = 0; k < elements8.size(); k++) {
				if(k==elements4.size()-1) {
					JavascriptExecutor js = (JavascriptExecutor)driver;
					js.executeScript("arguments[0].scrollIntoView(true)", elements4.get(k));
					elements8= driver.findElements(By.xpath("//div[contains(@class,'travel')]"));
					elements9 = driver.findElements(By.xpath("//div[contains(@class,'dp-time')]"));
					elements10 = driver.findElements(By.xpath("//div[contains(@class,'bp-time')]"));
					elements11= driver.findElements(By.xpath("//div[contains(@class,'fare d-block')]"));
					size2 = elements8.size();
				}else {
					String text8 = elements8.get(k).getText();
					String text9 = elements9.get(k).getText();
					String text10 = elements10.get(k).getText();
					String text11 = elements11.get(k).getText();
					System.out.println("Bus Name : " +text8+ "Departure Time : " +text9+ "Arrival Time : " +text10+ "Bus Fare : " +text11);
				}
			}
	
	}
}