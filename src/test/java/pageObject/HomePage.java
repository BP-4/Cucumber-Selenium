package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class HomePage extends BasePage {




    String titleHomePage = ("Ciudad Magazine - Últimas noticias del espectáculo en Argentina y el mundo");

    String titleVivo = ("Últimas noticias en Ciudad Magazine");

    String titleLoUltimo = ("Lo último");

    String titleInternacional = ("Internacional");

    String titleQueLook = ("Que look");

    String titileVideos = ("Ciudad TV");

    String titlePortfolio = ("Portfolio");

    By buttonLiveLocator = By.xpath("//header[@id='header-site']//a[@class='live-button']");

    By pageTitleLocator = By.xpath("//h1[@class='brick-title']");

    By buttonLoUltimoLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/lo-ultimo']");

    By buttonInternacionalLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/internacional']");

    By buttonQueLookLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/que-look']");

    By buttonVideosLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/ciudad-tv']");

    By buttonPortfolioLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/galerias/portfolio']");

    By linkMediakitLocator = By.xpath("//footer[@id='footer']//a[@href='http://artear.com.ar/es/comercial/digital/formato/todos']");

    By linkPoliticaDeUsoLocator = By.xpath("//footer[@id='footer']//a[@href='/politica-de-uso-aceptable']");

    By linkPoliticaDeConfidencialidadLocator = By.xpath("//footer[@id='footer']//a[@href='/politica-de-confidencialidad-ciudad']");

    By linkCucinareLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://www.ciudad.com.ar/cocina']");

    By linkTNLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://tn.com.ar']");

    By linkEldoceTvLocator = By.xpath("linkEldoceTvLocator");





    public void clickbuttonLiveLocator() throws Exception {

        this.click(buttonLiveLocator);
    }

    public void clickbuttonLoUltimoLocator() throws Exception {

        this.click(buttonLoUltimoLocator);
    }

    public  void clickInternacionalLocator() throws Exception {

        this.click(buttonInternacionalLocator);

    }

    public  void clickQueLookLocator() throws Exception {

        this.click(buttonQueLookLocator);

    }

    public  void clickVideosLocator() throws Exception {

        this.click(buttonVideosLocator);

    }

    public  void clickPortfolioLocator() throws Exception {

        this.click(buttonPortfolioLocator);

    }

    public  void clicklinkMediakitLocator() throws Exception {

        this.click(linkMediakitLocator);

    }

    public  void clicklinkPoliticaDeUsoLocator() throws Exception {

        this.click(linkPoliticaDeUsoLocator);

    }

    public  void clicklinklinkCucinareLocator() throws Exception {

        this.click(linkCucinareLocator);

    }

    public  void clicklinkPoliticaDeConfidencialidadLocator() throws Exception {

        this.click(linkPoliticaDeConfidencialidadLocator);

    }

    public  void clicklinkTNLocator() throws Exception {

        this.click(linkTNLocator);

    }

    public  void cliclinkEldoceTvLocator() throws Exception {

        this.click(linkEldoceTvLocator);

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

    public Boolean isTitleInternacional() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleInternacional);
    }

    public Boolean isTitleLoUltimo() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleLoUltimo);
    }

    public Boolean isTitleQueLook() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titleQueLook);
    }

    public Boolean isTitleVideos() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titileVideos);
    }

    public Boolean isTitlePortfolio() throws Exception {
        return this.isDisplayed(pageTitleLocator) && this.getText(pageTitleLocator).equals(titlePortfolio);
    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }


    public void titileLocator () throws Exception{
        this.getTitleLocator(pageTitleLocator);
    }

    public HomePage (WebDriver driver){
        super(driver);
    }

    }

