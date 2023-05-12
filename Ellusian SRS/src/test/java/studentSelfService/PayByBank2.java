package studentSelfService;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;
import org.testng.annotations.Test;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.gargoylesoftware.htmlunit.html.Keyboard;

import utils.StudentSelfServiceLoginUtility;
import utils.log;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileNotFoundException;
 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 


public class PayByBank2 extends StudentSelfServiceLoginUtility{
	 
 
@BeforeMethod



public void setUp1() throws Exception {
	  log.info("START=Student Profile Search--------------------------------------------------------------");

	
	  StudentSelfServiceLoginUtilityclass();
}



 
@SuppressWarnings("rawtypes")
@Test
public void createTestAccount() throws  Exception {
 
	  try {
	
		  Thread.sleep(2000);
		  
		  String filePath = System.getProperty("user.dir");
	 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
		    @SuppressWarnings("resource")
			XSSFWorkbook workbook = new XSSFWorkbook(fis); 			  
			  XSSFSheet sheets = workbook.getSheet("StudentSelf");
 	  
			  Row id = sheets.getRow(1);
			  Cell cell1 = id.getCell(1);
			  String ID  = cell1.getStringCellValue();
	  

			  Row dob = sheets.getRow(2);
			  Cell cell2 = dob.getCell(1);
			  String DOB  = cell2.getStringCellValue();
			  
			  Row address = sheets.getRow(3);
			  Cell cell3 = address.getCell(1);
			  String Address  = cell3.getStringCellValue();
			  
			  
			  Row town = sheets.getRow(4);
			  Cell cell4 = town.getCell(1);
			  String Town  = cell4.getStringCellValue(); 
			  
			  Row cardName = sheets.getRow(5);
			  Cell cell5 = cardName.getCell(1);
			  String CardName  = cell5.getStringCellValue();  
			  
			  
			  Row cardMail = sheets.getRow(6);
			  Cell cell6 = cardMail.getCell(1);
			  String CardMail  = cell6.getStringCellValue(); 
			  
			  
			  Row cardCName = sheets.getRow(6);
			  Cell cell7 = cardCName.getCell(1);
			  String CardCName  = cell7.getStringCellValue(); 

		 
			  
			  
	
	driver.findElement(By.xpath(objectrepo.getProperty("MyAccount"))).click();
    log.info("My Account Clicked  ");

	   Thread.sleep(15000);
		driver.findElement(By.xpath(objectrepo.getProperty("PayByBankButton"))).click();	 
		   log.info("Pay By Bank Clicked");
		   Thread.sleep(2000);
		  
		   // This Switch to New TAB 
		   String currentTab = driver.getWindowHandle();
		   for (String tab : driver.getWindowHandles()) {
		       if (!tab.equals(currentTab)) {
		           driver.switchTo().window(tab); 
		       }       
		   }
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentPageText")));	 
		   log.info("Payment Page Opened");
		   
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentStudentID"))).sendKeys(ID);	 
 		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentStudentDOB"))).sendKeys(DOB); 
 		  
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentTermsBox"))).click();
		   log.info("ID and DOB Supplied and Terms selected");
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentContinue"))).click()	 ;
		   log.info("COntinue Button Clicked ");
		   Thread.sleep(3000);
	   
		   driver.findElement(By.xpath(objectrepo.getProperty("TutionBox"))).click() ;
		   log.info("TutionBox Clicked ");
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentAmount"))).clear();
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentAmount"))).sendKeys("400");
		   log.info("Amount Entered");
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentContinue"))).click()	 ;
		   log.info("COntinue Button Clicked ");
		   Thread.sleep(3000);
		   
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentSummaryText")));	 
		   log.info("Summary Page Opened");
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentContinue"))).click()	 ;
		   log.info("COntinue Button Clicked ");
		   Thread.sleep(3000);
		    
		   log.info("Payment details  Page Opened");
		   
		   driver.findElement(By.xpath(objectrepo.getProperty("CountryDropDown"))).click();	
		   Select oSelect =  new Select( driver.findElement(By.xpath(objectrepo.getProperty("CountryDropDown"))));	
		   oSelect.selectByIndex(2);
		   Thread.sleep(2000);

		   driver.findElement(By.xpath(objectrepo.getProperty("Address1"))).sendKeys(Address);	 
		   log.info("Payment details  Page Opened");
		   

		   driver.findElement(By.xpath(objectrepo.getProperty("Town"))).sendKeys(Town);	 
 		   
		   driver.findElement(By.xpath(objectrepo.getProperty("CardOwnerName"))).sendKeys(CardName)	 ;
 		   driver.findElement(By.xpath(objectrepo.getProperty("CardEmail"))).sendKeys(CardMail)	; 
 		   driver.findElement(By.xpath(objectrepo.getProperty("CardCOnfirmEmail"))).sendKeys(CardCName)	; 
 		   driver.findElement(By.xpath(objectrepo.getProperty("CardTelephone"))).sendKeys("07098761542")	; 
 		   Thread.sleep(2000);
		   driver.findElement(By.xpath(objectrepo.getProperty("PaymentContinue"))).click()	 ;
		   log.info("Payment information entered and COntinue Button Clicked ");
		   Thread.sleep(3000);
		 
		
		   driver.getPageSource().contains("International Bank Transfer");
		   
  		   log.info("Pay By Bank Transfer Option Available ");
		   
		   
		   

	  } 
	  
	  catch (Exception e) {
		  log.info("END=FAILED");
 	   AssertJUnit.fail(e.getMessage());
							 
	 	}
	 }







@AfterMethod //AfterMethod annotation - This method executes after every test execution
public void screenShot(ITestResult result){
//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
if(ITestResult.FAILURE==result.getStatus()){
try{
// To create reference of TakesScreenshot
TakesScreenshot screenshot=(TakesScreenshot)driver;
// Call method to capture screenshot
File src=screenshot.getScreenshotAs(OutputType.FILE);
// Copy files to specific location 
// result.getName() will return name of test case so that screenshot name will be same as test case name
FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"/screenshots/"+result.getName()+new SimpleDateFormat("yyyyMMddhhmm").format(new Date())+".jpg"));

System.out.println("Successfully captured a screenshot");
}catch (Exception e){
System.out.println("Exception while taking screenshot "+e.getMessage());
} 
}
driver.quit();
}

private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

   


}
