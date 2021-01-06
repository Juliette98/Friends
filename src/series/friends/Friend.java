package series.friends;

import fusion.Colocataire;

import java.util.ArrayList;

public class Friend implements Colocataire {

    private String nom;

    private Colocataire colocataire;

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

    @Override
    public String getNom(){
        return this.nom;
    }

    @Override
    public void setNom(String nom){
        this.nom = nom;
    }

    @Override
    public Colocataire getColocataire(){
        return this.colocataire;
    }

    @Override
    public void setColocataire(Colocataire colocataire){
        this.colocataire = colocataire;
    }

    @Override
    public ArrayList <Passion> getPassion(){
        return this.passions;
    }

    @Override
    public void setPassion(ArrayList passions){
        this.passions = passions;
    }

    @Override
    public String devenirColocataire(Colocataire friend){
        devenirColocataireExtracted(friend);

        return this.nom + " est devenu(e) colocataire avec " + friend.getNom();
    }

    private void devenirColocataireExtracted(Colocataire friend) {
        if(friend.getColocataire() != null){
            friend.getColocataire().setColocataire(null);
        }
        if(this.colocataire != null){
            this.colocataire.setColocataire(null);
        }
        this.colocataire = friend;
        friend.setColocataire(this);
    }
    @Override
    public void addPassion(Passion passion) {
        this.passions.add(passion);
    }
}
