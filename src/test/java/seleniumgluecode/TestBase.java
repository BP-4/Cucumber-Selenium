package seleniumgluecode;




import org.openqa.selenium.chrome.ChromeDriver;
import pageObject.BackOficcePage;
import pageObject.HomePage;
import pageObject.NotaPage;

public class TestBase {

    protected ChromeDriver driver = Hooks.getDriver();
    protected HomePage homePage = new HomePage(driver);
    protected NotaPage notaPage = new NotaPage(driver);
    protected BackOficcePage backOficcePage = new BackOficcePage(driver);

}
