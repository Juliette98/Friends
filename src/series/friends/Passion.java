package series.friends;

public class Passion {

    private String intitule;

    private Friend friend;

    /**
     * Constructeur d'objets de classe Passion
     */
    public Passion(Friend friend, String intitule)
    {
        this.friend = friend;
        this.intitule = intitule;
    }

    public Friend getFriend() {
        return friend;
    }

    public String getIntitule() {
        return intitule;
    }

    public String toString(){
        return friend.getNom() + " est passionné(e) de " + this.intitule;
    }

    public String connaitreColocataire(){
        if(friend.getColocataire() != null)
            return friend.getNom() + " qui est passioné(e) de " + this.intitule + " est colocataire avec "
                    + friend.getColocataire().getNom();
        return friend.getNom() + " qui est passioné(e) de " + this.intitule + " n'a pas de colocataire";
    }
}
