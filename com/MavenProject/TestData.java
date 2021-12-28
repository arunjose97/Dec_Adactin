package com.MavenProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class TestData extends Base_Class {
	
	@Test
	private void data() {
		driver=browserLaunch("chrome");
		getUrl("https://www.facebook.com/");
		
		WebElement findElement = driver.findElement(By.id("email"));
		inputvalues(findElement, "arunjose98@yahoo.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement findElement2 = driver.findElement(By.id("pass"));
		inputvalues(findElement2, "Trippinghorse@1");
		
		WebElement findElement3 = driver.findElement(By.name("login"));
		clickOnElement(findElement3);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		confirmalert();
	}
	
	@Test
	private void Students() {
		System.out.println("Jose");

	}
	
	@Test(dependsOnMethods = "Students")
	private void bag() {
		System.out.println("Lenova");

	}

}
