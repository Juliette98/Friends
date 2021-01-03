package superHeros;

import java.util.ArrayList;

/**
 * Décrivez votre classe PackageParDefaut.Film ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Film
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String realisateur;
    private String titre;

    private ArrayList<SuperHeros> superheros;

    /**
     * Constructeur d'objets de classe PackageParDefaut.Film
     */
    public Film(String titre, String realisateur)
    {
        this.titre = titre;
        this.realisateur = realisateur;
        this.superheros = new ArrayList<>();
    }

    public void ajouterSuperHeros(SuperHeros superHeros){
        if(!this.superheros.contains(superHeros))
            this.superheros.add(superHeros);
    }

    public void enleverSuperHeros(SuperHeros superHeros){
        if(this.superheros.contains(superHeros))
            this.superheros.remove(superHeros);
    }

    public String getRealisateur() {
        return realisateur;
    }

    public String getTitre() {
        return titre;
    }

    public ArrayList<SuperHeros> getSuperheros() {
        return superheros;
    }


    public boolean testSuperHerosPresent(SuperHeros superHeros) {
        if(this.superheros.contains(superHeros))
            return true;
        else
            return false;
    }
}
