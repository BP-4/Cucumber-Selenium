package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class NotaTest extends TestBase {






    @When("^Ingresa a la primera nota$")
    public void ingresa_a_la_primera_nota() throws Throwable {
        Thread.sleep(100);
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
