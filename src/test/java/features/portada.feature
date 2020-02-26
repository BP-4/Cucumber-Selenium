Feature: Secciones en la Portada

  Como usuario quiero validar todas las secciones en la Portada de Ciudad

  Background:
    Given   El usuario se encuentra en la pagina home de ciudad

  Scenario: Contar imgenes
    When    Cuanto las etiquetas img
    Then    Consigo la cantidad de etiquetas que se encuentran en la home

  Scenario: Verificar la seccion Que Look en la portada
    When    Busco la seccion Que Look en la portada
    Then    Valido la seccion Que Look


  Scenario: Verificar la seccion Portfolio en la portada
    When    Busco la seccion Portfolio en la portada
    Then    Valido la seccion Portfolio

  Scenario: Verificar la seccion Te cuento algo en la portada
    When    Busco la seccion Te cuento algo en la portada
    Then    Valido la seccion Te cuento algo

  Scenario: Verificar la seccion Lo mejor de ciudad magazineTV en la portada
    When    Busco la seccion Lo mejor de ciudad magazineTV en la portada
    Then    Valido la seccion Lo mejor de ciudad magazineTV

  Scenario: Verificar la seccion Newsletter en la portada
    When    Busco la seccion Newsletter en la portada
    And     Ingreso un correo valido
    Then    Me regristro exitosamente