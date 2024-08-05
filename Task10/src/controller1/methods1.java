package controller1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import BOM.selectors1;
public class methods1 {

	public static void usernamesendkey(WebDriver driver,String r) throws InterruptedException {

		selectors1.username(driver).sendKeys(r);

		}
	
	public static void passwordsendkey(WebDriver driver,String p) throws InterruptedException {

		selectors1.password(driver).sendKeys(p);

		}
	
	public static void loginclick(WebDriver driver) throws InterruptedException {

		selectors1.login(driver).click();

		}
	
	public static void adminclick(WebDriver driver) throws InterruptedException {

		selectors1.admin(driver).click();

		}
	
	public static void addclick(WebDriver driver) throws InterruptedException {

		selectors1.add(driver).click();

		}
	
	public static void UserRoleclick(WebDriver driver, String choose) throws InterruptedException {

//		 WebElement userRoleElement = selectors1.UserRole(driver);
//		selectors1.UserRole(driver).click();
////		selectors1.UserRole(driver).sendKeys("Admin");
////		selectors1.UserRole(driver).click();
//		Select userRoleDropdown = new Select(userRoleElement);
//        userRoleDropdown.selectByVisibleText("Admin");
		WebElement dropdown = selectors1.UserRole(driver);
        dropdown.click();

        // Allow time for the dropdown options to appear
        Thread.sleep(1000); // Consider using WebDriverWait instead for a more reliable wait

        // Locate the option 'Admin' using the visible text and click it
        WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(), choose)]"));
        adminOption.click();

		}
	
	
	public static void empnamesendkey(WebDriver driver,String r) throws InterruptedException {

		WebElement employeeNameField = selectors1.EmployeeName(driver);
        employeeNameField.sendKeys(r);
        
        Thread.sleep(2000);
        // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
         employeeNameField.sendKeys(Keys.ARROW_DOWN);

         
         employeeNameField.sendKeys(Keys.ENTER);
         Thread.sleep(2000);
        
        
        
        /**/
//       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//        //List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));
//       List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));
//        // Loop through the options and click the desired employee name
//        for (WebElement option : employeeNameOptions) {
//            if (option.getText().equals(r)) {
//            	option.click();
//               break;
//
//            }
//            else {
//            	employeeNameField.clear();
//            	System.out.println("Name not found");
//            	
//            	//employeeNameField.sendKeys("Ranga  Akunuri");
//            	
//            }
            
        }
        
        /**/
//        
//        
//        Thread.sleep(1000);
//
//        WebElement employeeNameOption = driver.findElement(By.xpath("//*[contains(text(),r)]"));
//        Thread.sleep(1000);
//        employeeNameOption.click();
//        Thread.sleep(5000);
//		selectors1.EmployeeName(driver).sendKeys(r);
//		WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(),choose]"));
//	       adminOption.click();
		// Locate the Employee Name textbox
//        WebElement employeeNameTextbox = driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
//
        // Enter the employee name
