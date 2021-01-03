package stepDefinitions.superHeros;

import org.junit.Assert;

import java.util.StringJoiner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import superHeros.Film;
import superHeros.SuperHeros;

public class US3_MyStepdefs {
    Film film;
    SuperHeros superHeros, superHeros1, superHeros2, superHeros3;

    @Given("^un film nommé \"([^\"]*)\" ayant pour \"([^\"]*)\"$")
    public void un_film_nommé_ayant_pour(String nomFilm, String realisateur) {
        this.film = new Film(nomFilm, realisateur);
        Assert.assertEquals(this.film.getTitre(), nomFilm);
        Assert.assertEquals(this.film.getRealisateur(), realisateur);
    }

    @Given("^un superHeros \"([^\"]*)\"$")
    public void un_superHeros(String nomSh){
        superHeros1 = new SuperHeros();
        Assert.assertNotNull(this.superHeros1);
        this.superHeros1.setNom(nomSh);
        Assert.assertEquals(this.superHeros1.getNom(), nomSh);
    }

    @When("^quand je fais le casting$")
    public void quand_je_fais_le_casting(){
        this.film.ajouterSuperHeros(this.superHeros1);

    }

    @Then("^Ils sont engagés ma \"([^\"]*)\" est mise à jour$")
    public void ils_sont_engagés_ma_est_mise_à_jour(String listeSuperHeros){
        StringJoiner sj = new StringJoiner(",");
        for (SuperHeros s : this.film.getSuperheros()) {
            sj.add(s.getNom());
        }
        Assert.assertEquals(sj.toString(), listeSuperHeros);
    }

    @When("^quand le superheros se fait battre$")
    public void quand_le_superheros_se_fait_battre() {
        this.film.enleverSuperHeros(this.superHeros1);
    }

    @Then("^il est supprimé du film et la liste de base \"([^\"]*)\" deviens \"([^\"]*)\" est mise à jour$")
    public void il_est_supprimé_du_film_et_la_liste_de_base_deviens_est_mise_à_jour(String listeSuperHerosAvant, String listeSuperHeros) {
        StringJoiner sj = new StringJoiner(",");
        for (SuperHeros s : this.film.getSuperheros()) {
            sj.add(s.getNom());
        }
        Assert.assertEquals(sj.toString(), listeSuperHeros);
    }


}
