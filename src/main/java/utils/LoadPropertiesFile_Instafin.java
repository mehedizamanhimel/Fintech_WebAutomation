package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.omg.CORBA.PUBLIC_MEMBER;

public class LoadPropertiesFile_Instafin {
	
	/*public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		InputStream input = LoadPropertiesFile_Instafin.class.getClassLoader().getResourceAsStream("//testdata.properties");
		prop.load(input);
		System.out.println("url ="+ prop.getProperty("baseurl"));
		System.out.println("unsername ="+ prop.getProperty("username"));
		System.out.println("password ="+ prop.getProperty("password"));
		System.out.println("wrongpassword ="+ prop.getProperty("baseurl"));
		System.out.println("url ="+ prop.getProperty("baseurl"));
	}*/
	
	public Properties properties = new Properties();
	//OutputStream output = new FileOutputStream("test.properties");
	File file = new File("testData.properties");
	
	
	public LoadPropertiesFile_Instafin() throws IOException {
		FileInputStream fileInput = new FileInputStream(file);
		properties.load(fileInput);
		fileInput.close();
		
	}
	

}