//        selectors1.EmployeeName(driver).sendKeys(r);
//
//        // Wait for the dropdown list to appear and select the desired employee name
//        //WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//       // WebElement employeeNameOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(), r)]")));
//        WebElement employeeNameOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='option' and text()= r]")));
//        Thread.sleep(5000);
//
//        // Click the desired employee name
//        employeeNameOption.click();
//        Thread.sleep(5000);

		//}
	
	
	public static void Statusclick(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.Status(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(), 'Enabled')]"));
       adminOption.click();

		}
	
	
	
	public static void user_sendkey(WebDriver driver,String user) throws InterruptedException {

		selectors1.UserNamei(driver).sendKeys(user);

		}
	
	
	
	public static void pass1_sendkey(WebDriver driver,String pass) throws InterruptedException {

		selectors1.pass1(driver).sendKeys(pass);

		}
	
	
	
	public static void Confirm_Password_sendkey(WebDriver driver,String cpass) throws InterruptedException {

		selectors1.Confirm_Password(driver).sendKeys(cpass);

		}
	
	public static void save_click(WebDriver driver) throws InterruptedException {

		selectors1.save(driver).click();;

		}
	
	
	//******************************************************************************************
	
	
	public static void user2_sendkey(WebDriver driver,String user2) throws InterruptedException {

		selectors1.user2(driver).sendKeys(user2);

		}
	
	
	
	public static void UserRole2_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.UserRolec2(driver);
       dropdown.click();

       Thread.sleep(1000); 

       WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(), 'Admin')]"));
       adminOption.click();

		}
	
	public static String nn (WebDriver driver) {
//		return selectors1.findName(driver).getText().split(" ")[0];
		return selectors1.findName(driver).getText();
	}
	
	public static void empname2_sendkey(WebDriver driver,String r) throws InterruptedException {

		WebElement employeeNameField = selectors1.EmployeeName2(driver);
        employeeNameField.sendKeys(r);
        
        /**/
        Thread.sleep(2000);
      // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       employeeNameField.sendKeys(Keys.ARROW_DOWN);
       Thread.sleep(2000);

       
       employeeNameField.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
       
        //List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));
      // List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));
        // Loop through the options and click the desired employee name
        /*for (WebElement option : employeeNameOptions) {
            if (option.getText().equals(r)) {
            	option.click();
                break;

            }
            else {
            	employeeNameField.clear();
            	System.out.println("Name not found");
            	
            	//employeeNameField.sendKeys("Ranga  Akunuri");
            	
            }*/
      /* boolean nameFound = false;
       while (true) {
           // Get all options
           List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
                   By.xpath("//div[contains(@class, 'ac_results')]//li")));

           for (WebElement option : employeeNameOptions) {
               // Compare each option's text
               if (option.getText().equals("Ranga  Akunuri")) { // Example target name
                   option.click();
                   nameFound = true;
                   break;
               }
           }

           if (nameFound) {
               System.out.println("Name found and selected.");
               break;
           } else {
               // Clear the field and try again (or exit the loop after a few attempts to prevent infinite loop)
               employeeNameField.clear();
               employeeNameField.sendKeys("R"); // Try again or use another input
               System.out.println("Name not found. Trying again...");
           }
       }*/
            
        }
	
	
	
	
	
	public static void Status2click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.status2(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(), 'Enabled')]"));
       adminOption.click();

		}
	
	
	public static void search_click(WebDriver driver) throws InterruptedException {

		selectors1.search(driver).click();

		}
	
	
	public static String Found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.found(driver).getText();

		}
	
	
	
