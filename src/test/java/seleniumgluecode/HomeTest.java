package seleniumgluecode;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;




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
        Assert.assertTrue("No se encuentra en la seccion Lo Ultimo", homePage.isTitleLoUltimo());
    }

    @When("^Hace click en el boton Internacional$")
    public void hace_click_en_el_boton_Internacional() throws Throwable {
        homePage.clickInternacionalLocator();
    }

    @Then("^Se debe redirigir a la seccion Internacional$")
    public void se_debe_redirigir_a_la_seccion_Internacional() throws Throwable {
        Assert.assertTrue("No se encuentra en la seccion Internacional",homePage.isTitleInternacional());
    }

    @When("^Hace click en el boton Qué Look$")
    public void hace_click_en_el_boton_Qué_Look() throws Throwable {
        homePage.clickQueLookLocator();
    }

    @Then("^Se debe redirigir a la seccion Qué Look$")
    public void se_debe_redirigir_a_la_seccion_Qué_Look() throws Throwable {
        Assert.assertTrue("No se encuentra en la seccion Que Look", homePage.isTitleQueLook());
    }

    @When("^Hace click en el boton Videos$")
    public void hace_click_en_el_boton_Videos() throws Throwable {
        homePage.clickVideosLocator();
    }

    @Then("^Se debe redirigir a la seccion Videos$")
    public void se_debe_redirigir_a_la_seccion_Videos() throws Throwable {
        Assert.assertTrue("No se encuentra en la seccion Videos", homePage.isTitleVideos());
    }

    @When("^Hace click en el boton Portfolio$")
    public void hace_click_en_el_boton_Portfolio() throws Throwable {
        homePage.clickPortfolioLocator();
    }

    @Then("^Se debe redirigir a la seccion Portfolio$")
    public void se_debe_redirigir_a_la_seccion_Portfolio() throws Throwable {
        Assert.assertTrue("No se encuentra en la seccion Portfolio", homePage.isTitlePortfolio());

    }

    @When("^Hace click en el link Mediakit Comercial$")
    public void hace_click_en_el_link_Mediakit_Comercial() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinkMediakitLocator();
    }

    @Then("^Se debe redirigir a la pagina Mediakit Comercial$")
    public void se_debe_redirigir_a_la_pagina_Mediakit_Comercial() throws Throwable {
       Assert.assertTrue(homePage.getTitle().contains("Artear"));
    }

    @When("^Hace click en el link Politica de Uso$")
    public void hace_click_en_el_link_Politica_de_Uso() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinkPoliticaDeUsoLocator();
    }

    @Then("^Se debe redirigir a la pagina Politica de Uso$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Uso() throws Throwable {
        Assert.assertTrue(homePage.getTitle().contains("Política de uso aceptable - Ciudad Magazine"));
    }

    @When("^Hace click en el link Politica de Confidencialidad$")
    public void hace_click_en_el_link_Politica_de_Confidencialidad() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinkPoliticaDeConfidencialidadLocator();
    }

    @Then("^Se debe redirigir a la pagina Politica de Confidencialidad$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Confidencialidad() throws Throwable {
        Assert.assertTrue(homePage.getTitle().contains("Política de Privacidad - Ciudad Magazine"));
    }

    @When("^Hace click en el link Cucinare$")
    public void hace_click_en_el_link_Cucinare() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinklinkCucinareLocator();
    }

    @Then("^Se debe redirigir a la pagina de Cucinare$")
    public void se_debe_redirigir_a_la_pagina_de_Cucinare() throws Throwable {
        Assert.assertTrue(homePage.getTitle().contains("Cucinare - Ciudad Magazine"));

    }

    @When("^Hace click en el link TN$")
    public void hace_click_en_el_link_TN() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinkTNLocator();
    }

    @Then("^Se debe redirigir a la pagina de TN$")
    public void se_debe_redirigir_a_la_pagina_de_TN() throws Throwable {
        Assert.assertTrue(homePage.getTitle().contains("TN.com.ar - Últimas noticias de Argentina y el mundo en vivo"));
    }


    @When("^Hace click en el link EldoceTv$")
    public void hace_Click_En_El_Link_EldoceTv() throws Throwable {
        homePage.scrollDown();
        homePage.clicklinkEldoceTvLocator();
    }

    @Then("^Se debe redirigir a la pagina de EldoceTv$")
    public void se_Debe_Redirigir_A_La_Pagina_De_EldoceTv() throws Throwable {
        Assert.assertTrue(homePage.getTitle().contains("ElDoce.tv: Noticias y entretenimiento de Córdoba y Argentina"));
    }

    @When("^Ingresa a la primera nota$")
    public void ingresa_a_la_primera_nota() throws Throwable {
        homePage.clicklocatorFirstNota();
    }

    @When("^Ingresa a FaceBook$")
    public void ingresa_a_FaceBook() throws Throwable {
        homePage.closeBanner();
        homePage.clicklocatorHeaderFB();
        homePage.closeWindow();

    }

    @When("^Ingresa a Instagram$")
    public void ingresa_a_Instagram() throws Throwable {
        homePage.closeBanner();
        homePage.clicklocatorHeaderInsta();
        homePage.closeWindow();
    }

    @When("^Ingresa a YouTube$")
    public void ingresa_a_YouTube() throws Throwable {
        homePage.closeBanner();
        homePage.clicklocatorHeaderYT();
        homePage.closeWindow();

    }

    @When("^Ingresa a Twitter$")
    public void ingresa_a_Twitter() throws Throwable {
        homePage.closeBanner();
        homePage.clicklocatorHeaderTW();
        homePage.closeWindow();
    }

    @Then("^Se debe comprobar la estructura de la nota$")
    public void se_debe_comprobar_la_estructura_de_la_nota() throws Throwable {

    }


}
