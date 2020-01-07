package seleniumgluecode;



import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.HomePage;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    

}
