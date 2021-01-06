package fusion;

import series.friends.Passion;
import superHeros.SuperHeros;

import java.util.ArrayList;

public class SuperHerosAdapter implements Colocataire
{
    private SuperHeros superHeros;

    private Colocataire colocataire;

    private ArrayList<Passion> passions;

    public SuperHerosAdapter(SuperHeros superHeros) {
        this.superHeros = superHeros;
    }

    @Override
    public String getNom() {
        return this.superHeros.getNom();
    }

    @Override
    public void setNom(String nom) {
        this.superHeros.setNom(nom);
    }

    @Override
    public Colocataire getColocataire() {
        return this.colocataire;
    }

    @Override
    public void setColocataire(Colocataire colocataire) {
        this.colocataire = colocataire;
    }

    @Override
    public ArrayList <Passion> getPassion() {
        return this.passions;
    }

    @Override
    public void setPassion(ArrayList passions) {
        this.passions = passions;
    }

    @Override
    public String devenirColocataire(Colocataire colocataire) {
        if(colocataire.getColocataire() != null){
            colocataire.getColocataire().setColocataire(null);
        }
        if(this.colocataire != null){
            this.colocataire.setColocataire(null);
        }
        this.colocataire = colocataire;
        colocataire.setColocataire(this);
        return this.getNom() + " est devenu(e) colocataire avec " + colocataire.getNom();

    }

    @Override
    public void addPassion(Passion passion) {
        this.passions.add(passion);
    }
}
