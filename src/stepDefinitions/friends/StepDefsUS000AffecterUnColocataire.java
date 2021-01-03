package stepDefinitions.friends;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import series.friends.Friend;

public class StepDefsUS000AffecterUnColocataire {

    private Friend friend;
    private Friend coloc1;
    private Friend coloc2;
    private  Friend friend2;
    private String errorMessage = "";

    @Given("^un Friend$")
    public void createFriend(){
        this.friend = new Friend("friend");
        Assert.assertTrue(this.friend != null);
    }

    @Given("^le Friend a un colocataire \"([^\"]*)\"$")
    public void leFriendAUnColocataire(String arg1){
        this.coloc1 = new Friend(arg1);
        this.friend.setColocataire(this.coloc1);
    }

    @Given("^le Friend veut être colocataire avec \"([^\"]*)\"$")
    public void leFriendVeutEtreColocataireAvec(String arg1) {
        this.coloc2 = new Friend(arg1);
    }

    @When("^les Friends déménagent$")
    public void lesFriendsDéménagent(){
        this.friend.devenirColocataire(this.coloc2);
    }

    @Then("^le nouveau colocataire \"([^\"]*)\" doit être automatiquement ajouté à Friend\\.$")
    public void colocatireMisAJour(String arg1){
        Assert.assertEquals(this.friend.getColocataire(),this.coloc2);
        Assert.assertEquals(this.coloc2.getColocataire(),this.friend);
        Assert.assertNull(this.coloc1.getColocataire());
    }


    @Given("^un \"([^\"]*)\" qui veut emmenager avec Friend$")
    public void emmenagementFriend(String arg1){
        this.friend2 = new Friend("arg1");
    }

    @When("^le Friend ne peut pas changer de colocataire$")
    public void emmenagementImpossible() {
        Assert.assertNotNull(this.friend.getColocataire());
    }

    @Then("^le système renvoie le \"([^\"]*)\"$")
    public void erreurEmmenagement(String arg1) {
        this.errorMessage = "Changement de colocataire refusé";
        Assert.assertEquals(this.errorMessage, arg1);
    }

}
