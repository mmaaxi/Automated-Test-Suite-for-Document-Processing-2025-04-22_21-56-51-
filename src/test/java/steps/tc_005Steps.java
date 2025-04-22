package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_005Page;

public class tc_005Steps {

    tc_005Page documentUploadPage = new tc_005Page();

    @Given("que el usuario está en la página de carga de documentos")
    public void elUsuarioEstaEnLaPaginaDeCargaDeDocumentos() {
        documentUploadPage.navigateToUploadPage();
    }

    @When("el usuario intenta avanzar sin cargar un documento obligatorio")
    public void elUsuarioIntentaAvanzarSinCargarUnDocumentoObligatorio() {
        documentUploadPage.attemptToProceedWithoutDocument();
    }

    @Then("el sistema impide avanzar y muestra un mensaje de error respecto al documento faltante")
    public void elSistemaImpideAvanzarYDebeMostrarUnMensajeDeError() {
        Assert.assertTrue(documentUploadPage.isErrorMessageDisplayed());
    }
}