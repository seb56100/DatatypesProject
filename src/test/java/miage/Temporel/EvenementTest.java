/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Temporel;

import java.util.Date;
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
public class EvenementTest {
    
    public EvenementTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNom method, of class Evenement.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class Evenement.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        Evenement instance = new Evenement();
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLieu method, of class Evenement.
     */
    @Test
    public void testGetLieu() {
        System.out.println("getLieu");
        Evenement instance = new Evenement();
        String expResult = "";
        String result = instance.getLieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMyIntervalle method, of class Evenement.
     */
    @Test
    public void testGetMyIntervalle() {
        System.out.println("getMyIntervalle");
        Evenement instance = new Evenement();
        Intervalle expResult = null;
        Intervalle result = instance.getMyIntervalle();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Evenement.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "";
        Evenement instance = new Evenement();
        instance.setNom(nom);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class Evenement.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        Evenement instance = new Evenement();
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLieu method, of class Evenement.
     */
    @Test
    public void testSetLieu() {
        System.out.println("setLieu");
        String lieu = "";
        Evenement instance = new Evenement();
        instance.setLieu(lieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMyIntervalle method, of class Evenement.
     */
    @Test
    public void testSetMyIntervalle() {
        System.out.println("setMyIntervalle");
        Intervalle myIntervalle = null;
        Evenement instance = new Evenement();
        instance.setMyIntervalle(myIntervalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}