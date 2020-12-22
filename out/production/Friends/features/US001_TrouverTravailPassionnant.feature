@tag
Feature: US001 Trouver un travail passionnant

  En tant que Friend
  Je veux trouver un travail qui me passionne
  Afin de pouvoir vivre

  @tag1
  Scenario Outline: Affectation automatique d'un travail qui le passione
    Given une passion
    And la passion comprend <int1> de <friend1>
    And un caractéristique d'un travail <car1>
    When un Friend trouve un travail qui fait partie de sa passion
    Then le Friend aura un nouveau travail <travail>

    Examples:
      |   int1    |  friend1 	| car1     | travail   |
      | "cuisine" | "monica" 	|"cuisine" | "cuisine" |

  @tag2
  Scenario Outline: Refuser un travail qui ne passionne un Friend
    Given une autre passion
    And la passion comprend <int1> de <friend1>
    And un caractéristique d'un travail <car1>
    When le caractéristique du travail ne correspond pas à une passion de Friend
    Then le système renvoie un <messageErreur>

    Examples:
      | int1  		|  friend1 	|      car1  		|      messageErreur  		|
      | "mode"		| "monica" 	| "vendeuse" 		| "travail pas passionnant" |

