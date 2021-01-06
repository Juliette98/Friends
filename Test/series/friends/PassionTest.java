package series.friends;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PassionTest {
    private Friend monica;
    private Friend rachel;
    private Friend joey;
    private Passion cuisine;
    private Passion laMode;

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        monica = new Friend("monica");
        rachel = new Friend("rachel");
        joey = new Friend("joey");
        cuisine = new Passion(monica, "cuisine");
        laMode = new Passion(rachel, "la mode");
        monica.devenirColocataire(rachel);
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
        monica = null;
        rachel = null;
        cuisine = null;
        laMode = null;
    }

    @Test
    public void testConnaitreColocataire()
    {
        Assert.assertEquals("monica qui est passioné(e) de cuisine est colocataire avec rachel"
                , cuisine.connaitreColocataire());
        Assert.assertEquals("rachel qui est passioné(e) de la mode est colocataire avec monica"
                , laMode.connaitreColocataire());
    }

    @Test
    public void testCopy()
    {
        Passion passionJoey = new Passion(joey,"aller au Central Perk");
        Passion passion2Joey = (Passion) passionJoey.copy();
        passion2Joey.setIntitule("manger du sandwich");

        Assert.assertEquals("manger du sandwich", passion2Joey.getIntitule());
        Assert.assertEquals("aller au Central Perk", passionJoey.getIntitule());
    }

}


