Feature: US_003 Engager le super-héros

  En tant que réalisateur, j'ai besoin de superhéros pour mon film !

  # The first example has two steps
  Scenario Outline: J'engage des superheros dans un film
    Given un film nommé <nomFilm> ayant pour <realisateur>
    And un superHeros <nomSuperheros1>
    When quand je fais le casting
    Then Ils sont engagés ma <listeSuperHeros> est mise à jour
    Examples:
      | nomFilm   | realisateur   | nomSuperheros1 | listeSuperHeros |
      | "Justice" | "michael bay" | "batman"       | "batman"        |

  # The second example has three steps
  Scenario Outline: Un superhéros est battu par son ennemi
    Given un film nommé <nomFilm> ayant pour <realisateur>
    And un superHeros <nomSuperheros1>
    When quand le superheros se fait battre
    Then il est supprimé du film et la liste de base <listeSuperHerosavant> deviens <listeSuperHeros> est mise à jour
    Examples:
      | nomFilm   | realisateur   | nomSuperheros1 | listeSuperHerosavant | listeSuperHeros |
      | "Justice" | "michael bay" | "batman"       | "batman"             | ""              |