package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {




    String titleHomePage = ("Ciudad Magazine - Últimas noticias del espectáculo en Argentina y el mundo");

    String titleVivo = ("Últimas noticias en Ciudad Magazine");

    String titleLoUltimo = ("Lo último");

    By buttonLiveLocator = By.xpath("//header[@id='header-site']//a[@class='live-button']");

    By pageTitleLocator = By.xpath("//h1[@class='brick-title']");

    By buttonLoUltimoLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/lo-ultimo']");

    By buttonInternacionalLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/internacional']");



    public void clickbuttonLiveLocator() throws Exception {

        this.click(buttonLiveLocator);

    }

    public void clickbuttonLoUltimoLocator() throws Exception {

        this.click(buttonLoUltimoLocator);
    }

    public  void clickInternacionalLocator() throws Exception {

        this.click(buttonInternacionalLocator);

    }



    public String getTitleHomePage()
    {
        return titleHomePage;
    }

    public Boolean homePageIsDisplayed () throws Exception{

        return this.getTitle().equals(titleHomePage);
    }

    public Boolean isTitleVivo() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleVivo);
    }

    public Boolean isTitleLoUltimo() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleLoUltimo);
    }

    public void titileLocator () throws Exception{
        this.getTitleLocator(pageTitleLocator);
    }

    public HomePage (WebDriver driver){
        super(driver);
    }

    }

