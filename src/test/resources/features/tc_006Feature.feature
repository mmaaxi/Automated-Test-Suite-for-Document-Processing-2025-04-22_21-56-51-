Feature: Validar integración y procesamiento correcto de OCR y METIQ

  Scenario: Subir documentos estructurados y no estructurados
    Given el usuario está en la página de carga de documentos
    When el usuario sube documentos estructurados
    And el usuario sube documentos no estructurados
    Then el sistema procesa con OCR
    And extrae datos de los documentos
    And muestra la información para confirmación