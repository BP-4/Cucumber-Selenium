package seleniumgluecode;




import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hooks {

    private static ChromeDriver  driver;
    private static int numberOfCase=0;


    @Before
    public void setUp() {
        numberOfCase ++;
        System.out.println("Se esta ejecutando el caso numero:" + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www-stg.ciudad.com.ar/");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//footer[@id='footer']")));

    }


    @After
    public void tearDown(){
        driver.quit();
    }

    public static ChromeDriver getDriver(){
        System.out.println("El escenario numero: " + numberOfCase + " se ejecuto correctamente");
        return driver;

    }



}
