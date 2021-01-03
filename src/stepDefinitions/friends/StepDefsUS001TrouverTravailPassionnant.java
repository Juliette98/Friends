package stepDefinitions.friends;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import series.friends.Friend;
import series.friends.Passion;

public class StepDefsUS001TrouverTravailPassionnant {

    private Friend friend = new Friend("monica");
    private Passion passion;
    private String caractereTravail1;
    private String errorMessage = "";

    @Given("^une passion$")
    public void createPassion(){
        this.passion = new Passion(this.friend,"cuisine");
    }

    @Given("^la passion comprend \"([^\"]*)\" de \"([^\"]*)\"$")
    public void affecterPassion(String arg1, String arg2) {
        Assert.assertEquals(this.passion.getIntitule(), arg1);
        Assert.assertEquals(this.passion.getFriend().getNom(),arg2);
    }

    @Given("^un caractéristique d'un travail \"([^\"]*)\"$")
    public void creationTravail(String arg1){
        this.caractereTravail1 = arg1;
    }

    @When("^un Friend trouve un travail qui fait partie de sa passion$")
    public void trouverUnTravailPassionnant(){
        Assert.assertEquals(this.caractereTravail1, this.passion.getIntitule());
    }

    @Then("^le Friend aura un nouveau travail \"([^\"]*)\"$")
    public void rechercheFini(String arg1) {
        Assert.assertEquals(arg1, this.passion.getIntitule());
    }

    @Given("^une autre passion$")
    public void uneAutrePassion() {
        this.passion = new Passion(this.friend,"mode");
    }

    @When("^le caractéristique du travail ne correspond pas à une passion de Friend$")
    public void travailNonPassionnant() {
        Assert.assertNotEquals(this.caractereTravail1, this.passion.getIntitule());
    }

    @Then("^le système renvoie un \"([^\"]*)\"$")
    public void recherchePasFini(String arg1){
        this.errorMessage = "travail pas passionnant";
        Assert.assertEquals(this.errorMessage, arg1);
    }
}
