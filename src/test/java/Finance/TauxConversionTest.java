/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Finance;

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
    
    private Devise deviseIn;
    private Devise deviseOut;
    private TauxConversion tauxC;
    
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
        deviseIn = new Devise("Euro", "France");
        deviseOut = new Devise("Dollar", "USA");
        
        tauxC = new TauxConversion("Euro - Dollar", (float) 1.3057, "20/04/2013", deviseIn, deviseOut);
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
        float expResult = 0.0F;
        float result = instance.getTaux();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTaux method, of class TauxConversion.
     */
    @Test
    public void testSetTaux() {
        System.out.println("setTaux");
        float taux = 0.0F;
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
        String result = instance.getDate();
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
        String date = null;
        TauxConversion instance = null;
        instance.setDate(date);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseIn method, of class TauxConversion.
     */
    @Test
    public void testGetDeviseIn() {
        System.out.println("getDeviseIn");
        TauxConversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseIn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseIn method, of class TauxConversion.
     */
    @Test
    public void testSetDeviseIn() {
        System.out.println("setDeviseIn");
        Devise deviseIn = null;
        TauxConversion instance = null;
        instance.setDeviseIn(deviseIn);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDeviseOut method, of class TauxConversion.
     */
    @Test
    public void testGetDeviseOut() {
        System.out.println("getDeviseOut");
        TauxConversion instance = null;
        Devise expResult = null;
        Devise result = instance.getDeviseOut();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDeviseOut method, of class TauxConversion.
     */
    @Test
    public void testSetDeviseOut() {
        System.out.println("setDeviseOut");
        Devise deviseOut = null;
        TauxConversion instance = null;
        instance.setDeviseOut(deviseOut);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of convertirInOut method, of class TauxConversion.
     */
    @Test
    public void testConvertirInOut() {
        System.out.println("convertirInOut");
        float montant = (float) 1.0;
        float expResult = (float) 1.3057;
        float result = tauxC.convertirInOut(montant);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of convertirOutIn method, of class TauxConversion.
     */
    @Test
    public void testConvertirOutIn() {
        System.out.println("convertirOutIn");
        float montant = (float) 1.3057;
        float expResult = (float) 1;
        float result = tauxC.convertirOutIn(montant);
        assertEquals(expResult, result, 0.0);
    }
}