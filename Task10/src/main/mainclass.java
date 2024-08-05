package main;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import BOM.selectors1;
import configreader10.configreadcode10;
import controller1.methods1;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class mainclass {

	public static void main(String[] args) {
		
		String[] st={"Peter Mac Anderson","Ramkumar  Chowdary","Ranga  Akunuri","Tushar H Bond","Amelia  Brown"};
        Random random=new Random();
        int randomIndex = random.nextInt(st.length);
        int randomNumber = random.nextInt(100) + 1;
        
        String[] user={"ramaa","meraa","zainn","sosoo","tayaa"};
        Random random1=new Random();
        int randomIndex1 = random1.nextInt(st.length);
        
        
        String[] jtitle={"IT","Programming","ComputerPrograming","ITProgramming"};
        Random random5=new Random();
        int randomIndex5 = random5.nextInt(st.length);
        
        
        String[] Namepay={"Grade6","Grade7","Grade8","Grade9","Grade10"};
        Random random2=new Random();
        int randomIndex2 = random2.nextInt(st.length);
        
        
        
        
        
//        String[] cun={"1000","2000","3000"};
//        Random random3=new Random();
//        int randomIndex3 = random3.nextInt(st.length);
//        
//        
//        String[] cux={"4000","5000","6000"};
//        Random random4=new Random();
//        int randomIndex4 = random4.nextInt(st.length);
//        
        String[] sn={"development project",
        		"e-commerce platform renewal project",
        		"mobile application launch project",
        		"control panel project",
        		};
        Random random6=new Random();
        int randomIndex6 = random6.nextInt(st.length);
        
        
        
        String[] jc={"Software developer","Software engineer","Systems engineer","Cybersecurity Engineer","Systems Analyst","Database Administrator","Network Engineer","Web Developer"};
        Random random7=new Random();
        int randomIndex7 = random7.nextInt(st.length);
        
        
        
        String[] shn={"Full-time","part time","Distance working","hourly work","full","part"};
        Random random8=new Random();
        int randomIndex8 = random8.nextInt(st.length);
        
        
//        String[] from={"08:00AM","09:00AM","10:00AM","11:00AM"};
//        Random random9=new Random();
//        int randomIndex9 = random9.nextInt(st.length);
//        
//        String[] TO={"05:00PM","02:00PM","06:00PM","12:00PM"};
//        Random random10=new Random();
//        int randomIndex10 = random10.nextInt(st.length);
        
        

		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\HP\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    configreadcode10 crc=new configreadcode10();
     	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(100));
     	
     	
     	
     	
     try {
    	 //Thread.sleep(3000);
     		 
		 driver.manage().window().maximize();
     	 driver.get(crc.geturl());
         Thread.sleep(3000);
         //selectors1.log_wait(driver);
     	methods1.usernamesendkey(driver,crc.getusername());
        methods1.passwordsendkey(driver,crc.getpassword());
        selectors1.login_wait(driver);
        methods1.loginclick(driver);
        
        selectors1.admin_wait(driver);
        methods1.adminclick(driver);
        
        selectors1.add_wait(driver);
        methods1.addclick(driver);
        //Thread.sleep(5000);
        
        selectors1.UserRole_wait(driver);
        methods1.UserRoleclick(driver,"Admin");
        
        
        
       // methods1.UserRolesendkey(driver);
        selectors1.EmployeeName_wait(driver);
       // methods1.empnamesendkey(driver,st[randomIndex]);
       // methods1.empnamesendkey(driver,methods1.nn(driver));
        methods1.empnamesendkey(driver, methods1.nn(driver));

        
        selectors1.Status_wait(driver);
        methods1.Statusclick(driver,"Enabled");
        
        
        selectors1.UserNamei_wait(driver);
        methods1.user_sendkey(driver,user[randomIndex1]);
        
        
        selectors1.pass1_wait(driver);
        methods1.pass1_sendkey(driver,crc.getpass1());
        
        
        selectors1.Confirm_Password_wait(driver);
        methods1.Confirm_Password_sendkey(driver, crc.getpass1());
        
        
        selectors1.save_wait(driver);
        methods1.save_click(driver);
//        
//        //******************************************************************************
        
        selectors1.user2_wait(driver);
        methods1.user2_sendkey(driver,user[randomIndex1] );
        
        
        selectors1.UserRole2_wait(driver);
        methods1.UserRole2_click(driver, "Admin");
        
        
        selectors1.EmployeeName2_wait(driver);
       // String nn = methods1.
        methods1.empname2_sendkey(driver, methods1.nn(driver));
        
        selectors1.status2_wait(driver);
        methods1.Status2click(driver, "Enabled");
        
        
        selectors1.search_wait(driver);
        methods1.search_click(driver);
        
        
        selectors1.found_wait(driver);
        String Found=methods1.Found_click(driver);
        
        if(!(Found.contains("(0)") || Found.contains("No"))) {
     		System.out.println("Passed");
     	 }
     	 else {
     		System.out.println("Failed");
     	 }
        Thread.sleep(2000);

        //*****************************************************************************
         
        selectors1.admin_wait(driver);
        methods1.adminclick(driver);
        
        selectors1.job_wait(driver);
        methods1.job_click(driver);
        
        
        selectors1.Job_Titles_wait(driver);
        methods1.Job_Titles_click(driver);
        
        selectors1.add_Job_Titles_wait(driver);
        methods1.add_Job_Titles_click(driver);
        
        
        selectors1.add_Job_Titles_Name_wait(driver);
        methods1.add_Job_Titles_Name_sendkey(driver, jtitle[randomIndex5]+randomNumber);
        
        
        selectors1.add_Job_Titles_Description(driver);
        methods1.add_Job_Titles_Description_sendkey(driver, crc.getjobDescription());
        
        selectors1.add_Job_Titles_Note_wait(driver);
        methods1.add_Job_Titles_Note_sendkey(driver, crc.getjobNote());
        
        selectors1.add_Job_Titles_save_wait(driver);
        methods1.Job_Titles_save_click(driver);
        
        
        selectors1.Job_Titles_found_wait(driver);
        String Found2=methods1.Job_Titles_found_click(driver);
        
        if(!(Found2.contains("(0)") || Found2.contains("No"))) {
     		System.out.println("Job_Titles Passed");
     	 }
     	 else {
     		System.out.println("Job_Titles Failed");
     	 }
        Thread.sleep(2000);
//        
//        //********************************************************************
        
        selectors1.job2_wait(driver);
        methods1.job2_click(driver);
        
        selectors1.job2_PayGrade_wait(driver);
        methods1.job2_PayGrades_click(driver);
        
        selectors1.job2_PayGrade_add_wait(driver);
        methods1.job2_PayGrades_add_click(driver);
        
        selectors1.job2_PayGrade_add_Name_wait(driver);
        methods1.job2_PayGrades_add_Name_sendkey(driver,Namepay[randomIndex2]+randomNumber);
        
        selectors1.job2_PayGrade_add_Name_save_wait(driver);
        methods1.job2_PayGrades_add_Name_save_click(driver);
        
        selectors1.job2_PayGrade_add_Name_save_add2_wait(driver);
        methods1.job2_PayGrades_add_Name_save_add2_click(driver);
        
        selectors1.job2_PayGrade_add_Name_save_add2_c_wait(driver);
        methods1.job2_PayGrades_add_Name_save_add2_c_click(driver, "USD - United States Dollar");
        
        Thread.sleep(3000);
        
        selectors1.job2_PayGrade_add_Name_save_add2_c_min_wait(driver);
        methods1.job2_PayGrades_add_Name_save_add2_c_min_sendkey(driver, "2000");
        
        
        selectors1.job2_PayGrade_add_Name_save_add2_c_max_wait(driver);
        methods1.job2_PayGrades_add_Name_save_add2_c_max_sendkey(driver, "5000");
        Thread.sleep(1000);
        
        selectors1.job2_PayGrade_add_Name_save2_wait(driver);
        methods1.job2_PayGrades_add_Name_save2_click(driver);
        
        selectors1.Job2_PayGrade_found_wait(driver);
        String F=methods1.Job2_PayGrade_found_click(driver);
        
        if(!(F.contains("(0)") || F.contains("No"))) {
     		System.out.println("PayGrade Passed");
     	 }
     	 else {
     		System.out.println("PayGrade Failed");
     	 }
        Thread.sleep(3000);
        
//        
//        //************************************************************************************
        
        selectors1.job3_wait(driver);
        methods1.job3_click(driver);
        
        selectors1.job3_EmploymentStatus_wait(driver);
        methods1.job3_EmploymentStatus_click(driver);
        
        selectors1.job3_EmploymentStatus_add_wait(driver);
        methods1.job3_EmploymentStatus_add_click(driver);
        
        selectors1.job3_EmploymentStatus_add_name_wait(driver);
        methods1.job3_EmploymentStatus_add_name_click(driver,sn[randomIndex6]+randomNumber);
	
        selectors1.job3_EmploymentStatus_add_name_save_wait(driver);
        methods1.job3_EmploymentStatus_add_name_save_click(driver);
        
        selectors1.Job3_EmploymentStatus_found_wait(driver);
        String Fo=methods1.Job3_EmploymentStatus_found_click(driver);
        
        if(!(Fo.contains("(0)") || Fo.contains("No"))) {
     		System.out.println("EmploymentStatus Passed");
     	 }
     	 else {
     		System.out.println("EmploymentStatus Failed");
     	 }
        Thread.sleep(3000);
//        //*******************************************************************************************
        
        selectors1.job4_wait(driver);
        methods1.job4_click(driver);
        
        selectors1.job4_JobCategories_wait(driver);
        methods1.job4_JobCategories_click(driver);
        
        selectors1.job4_JobCategories_add_wait(driver);
        methods1.job4_JobCategories_add_click(driver);
        
        selectors1.job4_JobCategories_add_name_wait(driver);
        methods1.job4_JobCategories_add_name_click(driver,jc[randomIndex7]+randomNumber);
	
        selectors1.job4_JobCategories_add_name_save_wait(driver);
        methods1.job4_JobCategories_add_name_save_click(driver);
        
        selectors1.Job4_JobCategories_found_wait(driver);
        String Fou=methods1.Job4_JobCategories_found_click(driver);
        
        if(!(Fou.contains("(0)") || Fou.contains("No"))) {
     		System.out.println("JobCategories Passed");
     	 }
     	 else {
     		System.out.println("JobCategories Failed");
     	 }
        Thread.sleep(3000);
        
        //************************************************************************************
//        
        selectors1.job5_wait(driver);
        methods1.job5_click(driver);
        
        selectors1.job5_WorkShifts_wait(driver);
        methods1.job5_WorkShifts_click(driver);
        
        selectors1.job5_WorkShifts_add_wait(driver);
        methods1.job5_WorkShifts_add_click(driver);
        
        selectors1.job5_WorkShifts_add_name_wait(driver);
        methods1.job5_WorkShifts_add_name_sendKeys(driver,shn[randomIndex8]+randomNumber);
        
//        selectors1.job5_WorkShifts_add_fromhours_wait(driver);
//        methods1.job5_WorkShifts_add_fromhours_sendKeys(driver,crc.getjobfrom());
//        
//        selectors1.job5_WorkShifts_add_tohours_wait(driver);
//        methods1.job5_WorkShifts_add_tohours_sendKeys(driver,crc.getjobto());
        
         // selectors1.job5_WorkShifts_add_fromhours1_wait(driver);
          methods1.job5_WorkShifts_add_fromhours1_click(driver);
          
        
          
        //  selectors1.job5_WorkShifts_add_fromhours2_wait(driver);
          methods1.job5_WorkShifts_add_fromhours2_sendKeys(driver, crc.getjobfrom());
          Thread.sleep(2000);
          //selectors1.job5_WorkShifts_add_tohours_wait(driver);
          methods1.job5_WorkShifts_add_tohours1_click(driver);
          
          //selectors1.job5_WorkShifts_add_tohours1_wait(driver);
          //selectors1.job5_WorkShifts_add_tohours1(driver).clear();
          methods1.job5_WorkShifts_add_tohours2_sendKeys(driver, crc.getjobto());
          //Thread.sleep(2000);

          selectors1.expected_wait(driver);
          //Thread.sleep(2000);
          String exp= crc.getjobexp();
          System.out.println("Expected = " + exp);
          System.out.println("Actual = " +  methods1.exp_click(driver));
          String act= methods1.exp_click(driver);
          //Thread.sleep(2000);
          
//          //exp
         
          if(exp.equals(act))
          {
        	  System.out.println("passed");
          }
          else {
        	  System.out.println("failed");
          }
          
          //selectors1.job5_WorkShifts_add_save_wait(driver);
          methods1.job5_WorkShifts_save_click(driver);
          

        
//        selectors1.job5_WorkShifts_add_name_AssignedEmployees_wait(driver);
//        methods1.job5_WorkShifts_add_AssignedEmployees_sendKeys(driver,"");
        
	
        selectors1.job5_WorkShifts_found_wait(driver);
        String Foun=methods1.job5_WorkShifts_found_click(driver);
        
        if(!(Foun.contains("(0)") || Foun.contains("No"))) {
     		System.out.println("WorkShifts Passed");
     	 }
     	 else {
     		System.out.println("WorkShifts Failed");
     	 }
        Thread.sleep(3000);
        
        //**********************************************************************************

        selectors1.leave_wait(driver);
        methods1.leave_click(driver);
        
        selectors1.AssignLeave_wait(driver);
        methods1.AssignLeave_click(driver);
        
        selectors1.empname_assignleave_wait(driver);
       // methods1.empname_assignleave_sendkey(driver, "admin");
        methods1.empname_assignleave_sendkey(driver, methods1.nn(driver));
        
        selectors1.leave_type_wait(driver);
        methods1.leave_type_click(driver, "CAN - FMLA");
        
       // selectors1.leave_from_wait(driver);
        methods1.leave_from_sendKeys(driver, crc.getjobfdate());
        
       // selectors1.leave_to_wait(driver);
       // Thread.sleep(5000);
        //methods1.leave_to_sendKeys(driver, "");
        //selectors1.leave_to(driver).clear();
        methods1.leave_to_sendKeys(driver, crc.getjobtdate());
        
        Thread.sleep(5000);
     /**/   
//        selectors1.leave_Partial_Days_wait(driver);
//        methods1.leave_Partial_Days_click(driver, "All Days");
//        
//        selectors1.leave_Duration_wait(driver);
//        methods1.leave_Duration_click(driver, "Half Day - Morning");
        /**/
        //methods1.empname_assignleave_sendkey(driver, methods1.nn(driver));
        //selectors1.Assign_wait(driver);
        //Thread.sleep(5000);
        methods1.Assign_click(driver);
        try {
			selectors1.Assign_ok_wait(driver);
			methods1.Assign_ok_click(driver);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("No OK");
			
		}
        
        Thread.sleep(5000);

        selectors1.leave_list_wait(driver);
        methods1.leave_list_click(driver);
        
        methods1.leave_list_status_click(driver, "Scheduled");
        
        methods1.leave_list_search_click(driver);
        
        
        
        
        Thread.sleep(5000);

        
        
     
	} catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close the browser
        driver.quit();
    }
     
	}

}
