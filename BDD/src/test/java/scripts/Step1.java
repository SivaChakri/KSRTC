package scripts;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objectRepository.Elements;

public class Step1 {
	WebDriver d1;
	
	@Given("Open Chrome browser and URL of the application")
	public void open_Chrome_browser_and_URL_of_the_application() {
		System.setProperty("webdriver.chrome.driver" , "C:\\Users\\sivachakri.thokala\\Downloads\\chromedriver_win32\\chromedriver.exe");
		d1=new ChromeDriver();
		d1.get("https://ksrtc.in/oprs-web/user/add.do");
		d1.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		jse.executeScript("scroll(0,600)");
	}

	@When("Enter the email,fullName,mobileNumber and click on add button")
	public void enter_the_email_fullName_mobileNumber_and_click_on_add_button() throws InterruptedException {
		Elements.email(d1).sendKeys("sivachakri99@gmail.com");
		Elements.fullName(d1).sendKeys("Siva Chakri");
		Elements.moblieNumber(d1).sendKeys("9949943392");
		Elements.add(d1).click();
		d1.switchTo().alert().accept();
		
	}
	
	
	@Then("Successfully Registration done")
	public void successfully_Registration_done() throws AWTException, IOException {
		Robot robot1=new Robot();
		Dimension sc_size1=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect1=new Rectangle(sc_size1);
		BufferedImage Source1=robot1.createScreenCapture(rect1);
		File Destination1=new File("C:\\Screenshots\\screen_shot1.jpg");
		ImageIO.write(Source1, "jpg", Destination1);
	}
	
	@Then("If Registration is failed then move to login page")
	public void if_Registration_is_failed_then_move_to_login_page() {
	    d1.findElement(By.xpath("//a[@href='/oprs-web/login/show.do']")).click();
	    
	}

	@When("Enter the userName,password and click on login button")
	public void enter_the_Username_password_and_click_on_login_button() {
		Elements.userName(d1).sendKeys("sivachakri99@gmail.com");
		Elements.password(d1).sendKeys("Selenium@99");
		Elements.login(d1).click();
	}

	@Then("Successfully Login done")
	public void successfully_Login_done() throws AWTException, IOException {
		Robot robot2=new Robot();
		Dimension sc_size2=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect2=new Rectangle(sc_size2);
		BufferedImage Source2=robot2.createScreenCapture(rect2);
		File Destination2=new File("C:\\Screenshots\\screen_shot2.jpg");
		ImageIO.write(Source2, "jpg", Destination2);
	}
	@When("Enter the fromPlace,toPlace,JourneyDate and ReturnJournyDate and click on search button")
	public void enter_the_fromPlace_toPlace_JourneyDate_and_ReturnJournyDate_and_click_on_search_button() throws InterruptedException {
		d1.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) d1;
		jse.executeScript("scroll(0,750)");
		
		Elements.fromPlace(d1).sendKeys("beng");
		Thread.sleep(1000);
		List<WebElement> element1 = d1.findElements(By.xpath("//*[@id=\"ui-id-1\"]/li"));
		for(WebElement ele1:element1) {
			if(ele1.getText().equalsIgnoreCase("BENGALURU")){
				ele1.click();
				break;
			}
		}
		Elements.toPlaceName(d1).sendKeys("hyd");
		Thread.sleep(1000);
		List<WebElement> element2 =d1.findElements(By.xpath("//*[@id=\"ui-id-2\"]/li"));
		for(WebElement ele2:element2) {
		if(ele2.getText().equalsIgnoreCase("HYDERABAD")){
			ele2.click();
			break;
			}
		}
		
		jse.executeScript("document.getElementById('txtJourneyDate').value='28/01/2022'");
		jse.executeScript("document.getElementById('txtReturnJourneyDate').value='30/01/2022'");
		d1.findElement(By.xpath("//*[@id=\"bookingsForm\"]/div[1]/div/div[2]/div[3]/button")).click();
		jse.executeScript("scroll(0,1000)");
	}
	

	@Then("Successfully Availability done")
	public void successfully_Availability_done() throws AWTException, IOException {
		Robot robot3=new Robot();
		Dimension sc_size3=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rect3=new Rectangle(sc_size3);
		BufferedImage Source3=robot3.createScreenCapture(rect3);
		File Destination3=new File("C:\\Screenshots\\screen_shot3.jpg");
		ImageIO.write(Source3, "jpg", Destination3);
	}


}
