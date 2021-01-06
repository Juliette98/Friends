@tag
Feature: US002 Un super-héros accumule des passion
  En tant que Super-héros et colocataire
  Je veux me découvrir des nouvelles passions
  Afin de mieux intégrer la bande des Friends

  @tag1
  Scenario Outline: Un super-héros trouve un appartement avec un Friend
    Given un super-heros <superhero>
    And des passions <passion1>, <passion2>
    When il découvre une nouvelle <newPassion>
    Then sa liste de passion va être mis à jour: <listePassion>

    Examples:
      | superhero | passion1    | passion2  | newPassion | listePassion |
      | "batman"  | "capturer"  | "sauver"  | "manger"   | "capturer,sauver,manger" |