//	public static void UserRolesendkey(WebDriver driver) throws InterruptedException {
//
//		selectors1.UserRolek(driver).click();
//
//		}
	
	//************************************************************************************************
	
	
	public static void job_click(WebDriver driver) throws InterruptedException {

		  selectors1.job(driver).click();

		}
	
	public static void Job_Titles_click(WebDriver driver) throws InterruptedException {

		  selectors1.Job_Titles(driver).click();

		}
	
	
	
	public static void add_Job_Titles_click(WebDriver driver) throws InterruptedException {

		  selectors1.add_Job_Titles(driver).click();

		}
	
	
	public static void add_Job_Titles_Name_sendkey(WebDriver driver,String Name) throws InterruptedException {

		  selectors1.add_Job_Titles_Name(driver).sendKeys(Name);

		}
	
	
	public static void add_Job_Titles_Description_sendkey(WebDriver driver,String Description) throws InterruptedException {

		  selectors1.add_Job_Titles_Description(driver).sendKeys(Description);

		}
	
	public static void add_Job_Titles_Note_sendkey(WebDriver driver,String Note) throws InterruptedException {

		  selectors1.add_Job_Titles_Note(driver).sendKeys(Note);

		}
	
	
	public static void Job_Titles_save_click(WebDriver driver) throws InterruptedException {

		  selectors1.add_Job_Titles_save(driver).click();

		}
	
	
	public static String Job_Titles_found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.Job_Titles_found(driver).getText();

		}
	
	//*********************************************************************************************
	
	public static void job2_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2(driver).click();

		}
	
	
	public static void job2_PayGrades_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2_PayGrades(driver).click();

		}
	
	public static void job2_PayGrades_add_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2_PayGrades_add(driver).click();

		}
	
	
	public static void job2_PayGrades_add_Name_sendkey(WebDriver driver,String Nameg) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name(driver).sendKeys(Nameg);

		}
	
	public static void job2_PayGrades_add_Name_save_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name_save(driver).click();

		}
	
	public static void job2_PayGrades_add_Name_save_add2_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name_save_add2(driver).click();

		}
	
	
	public static void job2_PayGrades_add_Name_save_add2_c_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.job2_PayGrades_add_Name_save_add2_c(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement adminOption = driver.findElement(By.xpath("//*[contains(text(), 'USD - United States Dollar')]"));
       adminOption.click();

		}
	
	public static void job2_PayGrades_add_Name_save_add2_c_min_sendkey(WebDriver driver,String Namen) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name_save_add2_c_min(driver).sendKeys(Namen);

		}
	
	
	public static void job2_PayGrades_add_Name_save_add2_c_max_sendkey(WebDriver driver,String Namex) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name_save_add2_c_max(driver).sendKeys(Namex);

		}
	
	
	public static void job2_PayGrades_add_Name_save2_click(WebDriver driver) throws InterruptedException {

		  selectors1.job2_PayGrades_add_Name_save2(driver).click();

		}
	
	
	public static String Job2_PayGrade_found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.Job2_PayGrade_found(driver).getText();

		}
	
	//***********************************************************************************************
	public static void job3_click(WebDriver driver) throws InterruptedException {

		  selectors1.job3(driver).click();

		}
	
	public static void job3_EmploymentStatus_click(WebDriver driver) throws InterruptedException {

		  selectors1.job3_EmploymentStatus(driver).click();

		}
	
	
	public static void job3_EmploymentStatus_add_click(WebDriver driver) throws InterruptedException {

		  selectors1.job3_EmploymentStatus_add(driver).click();

		}
	
	public static void job3_EmploymentStatus_add_name_click(WebDriver driver,String n) throws InterruptedException {

		  selectors1.job3_EmploymentStatus_add_name(driver).sendKeys(n);

		}
	
	public static void job3_EmploymentStatus_add_name_save_click(WebDriver driver) throws InterruptedException {

		  selectors1.job3_EmploymentStatus_add_name_save(driver).click();

		}
	
	public static String Job3_EmploymentStatus_found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.Job3_EmploymentStatus_found(driver).getText();

		}
	
	//****************************************************************************************************
	
	public static void job4_click(WebDriver driver) throws InterruptedException {

		  selectors1.job4(driver).click();

		}
	
	public static void job4_JobCategories_click(WebDriver driver) throws InterruptedException {

		  selectors1.job4_JobCategories(driver).click();

		}
	
	
	public static void job4_JobCategories_add_click(WebDriver driver) throws InterruptedException {

		  selectors1.job4_JobCategories_add(driver).click();

		}
	
	public static void job4_JobCategories_add_name_click(WebDriver driver,String n) throws InterruptedException {

		  selectors1.job4_JobCategories_add_name(driver).sendKeys(n);

		}
	
	public static void job4_JobCategories_add_name_save_click(WebDriver driver) throws InterruptedException {

		  selectors1.job4_JobCategories_add_name_save(driver).click();

		}
	
	public static String Job4_JobCategories_found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.Job4_JobCategories_found(driver).getText();

		}
	
	//****************************************************************************************************
	
	public static void job5_click(WebDriver driver) throws InterruptedException {

		  selectors1.job5(driver).click();

		}
	
	public static void job5_WorkShifts_click(WebDriver driver) throws InterruptedException {

		  selectors1.job5_WorkShifts(driver).click();

		}
	
	
	public static void job5_WorkShifts_add_click(WebDriver driver) throws InterruptedException {

		  selectors1.job5_WorkShifts_add(driver).click();

		}
	
	public static void job5_WorkShifts_add_name_sendKeys(WebDriver driver,String n) throws InterruptedException {

		  selectors1.job5_WorkShifts_add_name(driver).sendKeys(n);
	}
	
//	public static void job5_WorkShifts_add_fromhours_sendKeys(WebDriver driver,String n) throws InterruptedException {
//
//		  selectors1.job5_WorkShifts_add_fromhours(driver).sendKeys(n);
//
//	}
	
	
	
	public static void job5_WorkShifts_add_fromhours1_click(WebDriver driver) throws InterruptedException {
		
			  selectors1.job5_WorkShifts_add_fromhours1(driver).click();
		
		}
	
	public static void job5_WorkShifts_add_fromhours2_sendKeys(WebDriver driver,String n) throws InterruptedException {
		
//		  selectors1.job5_WorkShifts_add_fromhours2(driver).clear();
//
//		  selectors1.job5_WorkShifts_add_fromhours2(driver).sendKeys(n);
		  selectors1.job5_WorkShifts_add_fromhours2(driver).sendKeys(Keys.CONTROL + "a");
		  selectors1.job5_WorkShifts_add_fromhours2(driver).sendKeys(Keys.DELETE);
		  selectors1.job5_WorkShifts_add_fromhours2(driver).sendKeys(n);

	
	}
	
	
	public static void job5_WorkShifts_add_tohours1_click(WebDriver driver) throws InterruptedException {

		  selectors1.job5_WorkShifts_add_tohours(driver).click();

	}
	
	
	//----------------------------------------------------------------------------------------------
	public static void job5_WorkShifts_add_tohours2_sendKeys(WebDriver driver,String n) throws InterruptedException {

//		  selectors1.job5_WorkShifts_add_tohours1(driver).clear();
//		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(Keys.DELETE);
//		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys("");
//		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(n);
		
		selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(Keys.CONTROL + "a");
		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(Keys.DELETE);
		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(n);
		  selectors1.job5_WorkShifts_add_tohours1(driver).sendKeys(Keys.ENTER);




	}
	
	
	
