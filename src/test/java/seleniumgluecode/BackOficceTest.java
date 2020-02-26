package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BackOficceTest extends TestBase {

    @Given("^El editor se encuentra en el master de Ciudad$")
    public void el_editor_se_encuentra_en_el_master_de_Ciudad() throws Throwable {
        backOficcePage.conectionMaster();
    }

    @When("^Ingreso credenciales correctas$")
    public void ingreso_credenciales_correctas() throws Throwable {
        backOficcePage.loginMaster();
    }


    @When("^Pulso el boton crear nota$")
    public void pulso_el_boton_crear_nota() throws Throwable {
        backOficcePage.searchButtonCrearNota();
    }

    @When("^Completo el formulario de la nota$")
    public void completo_el_formulario_de_la_nota() throws Throwable {
       backOficcePage.completeFormulario();
    }

    @When("^Envio la nota$")
    public void envio_la_nota() throws Throwable {

    }

    @Then("^Verifico la nota creada$")
    public void verifico_la_nota_creada() throws Throwable {

    }


}
