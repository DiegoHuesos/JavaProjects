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
 * @author Alvaro Romo
 */
public class ResuelveExpresionTest {
    
    public ResuelveExpresionTest() {
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
     * Test of ejecutaOperaciones method, of class ResuelveExpresion.
     */
    @Test
    public void testEjecutaOperaciones() {
        System.out.println("ejecutaOperaciones");
        ArrayList<Object> lista = ConvierteAPostFija.convierteAPostFija("(6+1)x3+(2+2)");
        ArrayList<Object> listaPosFijo = lista;
        double expResult = 25.0;
        double result = ResuelveExpresion.ejecutaOperaciones(listaPosFijo);
        
        assertEquals(expResult, result, 0.0);
        
        
    }
    
}
