Feature: Validar selección de modo de carga de documentos

  Scenario: Seleccionar la opción 'cargar documentos'
    When selecciono la opción 'cargar documentos'
    Then el sistema muestra opción para carga única y carga múltiple

  Scenario: Elegir 'carga en un solo archivo'
    When elijo 'carga en un solo archivo'
    Then se habilita un único recuadro para subir el archivo

  Scenario: Elegir 'cargar documentos por separado'
    When elijo 'cargar documentos por separado'
    Then se muestran múltiples recuadros correspondientes a cada documento requerido