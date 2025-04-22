package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.tc_006Page;
import static org.junit.Assert.assertTrue;

public class tc_006Steps {
    WebDriver driver;
    tc_006Page page = new tc_006Page(driver);

    @Given("el usuario está en la página de carga de documentos")
    public void el_usuario_está_en_la_página_de_carga_de_documentos() {
        page.navegarAPaginaDeCargaDeDocumentos();
    }

    @When("el usuario sube documentos estructurados")
    public void el_usuario_sube_documentos_estructurados() {
        page.subirDocumentosEstructurados();
    }

    @When("el usuario sube documentos no estructurados")
    public void el_usuario_sube_documentos_no_estructurados() {
        page.subirDocumentosNoEstructurados();
    }

    @Then("el sistema procesa con OCR")
    public void el_sistema_procesa_con_OCR() {
        assertTrue(page.verificarOCRProcesado());
    }

    @Then("extrae datos de los documentos")
    public void extrae_datos_de_los_documentos() {
        assertTrue(page.verificarExtraccionDeDatos());
    }

    @Then("muestra la información para confirmación")
    public void muestra_la_información_para_confirmación() {
        assertTrue(page.verificarInformacionMostradaParaConfirmacion());
    }
}