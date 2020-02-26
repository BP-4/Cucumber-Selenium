package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.text.SimpleDateFormat;
import java.util.Date;



public class BackOficcePage extends BasePage {

    By userField = By.xpath("//input[@id='edit-name']");

    By passField = By.xpath("//input[@id='edit-pass']");

    By ingresarButton = By.xpath("//input[@id='edit-submit']");

    String username = "soporte";

    String password = "ciudad2015";

    By banner = By.xpath("//*[@class='ad-better-close ad-better-close-top']");

    By buttonCrearNota = By.xpath("//div[@class='view-header']//a[@href='/node/add/nota']");

    String tituloNota = "Nota Test Titulo";

    By inputTituloNota = By.xpath("//input[@id='edit-title-field-und-0-value']");

    String random = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

    By buttonTipoDeNota = By.xpath("//div[@id='edit-field-tipo-de-nota']//div[contains(@class,'chosen-container')]");

    By buttonEnter = By.xpath("//div[@id='edit-field-tipo-de-nota']//div[contains(@class,'chosen-container')]/div[@class='chosen-drop']//input[@type='text']");

    By inputTipoNota = By.xpath("//div[@id='edit-field-tipo-de-nota']//div[contains(@class,'chosen-container')]/div[@class='chosen-drop']//input[@type='text']");

    String etiquetaNota = "#URGENTE";

    String textTipoNota = "normal";

    By inputEtiquetaNota = By.xpath("//input[@id='edit-field-etiqueta-und']");

    By inputCintilloCiudad = By.xpath("//input[@id='edit-field-cintillo-und-0-value']");

    String cintilloNota = "contenido del cintillo para la nota de prueba";

    By iframeBajadaNota = By.xpath("//div[@id='cke_edit-field-bajada-und-0-value']//iframe[contains(@title,'edit-field-bajada-und-0-value')]");

    String textBajadaNota = "texto de la bajada";

    By inputBajadaNota = By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']");

    By selectTextCuerpo = By.xpath("//div[@id='cke_edit-body-und-0-value']//iframe[contains(@title,'edit-body-und-0-value')]");

    String textCuerpoNota = "texto del cuerpo";

    By inputCuerpoNota = By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr']");

    By locatorMultimediaLocal = By.xpath("//div[@id='cke_edit-body-und-0-value']//span[@id='cke_2_top']//a[@id='cke_64']");

    By iframeMultimediaLocal = By.xpath("//iframe[@class='media-modal-frame ui-dialog-content ui-widget-content']");

    By buttonSelecFile = By.xpath("//form[@id='media-add-upload']//input[@id='edit-upload']");

    String fileRut = "C:\\QA_Automation_Ciudad\\apk\\yoda.gif";

    By buttonSendMultimediaLocal = By.xpath("//form[@id='media-add-upload']//input[@id='edit-submit']");

    By iframeIncrutando = By.xpath("//iframe[@class='media-modal-frame ui-dialog-content ui-widget-content']");

    By inputIncrustando = By.xpath("//form[@id='media-format-form']//input[@id='edit-alt']");

    String textMultimediaIncrustado = "descripcion de la imagen del cuerpo";

    By buttonEnviarIncrustando = By.xpath("//form[@id='media-format-form']//a[@class='button fake-ok']");

    By buttonCustomQuote = By.xpath("//div[@id='cke_edit-body-und-0-value']//span[@id='cke_2_top']//a[@id='cke_63']");

    By iframeCustomQuote = By.xpath("//iframe[@class='media-modal-frame ui-dialog-content ui-widget-content']");

    By buttonMediaBrowser = By.xpath("//div[@id='media-browser-tabset']//a[@href='#media-tab-library']");

    By buttonNotaRelacionada = By.xpath("//div[@id='cke_edit-body-und-0-value']//span[@id='cke_2_top']//a[@id='cke_66']");

    String urlNotaRel = "https://www-stg.ciudad.com.ar/espectaculos/rodolfo-stoessel-productor-patito-feo-creo-verdad-justicia-no-linchamientos_111396";

    By locatorNotarel = By.xpath("//form[@id='related-node-form']//div[@class='form-item form-type-textfield form-item-url-1']/input[@id='edit-url-1']");

    By buttonSubmitNotaRel = By.xpath("//form[@id='related-node-form']//input[@id='edit-submit']");

    By locatorAutor = By.xpath("//input[@id='edit-field-autor-und-0-uid']");

    String autor = "fabiana_lopez";

    By buttonSeccion = By.xpath("//div[@id='edit-field-seccion']//div[@id='edit_field_seccion_und_chosen']");

    By inputSeccion = By.xpath("//div[@id='edit-field-seccion']//div[@id='edit_field_seccion_und_chosen']/div[@class='chosen-drop']//input[@type='text']");

    String seccion = "virales";

    By inputTag = By.xpath("//input[@id='edit-field-tags-und']");

    String tag = "#CambiáTuDía";

    By inputPersonaje = By.xpath("//input[@id='edit-field-personajes-und']");

    String personaje = "Jimema Barón";

    boolean ingresaTexto = true;
    boolean contMultimedia = true;
    boolean conteMultimedia = false;


    public  void loginMaster () throws Exception {
        this.sendKeys(username, userField);
        this.sendKeys(password, passField);
        this.click(ingresarButton);
    }


