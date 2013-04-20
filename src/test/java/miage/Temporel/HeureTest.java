/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Temporel;

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
public class HeureTest {
    
    //  Heure à tester avec le premier constructeur
    private Heure h1;
    
    //  Heure à tester avec le second constructeur
    private Heure h2;
    
    public HeureTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        h1 = new Heure(22, 28, 10);
        h2 = new Heure(15, 30);
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getHeures method, of class Heure.
     */
    @Test
    public void testGetHeures() {
        //  Test du premier constructeur
        System.out.println("getHeures - Constructeur 1");
        Integer expResult1 = 22;
        Integer result1 = h1.getHeures();
        assertEquals(expResult1, result1);
        
        //  Test du deuxième constructeur
        System.out.println("getHeures - Constructeur 2");
        Integer expResult2 = 15;
        Integer result2 = h2.getHeures();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setHeures method, of class Heure.
     */
    @Test
    public void testSetHeures() {
        System.out.println("setHeures");
        h1.setHeures(18);
        assertEquals((Integer)18, (Integer)h1.getHeures());
    }

    /**
     * Test of getMinutes method, of class Heure.
     */
    @Test
    public void testGetMinutes() {
        //  Test du premier constructeur
        System.out.println("getMinutes - Constructeur 1");
        Integer expResult1 = 28;
        Integer result1 = h1.getMinutes();
        assertEquals(expResult1, result1);
        
        //  Test du deuxième constructeur
        System.out.println("getMinutes - Constructeur 2");
        Integer expResult2 = 30;
        Integer result2 = h2.getMinutes();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setMinutes method, of class Heure.
     */
    @Test
    public void testSetMinutes() {
        System.out.println("setMinutes");
        h1.setMinutes(25);
        assertEquals((Integer)25, (Integer)h1.getMinutes());
    }

    /**
     * Test of getSecondes method, of class Heure.
     */
    @Test
    public void testGetSecondes() {
        //  Test du premier constructeur
        System.out.println("getSecondes - Constructeur 1");
        Integer expResult1 = 10;
        Integer result1 = h1.getSecondes();
        assertEquals(expResult1, result1);
        
        //  Test du deuxième constructeur
        System.out.println("getSecondes - Constructeur 2");
        Integer expResult2 = 0;
        Integer result2 = h2.getSecondes();
        assertEquals(expResult2, result2);
    }

    /**
     * Test of setSecondes method, of class Heure.
     */
    @Test
    public void testSetSecondes() {
        System.out.println("setSecondes");
        h1.setSecondes(44);
        assertEquals((Integer)44, (Integer)h1.getSecondes());
    }
    
    /**
     * Test of donnerHeure method, of class Heure.
     */
    @Test
    public void testDonnerHeure() {
        System.out.println("donnerHeure");
        String sExpected = "Il est 15h30min0s";
        assertTrue(sExpected.equals(h2.donnerHeure()));
    }
}