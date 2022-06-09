package testPracauto;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Sdp_site {
	
	public static WebDriver driver ;
	
	public Sdp_site(WebDriver driver ) {
		PageFactory.initElements(driver, this );
		this.driver = driver;
	}
	
	
	
	
	
	
	
	
	public  Practicesite getPracticesite() {
		Practicesite q = new Practicesite (driver);
		return q;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
