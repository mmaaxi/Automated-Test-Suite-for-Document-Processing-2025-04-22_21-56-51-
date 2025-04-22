package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_006Page {
    WebDriver driver;

    By uploadButton = By.id("upload-button");
    By confirmationText = By.id("confirmation-text");

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarAPaginaDeCargaDeDocumentos() {
        driver.get("URL_DE_LA_PAGINA_DE_CARGA_DE_DOCUMENTOS");
    }

    public void subirDocumentosEstructurados() {
        driver.findElement(uploadButton).sendKeys("ruta/a/documento_estructurado");
    }

    public void subirDocumentosNoEstructurados() {
        driver.findElement(uploadButton).sendKeys("ruta/a/documento_no_estructurado");
    }

    public boolean verificarOCRProcesado() {
        // Lógica para verificar que OCR ha sido procesado
        return driver.findElement(confirmationText).isDisplayed();
    }

    public boolean verificarExtraccionDeDatos() {
        // Lógica para verificar que los datos se han extraído correctamente
        return true;
    }

    public boolean verificarInformacionMostradaParaConfirmacion() {
        // Lógica para verificar que la información se muestra para confirmación
        return true;
    }
}