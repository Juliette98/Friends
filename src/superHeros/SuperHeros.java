package superHeros;

/**
 * Décrivez votre classe PackageParDefaut.SuperHeros ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class SuperHeros
{
    // variables d'instance 
    private int nbrMechantsCaptures;
    private String nomEnnemi, nom;

    /**
     * Constructeur d'objets de classe PackageParDefaut.SuperHeros
     */
    public SuperHeros()
    {
        this.nbrMechantsCaptures = 0;
        this.nomEnnemi = "";
    }

    
    public void setNomEnnemi(String nom)
    {
        this.nomEnnemi = nom;
    }
    
    public void setNbrMechantsCaptures(int nombre)
    {
        this.nbrMechantsCaptures = nombre;
    }
    
    public String getNomEnnemi()
    {
        return this.nomEnnemi;
    }
    
    public int getNbrMechantsCaptures()
    {
        return this.nbrMechantsCaptures;
    }
    
    public void captureDunMechant()
    {
        this.nbrMechantsCaptures++;
    }

    public String getNom() { return nom; }

    public void setNom(String nom) { this.nom = nom;}

    public void captureEnnemiPrincipal()
    {
        this.nbrMechantsCaptures++;
        this.nomEnnemi = "";
    }

}
