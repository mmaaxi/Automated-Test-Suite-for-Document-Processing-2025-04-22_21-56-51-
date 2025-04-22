package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.tc_001Page;

public class tc_001Steps {
    WebDriver driver;
    tc_001Page page;

    public tc_001Steps() {
        this.driver = Hooks.driver;
        this.page = new tc_001Page(driver);
    }

    @When("selecciono la opción 'cargar documentos'")
    public void selecciono_la_opción_cargar_documentos() {
        page.selectLoadDocumentsOption();
    }

    @Then("el sistema muestra opción para carga única y carga múltiple")
    public void el_sistema_muestra_opción_para_carga_única_y_carga_múltiple() {
        Assert.assertTrue(page.isSingleAndMultipleUploadOptionsDisplayed());
    }

    @When("elijo 'carga en un solo archivo'")
    public void elijo_carga_en_un_solo_archivo() {
        page.chooseSingleFileUpload();
    }

    @Then("se habilita un único recuadro para subir el archivo")
    public void se_habilita_un_único_recuadro_para_subir_el_archivo() {
        Assert.assertTrue(page.isSingleFileUploadBoxEnabled());
    }

    @When("elijo 'cargar documentos por separado'")
    public void elijo_cargar_documentos_por_separado() {
        page.chooseSeparateFilesUpload();
    }

    @Then("se muestran múltiples recuadros correspondientes a cada documento requerido")
    public void se_muestran_múltiples_recuadros_correspondientes_a_cada_documento_requerido() {
        Assert.assertTrue(page.areMultipleDocumentUploadBoxesDisplayed());
    }
}