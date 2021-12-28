package com.MavenProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations extends Base_Class {

	@BeforeSuite
	private void Setproperty() {
		System.out.println("set property");
	}
	
	@BeforeTest
	private void browserinitialization() {
		System.out.println("chrome");
	}
	
	@BeforeClass
	private void url() {
		System.out.println("Amazon");
	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");
	}
	
	@Test
	private void searchMobile() {
		System.out.println("search mobile");
	}
	
	@Test
	private void searchPhone() {
		System.out.println("search phone");
	}
	
	@AfterMethod
	private void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	private void browserclose() {
		System.out.println("browser close");
	}
	
	@AfterTest
	private void verification() {
		System.out.println("verification");
	}
	
	@AfterSuite
	private void deleteCookies() {
		System.out.println("cookies delete");
	}
}
	//@Test
//	private void submit() {
//		System.out.println("submit");
//
//	}
//	@AfterMethod
//	private void Browser() {
//		driver = browserLaunch("chrome");
//		getUrl("https://www.facebook.com/");
//
//
//	}
//	@AfterClass
//	private void User() {
//		WebElement mail = driver.findElement(By.xpath("//input[@type='text']"));
//		inputvalues(mail,"arunjose@gmail.com");
//
//	}
//
//	@AfterTest
//	private void Pass() {
//		WebElement password = driver.findElement(By.id("pass"));
//		inputvalues(password,"9791116538");
//
//	}
//	@AfterSuite
//	private void Log() {
//		WebElement login = driver.findElement(By.name("login"));
//		clickOnElement(login);
//
//	}
//
//
//
//
//
//}