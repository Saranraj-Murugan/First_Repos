package com.hotel.project.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Base {
	static WebDriver driver;
	Select select;
	
	@Test
	public WebDriver browser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;

	}
	public void SelectFromDropdownFor(WebElement element) {//, String selectBy,int indexNo, String value
		select = new Select(element);
		
//		if (selectBy.equalsIgnoreCase("index")) {
//			select.selectByIndex(indexNo);
//		}
//		if (selectBy.equalsIgnoreCase("value")) {
//			select.selectByValue(value);
//		}
//		if (selectBy.equalsIgnoreCase("visibleText")) {
//			select.selectByVisibleText(value);
//		}
	}
}
