/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miage.Finance;

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
public class TauxConversionTest {
    
    public TauxConversionTest() {
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
     * Test of getNomTaux method, of class TauxConversion.
     */
    @Test
    public void testGetNomTaux() {
        System.out.println("getNomTaux");
        TauxConversion instance = null;
        String expResult = "";
        String result = instance.getNomTaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNomTaux method, of class TauxConversion.
     */
    @Test
    public void testSetNomTaux() {
        System.out.println("setNomTaux");
        String nomTaux = "";
        TauxConversion instance = null;
        instance.setNomTaux(nomTaux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTaux method, of class TauxConversion.
     */
    @Test
    public void testGetTaux() {
        System.out.println("getTaux");
        TauxConversion instance = null;
        Float expResult = null;
        Float result = instance.getTaux();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaux method, of class TauxConversion.
     */
    @Test
    public void testSetTaux() {
        System.out.println("setTaux");
        Float taux = null;
        TauxConversion instance = null;
        instance.setTaux(taux);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDate method, of class TauxConversion.
     */
    @Test
    public void testGetDate() {
        System.out.println("getDate");
        TauxConversion instance = null;
        Date expResult = null;
        Date result = instance.getDate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDate method, of class TauxConversion.
     */
    @Test
    public void testSetDate() {
        System.out.println("setDate");
        Date date = null;
        TauxConversion instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseEntree method, of class TauxConversion.
     */
    @Test
    public void testGetDeviseEntree() {
        System.out.println("getDeviseEntree");
        TauxConversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseEntree();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseEntree method, of class TauxConversion.
     */
    @Test
    public void testSetDeviseEntree() {
        System.out.println("setDeviseEntree");
        Devise deviseEntree = null;
        TauxConversion instance = null;
        instance.setDeviseEntree(deviseEntree);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseSortie method, of class TauxConversion.
     */
    @Test
    public void testGetDeviseSortie() {
        System.out.println("getDeviseSortie");
        TauxConversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseSortie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseSortie method, of class TauxConversion.
     */
    @Test
    public void testSetDeviseSortie() {
        System.out.println("setDeviseSortie");
        Devise deviseSortie = null;
        TauxConversion instance = null;
        instance.setDeviseSortie(deviseSortie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertir method, of class TauxConversion.
     */
    @Test
    public void testConvertir() {
        System.out.println("convertir");
        TauxConversion instance = null;
        Devise expResult = null;
        Devise result = instance.convertir();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}