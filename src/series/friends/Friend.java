package series.friends;

import java.util.ArrayList;

public class Friend {

    private String nom;

    private Friend colocataire;

    private ArrayList<Passion> passions;


    /**
     * Constructeur d'objets de classe Friend
     */
    public Friend(String nom)

    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.passions = new ArrayList();

    }

    public String getNom(){
        return this.nom;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public Friend getColocataire(){
        return this.colocataire;
    }

    public void setColocataire(Friend colocataire){
        this.colocataire = colocataire;
    }

    public ArrayList getPassion(){
        return this.passions;
    }

    public void setPassion(ArrayList passions){
        this.passions = passions;
    }

    public String devenirColocataire(Friend friend){
        devenirColocataireExtracted(friend);

        return this.nom + " est devenu(e) colocataire avec " + friend.nom;
    }

    private void devenirColocataireExtracted(Friend friend) {
        if(friend.colocataire != null){
            friend.colocataire.colocataire = null;
        }
        if(this.colocataire != null){
            this.colocataire.colocataire = null;
        }
        this.colocataire = friend;
        friend.colocataire = this;
    }

    public void addPassion(Passion passion) {
        this.passions.add(passion);
    }
}
