package pageObject;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class HomePage extends BasePage {




    String titleHomePage = ("Ciudad Magazine - Últimas noticias del espectáculo en Argentina y el mundo");

    String titleVivo = ("Últimas noticias en Ciudad Magazine");

    String titleLoUltimo = ("Lo último");

    String titleInternacional = ("Internacional");

    String titleQueLook = ("Que look");

    String titileVideos = ("Ciudad TV");

    String titlePortfolio = ("Portfolio");

    By linkMediakitLocator = By.xpath("//footer[@id='footer']//a[@href='http://artear.com.ar/es/comercial/digital/formato/todos']");

    By linkPoliticaDeUsoLocator = By.xpath("//footer[@id='footer']//a[@href='/politica-de-uso-aceptable']");

    By linkPoliticaDeConfidencialidadLocator = By.xpath("//footer[@id='footer']//a[@href='/politica-de-confidencialidad-ciudad']");

    By linkCucinareLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://www.ciudad.com.ar/cocina']");

    By linkTNLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://tn.com.ar']");

    By linkEldoceTvLocator = By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://eldoce.tv/']");


    By buttonLiveLocator = By.xpath("//header[@id='header-site']//a[@class='live-button']");

    By pageTitleLocator = By.xpath("//h1[@class='brick-title']");

    By buttonLoUltimoLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/lo-ultimo']");

    By buttonInternacionalLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/internacional']");

    By buttonQueLookLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/que-look']");

    By buttonVideosLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/ciudad-tv']");

    By buttonPortfolioLocator = By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/galerias/portfolio']");

                                    /* SECCION PORTFOLIO */
    By locatorPortfolioPortada = By.xpath("//section[@class='block block-portfolio ']");

    By locatorVerMasPortfolio = By.xpath("//section[@class='block block-portfolio ']//a[@title='Ver más']");

    By locatorArticlePortfolio = By.xpath("//section[@class='block block-portfolio ']//h2[@class='news-widget-title']");

    By locatorImagenPortfolio = By.xpath("//section[@class='block block-portfolio ']//div[@class='news-widget-image']");

    String textPortfolio = ("Portfolio");

                                     /* SECCION QUE LOOK */
    By locatorQueLookPortada = By.xpath("//section[@class='block block-que-look ']");

    By locatorVerMasQueLook = By.xpath("//section[@class='block block-que-look ']//a[@title='Ver más']");

    By locatorArticleQuelook = By.xpath("//section[@class='block block-que-look ']//h2[@class='news-widget-title block-content-wrapper']");

    By locatorImagenQueLook = By.xpath("//section[@class='block block-que-look ']//div[@class='news-widget-image col-12_xs-6']");

    String textQueLook = ("Que look");

                                     /* SECCION MAGAZINETV */
    By locatorMagazineTVPortada = By.xpath("//section[@class='block block-cuento-algo ']//a[@title='Lo Mejor de Ciudad Magazine TV']");

    By locatorVerMasMagazineTV = By.xpath("//section[@class='block block-cuento-algo ']//a[@href='/tags/ciudad-magazine'][@title='Ver más']");

    By locatorArticleMagazineTV = By.xpath("");

    By locatorImagenMagazineTV = By.xpath("");

    String textMagazineTV = ("Lo mejor de CiudadMagazineTV");
                                    /* SECCION TE CUENTO ALGO */
    By locatorTeCuentoAlgoPortada = By.xpath("//section[@class='block block-cuento-algo ']//a[@title='Te cuento algo']");

    By locatorVerMasTeCuentoAlgo = By.xpath("");

    By locatorArticleTeCuentoAlgo = By.xpath("");

    By locatorImagenTeCuentoAlgo= By.xpath("");

                                     /* SECCION NEWSLETTER */
    By iframeNewsLetterPortada = By.xpath("//div[@id='block-newsletter-home']//iframe[@class='lzl iframe-newsletter-home loaded']");

    By inputNewsLetterPortada = By.xpath("//form[@method='GET']/div[@class='subscribe-inputs']/input[@class='email']");

    By suscribirmeButtonNewsLetter = By.xpath("//form[@method='GET']/div[@class='subscribe-inputs']/input[@type='submit']");

    By locatortextNewsLetter = By.xpath("//div[@class='subscribe-text']");

    String textNewsLetter = ("¡Gracias por suscribirte!");

    String mailNewsLetter = ("ecadario@artear.com");






                                                      /*Header*/

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

                                                    /*Footer*/

    public void backWindow () throws Exception {
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.history.go(-1)");

    }

    public  void clicklinkMediakitLocator() throws Exception {
        this.click(linkMediakitLocator);
        Assert.assertTrue(driver.getTitle().contains("Artear"));

    }

    public  void clicklinkPoliticaDeUsoLocator() throws Exception {
        this.click(linkPoliticaDeUsoLocator);
        Assert.assertTrue(driver.getTitle().contains("Política de uso aceptable - Ciudad Magazine"));

    }

    public  void clicklinklinkCucinareLocator() throws Exception {
        this.click(linkCucinareLocator);
        Assert.assertTrue(driver.getTitle().contains("Cucinare - Ciudad Magazine"));

    }

    public  void clicklinkPoliticaDeConfidencialidadLocator() throws Exception {
        this.click(linkPoliticaDeConfidencialidadLocator);
        Assert.assertTrue(driver.getTitle().contains("Política de Privacidad - Ciudad Magazine"));

    }

    public  void clicklinkTNLocator() throws Exception {
        this.click(linkTNLocator);
        Assert.assertTrue(driver.getTitle().contains("TN.com.ar - Últimas noticias de Argentina y el mundo en vivo"));

    }

    public  void clicklinkEldoceTvLocator() throws Exception {
        this.click(linkEldoceTvLocator);
        Assert.assertTrue(driver.getTitle().contains("ElDoce.tv: Noticias y entretenimiento de Córdoba y Argentina"));

    }

                                                /*Secciones en Portada*/

    public  void getStructureLocatorPortfolioPortada() throws  Exception{
        this.getText(locatorPortfolioPortada).equals(textPortfolio);
        this.findElement(locatorVerMasPortfolio);
        this.findElement(locatorArticlePortfolio);
        this.findElement(locatorImagenPortfolio);
    }

    public void searchLocatorPortfolioPortada() throws Exception{
        this.findElement(locatorPortfolioPortada);
    }

    public  void  getStructurelocatorQueLookPortada() throws  Exception{
        this.getText(locatorQueLookPortada).equals(textQueLook);
        this.findElement(locatorVerMasQueLook);
        this.findElement(locatorArticleQuelook);
        this.findElement(locatorImagenQueLook);
    }


    public void searchlocatorQueLookPortada() throws  Exception{
        this.findElement(locatorQueLookPortada);
    }

    public void  getStructurelocatorMagazineTVPortada() throws Exception{
        this.getText(locatorMagazineTVPortada).equals(textMagazineTV);
        this.findElement(locatorVerMasMagazineTV);
    }

    public void searchlocatorNewsLetterPortada() throws  Exception{
        this.findElement(iframeNewsLetterPortada);
        WebElement iframe = driver.findElement(iframeNewsLetterPortada);
        driver.switchTo().frame(iframe);
        this.sendMail();
        Thread.sleep(3000);
        this.isLocatortextNewsLetter();
        driver.switchTo().defaultContent();
    }

    public  void sendMail () throws  Exception{
        this.sendKeys(mailNewsLetter, inputNewsLetterPortada);
        this.click(suscribirmeButtonNewsLetter);
    }

    public void isLocatortextNewsLetter() throws Exception {
        this.getText(locatortextNewsLetter).equals(textNewsLetter);
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

    public void closeWindow() {
        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);
    }

    public  void conectionHome () throws Exception{
        driver = new ChromeDriver();
        driver.get("https://www-stg.ciudad.com.ar/");
        driver.manage().window().maximize();
        this.closeBanner();
    }

    public void countTag() throws Exception {
        List<WebElement> elements = driver.findElements(By.tagName("section"));
        System.out.println("Número de elementos:" + elements.size());
        for (WebElement element:elements) {
            System.out.println(element.getAttribute("class").substring(0,4));
        }
    }

    public void searchText() throws Exception{
        boolean isTheTextPresent = driver.getPageSource().contains("===window.location.protocol?");
        Assert.assertTrue(isTheTextPresent);
    }

    public HomePage (WebDriver driver)
    { super(driver); }
 }



