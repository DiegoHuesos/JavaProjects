
/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package CODE;


/**LIBRERIAS IMPORTADAS PARA PODER UTILIZAR CONJUNTOS Y SU ITERADOR*/
import CONJUNTO.*;
import java.util.Iterator;

//_______"CLASE SudokuKaji"_______

/**
 * ENCARGADA DE CREAR EL OBJETO SUDOKU AL RECIBIR UNA MATRIZ PARA 
 * PODER RESOLVERLA A TRAVES DE SU METODO RECURSIVO Y SUS AUXILIARES */
public class SudokuKaji {
    
    /**VARIABLES DE LA CLASE SUDOKU_KAJI : MATRIZ-TABLERO, CONJUNTO-NUMEROS */
    private int[][] tablero;
    private boolean lleno;
    private ConjuntoADT<Integer> numeros;
    private long start;
    private long end; // 15 seconds * 1000 ms/sec
        
   
    /**
     * ASIGNA LA MATRIZ PARAMETRO AL ATRIBUTO TABLERO
     * INSTANCIA EL CONJUNTO DE NUMEROS Y LE AGREGA LOS DIGITOS
     * @param matrix 
     */
    public SudokuKaji( int [][] matrix){
        
        tablero = matrix;
        //CONJUNTO DE NUMEROS QUE SE UTILIZARA PARA OBTENER LOS NUMEROS POSIBLES
        numeros = new ConjuntoA();
        numeros.agrega(1);
        numeros.agrega(2);
        numeros.agrega(3);
        numeros.agrega(4);
        numeros.agrega(5);
        numeros.agrega(6);
        numeros.agrega(7);
        numeros.agrega(8);
        numeros.agrega(9);
        
        start = System.currentTimeMillis();
        end = start + 15000;
    }
    
    /**
     * DICE SI EL TABLERO YA ESTA LLENO, ES DECIR, SI YA SE RESOLVIO
     * @return  <ul>
     *              <li> TRUE: SI YA ESTA LLENO
     *              <li> FALSE: SI NO ESTA LLENO
     *          </ul>
     */
    public boolean estaLleno(){
        int i=0;
        int j=0;
        
        while( i<9 && tablero[i][j]!=0  ){
            while( j<9 && tablero[i][j]!=0 )
                j++;
            if(j==9){
                j=0;
                i++;
            }
        }
        
        if(i==9)
            return true;
        else 
            return false;
    }  
    
