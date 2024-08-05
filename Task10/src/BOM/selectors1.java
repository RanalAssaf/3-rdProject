package BOM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectors1 {

public static WebElement username(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
	}
	
    public static WebElement password (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
	}
    
    public static WebElement login (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
    }
    
    public static WebElement login_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
    }
    
    public static WebElement admin (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
    }  
    
    public static WebElement admin_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
    }
    
    public static WebElement add (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
    }  
    
    public static WebElement add_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")));
    }
    
    public static WebElement UserRole (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement UserRolec (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
    } 
    
//   public static WebElement UserRolek (WebDriver driver) {
//		
//		return driver.findElement(By.partialLinkText("Admin"));
//    } 
    
    
    public static WebElement UserRole_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]")));
    }
    
    
    public static WebElement EmployeeName (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
    } 
 
 
 
     public static WebElement EmployeeName_wait(WebDriver driver) {
 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input")));
    }
     
     
     //name
     public static WebElement findName (WebDriver driver) {
     		
     		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
         } 
     
     public static WebElement findName_wait(WebDriver driver) {
    	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
    	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")));
    	     
    	    }
 
 
      public static WebElement Status (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
    } 
      
      
      
      public static WebElement Status_wait(WebDriver driver) {
    	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
    	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]")));
    	    }
      
      public static WebElement UserNamei (WebDriver driver) {
  		
  		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input"));
      } 
      
      
      public static WebElement UserNamei_wait(WebDriver driver) {
  	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
  	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")));
  	    }
      
      
      public static WebElement pass1 (WebDriver driver) {
    		
    		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input"));
        } 
      
      
      public static WebElement pass1_wait(WebDriver driver) {
    	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
    	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")));
    	    }
      
      
      
      public static WebElement Confirm_Password (WebDriver driver) {
  		
  		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input"));
      } 
    
    
    public static WebElement Confirm_Password_wait(WebDriver driver) {
  	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
  	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")));
  	    }
    
    
    public static WebElement save (WebDriver driver) {
  		
  		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]"));
      } 
    
    
    public static WebElement save_wait(WebDriver driver) {
  	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
  	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")));
  	    }
        
    //*******************************************************************************************************
   
    public static WebElement user2 (WebDriver driver) {
  		
  		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
      } 
    
    
    public static WebElement user2_wait(WebDriver driver) {
  	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
  	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")));
  	    }
    
    
    public static WebElement UserRolec2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement UserRole2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/div[1]")));
    }
    
    
    public static WebElement EmployeeName2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
    } 
    
    
    public static WebElement EmployeeName2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input")));
    }
    
    
//    public static WebElement findName2 (WebDriver driver) {
// 		
// 		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p"));
//     } 
// 
// public static WebElement findName2_wait(WebDriver driver) {
//	 	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
//	     return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")));
//	    }
    
    
    
    public static WebElement status2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement status2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]")));
    }
    
    
    public static WebElement search (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
    } 
    
    
    public static WebElement search_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")));
    }
    
   public static WebElement found (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span"));
    } 
    
    
    public static WebElement found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/span")));
    }
    
    //*********************************************************************************************************
    
    
