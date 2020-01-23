package seleniumgluecode;




import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;


public class Hooks {

    private static ChromeDriver  driver;
    private static int numberOfCase=0;


    @Before
    public void setUp() throws InterruptedException {
        numberOfCase ++;
        System.out.println("Se esta ejecutando el caso numero:" + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www-stg.ciudad.com.ar/");
        driver.manage().window().maximize();

        By banner = By.xpath("//div[@class='ad-better-close ad-better-close-top']");
        if(driver.findElements(banner).size()!=0 )
        {
            WebElement cerrarBanner = driver.findElement(By.xpath("//div[@class='ad-better-close ad-better-close-top']"));
            cerrarBanner.click();

        }else
        {
            System.out.println("No hay better-ads");
        }

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//footer[@id='footer']")));


    }



    @After
    public void tearDown(){


        // Report will generate in Project Directory only.
        // After execution, refresh project directory.
        ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("C:\\Cucumber-Selenium\\report.html");
        ExtentReports reports = new ExtentReports();
        reports.attachReporter(htmlreport);

        // This is the object of extentTest class, by which log is generate.
        ExtentTest testlog;

        // Customize Report property
        htmlreport.config().setReportName("Test Report");
        reports.setSystemInfo("Host Name", "Test Host");
        reports.setSystemInfo("Environment", "Automation Testing");
        reports.setSystemInfo("User Name", "Juan Aguilar");
        htmlreport.config().setDocumentTitle("Automation Report");
        htmlreport.config().setTestViewChartLocation(ChartLocation.TOP);

        // Two default theme of report
        //htmlreport.config().setTheme(Theme.STANDARD);
        htmlreport.config().setTheme(Theme.DARK);

        testlog = reports.createTest("Test Log Method-1");
        testlog.info("This is Info log");
        testlog.pass("This is Pass log");
        testlog.fail("This is Fail log");
        testlog.error("This is Error log");

        testlog = reports.createTest("Test Log Method-2");
        testlog.log(Status.INFO, "This is Info log");
        testlog.log(Status.PASS, "This is Pass log");
        testlog.log(Status.FAIL, "This is Fail log");
        testlog.log(Status.FATAL, "This is Fatal log");

        testlog = reports.createTest("Test log with Extent Color");
        testlog.log(Status.INFO, MarkupHelper.createLabel("This is Info log", ExtentColor.ORANGE));
        testlog.log(Status.PASS, MarkupHelper.createLabel("This is pass log", ExtentColor.CYAN));

        // If flush method did not call, Report will not generate.
        reports.flush();


        driver.quit();
    }

    public static ChromeDriver getDriver(){
        System.out.println("El escenario numero: " + numberOfCase + " se ejecuto correctamente");
        return driver;

    }








}
