import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_007Page {
    WebDriver driver;

    // Localizadores
    By botonSubirArchivo = By.id("uploadButton");
    By mensajeError = By.id("errorNotification");
    By mensajeFinalizado = By.id("processingComplete");

    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navegarPaginaCarga() {
        driver.get("https://example.com/ocr-upload");
    }

    public void subirArchivoCorrupto() {
        WebElement subirArchivo = driver.findElement(botonSubirArchivo);
        subirArchivo.sendKeys("/path/to/corrupt/file.pdf");
    }

    public boolean esErrorNotificado() {
        return driver.findElement(mensajeError).isDisplayed();
    }

    public boolean esProcesamientoFinalizado() {
        return driver.findElement(mensajeFinalizado).isDisplayed();
    }
}