Feature: Validar manejo de archivo con formato no permitido o tamaño excedido

  Scenario: Usuario intenta subir un archivo con formato no permitido o tamaño superior a 50 MB
    Given el usuario está en la página de carga de archivos
    When el usuario intenta subir un archivo no permitido o demasiado grande
    Then se muestra un mensaje de error indicando formato inválido o tamaño excedido