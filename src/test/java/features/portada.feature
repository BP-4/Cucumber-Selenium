Feature: Secciones en la Portada

  Como usuario quiero velidar todas las secciones en la Portada de Ciudad

  Scenario: Verificar la seccion Que Look en la portada
    Given   El usuario se encuentra en la pagina home de ciudad
    When    Busco la seccion Que Look en la portada
    Then    Valido la seccion Que Look


  Scenario: Verificar la seccion Portfolio en la portada
    Given   El usuario se encuentra en la pagina home de ciudad
    When    Busco la seccion Portfolio en la portada
    Then    Valido la seccion Portfolio

  Scenario: Verificar la seccion Te cuento algo en la portada
    Given   El usuario se encuentra en la pagina home de ciudad
    When    Busco la seccion Te cuento algo en la portada
    Then    Valido la seccion Te cuento algo

  Scenario: Verificar la seccion Lo mejor de ciudad magazineTV en la portada
    Given   El usuario se encuentra en la pagina home de ciudad
    When    Busco la seccion Lo mejor de ciudad magazineTV en la portada
    Then    Valido la seccion Lo mejor de ciudad magazineTV

  Scenario: Verificar la seccion Newsletter en la portada
    Given   El usuario se encuentra en la pagina home de ciudad
    When    Busco la seccion Newsletter en la portada
    And     Ingreso un correo valido
    Then    Me regristro exitosamente