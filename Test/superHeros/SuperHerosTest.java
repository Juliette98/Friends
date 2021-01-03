package superHeros;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertTrue;

/**
 * Classe-test PackageTest.SuperHerosTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
public class SuperHerosTest
{
    private SuperHeros batman, superman, wonderwoman;
    private Film film1;

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
 

    /**
     * Constructeur de la classe-test PackageTest.SuperHerosTest
     */
    public SuperHerosTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        film1 = new Film("Batman vs Joker", "Michael Bay");
        batman = new SuperHeros();
        superman = new SuperHeros();
        wonderwoman = new SuperHeros();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }

   

    @Test
    public void testAjoutSuperHerosFilm()
    {
        film1.ajouterSuperHeros(batman);
        film1.ajouterSuperHeros(superman);
        film1.ajouterSuperHeros(wonderwoman);
        List<SuperHeros> myList = asList(batman, superman, wonderwoman);
        assertTrue(film1.getSuperheros().equals(myList));
    }

    @Test
    public void testSuppressionSuperHerosFilm()
    {
        SuperHeros robin = new SuperHeros();
        film1.ajouterSuperHeros(batman);
        film1.ajouterSuperHeros(superman);
        film1.ajouterSuperHeros(wonderwoman);

        film1.enleverSuperHeros(superman);
        film1.enleverSuperHeros(robin);

        List<SuperHeros> myList = asList(batman, wonderwoman);
        assertTrue(film1.getSuperheros().equals(myList));
    }

    @Test
    public void testPresenceSuperHerosFilm()
    {
        film1.ajouterSuperHeros(batman);

        assertTrue(film1.testSuperHerosPresent(batman));
    }



    /*
    @Test
    public void testCaptureDunMechant()
    {
        batman.captureDunMechant();
        assertEquals(101, batman.getNbrMechantsCaptures());
        
    }

     */
    
}



