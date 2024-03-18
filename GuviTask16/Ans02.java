package GuviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Ans02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		driver.getTitle();
		String expectedTitle = "STORE";
		String ActualTitle = driver.getTitle();
		if (ActualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Page landed on correct website");
		} else {
			System.out.println("Page not landed on correct Website");
		}

	}

}
//Output of -- Page landed on correct website