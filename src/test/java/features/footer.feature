Feature: Footer
      Como usuario quiero ingresar a todas los link del footer de Ciudad

  Scenario: Ingresar a los link Institucional en footer de la home
    Given  El usuario se encuentra en la pagina home de ciudad
    When   Hace click en el link Mediakit Comercial
    And    Hace click en el link Politica de Uso
    And    Hace click en el link Politica de Confidencialidad
    And    Hace click en el link Cucinare
    And    Hace click en el link TN
    And    Hace click en el link EldoceTv
    Then   Se notifica que se encontraron todos los link Institucionales

