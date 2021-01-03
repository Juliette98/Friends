Feature: US_001 Définir le super-héros

  Un nouveau super-heros arrive en ville !

  # The first example
  Scenario Outline: Une nouvelle cible est identifié
    Given un superheros <nomSuperheros>
    When un nouvel ennemi se confronte à lui
    Then Sa nouvelle cible sera <nomCible>
    Examples:
      | nomSuperheros | nomCible |
      | "batman"      | "jocker" |


  # The second example
  Scenario Outline: Refus nombre mechants captures
    Given un superheros <nomSuperheros>
    And le superheros a un <nbMechantsCapture> négatif
    When le réalisateur lui valide cette statistique
    Then le système le refuse avec <messageErreur>
    Examples:
      | nomSuperheros | nbMechantsCapture | messageErreur    |
      | "batman"      | -1                | "Nombre négatif" |


