package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class NotaPage extends BasePage {


    By locatorFirstNota = By.xpath("//article[contains(@class,'news-widget')][1]//a");

    By locatorHeaderFB = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'facebook')]");

    By locatorHeaderTW = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'twitter')]");

    By locatorHeaderYT = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'youtube')]");

    By locatorHeaderInsta = By.xpath("//div[@class='header-top']//div[@class='social-icons']/a[contains(@href,'instagram')]");

    By carrouselTopLocator = By.xpath("//section[@class='brick brick-notasTop wrapper']/div[@class='carrousel-wrapper']//article[contains(@id,'carrousel-404-item')]");

    By carrouselNextButton = By.xpath("//section[@class='brick brick-notasTop wrapper']/div[@class='carrousel-wrapper']/div[contains(@class,'carrousel-controls-next')]");

    By carrouselPrevButton = By.xpath("//section[@class='brick brick-notasTop wrapper']/div[@class='carrousel-wrapper']/div[contains(@class,'carrousel-controls-prev')]");

    By carrouselCountImagenTop = By.xpath("//section[@class='brick brick-notasTop wrapper']/div[@class='carrousel-wrapper']//article[contains(@id,'carrousel-404-item')]/div[@class='news-widget-image']/a/img");

    By carrouselCountTitleTop = By.xpath("//section[@class='brick brick-notasTop wrapper']/div[@class='carrousel-wrapper']//article[contains(@id,'carrousel-404-item')]/h1[@class='news-widget-title']/a");



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

    public void locatorCarrouselNextButton () throws  Exception{

        this.findElement(carrouselNextButton);
    }

    public void locatorCarrouselPrevButton () throws  Exception{

        this.findElement(carrouselPrevButton);
    }

    public  int countCarrouselTopLocator () throws  Exception{

        List<WebElement> totalTopNotas = driver.findElements(carrouselTopLocator);
        int totalNotasTopSize = totalTopNotas.size();
        return totalNotasTopSize;
    }



    public void closeWindow() {

        String winHandleBefore = driver.getWindowHandle();
        for (String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        driver.close();
        driver.switchTo().window(winHandleBefore);

    }

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
    }


    public  void closeBanner() throws Exception {


        By banner = By.xpath("//div[@class='ad-better-close ad-better-close-top']");
        if(driver.findElements(banner).size()!=0 )
        {
            WebElement cerrarBanner = driver.findElement(By.xpath("//div[@class='ad-better-close ad-better-close-top']"));
            cerrarBanner.click();

        }else
        {
            System.out.println("No hay better-ads");
        }

        Thread.sleep(3000);
    }




    public NotaPage (WebDriver driver){
        super(driver);
    }

}
