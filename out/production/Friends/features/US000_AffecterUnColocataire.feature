@tag
Feature: US000 Affecter un colocataire
  En tant que Friend
  Je veux devenir colocataire avec un autre Friend
  Afin qu'il trouve un logement

  @tag1
  Scenario Outline: Mettre à jour automatiquement les colocataires des Friends
    Given un Friend
    And le Friend a un colocataire <coloc1>
    And le Friend veut être colocataire avec <coloc2>
    When les Friends déménagent
    Then le nouveau colocataire <newColoc> doit être automatiquement ajouté à Friend.

    Examples:
      | coloc1  |   coloc2   |  newColoc  |
      | "rachel"| "chandler" | "chandler" |

  @tag2
  Scenario Outline: Refuser un colocataire
    Given un Friend
    And le Friend a un colocataire <coloc1>
    And un <coloc2> qui veut emmenager avec Friend
    When le Friend ne peut pas changer de colocataire
    Then le système renvoie le <messageErreur>

    Examples:
      |  coloc1 |    coloc2  |           messageErreur   		  |
      | "rachel"| "chandler" | "Changement de colocataire refusé" |
