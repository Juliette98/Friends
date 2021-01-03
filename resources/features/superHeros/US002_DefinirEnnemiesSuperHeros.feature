Feature: US_002 Définir l'ennemi du super-héros

  Notre superhéros a du travail, il doit capturé plusieurs méchants avant d'atteindre sa cible !

  # The first example
  Scenario Outline: Le heros capture un méchant
    Given un superheros <nomSuperheros> avec au compteur <nbMechantsCapture>
    When il capture un nouveau méchant
    Then ses statistiques se recalcule avec le <nbMechantsCaptureIncremente>
    Examples:
      | nomSuperheros | nbMechantsCapture | nbMechantsCaptureIncremente |
      | "batman"      | 40                | 41                          |
      | "wonderwoman" | 55                | 56                          |

   # The second example
  Scenario Outline: Le heros capture sa cible principal
    Given un superheros <nomSuperheros> avec au compteur <nbMechantsCapture>
    And et une <cible>
    When il capture son ennemi majeur
    Then ses statistiques se recalcule avec le <nbMechantsCaptureIncremente> et la <newCible>
    Examples:
      | nomSuperheros | nbMechantsCapture | nbMechantsCaptureIncremente | cible     | newCible |
      | "batman"      | 40                | 41                          | "Jocker"  | ""       |
      | "wonderwoman" | 55                | 56                          | "Maxwell" | ""       |



