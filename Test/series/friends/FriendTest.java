package series.friends;

import fusion.Colocataire;
import fusion.SuperHerosAdapter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import superHeros.SuperHeros;
import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;

public class FriendTest {
    private Friend monica;
    private Friend rachel;
    private Passion passionMonica;

    @Before
    public void setUp() // throws java.lang.Exception
    {
        monica = new Friend("monica");
        rachel = new Friend("rachel");
        passionMonica = new Passion(monica, "cuisine");
    }

    @After
    public void tearDown() // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
        monica = null;
        rachel = null;
        passionMonica = null;
    }

    @Test
    public void testDevenirColocataire()
    {
        Assert.assertEquals("monica est devenu(e) colocataire avec rachel", monica.devenirColocataire(rachel));
    }

    @Test
    public void testaddPassion()
    {
        monica.addPassion(passionMonica);

        ArrayList<Passion> passions = new ArrayList();
        passions.add(passionMonica);

        Assert.assertEquals(passions, monica.getPassion());
    }

    @Test
    public void testAdapterSuperHero()
    {
        SuperHeros batman = new SuperHeros();
        Colocataire joey = new Friend("Joey");
        Colocataire batmanAdapte = new SuperHerosAdapter(batman);

        batmanAdapte.devenirColocataire(joey);
        //Test de l'adaptation
        Assert.assertEquals(joey, batmanAdapte.getColocataire());
        //Test du type du super-héro adapté
        Assert.assertThat(batmanAdapte, instanceOf(Colocataire.class));
    }

}