//    public static WebElement admin_once_again (WebDriver driver) {
//		
//		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a"));
//    }  
//    
//    public static WebElement admin_once_again_wait(WebDriver driver) {
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); // Timeout of 10 seconds
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")));
//    }
    
    
    public static WebElement job (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
    } 
    
    
    public static WebElement job_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
    }
    
    
    
    public static WebElement Job_Titles (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a"));
    } 
    
    
    public static WebElement Job_Titles_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")));
    } 
    
    
    public static WebElement add_Job_Titles (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
    } 
    
    
    public static WebElement add_Job_Titles_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")));
    } 
    
    
    
    public static WebElement add_Job_Titles_Name (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
    } 
    
    
    public static WebElement add_Job_Titles_Name_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")));
    } 
    
    
   public static WebElement add_Job_Titles_Description (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea"));
    } 
    
    
    public static WebElement add_Job_Titles_Description_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")));
    } 
    
    
   public static WebElement add_Job_Titles_Note (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea"));
    } 
    
    
    public static WebElement add_Job_Titles_Note_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")));
    } 
    
    
    public static WebElement add_Job_Titles_save (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]"));
    } 
    
    
    public static WebElement add_Job_Titles_save_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")));
    } 
    
    
    public static WebElement Job_Titles_found (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span"));
    } 
    
    
    public static WebElement Job_Titles_found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span")));
    } 
    
    //******************************************************************************************
    
    public static WebElement job2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
    } 
    
    
    public static WebElement job2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
    }
    
    
    
    public static WebElement job2_PayGrades (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a"));
    } 
    
    
    public static WebElement job2_PayGrade_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[2]/a")));
    }
    
    public static WebElement job2_PayGrades_add (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
    } 
    
    
    public static WebElement job2_PayGrade_add_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name_save (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
    } 
    
    
    
    public static WebElement job2_PayGrade_add_Name_save_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name_save_add2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/button"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_save_add2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div/div[1]/div/button")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name_save_add2_c (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_save_add2_c_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[1]/div/div/div/div[2]/div/div/div[1]")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name_save_add2_c_min (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_save_add2_c_min_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/div[2]/input")));
    }
    
    
    public static WebElement job2_PayGrades_add_Name_save_add2_c_max (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_save_add2_c_max_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/div/div[2]/input")));
    }
    
    
   public static WebElement job2_PayGrades_add_Name_save2 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]"));
    } 
    
    
    public static WebElement job2_PayGrade_add_Name_save2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/form/div[3]/button[2]")));
    }
    
    
    public static WebElement Job2_PayGrade_found (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/span"));
    } 
    
    
    public static WebElement Job2_PayGrade_found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[2]/div/div[2]/div/span")));
    } 
    
    
    //**********************************************************************************************
    
    public static WebElement job3 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
    } 
    
    
    public static WebElement job3_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
    }
    
    
public static WebElement job3_EmploymentStatus(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a"));
    } 
    
    
    public static WebElement job3_EmploymentStatus_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[3]/a")));
    }
    
    
    
    
    
public static WebElement job3_EmploymentStatus_add (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
    } 
    
    
    public static WebElement job3_EmploymentStatus_add_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")));
    }
    
    
    
public static WebElement job3_EmploymentStatus_add_name (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
    } 
    
    
    public static WebElement job3_EmploymentStatus_add_name_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")));
    }
    
    
public static WebElement job3_EmploymentStatus_add_name_save (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
    } 
    
    
    public static WebElement job3_EmploymentStatus_add_name_save_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
    }
    
public static WebElement Job3_EmploymentStatus_found (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span"));
    } 
    
    
    public static WebElement Job3_EmploymentStatus_found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span")));
    } 
    
    //************************************************************************************************************
    
    public static WebElement job4 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
    } 
    
    
    public static WebElement job4_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
    }
    
    
    
   public static WebElement job4_JobCategories(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a"));
    } 
    
    
    public static WebElement job4_JobCategories_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[4]/a")));
    }
    
   public static WebElement job4_JobCategories_add(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
    } 
    
    
    public static WebElement job4_JobCategories_add_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")));
    }
    
public static WebElement job4_JobCategories_add_name(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input"));
    } 
    
    
    public static WebElement job4_JobCategories_add_name_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")));
    }
    
    
public static WebElement job4_JobCategories_add_name_save(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
    } 
    
    
    public static WebElement job4_JobCategories_add_name_save_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")));
    }
    
    
public static WebElement Job4_JobCategories_found (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span"));
    } 
    
    
    public static WebElement Job4_JobCategories_found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span")));
    } 
    
    //**************************************************************************************************************************************************
    
public static WebElement job5 (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span"));
    } 
    
    
    public static WebElement job5_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")));
    }
    
    
    
   public static WebElement job5_WorkShifts(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a"));
    } 
    
    
    public static WebElement job5_WorkShifts_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[5]/a")));
    }
    
   public static WebElement job5_WorkShifts_add(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[1]/div/button")));
    }
    
