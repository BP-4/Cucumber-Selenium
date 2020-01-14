package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;


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

    By linkEldoceTvLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://eldoce.tv/']");

    By locatorFirstNota = By.xpath("//article[contains(@class,'news-widget')][1]//a");

    By locatorHeaderFB = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'facebook')]");

    By locatorHeaderTW = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'twitter')]");

    By locatorHeaderYT = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'youtube')]");

    By locatorHeaderInsta = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'instagram')]");





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

    public  void clicklinkEldoceTvLocator() throws Exception {

        this.click(linkEldoceTvLocator);

    }

    public  void clicklocatorFirstNota() throws Exception {

        this.click(locatorFirstNota);

    }

    public  void clicklocatorHeaderFB() throws Exception {

        this.click(locatorHeaderFB);

    }

    public  void clicklocatorHeaderTW() throws Exception {

        this.click(locatorHeaderTW);

    }

    public  void clicklocatorHeaderInsta() throws Exception {

        this.click(locatorHeaderInsta);

    }

    public  void clicklocatorHeaderYT() throws Exception {

        this.click(locatorHeaderYT);

    }

    public  void closeBanner() throws Exception {

        By banner = By.xpath("//*[@class='ad-better-close ad-better-close-top']");
        if(driver.findElements(banner).size()!=0 )
        {
            WebElement cerrarBanner = driver.findElement(By.xpath("//div[@class='ad-better-close ad-better-close-top']"));
            cerrarBanner.click();

        }else
        {
            System.out.println("No hay better-ads");
        }
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

    public void closeWindow() throws InterruptedException {

        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);

    }


    public void titileLocator () throws Exception{
        this.getTitleLocator(pageTitleLocator);
    }

    public HomePage (WebDriver driver){
        super(driver);
    }

    }