    /**
     * RECIBE LA POSICION (I, J) DE LA CASILLA, CREA LOS CONJUNTOS DE SU
     * COLUMNA, FILA Y CUADRANTE; REALIZA UNA DIFERENCIA CON LOS DIGITOS
     * Y DA COMO RESULTADOS LOS NUMEROS POSIBLES PARA ESA CASILLA
     * @param i
     * @param j
     * @return CONJUNTO_NUMEROS_POSIBLES
     */
    public ConjuntoADT<Integer> numerosPosibles(int i, int j){ // i y j SON LA POSICION
        ConjuntoADT<Integer> verticales = new ConjuntoA();
        ConjuntoADT<Integer> horizontales = new ConjuntoA();
        ConjuntoADT<Integer> cuadrante = new ConjuntoA();
 
        //PARA GENERAR EL CONJUNTO DE LA COLUMNA Y DEL RENGLON DE LA CASILLA DADA:
        for(int k = 0; k < 9; k++){
            verticales.agrega(tablero[k][j]);
            horizontales.agrega(tablero[i][k]);
        }

        //PARA GENERAR EL CONJUNTO DEL CUADRANTE DE LA CASILLA DADA:
        if(i <=2){
            for(int k = 0; k < 3; k++){ // PRIMERA SECCION: PRIMEROS 3 CUADRANTES DE ARRIBA
                if(j <=2){
                    for(int l = 0; l < 3; l++)
                        cuadrante.agrega(tablero[k][l]);
                }
                else{
                    if(j <= 5){
                        for(int l = 3; l < 6; l++)
                            cuadrante.agrega(tablero[k][l]);
                    }
                    else
                        for(int l = 6; l < 9; l++)
                            cuadrante.agrega(tablero[k][l]);
                }   
            }
        }
        else{
            if(i <= 5){ // SEGUNDA SECCION: 3 CUADRANTES DE EN MEDIO
                for(int k = 3; k < 6; k++){
                    if(j <=2){
                        for(int l = 0; l < 3; l++)
                            cuadrante.agrega(tablero[k][l]);
                    }
                    else{
                        if(j <= 5){
                            for(int l = 3; l < 6; l++)
                                cuadrante.agrega(tablero[k][l]);
                        }
                        else
                            for(int l = 6; l < 9; l++)
                                cuadrante.agrega(tablero[k][l]);
                    }
                }
            }
            else { // TERCERA SECCION: 3 CUADRANTES DE ABAJO.
                for(int k = 6; k < 9; k++){
                    if(j <=2){
                        for(int l = 0; l < 3; l++)
                            cuadrante.agrega(tablero[k][l]);
                    }
                    else{
                        if(j <= 5){
                            for(int l = 3; l < 6; l++)
                                cuadrante.agrega(tablero[k][l]);
                        }
                        else
                            for(int l = 6; l < 9; l++)
                                cuadrante.agrega(tablero[k][l]);
                    }
                }
                
            }
        
        }
        //UNION DE LOS TRES CONJUNTOS
        ConjuntoADT<Integer> union = verticales.union(horizontales).union(cuadrante); 
        //DIFERENCIA DE LA UNION ANTERIOR CON LOS DIGITOS PARA OBTENER LOS NUMEROS POSIBLES
        ConjuntoADT<Integer> res = numeros.diferencia(union); 
        
        return res;   
    }
    
    /**
     * BUSCA LA SIGUINETE POSICION DE LA CASILLA
     * QUE SE ENCUENTRA CON UN VALOR IGUAL A CERO
     * 
     * @return ARR[2] DE ENTEROS CON LA POSICION {I,J}
     */
    private int[] posicionVacia(){
        int[] pos = new int[2];
        int i=0;
        int j=0;
        while( i<9 && tablero[i][j]!=0  ){
            while( j<9 && tablero[i][j]!=0 )
                j++;
            if(j==9){
                j=0;
                i++;
            }
        }
        if(i!=9){
            pos[0] = i;
            pos[1] = j;
        }
        return pos;
    }
    
    /**
     * SOLUCIONA EL SUDOKU SOBRE LA MATRIZ TABLERO
     */
    public void resuelve(){
        
        lleno = estaLleno();
        
        int[] pos= posicionVacia();
        
        //ESTADO BASE: PREGUNTA SI LA MATRIZ YA ESTA LLENA O SI EL TIEMPO QUE LLEVA PROCESANDOSE ES MAYOR A 15 MIN PARA DETENER LA RECURSIVIDAD
        if( lleno || System.currentTimeMillis() >= end )
            if(lleno)
                System.out.println("Se resolvió con éxito!\n"+this.toString());  
            else
                if(System.currentTimeMillis() >= end){
                    System.out.println("Sudoku dificil: exceso de tiempo (15 seg) de procesamiento.");
                    throw new RuntimeException("Demasiado tiempo");
                }else
                    System.out.println("No tiene solucion");
 
        else {
            
            //OBTENER EL CONJUNTO CON LOS NUMEROS POSIBLES PARA DICHA POSICION
            ConjuntoADT<Integer> posibles = numerosPosibles(pos[0],pos[1]); 
            
            Iterator<Integer> it = posibles.iterator();
            
            while(it.hasNext() && !lleno){
                tablero[pos[0]][pos[1]] = it.next(); // PROBAR CON ESTE NUMERO EN LA POSICION VACIA
                resuelve();
                                    
            }
            if( !lleno )
                tablero[pos[0]][pos[1]] = 0; //ASIGNAR UN CERO SI NO HAY MAS NUMEROS POSIBLES
 
        }
         
    }
    
