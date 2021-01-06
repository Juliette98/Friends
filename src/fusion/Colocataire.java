package fusion;

import series.friends.Passion;

import java.util.ArrayList;

public interface Colocataire {
    public String getNom();

    public void setNom(String nom);

    public Colocataire getColocataire();

    public void setColocataire(Colocataire colocataire);

    public ArrayList getPassion();

    public void setPassion(ArrayList passions);

    String devenirColocataire(Colocataire colocataire);

    public void addPassion(Passion passion);

}
