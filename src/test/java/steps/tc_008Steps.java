package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.tc_008Page;
import utils.DriverFactory;

public class tc_008Steps extends DriverFactory {

    private tc_008Page page = new tc_008Page(driver);

    @Given("^que el usuario está en la página de carga de archivos$")
    public void usuarioEnPaginaDeCargaDeArchivos() {
        page.navigateToFileUploadPage();
    }

    @When("^el usuario sube documentos$")
    public void usuarioSubeDocumentos() {
        page.uploadDocuments();
    }

    @Then("^el sistema muestra nombre, tamaño y tipo de cada archivo en la vista previa$")
    public void sistemaMuestraDetallesArchivos() {
        Assert.assertTrue(page.verifyFilePreviewDetails());
    }

    @When("^el usuario elimina uno de los archivos usando la opción de eliminar$")
    public void usuarioEliminaArchivo() {
        page.deleteFile();
    }

    @Then("^el archivo se elimina correctamente de la lista antes de la confirmación$")
    public void archivoEliminadoCorrectamente() {
        Assert.assertTrue(page.verifyFileDeletion());
    }
}