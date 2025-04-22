Feature: Validar manejo de error en procesamiento OCR por archivo corrupto

  Scenario: Subida de archivo corrupto para procesamiento OCR
    Given El navegador está abierto en la página de carga de archivos
    When Subo un archivo corrupto
    Then El sistema detecta el fallo y notifica el error al Bróker
    And El sistema finaliza el procesamiento