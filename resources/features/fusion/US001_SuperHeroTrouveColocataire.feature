@tag
Feature: US001 Un super-héros trouve un colocataire
  En tant que Super-héros
  Je veux devenir colocataire avec un Friend
  Afin qu'il trouve un logement

  @tag1
  Scenario Outline: Un super-héros trouve un appartement avec un Friend
    Given un super-héros <superhero>
    And un Friend <friend>
    When ils emménagent
    Then le superheros devient colocataire avec <friend>

    Examples:
      | superhero | friend |
      | "batman"  | "joey" |