    public  void conectionMaster () throws Exception{
        driver = new ChromeDriver();
        driver.get("https://master-stg.ciudad.com.ar/user");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        this.closeBanner();

    }


    public void   selecTipoDeNota () throws Exception {
        this.typeTipoDeNota();
    }

    public void typeTituloNota () throws Exception{
        this.sendKeys(tituloNota  + " " + random , inputTituloNota );
    }

    public  void searchButtonCrearNota() throws Exception{
        this.click(buttonCrearNota);
    }

    public void typeTipoDeNota() throws Exception{
        this.click(buttonTipoDeNota);
        Thread.sleep(1000);
        this.sendKeys(textTipoNota, inputTipoNota);
        driver.findElement(buttonEnter).sendKeys(Keys.ENTER);
    }

    public void typeEtiquetaNota() throws Exception{
        this.sendKeys(etiquetaNota, inputEtiquetaNota);
    }

    public  void typeCintilloNota() throws  Exception{
        this.sendKeys(cintilloNota,inputCintilloCiudad);
    }

    public void typeBajadaNota() throws  Exception{
        this.findElement(iframeBajadaNota);
        WebElement iframe = driver.findElement(iframeBajadaNota);
        driver.switchTo().frame(iframe);
        this.sendBajadaNota();
        driver.switchTo().defaultContent();
    }

    public void ifIngresaTexto () throws Exception{

        if (ingresaTexto){
            this.insertTextNota();
        }

        if (contMultimedia){
            this.insertMultimediaLocal();
        }

        if (conteMultimedia){
            this.insertCustom();
        }

    }

    public void insertTextNota() throws Exception{
        this.findElement(selectTextCuerpo);
        WebElement iframe = driver.findElement(selectTextCuerpo);
        driver.switchTo().frame(iframe);
        this.sendTextCuerpo();
        driver.switchTo().defaultContent();
    }

    public void sendTextCuerpo ()throws  Exception{
        this.sendKeys(textCuerpoNota,inputCuerpoNota);
    }

    public void insertMultimediaLocal() throws Exception{
        this.click(locatorMultimediaLocal);
        Thread.sleep(1000);
        this.findElement(iframeMultimediaLocal);
        WebElement iframe = driver.findElement(iframeMultimediaLocal);
        driver.switchTo().frame(iframe);
        Thread.sleep(1000);
        this.sendMultimediaLocal();
        this.click(buttonSendMultimediaLocal);
        Thread.sleep(3000);
        this.insertMultimediaLibreria();
    }

    public void insertMultimediaLibreria() throws Exception{
        this.findElement(iframeIncrutando);
        WebElement iframe = driver.findElement(iframeIncrutando);
        driver.switchTo().frame(iframe);
        Thread.sleep(3000);
        this.sendMultimediaLibreria();
        this.click(buttonEnviarIncrustando);
    }

    public void insertCustom() throws  Exception{
        this.click(buttonCustomQuote);
        Thread.sleep(3000);
        this.findElement(iframeCustomQuote);
        WebElement iframe = driver.findElement(iframeCustomQuote);
        driver.switchTo().frame(iframe);
        this.click(buttonMediaBrowser);
    }

    public void sendMultimediaLibreria() throws Exception{
        this.sendKeys(textMultimediaIncrustado, inputIncrustando );
    }

    public void sendMultimediaLocal() throws Exception{
        this.sendKeys(fileRut,buttonSelecFile);
    }


    public  void sendBajadaNota() throws Exception{
        this.sendKeys(textBajadaNota,inputBajadaNota );
    }

    public void insertNotaRelacionadaCuerpo() throws  Exception{
        this.click(buttonNotaRelacionada);
        Thread.sleep(2000);
        this.sendKeys(urlNotaRel,locatorNotarel);
        this.click(buttonSubmitNotaRel);
    }

    public void insertMetadatos () throws  Exception{
        this.sendKeys(autor, locatorAutor);
        driver.findElement(locatorAutor).sendKeys(Keys.ENTER);
    }

    public void insertSeccion() throws  Exception{
        Thread.sleep(1000);
        this.click(buttonSeccion);
        this.sendKeys(seccion, inputSeccion);
        driver.findElement(inputSeccion).sendKeys(Keys.ENTER);
    }

    public void insertTag() throws  Exception{
        this.sendKeys(tag, inputTag);
        driver.findElement(inputTag).sendKeys(Keys.ENTER);
    }

    public void insertPersonaje() throws  Exception{
        this.sendKeys(personaje, inputPersonaje);
        driver.findElement(inputPersonaje).sendKeys(Keys.ENTER);
    }


    public void completeFormulario() throws Exception{
        this.typeTituloNota();
        this.selecTipoDeNota();
        this.typeEtiquetaNota();
        this.typeCintilloNota();
        this.typeBajadaNota();
        this.ifIngresaTexto();
        this.insertNotaRelacionadaCuerpo();
        this.insertMetadatos();
        this.insertSeccion();
        this.insertTag();
        this.insertPersonaje();
    }


    public  void closeBanner() throws Exception {

        if(driver.findElements(banner).size()!=0 )
        {
            WebElement cerrarBanner = driver.findElement(By.xpath("//div[@class='ad-better-close ad-better-close-top']"));
            cerrarBanner.click();

        }else
        {
            System.out.println("No hay better-ads");
        }
    }


    public BackOficcePage(WebDriver driver) {
        super(driver);
    }
}
