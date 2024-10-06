package com.prac.auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		driver.findElement(By.cssSelector("textarea[class='gLFyf']")).sendKeys("Rishikesh Hulsure");
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")).click();
	}
}
