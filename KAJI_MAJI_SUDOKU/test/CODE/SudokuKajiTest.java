/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package CODE;

import CONJUNTO.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**CLASE ENCARGADA DE CREAR EL OBJETO SUDOKU AL RECIBIR UNA MATRIZ PARA 
 * PODER RESOLVERLA A TRAVES DE SU METODO RECURSIVO Y SUS AUXILIARES */
public class SudokuKajiTest {
    
    int [][] sudo =new int[][] { 
                   {0,0,2,6,0,4,0,9,3},
                   {0,6,0,0,2,0,4,0,0},
                   {5,0,4,0,0,7,0,0,0},
                   {2,0,3,0,0,0,0,0,0},
                   {0,0,8,0,0,0,6,0,0},
                   {0,0,0,0,0,0,1,0,8},
                   {0,0,0,3,0,0,7,0,5},
                   {0,0,7,0,4,0,0,2,0},
                   {8,2,0,9,0,6,3,0,0}     };
    
    int [][] sudoResuelto =new int[][] {
                    {7,8,2,6,1,4,5,9,3}, 
                    {3,6,1,5,2,9,4,8,7},
                    {5,9,4,8,3,7,2,1,6},
                    {2,1,3,7,6,8,9,5,4},
                    {9,7,8,4,5,1,6,3,2},
                    {4,5,6,2,9,3,1,7,8},
                    {1,4,9,3,8,2,7,6,5}, 
                    {6,3,7,1,4,5,8,2,9}, 
                    {8,2,5,9,7,6,3,4,1} };
                                            
   
    
    public SudokuKajiTest() {
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
     * PRUEBA DEL METODO 'ESTA_LLENO', DE LA CLAE 'SUDOKU_KAJI'
     * VERIFICA QUE UNA MATRIZ QUE TIENE CEROS NO ESTA LLENA
     * Y QUE UNA MATRIZ QUE NO TIENE CEROS ESTÁ LLENA
     */
    @Test
    public void testEstaLleno() {
        System.out.println("estaLleno");
        SudokuKaji instance = new SudokuKaji(sudo);
        boolean result = instance.estaLleno();
        assertEquals(false, result);
        
        SudokuKaji instance2 = new SudokuKaji(sudoResuelto);
        result = instance2.estaLleno();
        assertEquals(true, result);
    }

    /**
     * PRUEBA DEL METODO 'NUMEROS_POSIBLES', DE LA CLAE 'SUDOKU_KAJI'
     * VERIFICA QUE EL CONJUNTO DE NUMEROS POSIBLES CREADO POR EL METODO 
     * CONTENGA LOS MISMOS ELEMENTOS QUE EL CONJUNTO DADO
     */
    @Test
    public void testNumerosPosibles() {
        System.out.println("numerosPosibles");
        int i = 0;
        int j = 0;
        SudokuKaji instance = new SudokuKaji(sudo);
        
        
        ConjuntoADT<Integer> ideal = new ConjuntoA();
        ideal.agrega(1);
        ideal.agrega(3);
        ideal.agrega(5);
        ideal.agrega(7);
        ideal.agrega(8);
        
        ConjuntoADT<Integer> posibles = instance.numerosPosibles(i, j);
    
        boolean expResult;
        if( (posibles.diferencia(ideal)).getCardinalidad() == 0 )
            expResult = true;
        else 
            expResult = false;
        
        assertEquals(expResult, true);
        
    }

    /**
     * PRUEBA DEL METODO 'RESUELVE', DE LA CLAE 'SUDOKU_KAJI'
     * VERIFICA QUE LA MATRIZ RESULTANTE DESPUES DE APLICAR EL METODO 
     * SEA LA MISMA QUE LA MATRIZ DADA, LA CUAL ES SOLUCION DEL SUDOKU
     */
    @Test
    public void testResuelve() {
        System.out.println("resuelve");
        SudokuKaji instance = new SudokuKaji(sudo);
        instance.resuelve();
        int [][] result = instance.getTablero();
        int[][] expResult = sudoResuelto;
        Assert.assertArrayEquals(expResult, result);
    }

}
