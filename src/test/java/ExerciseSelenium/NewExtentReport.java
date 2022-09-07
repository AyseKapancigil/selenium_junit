package ExerciseSelenium;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.myfirstproject.utilities.TestBase;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NewExtentReport extends TestBase {


    protected ExtentReports extentReports;
    protected ExtentHtmlReporter extentHtmlReporter;
    protected ExtentTest extentTest;


    @Test

    public void extentReportsTest(){

        String currentTime= new SimpleDateFormat("ddMMYYYYhhmmss").format(new Date());
        String path= System.getProperty("user.dir")+"/test-output/reports/"+currentTime+"html_report.html";


        extentHtmlReporter=new ExtentHtmlReporter(path);

       extentReports = new ExtentReports();
       extentReports.setSystemInfo("SQA","Ayse");
       extentReports.setSystemInfo("Test Environment","Regression");



      extentHtmlReporter.config().setReportName("TechPro home page");
      extentHtmlReporter.config().setDocumentTitle("TechProEd extent report");


      extentReports.attachReporter(extentHtmlReporter);

      extentTest=extentReports.createTest("My extent reporter","Regression Test Report");
        extentTest.pass("going url");
        extentTest.info("Put https");
        extentTest.skip("Skip");
        extentTest.warning("take a screenshot");


      extentTest.pass("Going to url");
      driver.get("https://www.techproeducation.com");
      extentTest.pass("Opened the page");


      extentReports.flush();


    }




}