public static WebElement job5_WorkShifts_add_name(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_name_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/input")));
    }
    
//public static WebElement job5_WorkShifts_add_fromhours(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
//    } 
//    
//    
//    public static WebElement job5_WorkShifts_add_fromhours_wait(WebDriver driver) {
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/input")));
//    }
    

    
public static WebElement job5_WorkShifts_add_fromhours1(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_fromhours1_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/i")));
    }
    
    
public static WebElement job5_WorkShifts_add_fromhours2(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/input"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_fromhours2_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[1]/input")));
    }
    
    
    
    
    
    
    //*******************************************************************************************
    
    
public static WebElement job5_WorkShifts_add_tohours(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/i"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_tohours_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/i")));
    }
    
public static WebElement job5_WorkShifts_add_tohours1(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/input"));
    } 
    
    
    public static WebElement job5_WorkShifts_add_tohours1_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/input")));
    }
    
    
    public static void job5_WorkShifts_add_tohours1_wait_invisible(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
         wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[1]/input")));
    }
    
    
    //expected
    
    public static WebElement expected (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/p"));
    } 
    
    
    public static WebElement expected_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[3]/div/div[2]/p")));
    } 
    
    
    //***//***//***/***//**//***//
    
    
    
    public static WebElement job5_WorkShifts_add_save_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]")));
    }
    
    
public static WebElement job5_WorkShifts_add_save(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]"));
    } 
    
    
//public static WebElement job5_WorkShifts_add_AssignedEmployees(WebDriver driver) {
//		
//		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input"));
//    } 
//    
//    
//    public static WebElement job5_WorkShifts_add_name_AssignedEmployees_wait(WebDriver driver) {
//    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
//        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/div/div[1]/input")));
//    }
    
    
public static WebElement job5_WorkShifts_found(WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span"));
    } 
    
    
    public static WebElement job5_WorkShifts_found_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/div[2]/div/span")));
    }
    
    //*******************************************************************************************************************************
    
    
public static WebElement leave (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a"));
    } 
    
    
    public static WebElement leave_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a")));
    }
    
    
public static WebElement AssignLeave (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[7]/a"));
    } 
    
    
    public static WebElement AssignLeave_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[7]/a")));
    }
    
    
public static WebElement empname_assignleave (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input"));
    } 
    
    
    public static WebElement empname_assignleave_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input")));
    }
    
    
public static WebElement leave_type (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement leave_type_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[1]")));
    }
    
    
public static WebElement leave_from (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input"));
    } 
    
    
    public static WebElement leave_from_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/input")));
    }
    
    
public static WebElement leave_to (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input"));
    } 
    
    
    public static WebElement leave_to_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[2]/div/div[2]/div/div/input")));
    }
    
public static WebElement leave_Partial_Days (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement leave_Partial_Days_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[1]/div/div[2]/div/div/div[1]")));
    }
    
    
public static WebElement leave_Duration (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/div/div[2]/div/div/div[1]"));
    } 
    
    
    public static WebElement leave_Duration_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/div/div[2]/div/div/div[1]")));
    }
    
    
public static WebElement Assign (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button"));
		//return driver.findElement(By.name("data-v-10d463b7"));   
	//return driver.findElement(By.xpath("//button[contains(text(),'Assign')]"));
} 
    
    
    public static WebElement Assign_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[5]/button")));
    }
    
    
    
public static WebElement Assign_ok (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]"));
    } 
    
    
    public static WebElement Assign_ok_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[3]/div/div/div/div[3]/button[2]")));
    }
    
    
public static WebElement leave_list (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a"));
    } 
    
    
    public static WebElement leave_list_wait(WebDriver driver) {
    	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50)); // Timeout of 10 seconds
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div/div[1]/div[1]/header/div[2]/nav/ul/li[6]/a")));
    }
    
    
public static WebElement leave_list_status (WebDriver driver) {
		
		return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]"));
    } 

public static WebElement leave_list_search (WebDriver driver) {
	
	return driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]"));
} 
    
}
