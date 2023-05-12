package cRMRecruit;

//Generated by Selenium IDE
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

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
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
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

import utils.CRMRecruitLoginUtility;
import utils.MeBannerLoginUtility;
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
import org.openqa.selenium.JavascriptExecutor;


 
public class CheckAccountCreatedCount extends CRMRecruitLoginUtility{
	 private Map<String, Object> vars;
	  JavascriptExecutor js;
 
@BeforeMethod


public void setUp1() throws Exception {
	  log.info("START=Student Profile Search--------------------------------------------------------------");
	  CRMRecruitLoginClass();
 	    js = (JavascriptExecutor) driver;
	    vars = new HashMap<String, Object>();
	 
}



public String waitForWindow(int timeout) {
    try {
      Thread.sleep(timeout);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    Set<String> whNow = driver.getWindowHandles();
    Set<String> whThen = (Set<String>) vars.get("window_handles");
    if (whNow.size() > whThen.size()) {
      whNow.removeAll(whThen);
    }
    return whNow.iterator().next();
}
 
@SuppressWarnings("rawtypes")
@Test
public void changeemail() throws  Exception {
 	  try {
		   
		  String filePath = System.getProperty("user.dir");
	 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");
		    XSSFWorkbook workbook = new XSSFWorkbook(fis); 			  
			  XSSFSheet sheet = workbook.getSheet("CRM-Banner");
			  XSSFSheet sheets = workbook.getSheet("Environment");


			  Row Studname = sheet.getRow(2);
			  Cell cell1 = Studname.getCell(1);
			  String studname  = cell1.getStringCellValue();
			  
			  
			  
			  
			  Row TESTURL= sheets.getRow(6);
			  Cell cell5 = TESTURL.getCell(1);
			  String STAGINGURL  = cell5.getStringCellValue();
			  
			  Row PRODUCTIONURL= sheets.getRow(8);
			  Cell cell4 = PRODUCTIONURL.getCell(1);
			  String PRODURL  = cell4.getStringCellValue();
			  
			  Row PREPROD= sheets.getRow(7);
			  Cell cell2 = PREPROD.getCell(1);
			  String PREPRODURL  = cell2.getStringCellValue();
			  
			  Row plaform = sheets.getRow(1);
			  Cell cell11 = plaform.getCell(1);
			  String PLATFORM  = cell11.getStringCellValue();
			  
			  
			   
 			    vars.put("window_handles", driver.getWindowHandles());
			    driver.findElement(By.id("advancedFindImage")).click();
			     
			    vars.put("win23", waitForWindow(2000));
			    vars.put("root", driver.getWindowHandle());
			    driver.switchTo().window(vars.get("win23").toString());
			    
			    driver.switchTo().frame(0);
			    driver.findElement(By.id("slctPrimaryEntity")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("slctPrimaryEntity"));
			      dropdown.findElement(By.xpath("//option[. = 'People']")).click();
			    }
			    driver.findElement(By.id("savedQuerySelector")).click();
			    {
			      WebElement dropdown = driver.findElement(By.id("savedQuerySelector"));
			      dropdown.findElement(By.xpath("//option[. = 'Last 24 Hours Created Accounts']")).click();
			    }
			    driver.switchTo().defaultContent();
			    driver.findElement(By.cssSelector(".ms-crm-ImageStrip-Results_32")).click();
			    {
			      WebElement element = driver.findElement(By.cssSelector(".ms-crm-ImageStrip-Assign_32"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element).perform();
			    }
			    {
			      WebElement element = driver.findElement(By.tagName("body"));
			      Actions builder = new Actions(driver);
			      builder.moveToElement(element, 0, 0).perform();
			    }
			   
			    driver.switchTo().frame(0);
			    driver.switchTo().frame(0);
			    
  			    driver.findElement(By.id("crmGridControl_gridBodyTable_checkBox_Image_All")).click();
			    driver.findElement(By.id("crmGridControl_LastItem")).click();
			    driver.findElement(By.id("crmGridControl_ItemsSelected")).click();
			    driver.findElement(By.id("crmGridControl_ItemsSelected")).click();
			    driver.findElement(By.id("crmGridControl_ItemsSelected")).click();
			    
	String TotalCount = driver.findElement(By.id("crmGridControl_ItemsSelected")).getText();
 	  int PageCount = Integer.parseInt(TotalCount);
	  log.info("Total Selected Count within 24 Hours is   "  +PageCount);
			 
		  Thread.sleep(2000);
		 
		   
		  
  if ( PageCount <= 5){
			  
	  log.info("Created Accounts is Within the specified limit ");
	    
					  
			}
			else  if ( PageCount > 5){
 			 
				  Assert.fail();
				  
			}	
		 
	 		  
		  
		  
		  
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
