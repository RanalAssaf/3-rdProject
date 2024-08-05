package configreader10;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configreadcode10 {

   public static Properties getpropertyopject() throws IOException {
		
		FileInputStream fp= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Task10\\config\\read");
		FileInputStream fp2= new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Task10\\config\\expected");

		Properties prop=new Properties();
		
		prop.load(fp);
		prop.load(fp2);

		
		return prop;
   }

   public static String geturl() throws IOException {
	
	return getpropertyopject().getProperty("url");
   }


   public static String getusername() throws IOException {
	
	return getpropertyopject().getProperty("username");
  }

   public static String getpassword() throws IOException {
	
	return getpropertyopject().getProperty("password");
  }
   
   
   public static String getempname() throws IOException {
		
		return getpropertyopject().getProperty("empname");
	  }
   
   
   public static String getpass1() throws IOException {
		
		return getpropertyopject().getProperty("pass1");
	  }
   
   
   public static String getjobtitle() throws IOException {
		
		return getpropertyopject().getProperty("jobtitle");
	  }
   
   public static String getjobDescription() throws IOException {
		
		return getpropertyopject().getProperty("Description");
	  }
   
   
   public static String getjobNote() throws IOException {
		
		return getpropertyopject().getProperty("Note");
	  }
   
   public static String getjobfrom() throws IOException {
		
		return getpropertyopject().getProperty("from");
	  }
   
   
   public static String getjobto() throws IOException {
		
		return getpropertyopject().getProperty("to");
	  }
   
   public static String getjobexp() throws IOException {
		
		return getpropertyopject().getProperty("exp");
	  }
   
   public static String getjobfdate() throws IOException {
		
		return getpropertyopject().getProperty("fdate");
	  }
  
  public static String getjobtdate() throws IOException {
		
		return getpropertyopject().getProperty("tdate");
	  }
   
}
