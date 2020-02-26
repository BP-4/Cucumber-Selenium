package seleniumgluecode;





import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;




public class Hooks {

    protected static ChromeDriver  driver;
    private static int numberOfCase=0;



    @Before
    public void setUp() throws Exception {
        numberOfCase ++;
        System.out.println("Se esta ejecutando el caso numero:" + numberOfCase);
        System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");

    }



    @After
    public void tearDown(){

    }

    public static ChromeDriver getDriver(){
        System.out.println("El escenario numero: " + numberOfCase + " se ejecuto correctamente");
        return driver;

    }


}
