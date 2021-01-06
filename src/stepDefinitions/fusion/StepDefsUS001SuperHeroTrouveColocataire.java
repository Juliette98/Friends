package stepDefinitions.fusion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import fusion.Colocataire;
import fusion.SuperHerosAdapter;
import org.junit.Assert;
import series.friends.Friend;
import superHeros.SuperHeros;

import static org.hamcrest.CoreMatchers.instanceOf;

public class StepDefsUS001SuperHeroTrouveColocataire {
    private SuperHeros superHeros;
    private Friend friend;
    private Colocataire superHeroAdapte;

    @Given("^un super-héros \"([^\"]*)\"$")
    public void un_super_héros(String nom){
        superHeros = new SuperHeros();
        Assert.assertNotNull(this.superHeros);
        this.superHeros.setNom(nom);
        Assert.assertEquals(this.superHeros.getNom(), nom);
    }

    @Given("^un Friend (.*)$")
    public void un_Friend(String nom)  {
        this.friend = new Friend(nom);
        Assert.assertNotNull(this.friend);
    }

    @When("^ils emménagent$")
    public void ils_emménagent(){
        superHeroAdapte = new SuperHerosAdapter(superHeros);
        Assert.assertThat(superHeroAdapte, instanceOf(Colocataire.class));
    }

    @Then("^le superheros devient colocataire avec (.*)$")
    public void le_superheros_devient_colocataire_avec(String nom) {
        superHeroAdapte.devenirColocataire(friend);
        Assert.assertEquals(nom, superHeroAdapte.getColocataire().getNom());
    }


}
