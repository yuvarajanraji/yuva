package com.testautomation.Testauto;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import testPracauto.Sdp_site;
import testPractice.Configuration_helper;

public class TestClass extends BaseClass{
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		String Browser = Configuration_helper.getinstance().getinstanceCR().get_browser();
		 
		driver = Browserlaunch(Browser);
		 
		String Url = Configuration_helper.getinstance().getinstanceCR().get_url();
		Urllaunch(Url);
		
		Sdp_site s1 = new Sdp_site (driver);
		
		conclick(s1.getPracticesite().getDress());
		
		conclick(s1.getPracticesite().getEven());
		
		conclick(s1.getPracticesite().getIm());
		
		Frame(s1.getPracticesite().getSw());
		
		conclick(s1.getPracticesite().getAdcart());
		
		sel(s1.getPracticesite().getSi());
		
		conclick(s1.getPracticesite().getSub());
		
	    sele(s1.getPracticesite().getSi());
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		conclick(s1.getPracticesite().getPat());
		
		conclick(s1.getPracticesite().getSig());
		
		sendkey(s1.getPracticesite().getMail());
		
	    Configuration_helper.getinstance().getinstanceCR().get_mail();
		
	    sendkey(s1.getPracticesite().getPass());
	    
		Configuration_helper.getinstance().getinstanceCR().get_pass();
		
		conclick(s1.getPracticesite().getLog());
		
		conclick(s1.getPracticesite().getPro1());
		
		conclick(s1.getPracticesite().getPro2());
		
		conclick(s1.getPracticesite().getPro3());
		
		conclick(s1.getPracticesite().getPro4());
		
		conclick(s1.getPracticesite().getPro5());
		
		clos();
	}
	
	
	
	
	
	
	
	

}
