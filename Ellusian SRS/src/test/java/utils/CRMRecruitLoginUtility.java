 package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.regex.Pattern;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.IAttributes;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

 import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
 
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
import org.json.simple.JSONObject;

import java.util.Map;
public class CRMRecruitLoginUtility {
	public WebDriver driver;
	private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private static Workbook wb;
	  private static Sheet sh;
	  private static FileInputStream fis; 
	  private static FileOutputStream fos; 
	  private static Row row;
	  private static Cell cell;
	  protected Properties objectrepo;
	  protected Properties config;	
	  public ExtentTest test;
	  public ExtentReports report;
	
	 
	    public static String Logs = "";

		 
	  
	  
	public void CRMRecruitLoginClass() throws IOException, InterruptedException {
		

	//	System.setProperty("webdriver.chrome.silentOutput", "true");        
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.SEVERE);
		
		
		//Open wakanow Site
		  String filePath = System.getProperty("user.dir");
		 	
		
		  
 	  FileInputStream fis = new FileInputStream(filePath+"/config/Testdata.xlsx");

	
	    
	    XSSFWorkbook workbook = new XSSFWorkbook(fis); 
		  
		  XSSFSheet sheets = workbook.getSheet("Environment");
		  XSSFSheet sheet = workbook.getSheet("Credentials");
		  XSSFSheet sheet2 = workbook.getSheet("Selenium");

		  objectrepo   = new Properties();
			File objfile = new File(System.getProperty("user.dir")+"//src//test//java//utils/objectrepo.properties");
			FileReader objrepo = new FileReader(objfile);
			objectrepo.load(objrepo);
		  
			  
			  
		  Row plaform = sheets.getRow(1);
		  Cell cell11 = plaform.getCell(1);
		  String PLATFORM  = cell11.getStringCellValue();
		  
		  
		  
		  Row TESTURL= sheets.getRow(14);
		  Cell cell5 = TESTURL.getCell(1);
		  String STAGINGURL  = cell5.getStringCellValue();
		  
		  Row PRODUCTIONURL= sheets.getRow(16);
		  Cell cell4 = PRODUCTIONURL.getCell(1);
		  String PRODURL  = cell4.getStringCellValue();
		  
		  Row PREPROD= sheets.getRow(15);
		  Cell cell2 = PREPROD.getCell(1);
		  String PREPRODURL  = cell2.getStringCellValue();
		  
		  
		  Row username = sheet.getRow(11);
		  Cell cell1 = username.getCell(1);
		  String Username  = cell1.getStringCellValue();
		  
		  
		  Row password = sheet.getRow(12);
		  Cell cell7 = password.getCell(1);
		  String Password  = cell7.getStringCellValue();
		  
		  
		  Row username1 = sheet.getRow(3);
		  Cell cell14 = username1.getCell(1);
		  String Username1  = cell14.getStringCellValue();
		  
		  
		  Row password1 = sheet.getRow(4);
		  Cell cell74 = password1.getCell(1);
		  String Password1  = cell74.getStringCellValue();
		  
		  
		  
		  
		  Row browser = sheets.getRow(5);
		  Cell cell8 = browser.getCell(1);
		  String Browser  = cell8.getStringCellValue();
		 
		 
		     System.setProperty("webdriver.chrome.silentOutput", "true");
		     java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
		    
		  {
			  
			  if (Browser.equals("CHROME")){
				  
				  System.setProperty("webdriver.chrome.driver",filePath +"//Drivers/chromedriver.exe"); 
				//	driver = new ChromeDriver();	
				    log.info("Chrome browser is Selected ");
				 
		 			  
				}
				else if(Browser.equals("FIREFOX")){
					  System.setProperty("webdriver.gecko.driver",filePath +"//Drivers/geckodriver"); 
						driver = new FirefoxDriver();
				    log.info("Firefox browser is Selected ");   
				}	
			  		
		  }
		  
		  
	    
		  
		  if (PLATFORM.equals("TEST")){
			  
			  ChromeOptions options = new ChromeOptions();
			  options.addArguments("--remote-allow-origins=*");
			 driver = new ChromeDriver(options);
			  
 			    log.info("Chrome browser is Selected ");
			  baseUrl = STAGINGURL ;
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				    driver.get(baseUrl);
			    log.info("Test Execution Started On  Alpha");
			 
			   
			    
					  
			}
			else if(PLATFORM.equals("PROD")){
				  ChromeOptions options = new ChromeOptions();
				  options.addArguments("user-data-dir=C:/Users/user_name/AppData/Local/Google/Chrome/User Data");

			//	  options.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(options);
				//  driver = new ChromeDriver();	
				    log.info("Chrome browser is Selected ");
				baseUrl = PRODURL;
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();  
			    driver.get(baseUrl);
			    log.info("Test Execution Started On Production");
			   
			}	
		 
			else if(PLATFORM.equals("PREPROD")){
				
				
				  ChromeOptions options = new ChromeOptions();
				  options.addArguments("--remote-allow-origins=*");
				 driver = new ChromeDriver(options);
			 
			//	 THIS ONE RUN HEADLESS  options.addArguments("--headless", "--window-size=1920,1200");
				   
				 //  driver = new ChromeDriver();
				baseUrl = PREPRODURL;
				driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();
				driver.manage().window().maximize();
				driver.manage().deleteAllCookies();  
			    driver.get(baseUrl);
			    log.info("Test Execution Started On Preprod");
			   
			}	

 driver.findElement(By.xpath(objectrepo.getProperty("Otherorganizations"))).click()	; 
 Thread.sleep(2000);

    driver.findElement(By.xpath(objectrepo.getProperty("EmailLogin"))).sendKeys(Username);	 
	   Thread.sleep(2000);
	   
	   driver.findElement(By.xpath(objectrepo.getProperty("NextButton"))).click()	; 
	   Thread.sleep(2000);
	   
	   
  
	   driver.findElement(By.xpath(objectrepo.getProperty("BannerUsernameTextBox"))).sendKeys(Username1);	 
	   Thread.sleep(2000);
 	   driver.findElement(By.xpath(objectrepo.getProperty("BannerPasswordTextBox"))).sendKeys(Password1);
	   Thread.sleep(2000);
 
	   driver.findElement(By.xpath(objectrepo.getProperty("BannerLoginButton"))).click();
	     log.info("Username , Password Entered and Sign In Button Clicked  ");
	    Thread.sleep(3000);
	   
		 
	    
 

}
	 
  
  @AfterMethod //AfterMethod annotation - This method executes after every test execution
  public void screenShot(ITestResult result){

  driver.quit();
  }}