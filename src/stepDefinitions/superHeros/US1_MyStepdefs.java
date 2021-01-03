package stepDefinitions.superHeros;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import superHeros.SuperHeros;

public class US1_MyStepdefs {
    private SuperHeros superHeros;

    @Given("^un superheros \"([^\"]*)\"$")
    public void un_superheros(String nom){
        superHeros = new SuperHeros();
        Assert.assertNotNull(this.superHeros);
        this.superHeros.setNom(nom);
        Assert.assertEquals(this.superHeros.getNom(), nom);    }

    @When("^un nouvel ennemi se confronte à lui$")
    public void un_nouvel_ennemi_se_confronte_à_lui(){
    }

    @Then("^Sa nouvelle cible sera \"([^\"]*)\"$")
    public void sa_nouvelle_cible_sera(String nom){
        superHeros.setNomEnnemi(nom);
        Assert.assertEquals(nom, superHeros.getNomEnnemi());
    }

    @Given("^le superheros a un -(\\d+) négatif$")
    public void le_superheros_a_un_négatif(int nbmechant){
        superHeros.setNbrMechantsCaptures(nbmechant);
    }

    @When("^le réalisateur lui valide cette statistique$")
    public void le_réalisateur_lui_valide_cette_statistique() {
    }

    @Then("^le système le refuse avec \"([^\"]*)\"$")
    public void le_système_le_refuse_avec(String msgError) throws Exception {
        throw new Exception(msgError);
    }
}
