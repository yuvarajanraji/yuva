package testPractice;

import java.io.IOException;

public class Configuration_helper {
	
	public Configuration_helper() {
		
	}
	
	
	
	
	 public static  Configuration_Reader getinstanceCR() throws IOException {
		 
		Configuration_Reader read = new Configuration_Reader ();
		return read;	 
	}
	
	public static  Configuration_helper getinstance() {
		
		Configuration_helper help = new Configuration_helper ();
		
		return help;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
