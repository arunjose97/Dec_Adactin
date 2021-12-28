package Mini_Projects;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.UserSViewBegin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.MavenProject.Base_Class;

public class Project_Adactin extends Base_Class{
	public static void main(String[] args)throws Throwable {
		driver=browserLaunch("chrome");
		getUrl("http://adactinhotelapp.com/");
		implicitwait();
		
		WebElement username = driver.findElement(By.id("username"));
		inputvalues(username, "arunjose98");
		
		WebElement password = driver.findElement(By.id("password"));
		inputvalues(password, "WFHLIB");
		implicitwait();
		
		WebElement login = driver.findElement(By.id("login"));
		clickOnElement(login);
		implicitwait();

	
	WebElement loc = driver.findElement(By.id("location"));
	clickOnElement(loc);
	implicitwait();
	WebElement location = driver.findElement(By.id("location"));
	isSelected(location);
	dropDownSelection(location, "index", "7");
	clickOnElement(location);
	implicitwait();
	
	WebElement hot = driver.findElement(By.id("hotels"));
	clickOnElement(hot);
	implicitwait();
	WebElement hotel = driver.findElement(By.id("hotels"));
	isSelected(hotel);
	dropDownSelection(hotel, "index", "2");
	clickOnElement(hotel);
	implicitwait();
	
	WebElement room = driver.findElement(By.id("room_type"));
	clickOnElement(room);
	implicitwait();
	WebElement type = driver.findElement(By.id("room_type"));
	isSelected(type);
	dropDownSelection(type, "text", "Super Deluxe");
	clickOnElement(type);
	implicitwait();

	WebElement rn = driver.findElement(By.id("room_nos"));
	clickOnElement(rn);
	implicitwait();
	WebElement rnos = driver.findElement(By.id("room_nos"));
	isSelected(rnos);
	dropDownSelection(rnos, "index", "3");
	clickOnElement(rnos);
	implicitwait();
	
	WebElement cin = driver.findElement(By.name("datepick_in"));
	clickOnElement(cin);
	implicitwait();

	WebElement cout = driver.findElement(By.name("datepick_out"));
	clickOnElement(cout);
	implicitwait();
	
	WebElement adult = driver.findElement(By.id("adult_room"));
	clickOnElement(adult);
	implicitwait();
	WebElement adultroom = driver.findElement(By.id("adult_room"));
	isSelected(adultroom);
	dropDownSelection(adultroom, "index", "2");
	clickOnElement(adultroom);
	implicitwait();
	
	WebElement child = driver.findElement(By.id("child_room"));
	clickOnElement(child);
	implicitwait();
	WebElement childroom = driver.findElement(By.id("child_room"));
	isSelected(childroom);
	dropDownSelection(childroom, "index", "1");
	clickOnElement(childroom);
	implicitwait();
	
	WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	clickOnElement(search);
	
	WebElement button = driver.findElement(By.name("radiobutton_0"));
	clickOnElement(button);
	implicitwait();
	
	WebElement con = driver.findElement(By.name("continue"));
	clickOnElement(con);
	implicitwait();
	
	WebElement first = driver.findElement(By.name("first_name"));
	inputvalues(first, "ARUN");
	implicitwait();
	
	WebElement last = driver.findElement(By.name("last_name"));
	inputvalues(last, "JOSE");

	implicitwait();
	WebElement add = driver.findElement(By.name("address"));
	inputvalues(add, "4896 Locust Court, Los Angeles, California");

	implicitwait();
	WebElement num = driver.findElement(By.name("cc_num"));
	inputvalues(num, "4221356798561734");
	implicitwait();

	WebElement cctype = driver.findElement(By.name("cc_type"));
	clickOnElement(cctype);
	implicitwait();
	WebElement credit = driver.findElement(By.name("cc_type"));
	isSelected(credit);
	dropDownSelection(credit, "index", "2");
	clickOnElement(credit);
	implicitwait();
	
	WebElement mon = driver.findElement(By.name("cc_exp_month"));
	clickOnElement(mon);
	implicitwait();
	WebElement month = driver.findElement(By.name("cc_exp_month"));
	isSelected(month);
	dropDownSelection(month, "text", "August");
	clickOnElement(month);
	implicitwait();
	
	WebElement yar = driver.findElement(By.name("cc_exp_year"));
	clickOnElement(yar);
	WebElement year = driver.findElement(By.name("cc_exp_year"));
	isSelected(year);
	dropDownSelection(year, "value", "2022");
	clickOnElement(year);
	implicitwait();
	
	WebElement cvv = driver.findElement(By.name("cc_cvv"));
	inputvalues(cvv, "123");
	implicitwait();
	
	WebElement book = driver.findElement(By.name("book_now"));
	clickOnElement(book);
	//driver.manage().window().maximize();
	robot(book);
	implicitwait();
	
	WebElement ary = driver.findElement(By.name("my_itinerary"));
	clickOnElement(ary);


	}

}

