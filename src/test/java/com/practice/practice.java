package com.practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.demoblaze.com/index.html");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement login = driver.findElement(By.xpath("//a[.=\"Log in\"]"));
        login.click();
        
        
        
		WebElement user = driver.findElement(By.xpath("(//input[@class=\"form-control\"])[1]"));
        user.sendKeys("madhavan");
        
		WebElement password = driver.findElement(By.xpath("//input[@id=\\\"loginpassword\\\"]"));
        password.sendKeys("madhavan");
        
		WebElement loginbuton = driver.findElement(By.xpath("//button[@onclick=\"logIn()\"]"));
		loginbuton.click();

		WebElement samsung = driver.findElement(By.xpath("//a[.=\"Samsung galaxy s7\"]"));
		samsung.click();

	}

}
