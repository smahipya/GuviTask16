package GuviTask16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ans01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		String y = driver.getCurrentUrl();
		System.out.println(y);
		driver.navigate().refresh();
		driver.close();

	}

}
//Output of -- https://www.google.com/?gws_rd=ssl