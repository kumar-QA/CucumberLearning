package stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	ChromeDriver driver;
	@Given("launch the browser enter url")
	public void launch_the_browser_enter_url() {
		driver=new ChromeDriver();
	    driver.get("https://admin-demo.nopcommerce.com/login");
	    driver.manage().window().maximize();	 
	}

	@When("enter valid username")
	public void enter_valid_username() {
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	}

	@When("enter valid password")
	public void enter_valid_password() {
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin");
	   	}

	@When("click on login btn")
	public void click_on_login_btn() {
		driver.findElement(By.className("login-button")).click();
	   	}

	@Then("it should navgate to Dashboard page")
	public void it_should_navgate_to_dashboard_page() {
		String Result=driver.findElement(By.xpath("//div[@class='content-header']/h1")).getText();
		 System.out.println("Succesfully Navigated to "+Result);
	    	}

	@Then("Close the Browser")
	public void close_the_browser() {
		  driver.close();
	    	}
	
	@When("enter Invalid username")
	public void enter_invalid_username() {
		driver.findElement(By.name("Email")).clear();
        driver.findElement(By.name("Email")).sendKeys("admin1234@yourstore.com");
	}

	@When("enter Invalid password")
	public void enter_invalid_password() {
		driver.findElement(By.name("Password")).clear();
		driver.findElement(By.name("Password")).sendKeys("admin1234");
	  
	}

	@Then("it should through error message")
	public void it_should_through_error_message() {
	String Actualresult=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/descendant::li")).getText();
	String ExpectedResult="No customer account found";
	Assert.assertEquals("Check values", ExpectedResult, Actualresult);
	
	}
	@Then("it should through usernmae error message")
	public void it_should_through_usernmae_error_message() {
		String Actualresult=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/descendant::li")).getText();
		String ExpectedResult="No customer account found";
		Assert.assertEquals("Check values", ExpectedResult, Actualresult);
		  
	}
	
	@Then("it should through invalid password error message")
	public void it_should_through_invalid_password_error_message() {
		
		String Actualresult=driver.findElement(By.xpath("//div[@class=\"message-error validation-summary-errors\"]/descendant::li")).getText();
		String ExpectedResult="The credentials provided are incorrect";
		Assert.assertEquals("Check values", ExpectedResult, Actualresult);
		
	    	}

	
	@When("username field keep as empty")
	public void username_field_keep_as_empty() {
		driver.findElement(By.name("Email")).clear();
	    	}

	@When("Password field keep as empty")
	public void password_field_keep_as_empty() {
		driver.findElement(By.name("Password")).clear();
	    	}

	@Then("it should through required error message")
	public void it_should_through_required_error_message() {
	String actual=driver.findElement(By.xpath("//span[@id=\"Email-error\"]")).getText();
	String expected="Please enter your email";
	Assert.assertEquals("verifying data", expected, actual);
	    	}

	
	
}
