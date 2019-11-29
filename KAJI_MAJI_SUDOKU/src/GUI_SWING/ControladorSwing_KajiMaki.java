
/**@author DANIELA COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package GUI_SWING;

//LIBRERIAS IMPORTADAS PARA PODER ESCUCHAR EVENTOS Y UTILIZAR METODOS DE OTRAS CLASES
import CODE.SudokuKaji;
import CONJUNTO.ConjuntoADT;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;
import java.awt.event.ActionEvent;


public class ControladorSwing_KajiMaki extends VistaSwing_KajiMaki{
    
    //VARIABLES DE LA CLASE CONTROLADOR_SWING 
    private static final long serialVersionUID = 1L;
    private JButton b;
    int [][] matrix;
	
    /**
     * SE CREA LA MATRIZ Y SE AÑADEN LAS 
     * ESCUCHAS A LOS BOTONES
     * 
     * @param title 
     */
    public ControladorSwing_KajiMaki (String title){
	super(title);
        matrix = new int[9][9];
        areaRes.setBackground(new Color(0,0,0,0));
        btnSolve.addActionListener(new Resuelve());
        btnClear.addActionListener(new Limpia());
	b_0_0.addActionListener(new SeleccionaBoton());
	b_0_1.addActionListener(new SeleccionaBoton());
	b_0_2.addActionListener(new SeleccionaBoton());
	b_0_3.addActionListener(new SeleccionaBoton());
	b_0_4.addActionListener(new SeleccionaBoton());
	b_0_5.addActionListener(new SeleccionaBoton());
	b_0_6.addActionListener(new SeleccionaBoton());
	b_0_7.addActionListener(new SeleccionaBoton());
	b_0_8.addActionListener(new SeleccionaBoton());
	b_1_0.addActionListener(new SeleccionaBoton());
	b_1_1.addActionListener(new SeleccionaBoton());
	b_1_2.addActionListener(new SeleccionaBoton());
	b_1_3.addActionListener(new SeleccionaBoton());
	b_1_4.addActionListener(new SeleccionaBoton());
	b_1_5.addActionListener(new SeleccionaBoton());
	b_1_6.addActionListener(new SeleccionaBoton());
	b_1_7.addActionListener(new SeleccionaBoton());
	b_1_8.addActionListener(new SeleccionaBoton());
	b_2_0.addActionListener(new SeleccionaBoton());
	b_2_1.addActionListener(new SeleccionaBoton());
	b_2_2.addActionListener(new SeleccionaBoton());
	b_2_3.addActionListener(new SeleccionaBoton());
	b_2_4.addActionListener(new SeleccionaBoton());
	b_2_5.addActionListener(new SeleccionaBoton());
	b_2_6.addActionListener(new SeleccionaBoton());
	b_2_7.addActionListener(new SeleccionaBoton());
	b_2_8.addActionListener(new SeleccionaBoton());
	b_3_0.addActionListener(new SeleccionaBoton());
	b_3_1.addActionListener(new SeleccionaBoton());
	b_3_2.addActionListener(new SeleccionaBoton());
	b_3_3.addActionListener(new SeleccionaBoton());
	b_3_4.addActionListener(new SeleccionaBoton());
	b_3_5.addActionListener(new SeleccionaBoton());
	b_3_6.addActionListener(new SeleccionaBoton());
	b_3_7.addActionListener(new SeleccionaBoton());
	b_3_8.addActionListener(new SeleccionaBoton());
	b_4_0.addActionListener(new SeleccionaBoton());
	b_4_1.addActionListener(new SeleccionaBoton());
	b_4_2.addActionListener(new SeleccionaBoton());
	b_4_3.addActionListener(new SeleccionaBoton());
	b_4_4.addActionListener(new SeleccionaBoton());
	b_4_5.addActionListener(new SeleccionaBoton());
	b_4_6.addActionListener(new SeleccionaBoton());
	b_4_7.addActionListener(new SeleccionaBoton());
	b_4_8.addActionListener(new SeleccionaBoton());
	b_5_0.addActionListener(new SeleccionaBoton());
	b_5_1.addActionListener(new SeleccionaBoton());
	b_5_2.addActionListener(new SeleccionaBoton());
	b_5_3.addActionListener(new SeleccionaBoton());
	b_5_4.addActionListener(new SeleccionaBoton());
	b_5_5.addActionListener(new SeleccionaBoton());
	b_5_6.addActionListener(new SeleccionaBoton());
	b_5_7.addActionListener(new SeleccionaBoton());
	b_5_8.addActionListener(new SeleccionaBoton());
	b_6_0.addActionListener(new SeleccionaBoton());
	b_6_1.addActionListener(new SeleccionaBoton());
	b_6_2.addActionListener(new SeleccionaBoton());
	b_6_3.addActionListener(new SeleccionaBoton());
	b_6_4.addActionListener(new SeleccionaBoton());
	b_6_5.addActionListener(new SeleccionaBoton());
	b_6_6.addActionListener(new SeleccionaBoton());
	b_6_7.addActionListener(new SeleccionaBoton());
	b_6_8.addActionListener(new SeleccionaBoton());
	b_7_0.addActionListener(new SeleccionaBoton());
	b_7_1.addActionListener(new SeleccionaBoton());
	b_7_2.addActionListener(new SeleccionaBoton());
	b_7_3.addActionListener(new SeleccionaBoton());
	b_7_4.addActionListener(new SeleccionaBoton());
	b_7_5.addActionListener(new SeleccionaBoton());
	b_7_6.addActionListener(new SeleccionaBoton());
	b_7_7.addActionListener(new SeleccionaBoton());
	b_7_8.addActionListener(new SeleccionaBoton());
	b_8_0.addActionListener(new SeleccionaBoton());
	b_8_1.addActionListener(new SeleccionaBoton());
	b_8_2.addActionListener(new SeleccionaBoton());
	b_8_3.addActionListener(new SeleccionaBoton());
	b_8_4.addActionListener(new SeleccionaBoton());
	b_8_5.addActionListener(new SeleccionaBoton());
	b_8_6.addActionListener(new SeleccionaBoton());
	b_8_7.addActionListener(new SeleccionaBoton());
	b_8_8.addActionListener(new SeleccionaBoton());
		
	b_0_0.addKeyListener(new EscuchaTeclas());
	b_0_1.addKeyListener(new EscuchaTeclas());
	b_0_2.addKeyListener(new EscuchaTeclas());
	b_0_3.addKeyListener(new EscuchaTeclas());
	b_0_4.addKeyListener(new EscuchaTeclas());
	b_0_5.addKeyListener(new EscuchaTeclas());
        b_0_6.addKeyListener(new EscuchaTeclas());
	b_0_7.addKeyListener(new EscuchaTeclas());
	b_0_8.addKeyListener(new EscuchaTeclas());
	b_1_0.addKeyListener(new EscuchaTeclas());
	b_1_1.addKeyListener(new EscuchaTeclas());
	b_1_2.addKeyListener(new EscuchaTeclas());
	b_1_3.addKeyListener(new EscuchaTeclas());
	b_1_4.addKeyListener(new EscuchaTeclas());
	b_1_5.addKeyListener(new EscuchaTeclas());
	b_1_6.addKeyListener(new EscuchaTeclas());
	b_1_7.addKeyListener(new EscuchaTeclas());
	b_1_8.addKeyListener(new EscuchaTeclas());
	b_2_0.addKeyListener(new EscuchaTeclas());
	b_2_1.addKeyListener(new EscuchaTeclas());
	b_2_2.addKeyListener(new EscuchaTeclas());
	b_2_3.addKeyListener(new EscuchaTeclas());
	b_2_4.addKeyListener(new EscuchaTeclas());
	b_2_5.addKeyListener(new EscuchaTeclas());
	b_2_6.addKeyListener(new EscuchaTeclas());
	b_2_7.addKeyListener(new EscuchaTeclas());
	b_2_8.addKeyListener(new EscuchaTeclas());
	b_3_0.addKeyListener(new EscuchaTeclas());
	b_3_1.addKeyListener(new EscuchaTeclas());
	b_3_2.addKeyListener(new EscuchaTeclas());
	b_3_3.addKeyListener(new EscuchaTeclas());
	b_3_4.addKeyListener(new EscuchaTeclas());
	b_3_5.addKeyListener(new EscuchaTeclas());
	b_3_6.addKeyListener(new EscuchaTeclas());
	b_3_7.addKeyListener(new EscuchaTeclas());
	b_3_8.addKeyListener(new EscuchaTeclas());
	b_4_0.addKeyListener(new EscuchaTeclas());
	b_4_1.addKeyListener(new EscuchaTeclas());
	b_4_2.addKeyListener(new EscuchaTeclas());
	b_4_3.addKeyListener(new EscuchaTeclas());
	b_4_4.addKeyListener(new EscuchaTeclas());
	b_4_5.addKeyListener(new EscuchaTeclas());
	b_4_6.addKeyListener(new EscuchaTeclas());
	b_4_7.addKeyListener(new EscuchaTeclas());
	b_4_8.addKeyListener(new EscuchaTeclas());
	b_5_0.addKeyListener(new EscuchaTeclas());
	b_5_1.addKeyListener(new EscuchaTeclas());
	b_5_2.addKeyListener(new EscuchaTeclas());
	b_5_3.addKeyListener(new EscuchaTeclas());
	b_5_4.addKeyListener(new EscuchaTeclas());
	b_5_5.addKeyListener(new EscuchaTeclas());
	b_5_6.addKeyListener(new EscuchaTeclas());
	b_5_7.addKeyListener(new EscuchaTeclas());
	b_5_8.addKeyListener(new EscuchaTeclas());
	b_6_0.addKeyListener(new EscuchaTeclas());
	b_6_1.addKeyListener(new EscuchaTeclas());
	b_6_2.addKeyListener(new EscuchaTeclas());
	b_6_3.addKeyListener(new EscuchaTeclas());
	b_6_4.addKeyListener(new EscuchaTeclas());
	b_6_5.addKeyListener(new EscuchaTeclas());
	b_6_6.addKeyListener(new EscuchaTeclas());
	b_6_7.addKeyListener(new EscuchaTeclas());
	b_6_8.addKeyListener(new EscuchaTeclas());
	b_7_0.addKeyListener(new EscuchaTeclas());
	b_7_1.addKeyListener(new EscuchaTeclas());
	b_7_2.addKeyListener(new EscuchaTeclas());
	b_7_3.addKeyListener(new EscuchaTeclas());
	b_7_4.addKeyListener(new EscuchaTeclas());
	b_7_5.addKeyListener(new EscuchaTeclas());
	b_7_6.addKeyListener(new EscuchaTeclas());
	b_7_7.addKeyListener(new EscuchaTeclas());
	b_7_8.addKeyListener(new EscuchaTeclas());
	b_8_0.addKeyListener(new EscuchaTeclas());
	b_8_1.addKeyListener(new EscuchaTeclas());
	b_8_2.addKeyListener(new EscuchaTeclas());
	b_8_3.addKeyListener(new EscuchaTeclas());
	b_8_4.addKeyListener(new EscuchaTeclas());
	b_8_5.addKeyListener(new EscuchaTeclas());
	b_8_6.addKeyListener(new EscuchaTeclas());
	b_8_7.addKeyListener(new EscuchaTeclas());
	b_8_8.addKeyListener(new EscuchaTeclas());
    }
    
    /**
     * "CLASE SELECCION_BOTON"
     * ESCUCHA LA SELECCION DE UN BOTON
     * Y GUARDA EL BOTON SELECCIONADO
     * EN UNA VARIABLE DE BOTON ('B')
     */
    public class SeleccionaBoton implements ActionListener{
	public void actionPerformed(ActionEvent e) {
            b= (JButton) e.getSource() ;
	}
    }

    /**
     * ESCUCHA LA SELECCION DEL BOTON SOLVE
     * Y LLAMA AL METODO SOLVE() PARA QUE OBTENGA
     * LOS VALORES DE LA INTERFAZ GRAFICA, RESUELVA 
     * LA MATRIZ Y COLOQUE LOS RESULTADOS EN LA INTERFAZ
     */
    public class Resuelve implements ActionListener{
	public void actionPerformed(ActionEvent e) {
            solve();	
	}
    }
    
    /**
     * ESCUCHA LA PRESION DE LAS TECLAS,
     * OBTIENE EL CODIGO DE LA TECLA, PARA 
     * REACCCIONAR SOLO CON LOS DIGITOS Y LA
     * TECLA BORRAR
     */
    public class EscuchaTeclas implements KeyListener{
        @Override
        public void keyPressed(KeyEvent e) {
            switch(e.getKeyCode()){
                case KeyEvent.VK_1 :
                    setValor(1);
                    break;
				
                case KeyEvent.VK_2 :
                    setValor(2);
                    break;
				
                case KeyEvent.VK_3 :
                    setValor(3);
                    break;
				
                case KeyEvent.VK_4:
                    setValor(4);
                    break;
				
                case KeyEvent.VK_5 :
                    setValor(5);
                    break;
				
                case KeyEvent.VK_6 :
                    setValor(6);
                    break;
				
                case KeyEvent.VK_7 :
                    setValor(7);
                    break;
				
                case KeyEvent.VK_8 :
                    setValor(8);
                    break;
				
                case KeyEvent.VK_9 :
                    setValor(9);
                    break;
                    
                case 8:
                    b.setText(" ");
                    areaRes.setText(" ");
                    break;
            }	
        }

        /**
         * "METODO AUXILIAR 'SET_VALOR' PARA EL METODO 'KEY_PRESSED' "
         * VERIFICA EL QUE EL NUMERO DE LA TECLA PRESIONADA 
         * NO ESTÉ EN EL CONJUNTO PARA AÑADIRLO O EN SU 
         * DEFECTO, MOSTRAR UN MENSAJE.
         * @param val 
         */
        private void setValor(int val){
            try{ 
                jalaNumAMatriz();
                numRepetido(val);  
                b.setText(""+val);
                areaRes.setText(" ");
            }
            catch(Exception ete){
            areaRes.setText("Ya está ese número.");
            }
        }
        
        /**
         * "METODO AUXILIAR 'NUM_REPETIDO' PARA EL METODO 'SET_VALOR' "
         * OBTIENE LA POSICION DEL BOTON SELECCIONADO Y VERIFICA QUE EL 
         * NUMERO DADO POR EL PARAMETRO NO SE ENCUENTRE EN EL CONJUNTO,
         * EN SU DEFECTO, LANZA UN ERROR.
         * @param n 
         */
        private void numRepetido(int n){
            int i = Integer.parseInt( ""+b.getName().charAt(2) );
            int j = Integer.parseInt( ""+b.getName().charAt(4) );
            SudokuKaji su = new SudokuKaji(matrix);
            ConjuntoADT<Integer> posibles = su.numerosPosibles(i,j);
            if(!posibles.contiene(n))
                throw new RuntimeException("Error: número repetido.");
        }
        
        @Override
        public void keyTyped(KeyEvent e){}
	
        @Override
        public void keyReleased(KeyEvent e) {}
    }

    /**
     * "CLASE LIMPIA"
     * COLOCA EL TEXTO DE TODOS LOS BOTONES/CASILLAS
     * DE LA INTERFAZ GRÁFICA EN VACIO " "
     */
    public class Limpia implements ActionListener{
		
	public void actionPerformed(ActionEvent e) {
			
            areaRes.setText(" ");
        
                b_0_0.setText(" ");
                b_0_1.setText(" ");
                b_0_2.setText(" ");
                b_0_3.setText(" ");
                b_0_4.setText(" ");
                b_0_5.setText(" ");
                b_0_6.setText(" ");
                b_0_7.setText(" ");
                b_0_8.setText(" ");
                b_1_0.setText(" ");
                b_1_1.setText(" ");
                b_1_2.setText(" ");
                b_1_3.setText(" ");
                b_1_4.setText(" ");
                b_1_5.setText(" ");
                b_1_6.setText(" ");
                b_1_7.setText(" ");
                b_1_8.setText(" ");
                b_2_0.setText(" ");
                b_2_1.setText(" ");
                b_2_2.setText(" ");
                b_2_3.setText(" ");
                b_2_4.setText(" ");
                b_2_5.setText(" ");
                b_2_6.setText(" ");
                b_2_7.setText(" ");
                b_2_8.setText(" ");
                b_3_0.setText(" ");
                b_3_1.setText(" ");
                b_3_2.setText(" ");
                b_3_3.setText(" ");
                b_3_4.setText(" ");
                b_3_5.setText(" ");
                b_3_6.setText(" ");
                b_3_7.setText(" ");
                b_3_8.setText(" ");
                b_4_0.setText(" ");
                b_4_1.setText(" ");
                b_4_2.setText(" ");
                b_4_3.setText(" ");
                b_4_4.setText(" ");
                b_4_5.setText(" ");
                b_4_6.setText(" ");
                b_4_7.setText(" ");
                b_4_8.setText(" ");
                b_5_0.setText(" ");
                b_5_1.setText(" ");
                b_5_2.setText(" ");
                b_5_3.setText(" ");
                b_5_4.setText(" ");
                b_5_5.setText(" ");
                b_5_6.setText(" ");
                b_5_7.setText(" ");
                b_5_8.setText(" ");
                b_6_0.setText(" ");
                b_6_1.setText(" ");
                b_6_2.setText(" ");
                b_6_3.setText(" ");
                b_6_4.setText(" ");
                b_6_5.setText(" ");
                b_6_6.setText(" ");
                b_6_7.setText(" ");
                b_6_8.setText(" ");
                b_7_0.setText(" ");
                b_7_1.setText(" ");
                b_7_2.setText(" ");
                b_7_3.setText(" ");
                b_7_4.setText(" ");
                b_7_5.setText(" ");
                b_7_6.setText(" ");
                b_7_7.setText(" ");
                b_7_8.setText(" ");
                b_8_0.setText(" ");
                b_8_1.setText(" ");
                b_8_2.setText(" ");
                b_8_3.setText(" ");
                b_8_4.setText(" ");
                b_8_5.setText(" ");
                b_8_6.setText(" ");
                b_8_7.setText(" ");
                b_8_8.setText(" ");
    	
        }
    }
    
    /**
     * OBTIENE LOS VALORES DE LA INTERFAZ GRAFICA CON EL 
     * METODO 'JALA_NUM_A_MATRIZ()', CREA UN OBJETO DE LA 
     * CLASE SUDOKU_KAJI Y RESUELVE EL SUDOKU.
     * SI TARDA MAS DE 15 SEGUNDOS DETIENE EL PROCESO CON
     * UN ERROR Y MANDA UN MENSAJE A LA INTERFAZ. SI NO TIENE
     * SOLUCION MANDA UN MENSAJE EN LA INTERFAZ. SI SI TIENE 
     * SOLUCION, ENVIA U MENSAJE A PANTALLA Y ASIGNA EL RESULTADO 
     * A LAS CASILLAS DE LA INTERFAZ.
     */
    private void solve(){
        jalaNumAMatriz();
        SudokuKaji sudo = new SudokuKaji(matrix);
        try{ 
            sudo.resuelve(); //METODO DE LA CLASE SUDOKU_KAJI QUE RESUELVE LA MATRIZ
            if(!sudo.estaLleno())
                areaRes.setText("¡No tiene solución!");
            else{
                areaRes.setText("¡Solución exitosa!");
                b_0_0.setText(""+matrix[0][0]);
                b_0_1.setText(""+matrix[0][1]);
                b_0_2.setText(""+matrix[0][2]);
                b_0_3.setText(""+matrix[0][3]);
                b_0_4.setText(""+matrix[0][4]);
                b_0_5.setText(""+matrix[0][5]);
                b_0_6.setText(""+matrix[0][6]);
                b_0_7.setText(""+matrix[0][7]);
                b_0_8.setText(""+matrix[0][8]);
                b_1_0.setText(""+matrix[1][0]);
                b_1_1.setText(""+matrix[1][1]);
                b_1_2.setText(""+matrix[1][2]);
                b_1_3.setText(""+matrix[1][3]);
                b_1_4.setText(""+matrix[1][4]);
                b_1_5.setText(""+matrix[1][5]);
                b_1_6.setText(""+matrix[1][6]);
                b_1_7.setText(""+matrix[1][7]);
                b_1_8.setText(""+matrix[1][8]);
                b_2_0.setText(""+matrix[2][0]);
                b_2_1.setText(""+matrix[2][1]);
                b_2_2.setText(""+matrix[2][2]);
                b_2_3.setText(""+matrix[2][3]);
                b_2_4.setText(""+matrix[2][4]);
                b_2_5.setText(""+matrix[2][5]);
                b_2_6.setText(""+matrix[2][6]);
                b_2_7.setText(""+matrix[2][7]);
                b_2_8.setText(""+matrix[2][8]);
                b_3_0.setText(""+matrix[3][0]);
                b_3_1.setText(""+matrix[3][1]);
                b_3_2.setText(""+matrix[3][2]);
                b_3_3.setText(""+matrix[3][3]);
                b_3_4.setText(""+matrix[3][4]);
                b_3_5.setText(""+matrix[3][5]);
                b_3_6.setText(""+matrix[3][6]);
                b_3_7.setText(""+matrix[3][7]);
                b_3_8.setText(""+matrix[3][8]);
                b_4_0.setText(""+matrix[4][0]);
                b_4_1.setText(""+matrix[4][1]);
                b_4_2.setText(""+matrix[4][2]);
                b_4_3.setText(""+matrix[4][3]);
                b_4_4.setText(""+matrix[4][4]);
                b_4_5.setText(""+matrix[4][5]);
                b_4_6.setText(""+matrix[4][6]);
                b_4_7.setText(""+matrix[4][7]);
                b_4_8.setText(""+matrix[4][8]);
                b_5_0.setText(""+matrix[5][0]);
                b_5_1.setText(""+matrix[5][1]);
                b_5_2.setText(""+matrix[5][2]);
                b_5_3.setText(""+matrix[5][3]);
                b_5_4.setText(""+matrix[5][4]);
                b_5_5.setText(""+matrix[5][5]);
                b_5_6.setText(""+matrix[5][6]);
                b_5_7.setText(""+matrix[5][7]);
                b_5_8.setText(""+matrix[5][8]);
                b_6_0.setText(""+matrix[6][0]);
                b_6_1.setText(""+matrix[6][1]);
                b_6_2.setText(""+matrix[6][2]);
                b_6_3.setText(""+matrix[6][3]);
                b_6_4.setText(""+matrix[6][4]);
                b_6_5.setText(""+matrix[6][5]);
                b_6_6.setText(""+matrix[6][6]);
                b_6_7.setText(""+matrix[6][7]);
                b_6_8.setText(""+matrix[6][8]);
                b_7_0.setText(""+matrix[7][0]);
                b_7_1.setText(""+matrix[7][1]);
                b_7_2.setText(""+matrix[7][2]);
                b_7_3.setText(""+matrix[7][3]);
                b_7_4.setText(""+matrix[7][4]);
                b_7_5.setText(""+matrix[7][5]);
                b_7_6.setText(""+matrix[7][6]);
                b_7_7.setText(""+matrix[7][7]);
                b_7_8.setText(""+matrix[7][8]);
                b_8_0.setText(""+matrix[8][0]);
                b_8_1.setText(""+matrix[8][1]);
                b_8_2.setText(""+matrix[8][2]);
                b_8_3.setText(""+matrix[8][3]);
                b_8_4.setText(""+matrix[8][4]);
                b_8_5.setText(""+matrix[8][5]);
                b_8_6.setText(""+matrix[8][6]);
                b_8_7.setText(""+matrix[8][7]);
                b_8_8.setText(""+matrix[8][8]);
            }
        }catch(Exception e){
            areaRes.setText("Exceso de tiempo o memoria"); 
        }
        
        
    }
    
    /**
     * "METODO AUXILIAR 'TO_INT' PARA EL METODO 'JALA_NUM_A_MATRIZ' "
     * @param b
     * @return valor entero de la casilla
     * OBTIENE EL VALOR DEL BOTON DADO COMO PARAMETRO Y LO REGRESA
     * COMO ENTERO
     */
    private int toInt(JButton b){
        if(b.getText().equals(" ") || b.getText().equals(""))
            return 0;
        else
            return Integer.parseInt(b.getText());
    }
    
    /**
     * ASIGNA TODOS LOS VALORES DE LOS BOTONES A LAS CASILLAS CORRESPONDIENTES
     */
    private void jalaNumAMatriz(){
            matrix[0][0] = toInt(b_0_0);
            matrix[0][1] = toInt(b_0_1);
            matrix[0][2] = toInt(b_0_2);
            matrix[0][3] = toInt(b_0_3);
            matrix[0][4] = toInt(b_0_4);
            matrix[0][5] = toInt(b_0_5);
            matrix[0][6] = toInt(b_0_6);
            matrix[0][7] = toInt(b_0_7);
            matrix[0][8] = toInt(b_0_8);
            matrix[1][0] = toInt(b_1_0);
            matrix[1][1] = toInt(b_1_1);
            matrix[1][2] = toInt(b_1_2);
            matrix[1][3] = toInt(b_1_3);
            matrix[1][4] = toInt(b_1_4);
            matrix[1][5] = toInt(b_1_5);
            matrix[1][6] = toInt(b_1_6);
            matrix[1][7] = toInt(b_1_7);
            matrix[1][8] = toInt(b_1_8);
            matrix[2][0] = toInt(b_2_0);
            matrix[2][1] = toInt(b_2_1);
            matrix[2][2] = toInt(b_2_2);
            matrix[2][3] = toInt(b_2_3);
            matrix[2][4] = toInt(b_2_4);
            matrix[2][5] = toInt(b_2_5);
            matrix[2][6] = toInt(b_2_6);
            matrix[2][7] = toInt(b_2_7);
            matrix[2][8] = toInt(b_2_8);
            matrix[3][0] = toInt(b_3_0);
            matrix[3][1] = toInt(b_3_1);
            matrix[3][2] = toInt(b_3_2);
            matrix[3][3] = toInt(b_3_3);
            matrix[3][4] = toInt(b_3_4);
            matrix[3][5] = toInt(b_3_5);
            matrix[3][6] = toInt(b_3_6);
            matrix[3][7] = toInt(b_3_7);
            matrix[3][8] = toInt(b_3_8);
            matrix[4][0] = toInt(b_4_0);
            matrix[4][1] = toInt(b_4_1);
            matrix[4][2] = toInt(b_4_2);
            matrix[4][3] = toInt(b_4_3);
            matrix[4][4] = toInt(b_4_4);
            matrix[4][5] = toInt(b_4_5);
            matrix[4][6] = toInt(b_4_6);
            matrix[4][7] = toInt(b_4_7);
            matrix[4][8] = toInt(b_4_8);
            matrix[5][0] = toInt(b_5_0);
            matrix[5][1] = toInt(b_5_1);
            matrix[5][2] = toInt(b_5_2);
            matrix[5][3] = toInt(b_5_3);
            matrix[5][4] = toInt(b_5_4);
            matrix[5][5] = toInt(b_5_5);
            matrix[5][6] = toInt(b_5_6);
            matrix[5][7] = toInt(b_5_7);
            matrix[5][8] = toInt(b_5_8);
            matrix[6][0] = toInt(b_6_0);
            matrix[6][1] = toInt(b_6_1);
            matrix[6][2] = toInt(b_6_2);
            matrix[6][3] = toInt(b_6_3);
            matrix[6][4] = toInt(b_6_4);
            matrix[6][5] = toInt(b_6_5);
            matrix[6][6] = toInt(b_6_6);
            matrix[6][7] = toInt(b_6_7);
            matrix[6][8] = toInt(b_6_8);
            matrix[7][0] = toInt(b_7_0);
            matrix[7][1] = toInt(b_7_1);
            matrix[7][2] = toInt(b_7_2);
            matrix[7][3] = toInt(b_7_3);
            matrix[7][4] = toInt(b_7_4);
            matrix[7][5] = toInt(b_7_5);
            matrix[7][6] = toInt(b_7_6);
            matrix[7][7] = toInt(b_7_7);
            matrix[7][8] = toInt(b_7_8);
            matrix[8][0] = toInt(b_8_0);
            matrix[8][1] = toInt(b_8_1);
            matrix[8][2] = toInt(b_8_2);
            matrix[8][3] = toInt(b_8_3);
            matrix[8][4] = toInt(b_8_4);
            matrix[8][5] = toInt(b_8_5);
            matrix[8][6] = toInt(b_8_6);
            matrix[8][7] = toInt(b_8_7);
            matrix[8][8] = toInt(b_8_8); 
    }
  
    /**CLASE MAIN PARA REALIZAR TEST (PRUBEA) DE LA CLASE CONTROLADOR_SWING*/
    public static void main(String[] args){
        ControladorSwing_KajiMaki a = new ControladorSwing_KajiMaki("Test Controlador KajiMaki");    
    }
}
