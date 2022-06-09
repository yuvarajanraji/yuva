package testPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	
	public Configuration_Reader() throws IOException {
		
		File fi = new File ("C:\\Users\\Yuvaraj\\eclipse-workspac\\Testauto\\src\\main\\java\\testPractice\\Testin.properties");
		
		FileInputStream fiz = new FileInputStream(fi);
		
		p = new Properties();
		
		p.load(fiz);
		
	}
	
	public  String get_browser() {
		String Browser = p.getProperty("Browser");
		return Browser;
	}
	
	public  String get_url() {
		String Url = p.getProperty("Url");
		return Url;
	}
	
	public  String get_mail() {
		String mail = p.getProperty("mail");
        return mail;
	}

	public String get_pass() {
		String pas = p.getProperty("pass");
		return pas;
	}
	
	
	
	
	
	

}
