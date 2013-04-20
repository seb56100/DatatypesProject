/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Adresse;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author john.gdowe
 */
public class AdresseTest {
    
    private Adresse a;
    
    public AdresseTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        a = new Adresse (2, Lieux.Rue, "Kervegan", new Ville("Nantes", 44000, new Pays("France", 10, 33)));
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setVille method, of class Adresse.
     */
    @Test
    public void testSetVille() {
        System.out.println("setVille");
        Ville ville = null;
        Adresse instance = null;
        instance.setVille(ville);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getVille method, of class Adresse.
     */
    @Test
    public void testGetVille() {
        System.out.println("getVille");
        Adresse instance = null;
        Ville expResult = null;
        Ville result = instance.getVille();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLieu method, of class Adresse.
     */
    @Test
    public void testGetLieu() {
        System.out.println("getLieu");
        Adresse instance = null;
        Lieux expResult = null;
        Lieux result = instance.getLieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumero method, of class Adresse.
     */
    @Test
    public void testGetNumero() {
        System.out.println("getNumero");
        Adresse instance = null;
        int expResult = 0;
        int result = instance.getNumero();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNom method, of class Adresse.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Adresse instance = null;
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLieu method, of class Adresse.
     */
    @Test
    public void testSetLieu() {
        System.out.println("setLieu");
        Lieux lieu = null;
        Adresse instance = null;
        instance.setLieu(lieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumero method, of class Adresse.
     */
    @Test
    public void testSetNumero() {
        System.out.println("setNumero");
        int numero = 0;
        Adresse instance = null;
        instance.setNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Adresse.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Adresse instance = null;
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Adresse.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "2, Rue Kervegan, 44000 Nantes, France.";
        String result = a.toString();
        assertEquals(expResult, result);
    }
}