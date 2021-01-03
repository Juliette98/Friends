package stepDefinitions.superHeros;

import org.junit.Assert;
import superHeros.SuperHeros;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class US2_MyStepdefs {
    private SuperHeros superHeros;

    @Given("^un superheros \"([^\"]*)\" avec au compteur (\\d+)$")
    public void un_superheros_avec_au_compteur(String nom, int nbMechantsCaptures) {
        superHeros = new SuperHeros();
        Assert.assertNotNull(this.superHeros);
        this.superHeros.setNom(nom);
        this.superHeros.setNbrMechantsCaptures(nbMechantsCaptures);
        Assert.assertEquals(this.superHeros.getNom(), nom);
        Assert.assertEquals(this.superHeros.getNbrMechantsCaptures(), nbMechantsCaptures);
    }

    @When("^il capture un nouveau méchant$")
    public void il_capture_un_nouveau_méchant(){
        this.superHeros.captureDunMechant();
    }

    @Then("^ses statistiques se recalcule avec le (\\d+)$")
    public void ses_statistiques_se_recalcule_avec_le(int nbrMechantsCaptureIncr){
        Assert.assertEquals(this.superHeros.getNbrMechantsCaptures(), nbrMechantsCaptureIncr);
    }

    @Given("^et une \"([^\"]*)\"$")
    public void et_une(String cible) {
        this.superHeros.setNomEnnemi(cible);
    }

    @When("^il capture son ennemi majeur$")
    public void il_capture_son_ennemi_majeur() throws Exception {
        this.superHeros.captureEnnemiPrincipal();
    }

    @Then("^ses statistiques se recalcule avec le (\\d+) et la \"([^\"]*)\"$")
    public void ses_statistiques_se_recalcule_avec_le_et_la(int nbrMechantsCaptureIncr, String newCible){
        Assert.assertEquals(this.superHeros.getNbrMechantsCaptures(), nbrMechantsCaptureIncr);
        Assert.assertEquals(this.superHeros.getNomEnnemi(), newCible);
    }
}
