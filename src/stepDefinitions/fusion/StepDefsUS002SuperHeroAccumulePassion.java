package stepDefinitions.fusion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fusion.Colocataire;
import fusion.SuperHerosAdapter;
import org.junit.Assert;
import series.friends.Passion;
import superHeros.SuperHeros;

import java.util.StringJoiner;

import static org.hamcrest.CoreMatchers.instanceOf;

public class StepDefsUS002SuperHeroAccumulePassion {
    private Passion passionUn;
    private Passion passionDeux;
    private Passion passionTrois;
    private SuperHeros superHeros;
    private SuperHerosAdapter superHeroAdapte;

    @Given("^un super-heros \"([^\"]*)\"$")
    public void un_super_heros(String nom) {
        superHeros = new SuperHeros();
        Assert.assertNotNull(this.superHeros);
        this.superHeros.setNom(nom);
        Assert.assertEquals(this.superHeros.getNom(), nom);
    }

    @Given("^des passions \"([^\"]*)\", \"([^\"]*)\"$")
    public void des_passions(String passion1, String passion2) {
        superHeroAdapte = new SuperHerosAdapter(superHeros);
        Assert.assertThat(superHeroAdapte, instanceOf(Colocataire.class));
        passionUn = new Passion(superHeroAdapte,passion1);
        passionDeux = (Passion) passionUn.copy();
        passionDeux.setIntitule(passion2);
        Assert.assertEquals(passion1, passionUn.getIntitule());
        Assert.assertEquals(passion2, passionDeux.getIntitule());
    }

    @When("^il découvre une nouvelle \"([^\"]*)\"$")
    public void il_découvre_une_nouvelle(String newPassion){
        passionTrois = (Passion) passionUn.copy();
        passionTrois.setIntitule(newPassion);
        Assert.assertEquals(newPassion, passionTrois.getIntitule());
    }

    @Then("^sa liste de passion va être mis à jour: (.*)$")
    public void sa_liste_de_passion_va_être_mis_à_jour(String listePassion){
        Assert.assertEquals('"' + passionUn.getIntitule() + "," + passionDeux.getIntitule() + "," +
                passionTrois.getIntitule() + '"' , listePassion);
    }
}
