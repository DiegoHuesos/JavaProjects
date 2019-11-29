/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author huesos
 */
public class ConvierteAPostFijaTest {
    
    public ConvierteAPostFijaTest() {
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
     * Test of convierteAPostFija method, of class ConvierteAPostFija.
     */
    @Test
    public void testConvierteAPostFija() {
        System.out.println("convierteAPostFija");
        String cadena = "3+2x3";
        ArrayList<Object> lista = new ArrayList();
        lista.add("3");
        lista.add("2");
        lista.add("3");
        lista.add((Character)'x');
        lista.add((Character)'+');
        
        boolean expResult = true;
        String res;
        res = lista.toString();
        
        boolean result = ConvierteAPostFija.convierteAPostFija(cadena).toString().equals(res);
        
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of strToArrayList method, of class ConvierteAPostFija.
     */
    @Test
    public void testStrToArrayList() {
        System.out.println("strToArrayList");
        String cadena = "32.5+5+(5+4)–5";
        ArrayList<Object> lista = new ArrayList();
        lista.add("32.5");
        lista.add('+');
        lista.add("5");
        lista.add('+');
        lista.add('('); lista.add("5");
        lista.add('+'); lista.add("4"); lista.add(')'); lista.add('–'); lista.add("5");
        
        ArrayList expResult = lista;
        ArrayList result = ConvierteAPostFija.strToArrayList(cadena);
        
        assertEquals(expResult, result);
        
        
    }

    /**
     * Test of creaPostFija method, of class ConvierteAPostFija.
     */
    @Test
    public void testCreaPostFija() {
        System.out.println("creaPostFija");
        ArrayList<Object> entrada = new ArrayList();
        entrada.add("5"); entrada.add('x'); entrada.add("6");
        
        ArrayList<Object> expResult = new ArrayList();
        expResult.add("5");expResult.add("6"); expResult.add('x');
        
        ArrayList<Object> result = ConvierteAPostFija.creaPostFija(entrada);
        assertEquals(expResult, result);
        
    }
    
}
