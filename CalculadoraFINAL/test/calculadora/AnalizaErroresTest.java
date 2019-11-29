/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alvaro y Diego
 */
public class AnalizaErroresTest {
    
    public AnalizaErroresTest() {
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
     * Test of revisaOperadores method, of class AnalizaErrores.
     */
    @Test
    public void testRevisaOperadores() {
        System.out.println("revisaOperadores");
        String cadena = "3+3+3";
        boolean expResult = true;
        boolean result = AnalizaErrores.revisaOperadores(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    

    /**
     * Test of revisarParentesis method, of class AnalizaErrores.
     */
    @Test
    public void testRevisarParentesis() {
        System.out.println("revisarParentesis");
        String cadena = "(3+3)";
        boolean expResult = true;
        boolean result = AnalizaErrores.revisarParentesis(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of noDividirCero method, of class AnalizaErrores.
     */
    @Test
    public void testNoDividirCero() {
        System.out.println("noDividirCero");
        String cadena = "1/12";
        boolean expResult = true;
        boolean result = AnalizaErrores.noDividirCero(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of esOperadorOParentesis method, of class AnalizaErrores.
     */
    @Test
    public void testEsOperadorOParentesis() {
        System.out.println("esOperadorOParentesis");
        char c = '+';
        boolean expResult = true;
        boolean result = AnalizaErrores.esOperadorOParentesis(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of revisaPuntos method, of class AnalizaErrores.
     */
    @Test
    public void testRevisaPuntos() {
        System.out.println("revisaPuntos");
        String cadena = "3.4+4";
        boolean expResult = true;
        boolean result = AnalizaErrores.revisaPuntos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of revisaSignos method, of class AnalizaErrores.
     */
    @Test
    public void testRevisaSignos() {
        System.out.println("revisaSignos");
        String cadena = "3+3+6";
        boolean expResult = true;
        boolean result = AnalizaErrores.revisaSignos(cadena);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    

    

    

    /**
     * Test of analizaErrores method, of class AnalizaErrores.
     */
    @Test
    public void testAnalizaErrores() {
        System.out.println("analizaErrores");
        String cadena = "(3+3)*5÷2–3";
        AnalizaErrores.analizaErrores(cadena);
    }
    
    
}
