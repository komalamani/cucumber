package org.script;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class steps {
	static WebDriver driver;
	@Given("User launches the Adactin url")
	public void user_launches_the_Adactin_url() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS)	;
			driver.get("http://adactinhotelapp.com/index.php");   
	}

	@When("User enters the {string} and {string} and clicks login button")
	public void user_enters_the_and_and_clicks_login_button(String string, String string2) {
		WebElement user = driver.findElement(By.id("username"));
		boolean displayed = user.isDisplayed();	
		Assert.assertTrue(displayed);
		user.sendKeys(string);
		
		WebElement password = driver.findElement(By.id("password"));
		boolean displayed1 = password.isDisplayed();
		Assert.assertEquals(true, displayed1);
		password.sendKeys(string2);
		
		WebElement login = driver.findElement(By.id("login"));
		boolean enabled = login.isEnabled();
		Assert.assertTrue(enabled);
		login.click();	
		
	    
	}

	@And("User searchs the holel")
	public void user_searchs_the_holel() {
		
		
		WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
		boolean selected = location.isDisplayed();
		Assert.assertTrue(selected);
		Select 	s = new Select(location);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);
		s.selectByIndex(1);
		

		WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
		boolean selected2 = hotel.isDisplayed();
		Assert.assertTrue(selected2);
		Select s1= new Select(hotel);
		boolean multiple1 = s1.isMultiple();
		System.out.println(multiple1);
		s1.selectByValue("Hotel Creek");
		
		
		WebElement room = driver.findElement(By.xpath("//select[@id='room_type']"));
		boolean selected3 = room.isDisplayed();
		Assert.assertTrue(selected3);
		Select s2 = new Select(room);
		boolean multiple2 = s2.isMultiple();
		System.out.println(multiple2);
		s2.selectByVisibleText("Standard");
		
		
		WebElement Noroom = driver.findElement(By.xpath("//select[@id='room_nos']"));
		boolean selected4 = room.isDisplayed();
		Assert.assertTrue(selected4);
		Select s3 = new Select(Noroom);
		boolean multiple3 = s3.isMultiple();
		System.out.println(multiple3);
		s3.selectByIndex(3);
		
		WebElement chckin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
		boolean selected5 = chckin.isDisplayed();
		Assert.assertTrue(selected5);	
		chckin.sendKeys("12/11/22");
		
		
		WebElement chckout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
		boolean selected6 = chckout.isDisplayed();
		Assert.assertTrue(selected6);	
		chckin.sendKeys("13/11/22");
		
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
		boolean selected7 = adult.isDisplayed();
		Assert.assertTrue(selected7);
		Select s4 = new Select(adult);
		boolean multiple4 = s4.isMultiple();
		System.out.println(multiple4);
		s4.selectByIndex(3);
		
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
		boolean selected8 = child.isDisplayed();
		Assert.assertTrue(selected8);
		Select s5 = new Select(child);
		boolean multiple5 = s5.isMultiple();
		System.out.println(multiple5);
		s5.selectByIndex(1);
		
		
		WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
		boolean enabled1 = search.isEnabled();
		Assert.assertTrue(enabled1);
		search.click();
	}
		@And("User selects the hotel")
		public void user_selects_the_hotel() {
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		boolean selected9 = radio.isDisplayed();
		Assert.assertTrue(selected9);
		radio.click();
		
		
		WebElement conti = driver.findElement(By.id("continue"));
		boolean displayed2 = conti.isDisplayed();
		Assert.assertTrue(displayed2);
		conti.click();
	    
	}

	@And("User enters the {string}, {string} and {string}")
	public void user_enters_the_and(String string, String string2, String string3) {
		WebElement firstname = driver.findElement(By.xpath("//input[@name='first_name']"));
		boolean displayed3 = firstname.isDisplayed();
		Assert.assertTrue(displayed3);
		firstname.sendKeys(string);
		
		
		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		boolean displayed4 = lastname.isDisplayed();
		Assert.assertTrue(displayed4);
		lastname.sendKeys(string2);
		
		
		WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
		boolean displayed5 = address.isDisplayed();
		Assert.assertTrue(displayed5);
		address.sendKeys(string3);
	    
	}
	
	@And("User enters the Month, Year and Card type")
	public void user_enters_the_Month_Year_and_Card_type() {
		WebElement ctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
		boolean displayed7 = ctype.isDisplayed();
		Assert.assertTrue(displayed7);
		Select s6 = new Select(ctype);
		s6.selectByIndex(1);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
		boolean displayed8 = ctype.isDisplayed();
		Assert.assertTrue(displayed8);
		Select s7 = new Select(month);
		s7.selectByIndex(1);
		
		
		WebElement year = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
		boolean displayed9 = ctype.isDisplayed();
		Assert.assertTrue(displayed9);
		Select s8 = new Select(year);
		s8.selectByIndex(6);
		
		
	}
	@And("User enters the {string} and {string}")
	public void user_enters_the_and(String string, String string2) {
		WebElement cardno = driver.findElement(By.xpath("//input[@name='cc_num']"));
		boolean displayed6 = cardno.isDisplayed();
		Assert.assertTrue(displayed6);
		cardno.sendKeys(string);
		
		
		WebElement cvc = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
		boolean displayed10 = cvc.isDisplayed();
		Assert.assertTrue(displayed10);
		cvc.sendKeys(string2);
	    
	}

	@Then("Books the hotel")
	public void books_the_hotel() {
		WebElement book = driver.findElement(By.xpath("//input[@type='button']"));
		boolean displayed11 = book.isDisplayed();
		Assert.assertTrue(displayed11);
		book.click();
	    
	}




}