//	public static void job5_WorkShifts_add_AssignedEmployees_sendKeys(WebDriver driver,String n) throws InterruptedException {
//
//		  selectors1.job5_WorkShifts_add_AssignedEmployees(driver).sendKeys(n);
//
//	}
	
	
	//exp
	
		public static String exp_click(WebDriver driver) throws InterruptedException {
			
			//Thread.sleep(2000);
			selectors1.job5_WorkShifts_add_tohours1_wait_invisible(driver);

			return  selectors1.expected(driver).getText();

			}
		//+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
	
	
	public static void job5_WorkShifts_save_click(WebDriver driver) throws InterruptedException {

		  selectors1.job5_WorkShifts_add_save(driver).click();

		}
	
	public static String job5_WorkShifts_found_click(WebDriver driver) throws InterruptedException {

		return  selectors1.job5_WorkShifts_found(driver).getText();

	}
	
	//*************************************************************************************************
	
	public static void leave_click(WebDriver driver) throws InterruptedException {

		  selectors1.leave(driver).click();

		}
	
	
	public static void AssignLeave_click(WebDriver driver) throws InterruptedException {

		  selectors1.AssignLeave(driver).click();

		}
	
	
	
	public static void empname_assignleave_sendkey(WebDriver driver,String r) throws InterruptedException {

		WebElement employeeNameField = selectors1.empname_assignleave(driver);
        employeeNameField.sendKeys(r);
        
        
        /**/
        Thread.sleep(2000);
      // WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
       employeeNameField.sendKeys(Keys.ARROW_DOWN);

       
       employeeNameField.sendKeys(Keys.ENTER);
       Thread.sleep(2000);
        
        /**/
//       WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//        //List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));
//       List<WebElement> employeeNameOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='listbox']//span")));
//        // Loop through the options and click the desired employee name
//        for (WebElement option : employeeNameOptions) {
//            if (option.getText().equals(r)) {
//            	option.click();
//               break;
//
//            }
//            else {
//            	employeeNameField.clear();
//            	System.out.println("Name not found");
//            	
//            	
//            }
            
        }
	//}
	
	
	public static void leave_type_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.leave_type(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement leave_typeOption = driver.findElement(By.xpath("//*[contains(text(), 'CAN - FMLA')]"));
       leave_typeOption.click();

		}
	
	
	public static void leave_from_sendKeys(WebDriver driver,String n) throws InterruptedException {

		  selectors1.leave_from(driver).clear();

		  selectors1.leave_from(driver).sendKeys(n);
		  selectors1.leave_to(driver).clear();
		  

		}
	
	
	public static void leave_to_sendKeys(WebDriver driver,String n) throws InterruptedException {
		
		//selectors1.leave_from(driver).clear();  
		//selectors1.leave_to(driver).clear();
		selectors1.leave_to(driver).sendKeys(Keys.CONTROL + "a");
		selectors1.leave_to(driver).sendKeys(Keys.DELETE);
		  selectors1.leave_to(driver).sendKeys(n);
		  selectors1.leave_to(driver).sendKeys(Keys.ENTER);

		}
	
	
	
	public static void leave_Partial_Days_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.leave_Partial_Days(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement leave_Partial_DaysOption = driver.findElement(By.xpath("//*[contains(text(), 'All Days')]"));
       leave_Partial_DaysOption.click();

		}
	
	
	public static void leave_Duration_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.leave_Duration(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement leave_DurationOption = driver.findElement(By.xpath("//*[contains(text(), 'Half Day - Morning')]"));
       leave_DurationOption.click();

		}
	
	
	public static void Assign_click(WebDriver driver) throws InterruptedException {

		WebElement okButton = selectors1.Assign(driver);
		okButton.click();
		}
	
	public static void Assign_ok_click(WebDriver driver) throws InterruptedException {

		WebElement okButton = driver.findElement(By.xpath("//button[contains(text(),'Ok')]"));
		okButton.click();

		}
	
	public static void leave_list_click(WebDriver driver) throws InterruptedException {

		  selectors1.leave_list(driver).click();

		}
	
	
	public static void leave_list_status_click(WebDriver driver, String choose) throws InterruptedException {

		WebElement dropdown = selectors1.leave_list_status(driver);
       dropdown.click();

       Thread.sleep(1000);

       WebElement leave_DurationOption = driver.findElement(By.xpath("//*[contains(text(), 'Scheduled')]"));
       leave_DurationOption.click();

		}
	
	
	
	public static void leave_list_search_click(WebDriver driver) throws InterruptedException {

		  selectors1.leave_list_search(driver).click();

		}
	
	

}

