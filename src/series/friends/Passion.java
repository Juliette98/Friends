package series.friends;

import fusion.Colocataire;
import fusion.PassionPrototype;

public class Passion extends PassionPrototype {

    private String intitule;

    private Colocataire colocataire;

    /**
     * Constructeur d'objets de classe Passion
     */
    public Passion(Colocataire colocataire, String intitule)
    {
        this.colocataire = colocataire;
        this.intitule = intitule;
    }

    public Colocataire getColocataire() {
        return colocataire;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public void setColocataire(Colocataire colocataire) {
        this.colocataire = colocataire;
    }

    public String getIntitule() {
        return intitule;
    }

    public String toString(){
        return colocataire.getNom() + " est passionné(e) de " + this.intitule;
    }

    public String connaitreColocataire(){
        if(colocataire.getColocataire() != null)
            return colocataire.getNom() + " qui est passioné(e) de " + this.intitule + " est colocataire avec "
                    + colocataire.getColocataire().getNom();
        return colocataire.getNom() + " qui est passioné(e) de " + this.intitule + " n'a pas de colocataire";
    }

    @Override
    public PassionPrototype copy() {
        return new Passion(this.colocataire, this.intitule);
    }
}
