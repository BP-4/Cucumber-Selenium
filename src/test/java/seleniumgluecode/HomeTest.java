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

    @When("^Busco la seccion Que Look en la portada$")
    public void busco_la_seccion_Que_Look_en_la_portada() throws Throwable {

    }

    @Then("^Valido la seccion Que Look$")
    public void valido_la_seccion_Que_Look() throws Throwable {

    }

    @When("^Busco la seccion Portfolio en la portada$")
    public void busco_la_seccion_Portfolio_en_la_portada() throws Throwable {
        homePage.searchLocatorPortfolioPortada();
    }

    @Then("^Valido la seccion Portfolio$")
    public void valido_la_seccion_Portfolio() throws Throwable {
        homePage.getStructureLocatorPortfolioPortada();
    }

    @When("^Busco la seccion Te cuento algo en la portada$")
    public void busco_la_seccion_Te_cuento_algo_en_la_portada() throws Throwable {

    }

    @Then("^Valido la seccion Te cuento algo$")
    public void valido_la_seccion_Te_cuento_algo() throws Throwable {

    }

    @When("^Busco la seccion Lo mejor de ciudad magazineTV en la portada$")
    public void busco_la_Lo_mejor_de_ciudad_magazineTV_en_la_portada() throws Throwable {

    }

    @Then("^Valido la seccion Lo mejor de ciudad magazineTV$")
    public void valido_la_seccion_Lo_mejor_de_ciudad_magazineTV() throws Throwable {

    }

    @When("^Busco la seccion Newsletter en la portada$")
    public void busco_la_seccion_Newsletter_en_la_portada() throws Throwable {

    }

    @Then("^Valido la seccion de Newsletter$")
    public void valido_la_Newsletter() throws Throwable {

    }




}
