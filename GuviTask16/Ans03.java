package GuviTask16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;


public class Ans03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("Artificial Intelligence");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.findElement(By.xpath("//div[normalize-space()='History']")).click();
		String i = driver.findElement(By.cssSelector("#firstHeading")).getText();
		System.out.println(i);


	}

}

// Output of -- History of artificial intelligence