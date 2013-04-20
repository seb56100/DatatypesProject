/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Temporel;

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
    //  Evenement de test
    private Evenement myEvent;
    
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
        myEvent = new Evenement("Forum MIAGE", "15/11/2012", "Faculté des sciences", new Intervalle(new Heure(9,0), new Heure(13,0)));
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
        Evenement instance = null;
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
        Evenement instance = null;
        String expResult = null;
        String result = instance.getDate();
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
        Evenement instance = null;
        String expResult = "";
        String result = instance.getLieu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIntervalle method, of class Evenement.
     */
    @Test
    public void testGetIntervalle() {
        System.out.println("getIntervalle");
        Evenement instance = null;
        Intervalle expResult = null;
        Intervalle result = instance.getIntervalle();
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
        Evenement instance = null;
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
        String date = null;
        Evenement instance = null;
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
        Evenement instance = null;
        instance.setLieu(lieu);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIntervalle method, of class Evenement.
     */
    @Test
    public void testSetIntervalle() {
        System.out.println("setIntervalle");
        Intervalle myIntervalle = null;
        Evenement instance = null;
        instance.setIntervalle(myIntervalle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of détailsEvenements method, of class Evenement.
     */
    @Test
    public void testDetailsEvenements() {
        System.out.println("detailsEvenements");
        String sExpected = "L'événement 'Forum MIAGE'  se déroulera le 15/11/2012. Lieu : Faculté des sciences. Durée : 240 minutes.";
        assertTrue(sExpected.equals(myEvent.detailsEvenements()));
    }
}