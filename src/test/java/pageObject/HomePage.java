package pageObject;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



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

                                     /* SECCION MAGAZINETV */
    By locatorMagazineTVPortada = By.xpath("//section[@class='block block-cuento-algo ']//a[@title='Lo Mejor de Ciudad Magazine TV']");

    By locatorVerMasMagazineTV = By.xpath("");

    By locatorArticleMagazineTV = By.xpath("");

    By locatorImagenMagazineTV = By.xpath("");

                                    /* SECCION TE CUENTO ALGO */
    By locatorTeCuentoAlgoPortada = By.xpath("//section[@class='block block-cuento-algo ']//a[@title='Te cuento algo']");

    By locatorVerMasTeCuentoAlgo = By.xpath("");

    By locatorArticleTeCuentoAlgo = By.xpath("");

    By locatorImagenTeCuentoAlgo= By.xpath("");

                                     /* SECCION NEWSLETTER */
    By locatorNewsLetterPortada = By.xpath("//div[@id='block-newsletter-home']//iframe[@class='lzl iframe-newsletter-home loaded']");






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

    public  void getStructureLocatorPortfolioPortada() throws  Exception{

        this.getText(locatorPortfolioPortada).equals(textPortfolio);
        this.findElement(locatorVerMasPortfolio);
        this.findElement(locatorArticlePortfolio);
        this.findElement(locatorImagenPortfolio);
    }

    public void searchLocatorPortfolioPortada() throws Exception{

        this.findElement(locatorPortfolioPortada);
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


    public void titileLocator () throws Exception{
        this.getTitleLocator(pageTitleLocator);
    }

    public HomePage (WebDriver driver){
        super(driver);
    }

    }