    /**
     * REGRESA LA MATRIZ (TABLERO) DEL SUDOKU
     * @return TABLERO (INT [][])
     */
    public int[][] getTablero(){
            return this.tablero;
    }
   
    /**
     * REGRESA LA MATRIZ EN FORMA DE STRING
     * SIRVIO Y SIRVE PARA VERIFICAR LOS RESULTADOS DE LAS PRUEBAS
     * 
     * @return MATRIZ_CADENA 
     */    
    public String toString(){
        StringBuilder cad = new StringBuilder();
        for(int i = 0; i < 9 ; i++){
            for(int j = 0; j < 9; j++){
                cad.append(tablero[i][j]+" ");
            }
            cad.append("\n");
        }
        return cad.toString();
        
    }
    
    
    
    
    /**
     * "MAIN PARA REALIZAR LAS PRUEBAS DEL FUNCIONAMIENTO DE LA CLASE SUDOKU"
     * @param args 
     */
    public static void main (String [] args){
        
        // 1.- SUDOKU CON UNA UNICA SOLUCION                               
        int [][] conUnaSolucion =new int[][] { 
                   {0,0,2,6,0,4,0,9,3},
                   {0,6,0,0,2,0,4,0,0},
                   {5,0,4,0,0,7,0,0,0},
                   {2,0,3,0,0,0,0,0,0},
                   {0,0,8,0,0,0,6,0,0},
                   {0,0,0,0,0,0,1,0,8},
                   {0,0,0,3,0,0,7,0,5},
                   {0,0,7,0,4,0,0,2,0},
                   {8,2,0,9,0,6,3,0,0},     };
      
        // 2.- SUDOKU CON MULTIPLES SOLUCIONES
        int [][] multSoluciones =new int[][] {
                   {1,0,0,0,0,0,0,0,0},
                   {0,0,3,0,0,0,0,0,9},
                   {0,0,0,0,0,0,8,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,7,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},     };

        // 3.- SUDOKU SIN SOLUCION
        int [][] sinSolucion =new int[][] {
                   {1,2,3,4,5,6,7,8,0},
                   {0,0,0,0,0,0,0,0,9},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,0,0,0,0},     };
        
        // 4.- SUDOKU DISEÑADO PARA GENERAR STACK OVERFLOW
        int [][] eternaRecursividad =new int[][] {
                   {0,0,0,0,0,0,0,0,0},
                   {0,0,0,0,0,3,0,8,5},
                   {0,0,1,0,2,0,0,0,0},
                   {0,0,0,5,0,7,0,0,0},
                   {0,0,4,0,0,0,1,0,0},
                   {0,9,0,0,0,0,0,0,0},
                   {5,0,0,0,0,0,0,7,3},
                   {0,0,2,0,1,0,0,0,0},
                   {0,0,0,0,4,0,0,0,9},     };
                                           
        SudokuKaji pUnaSol = new SudokuKaji(conUnaSolucion);
        SudokuKaji pMultSol = new SudokuKaji(multSoluciones);
        SudokuKaji pSinSol = new SudokuKaji(sinSolucion);
        SudokuKaji pEternaRec = new SudokuKaji(eternaRecursividad);
      
        System.out.print("1.- ");
        pUnaSol.resuelve();
        
        System.out.print("2.- ");
        pMultSol.resuelve();
        
        System.out.print("3.- ");
        pSinSol.resuelve();
        System.out.println("Tiene solucion: "+pSinSol.estaLleno()+"\n");
        
        System.out.print("4.- ");
        try{
            pEternaRec.resuelve();
        }catch(Exception ea){}
      
    }
}
    

