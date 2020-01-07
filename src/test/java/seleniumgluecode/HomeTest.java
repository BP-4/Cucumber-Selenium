package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class HomeTest extends TestBase{



    @Given("^El usuario se encuentra en la pagina home de ciudad$")
    public void el_usuario_se_encuentra_en_la_pagina_home_de_ciudad() throws Throwable {
        Assert.assertTrue(homePage.homePageIsDisplayed());

    }

    @When("^Hace click en el boton EN VIVO$")
    public void hace_click_en_el_boton_EN_VIVO() throws Throwable {
        homePage.clickbuttonLiveLocator();

    }

    @Then("^Se debe redirigir a la seccion En Vivo$")
    public void se_debe_redirigir_a_la_seccion_En_Vivo() throws Throwable {
        Assert.assertTrue("No se encuentra en la seccion En Vivo", homePage.isTitleVivo());
    }

    @When("^Hace click en el boton LO ULTIMO$")
    public void hace_click_en_el_boton_LO_ULTIMO() throws Throwable {
        homePage.clickbuttonLoUltimoLocator();
    }

    @Then("^Se debe redirigir a la seccion Lo Ultimo$")
    public void se_debe_redirigir_a_la_seccion_Lo_Ultimo() throws Throwable {
        homePage.titileLocator();
        Assert.assertTrue("No se encuentra en la seccion Lo Ultimo", homePage.isTitleLoUltimo());

    }

    @When("^Hace click en el boton Internacional$")
    public void hace_click_en_el_boton_Internacional() throws Throwable {

        homePage.clickInternacionalLocator();
    }

    @Then("^Se debe redirigir a la seccion Internacional$")
    public void se_debe_redirigir_a_la_seccion_Internacional() throws Throwable {
        WebElement pageTitleLocatorInternacional = driver.findElement(By.xpath("//h1[@class='brick-title']"));
        Assert.assertTrue("No se encuentra en la seccion Internacional", pageTitleLocatorInternacional.isDisplayed());
        Assert.assertEquals("Internacional", pageTitleLocatorInternacional.getText());
    }

    @When("^Hace click en el boton Qué Look$")
    public void hace_click_en_el_boton_Qué_Look() throws Throwable {
        WebElement buttonQueLookLocator = driver.findElement(By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/secciones/que-look']"));
        buttonQueLookLocator.click();
    }

    @Then("^Se debe redirigir a la seccion Qué Look$")
    public void se_debe_redirigir_a_la_seccion_Qué_Look() throws Throwable {
        WebElement pageTitleLocatorQueLook = driver.findElement(By.xpath("//h1[@class='brick-title']"));
        Assert.assertTrue("No se encuentra en la seccion Internacional", pageTitleLocatorQueLook.isDisplayed());
        Assert.assertEquals("Que look", pageTitleLocatorQueLook.getText());
    }

    @When("^Hace click en el boton Videos$")
    public void hace_click_en_el_boton_Videos() throws Throwable {
        WebElement buttonVideosLocator = driver.findElement(By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/ciudad-tv']"));
        buttonVideosLocator.click();

    }

    @Then("^Se debe redirigir a la seccion Videos$")
    public void se_debe_redirigir_a_la_seccion_Videos() throws Throwable {
        WebElement pageTitleLocatorVideos = driver.findElement(By.xpath("//h1[@class='brick-title']"));
        Assert.assertTrue("No se encuentra en la seccion Videos", pageTitleLocatorVideos.isDisplayed());
        Assert.assertEquals("Ciudad TV", pageTitleLocatorVideos.getText());

    }

    @When("^Hace click en el boton Portfolio$")
    public void hace_click_en_el_boton_Portfolio() throws Throwable {
        WebElement buttonPortfolioLocator = driver.findElement(By.xpath("//header[@id='header-site']//nav[@class='header-links']//a[@href='/galerias/portfolio']"));
        buttonPortfolioLocator.click();
    }

    @Then("^Se debe redirigir a la seccion Portfolio$")
    public void se_debe_redirigir_a_la_seccion_Portfolio() throws Throwable {
        WebElement pageTitleLocatorPortfolio = driver.findElement(By.xpath("//h1[@class='brick-title']"));
        Assert.assertTrue("No se encuentra en la seccion Portfolio", pageTitleLocatorPortfolio.isDisplayed());
        Assert.assertEquals("Portfolio", pageTitleLocatorPortfolio.getText());

    }

    @When("^Hace click en el link Mediakit Comercial$")
    public void hace_click_en_el_link_Mediakit_Comercial() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkMediakitLocator = driver.findElement(By.xpath("//footer[@id='footer']//a[@href='http://artear.com.ar/es/comercial/digital/formato/todos']"));
        linkMediakitLocator.click();
    }

    @Then("^Se debe redirigir a la pagina Mediakit Comercial$")
    public void se_debe_redirigir_a_la_pagina_Mediakit_Comercial() throws Throwable {
       Assert.assertTrue(driver.getTitle().contains("Artear"));
    }

    @When("^Hace click en el link Politica de Uso$")
    public void hace_click_en_el_link_Politica_de_Uso() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkPoliticaDeUsoLocator = driver.findElement(By.xpath("//footer[@id='footer']//a[@href='/politica-de-uso-aceptable']"));
        linkPoliticaDeUsoLocator.click();
    }

    @Then("^Se debe redirigir a la pagina Politica de Uso$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Uso() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Política de uso aceptable - Ciudad Magazine"));
    }

    @When("^Hace click en el link Politica de Confidencialidad$")
    public void hace_click_en_el_link_Politica_de_Confidencialidad() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkPoliticaDeConfidencialidadLocator = driver.findElement(By.xpath("//footer[@id='footer']//a[@href='/politica-de-confidencialidad-ciudad']"));
        linkPoliticaDeConfidencialidadLocator.click();
    }

    @Then("^Se debe redirigir a la pagina Politica de Confidencialidad$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Confidencialidad() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Política de Privacidad - Ciudad Magazine"));
    }

    @When("^Hace click en el link Cucinare$")
    public void hace_click_en_el_link_Cucinare() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkCucinareLocator = driver.findElement(By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://www.ciudad.com.ar/cocina']"));
        linkCucinareLocator.click();
    }

    @Then("^Se debe redirigir a la pagina de Cucinare$")
    public void se_debe_redirigir_a_la_pagina_de_Cucinare() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("Cucinare - Ciudad Magazine"));

    }

    @When("^Hace click en el link TN$")
    public void hace_click_en_el_link_TN() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkTNLocator = driver.findElement(By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://tn.com.ar']"));
        linkTNLocator.click();
    }

    @Then("^Se debe redirigir a la pagina de TN$")
    public void se_debe_redirigir_a_la_pagina_de_TN() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("TN.com.ar - Últimas noticias de Argentina y el mundo en vivo"));
    }


    @When("^Hace click en el link EldoceTv$")
    public void hace_Click_En_El_Link_EldoceTv() throws Throwable {
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        WebElement linkEldoceTvLocator = driver.findElement(By.xpath("//div[@class='footer-menu']//a[@class='footer-menu-link'][@href='https://eldoce.tv/']"));
        linkEldoceTvLocator.click();
    }

    @Then("^Se debe redirigir a la pagina de EldoceTv$")
    public void se_Debe_Redirigir_A_La_Pagina_De_EldoceTv() throws Throwable {
        Assert.assertTrue(driver.getTitle().contains("ElDoce.tv: Noticias y entretenimiento de Córdoba y Argentina"));
    }
}
