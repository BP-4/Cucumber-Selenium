package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NotaTest extends TestBase {





    @When("^Hace click en el link Mediakit Comercial$")
    public void hace_click_en_el_link_Mediakit_Comercial() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinkMediakitLocator();
    }

    @Then("^Se debe redirigir a la pagina Mediakit Comercial$")
    public void se_debe_redirigir_a_la_pagina_Mediakit_Comercial() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("Artear"));
    }

    @When("^Hace click en el link Politica de Uso$")
    public void hace_click_en_el_link_Politica_de_Uso() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinkPoliticaDeUsoLocator();
    }

    @Then("^Se debe redirigir a la pagina Politica de Uso$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Uso() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("Política de uso aceptable - Ciudad Magazine"));
    }

    @When("^Hace click en el link Politica de Confidencialidad$")
    public void hace_click_en_el_link_Politica_de_Confidencialidad() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinkPoliticaDeConfidencialidadLocator();
    }

    @Then("^Se debe redirigir a la pagina Politica de Confidencialidad$")
    public void se_debe_redirigir_a_la_pagina_Politica_de_Confidencialidad() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("Política de Privacidad - Ciudad Magazine"));
    }

    @When("^Hace click en el link Cucinare$")
    public void hace_click_en_el_link_Cucinare() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinklinkCucinareLocator();
    }

    @Then("^Se debe redirigir a la pagina de Cucinare$")
    public void se_debe_redirigir_a_la_pagina_de_Cucinare() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("Cucinare - Ciudad Magazine"));

    }

    @When("^Hace click en el link TN$")
    public void hace_click_en_el_link_TN() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinkTNLocator();
    }

    @Then("^Se debe redirigir a la pagina de TN$")
    public void se_debe_redirigir_a_la_pagina_de_TN() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("TN.com.ar - Últimas noticias de Argentina y el mundo en vivo"));
    }


    @When("^Hace click en el link EldoceTv$")
    public void hace_Click_En_El_Link_EldoceTv() throws Throwable {
        notaPage.scrollDown();
        notaPage.clicklinkEldoceTvLocator();
    }

    @Then("^Se debe redirigir a la pagina de EldoceTv$")
    public void se_Debe_Redirigir_A_La_Pagina_De_EldoceTv() throws Throwable {
        Assert.assertTrue(notaPage.getTitle().contains("ElDoce.tv: Noticias y entretenimiento de Córdoba y Argentina"));
    }

    @When("^Ingresa a la primera nota$")
    public void ingresa_a_la_primera_nota() throws Throwable {
        notaPage.clicklocatorFirstNota();
    }

    @When("^Ingresa a FaceBook$")
    public void ingresa_a_FaceBook() throws Throwable {
        notaPage.closeBanner();
        notaPage.clicklocatorHeaderFB();
        notaPage.closeWindow();

    }

    @When("^Ingresa a Instagram$")
    public void ingresa_a_Instagram() throws Throwable {
        notaPage.clicklocatorHeaderInsta();
        notaPage.closeWindow();
    }

    @When("^Ingresa a YouTube$")
    public void ingresa_a_YouTube() throws Throwable {
        notaPage.clicklocatorHeaderYT();
        notaPage.closeWindow();

    }

    @When("^Ingresa a Twitter$")
    public void ingresa_a_Twitter() throws Throwable {
        notaPage.clicklocatorHeaderTW();
        notaPage.closeWindow();
    }

    @Then("^Se debe comprobar la estructura de la nota$")
    public void se_debe_comprobar_la_estructura_de_la_nota() throws Throwable {

    }

    @When("^Cuento las notas Top$")
    public void cuento_las_notas_Top() throws Throwable {
        notaPage.countCarrouselTopLocator();
    }

    @Then("^Verificamos la cantidad de notas top$")
    public void verificamos_la_cantidad_de_notas_top() throws Throwable {
        Assert.assertEquals(notaPage.countCarrouselTopLocator(),9);
    }



}
