package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class MailSteps {
public static WebDriver driver;

	
	@Given("User visits google.com")
	public void user_visits_google_com() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
	}

	@And("User clicks on Gmail and clicks on Sign In")
	public void user_clicks_on_gmail_and_clicks_on_sign_in() throws Throwable {
		driver.findElement(By.cssSelector("a.gb_d")).click();
		driver.findElement(By.cssSelector("a.button.button--medium")).click();

	}

	@And("User enters valid email id and password")
	public void user_enters_valid_email_id_and_password() throws Throwable {
		driver.findElement(By.id("identifierId")).sendKeys("testingautomation699@gmail.com");
		driver.findElement(By.xpath("//*[@id='identifierNext']/div/button/span")).click();
		Thread.sleep(8000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("selenium@123");
		driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
		
	}

	@When("User sends an email to with required subject and body")
	public void user_sends_an_email_to_with_required_subject_and_body() throws Throwable {
		Thread.sleep(12000);
		driver.findElement(By.cssSelector("div[class='T-I T-I-KE L3']")).click();
driver.findElement(By.cssSelector("input[class='agP aFw']")).sendKeys("testingautomation699@gmail.com");	
driver.findElement(By.xpath("//*[@class='aoT']")).sendKeys("Incubyte");
		driver.findElement(By.cssSelector("div[class='Am Al editable LW-avf tS-tW']")).sendKeys("Automation QA test for Incubyte");
		driver.findElement(By.xpath("//*[@class= 'T-I J-J5-Ji aoO v7 T-I-atl L3']")).click();
	}

	@Then("The email appears in the sent folder of gmail with required subject and body")
	public void the_email_appears_in_the_sent_folder_of_gmail_with_required_subject_and_body() throws Throwable {
		Thread.sleep(10000);
		driver.findElement(By.cssSelector("div[class='TN bzz aHS-bnu']")).click();
		driver.close();

	}
}