
/**@author DANI COELLO, DIEGO MERODIO, ALVARO ROMO, DIEGO HERNANDEZ
 * MAESTRA: SILVIA GUARDATI
 * FECHA DE ENTREGA: 09/04/2019
 * PROYECTO 2 DE ESTRUCTURAS DE DATOS: 
 * --------------"KAJI MAKI SUDOKU"-------------- */

package GUI_SWING;

/**LIBRERIAS IMPORTADAS PARA PODER CONSTRUIR LA INTERFAZ GRAFICA DE USUARIO */
import javax.swing.*;
import java.awt.*;


public class VistaSwing_KajiMaki extends JFrame {

	//ATRIBUTOS O ELEMENTOS DEL FRAME
	private static final long serialVersionUID = 1L;
	protected ImageIcon imgLupa;
	protected JButton help;
	protected JButton btnInfo;
	protected JButton btnClear;
	protected JButton btnSolve;
	protected JLabel lblTitle;
	protected JLabel lblFondo;
	protected JLabel areaRes;
	private JLabel lblSudoku;
	protected JButton   b_0_0 ,b_0_1 ,b_0_2 ,b_0_3 ,b_0_4 ,b_0_5 ,b_0_6 ,b_0_7 ,b_0_8 ,
                            b_1_0 ,b_1_1 ,b_1_2 ,b_1_3 ,b_1_4 ,b_1_5 ,b_1_6 ,b_1_7 ,b_1_8 ,
                            b_2_0 ,b_2_1 ,b_2_2 ,b_2_3 ,b_2_4 ,b_2_5 ,b_2_6 ,b_2_7 ,b_2_8 ,
                            b_3_0 ,b_3_1 ,b_3_2 ,b_3_3 ,b_3_4 ,b_3_5 ,b_3_6 ,b_3_7 ,b_3_8 ,
                            b_4_0 ,b_4_1 ,b_4_2 ,b_4_3 ,b_4_4 ,b_4_5 ,b_4_6 ,b_4_7 ,b_4_8 ,
                            b_5_0 ,b_5_1 ,b_5_2 ,b_5_3 ,b_5_4 ,b_5_5 ,b_5_6 ,b_5_7 ,b_5_8 ,
                            b_6_0 ,b_6_1 ,b_6_2 ,b_6_3 ,b_6_4 ,b_6_5 ,b_6_6 ,b_6_7 ,b_6_8 ,
                            b_7_0 ,b_7_1 ,b_7_2 ,b_7_3 ,b_7_4 ,b_7_5 ,b_7_6 ,b_7_7 ,b_7_8 ,
                            b_8_0 ,b_8_1 ,b_8_2 ,b_8_3 ,b_8_4 ,b_8_5 ,b_8_6 ,b_8_7 ,b_8_8;
	
	
	/**METODO QUE CONSTRYE LA VISTA DE LA APLICACION*/
	public VistaSwing_KajiMaki(String title){
		
                super(title);
		
		this.setBounds(180, 60, 930, 668);
		this.setResizable(false);
		this.setVisible(true);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		
		
		/**BUTTON: btnClear*/
		btnClear = new JButton("Limpiar");
		btnClear.setForeground(new Color(100, 149, 237));
		btnClear.setBounds(705, 390, 147, 56);
		btnClear.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		getContentPane().add(btnClear);
		
		/**BUTTON: btnSolve*/
		btnSolve = new JButton("Resolver");
		btnSolve.setForeground(new Color(100, 149, 237));
		btnSolve.setBounds(705, 185, 147, 56);
		btnSolve.setFont(new Font("Lucida Grande", Font.PLAIN, 19));
		getContentPane().add(btnSolve);
		
		/**LABEL: LBL_TITLE */
		lblTitle = new JLabel("Kaji Maki");
		lblTitle.setBounds(228, -12, 314, 99);
		lblTitle.setForeground(new Color(255, 140, 0));
		lblTitle.setFont(new Font("Dialog", Font.BOLD, 54));
		getContentPane().add(lblTitle);
		
		/**TEXT_AREA  AREA_RES */
		areaRes = new JLabel();
		areaRes.setFont(new Font("Lucida Grande", Font.BOLD, 26));
		areaRes.setForeground(Color.WHITE);
		areaRes.setBackground(new Color(0,0,0,0));
		areaRes.setText(" ");
		areaRes.setBounds(215, 586, 480, 41);
		getContentPane().add(areaRes);
		
		/**LABEL SUDOKU */
		lblSudoku = new JLabel("SUDOKU");
		lblSudoku.setFont(new Font("Lucida Grande", Font.BOLD, 38));
		lblSudoku.setForeground(new Color(70, 130, 180));
		lblSudoku.setBounds(678, 33, 214, 41);
		lblSudoku.setBackground(new Color(0,0,0,0));
		getContentPane().add(lblSudoku);
		
                /**INSTANCIA DE LOS BOTONES_CASILLAS*/
		b_0_0 = new JButton(" ");
		b_0_0.setBounds(0, 0, 56, 53);
		b_0_1 = new JButton(" ");
		b_0_1.setBounds(53, 0, 53, 53);
		b_0_2 = new JButton(" ");
		b_0_2.setBounds(106, 0, 53, 53);
		b_0_3 = new JButton(" ");
		b_0_3.setBounds(0, 0, 53, 53);
		b_0_4 = new JButton(" ");
		b_0_4.setBounds(53, 0, 53, 53);
		b_0_5 = new JButton(" ");
		b_0_5.setBounds(106, 0, 53, 53);
		b_0_6 = new JButton(" ");
		b_0_6.setBounds(0, 0, 53, 53);
		b_0_7 = new JButton(" ");
		b_0_7.setBounds(53, 0, 53, 53);
		b_0_8 = new JButton(" ");
		b_0_8.setBounds(106, 0, 53, 53);
		b_1_0 = new JButton(" ");
		b_1_0.setBounds(0, 53, 53, 53);
		b_1_1 = new JButton(" ");
		b_1_1.setBounds(53, 53, 53, 53);
		b_1_2 = new JButton(" ");
		b_1_2.setBounds(106, 53, 53, 53);
		b_1_3 = new JButton(" ");
		b_1_3.setBounds(0, 53, 53, 53);
		b_1_4 = new JButton(" ");
		b_1_4.setBounds(53, 53, 53, 53);
		b_1_5 = new JButton(" ");
		b_1_5.setBounds(106, 53, 53, 53);
		b_1_6 = new JButton(" ");
		b_1_6.setBounds(0, 53, 53, 53);
		b_1_7 = new JButton(" ");
		b_1_7.setBounds(53, 53, 53, 53);
		b_1_8 = new JButton(" ");
		b_1_8.setBounds(106, 53, 53, 53);
		b_2_0 = new JButton(" ");
		b_2_0.setBounds(0, 106, 53, 53);
		b_2_1 = new JButton(" ");
		b_2_1.setBounds(53, 106, 53, 53);
		b_2_2 = new JButton(" ");
		b_2_2.setBounds(106, 106, 53, 53);
		b_2_3 = new JButton(" ");
		b_2_3.setBounds(0, 106, 53, 53);
		b_2_4 = new JButton(" ");
		b_2_4.setBounds(53, 106, 53, 53);
		b_2_5 = new JButton(" ");
		b_2_5.setBounds(106, 106, 53, 53);
		b_2_6 = new JButton(" ");
		b_2_6.setBounds(0, 106, 53, 53);
		b_2_7 = new JButton(" ");
		b_2_7.setBounds(53, 106, 53, 53);
		b_2_8 = new JButton(" ");
		b_2_8.setBounds(106, 106, 53, 53);
		b_3_0 = new JButton(" ");
		b_3_0.setBounds(0, 0, 53, 53);
		b_3_1 = new JButton(" ");
		b_3_1.setBounds(53, 0, 53, 53);
		b_3_2 = new JButton(" ");
		b_3_2.setBounds(106, 0, 53, 53);
		b_3_3 = new JButton(" ");
		b_3_3.setBounds(0, 0, 53, 53);
		b_3_4 = new JButton(" ");
		b_3_4.setBounds(53, 0, 53, 53);
		b_3_5 = new JButton(" ");
		b_3_5.setBounds(106, 0, 53, 53);
		b_3_6 = new JButton(" ");
		b_3_6.setBounds(0, 0, 53, 53);
		b_3_7 = new JButton(" ");
		b_3_7.setBounds(53, 0, 53, 53);
		b_3_8 = new JButton(" ");
		b_3_8.setBounds(106, 0, 53, 53);
		b_4_0 = new JButton(" ");
		b_4_0.setBounds(0, 53, 53, 53);
		b_4_1 = new JButton(" ");
		b_4_1.setBounds(53, 53, 53, 53);
		b_4_2 = new JButton(" ");
		b_4_2.setBounds(106, 53, 53, 53);
		b_4_3 = new JButton(" ");
		b_4_3.setBounds(0, 53, 53, 53);
		b_4_4 = new JButton(" ");
		b_4_4.setBounds(53, 53, 53, 53);
		b_4_5 = new JButton(" ");
		b_4_5.setBounds(106, 53, 53, 53);
		b_4_6 = new JButton(" ");
		b_4_6.setBounds(0, 53, 53, 53);
		b_4_7 = new JButton(" ");
		b_4_7.setBounds(53, 53, 53, 53);
		b_4_8 = new JButton(" ");
		b_4_8.setBounds(106, 53, 53, 53);
		b_5_0 = new JButton(" ");
		b_5_0.setBounds(0, 106, 53, 53);
		b_5_1 = new JButton(" ");
		b_5_1.setBounds(53, 106, 53, 53);
		b_5_2 = new JButton(" ");
		b_5_2.setBounds(106, 106, 53, 53);
		b_5_3 = new JButton(" ");
		b_5_3.setBounds(0, 106, 53, 53);
		b_5_4 = new JButton(" ");
		b_5_4.setBounds(53, 106, 53, 53);
		b_5_5 = new JButton(" ");
		b_5_5.setBounds(106, 106, 53, 53);
		b_5_6 = new JButton(" ");
		b_5_6.setBounds(0, 106, 53, 53);
		b_5_7 = new JButton(" ");
		b_5_7.setBounds(53, 106, 53, 53);
		b_5_8 = new JButton(" ");
		b_5_8.setBounds(106, 106, 53, 53);
		b_6_0 = new JButton(" ");
		b_6_0.setBounds(0, 0, 53, 53);
		b_6_1 = new JButton(" ");
		b_6_1.setBounds(53, 0, 53, 53);
		b_6_2 = new JButton(" ");
		b_6_2.setBounds(106, 0, 53, 53);
		b_6_3 = new JButton(" ");
		b_6_3.setBounds(0, 0, 53, 53);
		b_6_4 = new JButton(" ");
		b_6_4.setBounds(53, 0, 53, 53);
		b_6_5 = new JButton(" ");
		b_6_5.setBounds(106, 0, 53, 53);
		b_6_6 = new JButton(" ");
		b_6_6.setBounds(0, 0, 53, 53);
		b_6_7 = new JButton(" ");
		b_6_7.setBounds(53, 0, 53, 53);
		b_6_8 = new JButton(" ");
		b_6_8.setBounds(106, 0, 53, 53);
		b_7_0 = new JButton(" ");
		b_7_0.setBounds(0, 53, 53, 53);
		b_7_1 = new JButton(" ");
		b_7_1.setBounds(53, 53, 53, 53);
		b_7_2 = new JButton(" ");
		b_7_2.setBounds(106, 53, 53, 53);
		b_7_3 = new JButton(" ");
		b_7_3.setBounds(0, 53, 53, 53);
		b_7_4 = new JButton(" ");
		b_7_4.setBounds(53, 53, 53, 53);
		b_7_5 = new JButton(" ");
		b_7_5.setBounds(106, 53, 53, 53);
		b_7_6 = new JButton(" ");
		b_7_6.setBounds(0, 53, 53, 53);
		b_7_7 = new JButton(" ");
		b_7_7.setBounds(53, 53, 53, 53);
		b_7_8 = new JButton(" ");
		b_7_8.setBounds(106, 53, 53, 53);
		b_8_0 = new JButton(" ");
		b_8_0.setBounds(0, 106, 53, 53);
		b_8_1 = new JButton(" ");
		b_8_1.setBounds(53, 106, 53, 53);
		b_8_2 = new JButton(" ");
		b_8_2.setBounds(106, 106, 53, 53);
		b_8_3 = new JButton(" ");
		b_8_3.setBounds(0, 106, 53, 53);
		b_8_4 = new JButton(" ");
		b_8_4.setBounds(53, 106, 53, 53);
		b_8_5 = new JButton(" ");
		b_8_5.setBounds(106, 106, 53, 53);
		b_8_6 = new JButton(" ");
		b_8_6.setBounds(0, 106, 53, 53);
		b_8_7 = new JButton(" ");
		b_8_7.setBounds(53, 106, 53, 53);
		b_8_8 = new JButton(" ");
		b_8_8.setBounds(106, 106, 53, 53);
		
		/**SE AGREGA UN PANEL-GRIDLAYOUT-PANEL-GRIDLAYOUT-BOTONS PARA EL SUDOKU */
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 127, 80));
		panel.setBounds(98, 85, 480, 480);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel00= new JPanel();
		panel00.setBounds(0, 0, 160, 160);
		panel00.setBackground(new Color(70, 130, 180));
		panel00.setForeground(new Color(0, 0, 0));
		panel.add(panel00);
		panel00.setLayout(null);
		panel00.add(b_0_0);
		panel00.add(b_0_1);
		panel00.add(b_0_2);
		panel00.add(b_1_0);
		panel00.add(b_1_1);
		panel00.add(b_1_2);
		panel00.add(b_2_0);
		panel00.add(b_2_1);
		panel00.add(b_2_2);
		
		JPanel panel01= new JPanel();
		panel01.setBounds(160, 0, 160, 160);
		panel01.setBackground(new Color(255, 140, 0));
		panel.add(panel01);
		panel01.setLayout(null);
		panel01.add(b_0_3);
		panel01.add(b_0_4);
		panel01.add(b_0_5);
		panel01.add(b_1_3);
		panel01.add(b_1_4);
		panel01.add(b_1_5);
		panel01.add(b_2_3);
		panel01.add(b_2_4);
		panel01.add(b_2_5);
		
		
		JPanel panel02= new JPanel();
		panel02.setBounds(320, 0, 160, 160);
		panel02.setBackground(new Color(70, 130, 180));
		panel.add(panel02);
		panel02.setLayout(null);
		panel02.add(b_0_6);
		panel02.add(b_0_7);
		panel02.add(b_0_8);
		panel02.add(b_1_6);
		panel02.add(b_1_7);
		panel02.add(b_1_8);
		panel02.add(b_2_6);
		panel02.add(b_2_7);
		panel02.add(b_2_8);
		
		JPanel panel10= new JPanel();
		panel10.setBounds(0, 160, 160, 160);
		panel10.setBackground(new Color(255, 140, 0));
		panel.add(panel10);
		panel10.setLayout(null);
		panel10.add(b_3_0);
		panel10.add(b_3_1);
		panel10.add(b_3_2);
		panel10.add(b_4_0);
		panel10.add(b_4_1);
		panel10.add(b_4_2);
		panel10.add(b_5_0);
		panel10.add(b_5_1);
		panel10.add(b_5_2);
		
		JPanel panel11= new JPanel();
		panel11.setBounds(160, 160, 160, 160);
		panel11.setBackground(new Color(70, 130, 180));
		panel.add(panel11);
		panel11.setLayout(null);
		panel11.add(b_3_3);
		panel11.add(b_3_4);
		panel11.add(b_3_5);
		panel11.add(b_4_3);
		panel11.add(b_4_4);
		panel11.add(b_4_5);
		panel11.add(b_5_3);
		panel11.add(b_5_4);
		panel11.add(b_5_5);
		
		JPanel panel12= new JPanel();
		panel12.setBounds(320, 160, 160, 160);
		panel12.setBackground(new Color(255, 140, 0));
		panel.add(panel12);
		panel12.setLayout(null);
		panel12.add(b_3_6);
		panel12.add(b_3_7);
		panel12.add(b_3_8);
		panel12.add(b_4_6);
		panel12.add(b_4_7);
		panel12.add(b_4_8);
		panel12.add(b_5_6);
		panel12.add(b_5_7);
		panel12.add(b_5_8);
		
		JPanel panel20= new JPanel();
		panel20.setBounds(0, 320, 160, 160);
		panel20.setBackground(new Color(70, 130, 180));
		panel.add(panel20);
		panel20.setLayout(null);
		panel20.add(b_6_0);
		panel20.add(b_6_1);
		panel20.add(b_6_2);
		panel20.add(b_7_0);
		panel20.add(b_7_1);
		panel20.add(b_7_2);
		panel20.add(b_8_0);
		panel20.add(b_8_1);
		panel20.add(b_8_2);
		
		JPanel panel21= new JPanel();
		panel21.setBounds(160, 320, 160, 160);
		panel21.setBackground(new Color(255, 165, 0));
		panel.add(panel21);
		panel21.setLayout(null);
		panel21.add(b_6_3);
		panel21.add(b_6_4);
		panel21.add(b_6_5);
		panel21.add(b_7_3);
		panel21.add(b_7_4);
		panel21.add(b_7_5);
		panel21.add(b_8_3);
		panel21.add(b_8_4);
		panel21.add(b_8_5);
		
		JPanel panel22= new JPanel();
		panel22.setBounds(320, 320, 160, 160);
		panel22.setBackground(new Color(70, 130, 180));
		panel.add(panel22);
		panel22.setLayout(null);
		panel22.add(b_6_6);
		panel22.add(b_6_7);
		panel22.add(b_6_8);
		panel22.add(b_7_6);
		panel22.add(b_7_7);
		panel22.add(b_7_8);
		panel22.add(b_8_6);
		panel22.add(b_8_7);
		panel22.add(b_8_8);
		
                
		/**IMAGEN DE FONDO: LBL_FONDO*/
		lblFondo = new JLabel("");
		lblFondo.setBounds(0, -12, 930, 668);
		getContentPane().add(lblFondo);
		//ImageIcon imgFondo= new ImageIcon("/Users/Huesos/Desktop/ToriiGate.jpg");
		ImageIcon imgFondo= new ImageIcon(this.getClass().getResource("/GUI_SWING/ToriiGate.jpg"));
		Icon icon= new ImageIcon(imgFondo.getImage().getScaledInstance(lblFondo.getWidth(), lblFondo.getHeight(), Image.SCALE_DEFAULT));
		lblFondo.setIcon(icon);
		
		this.repaint();
		
                //SE COLOCA EL NOMBRE DE LOS BOTONES PARA 
                //LOCALIZAR LA POSICION EN EL CONTROLADOR
                b_0_0.setName("b_0_0");
                b_0_1.setName("b_0_1");
                b_0_2.setName("b_0_2");
                b_0_3.setName("b_0_3");
                b_0_4.setName("b_0_4");
                b_0_5.setName("b_0_5");
                b_0_6.setName("b_0_6");
                b_0_7.setName("b_0_7");
                b_0_8.setName("b_0_8");
                b_1_0.setName("b_1_0");
                b_1_1.setName("b_1_1");
                b_1_2.setName("b_1_2");
                b_1_3.setName("b_1_3");
                b_1_4.setName("b_1_4");
                b_1_5.setName("b_1_5");
                b_1_6.setName("b_1_6");
                b_1_7.setName("b_1_7");
                b_1_8.setName("b_1_8");
                b_2_0.setName("b_2_0");
                b_2_1.setName("b_2_1");
                b_2_2.setName("b_2_2");
                b_2_3.setName("b_2_3");
                b_2_4.setName("b_2_4");
                b_2_5.setName("b_2_5");
                b_2_6.setName("b_2_6");
                b_2_7.setName("b_2_7");
                b_2_8.setName("b_2_8");
                b_3_0.setName("b_3_0");
                b_3_1.setName("b_3_1");
                b_3_2.setName("b_3_2");
                b_3_3.setName("b_3_3");
                b_3_4.setName("b_3_4");
                b_3_5.setName("b_3_5");
                b_3_6.setName("b_3_6");
                b_3_7.setName("b_3_7");
                b_3_8.setName("b_3_8");
                b_4_0.setName("b_4_0");
                b_4_1.setName("b_4_1");
                b_4_2.setName("b_4_2");
                b_4_3.setName("b_4_3");
                b_4_4.setName("b_4_4");
                b_4_5.setName("b_4_5");
                b_4_6.setName("b_4_6");
                b_4_7.setName("b_4_7");
                b_4_8.setName("b_4_8");
                b_5_0.setName("b_5_0");
                b_5_1.setName("b_5_1");
                b_5_2.setName("b_5_2");
                b_5_3.setName("b_5_3");
                b_5_4.setName("b_5_4");
                b_5_5.setName("b_5_5");
                b_5_6.setName("b_5_6");
                b_5_7.setName("b_5_7");
                b_5_8.setName("b_5_8");
                b_6_0.setName("b_6_0");
                b_6_1.setName("b_6_1");
                b_6_2.setName("b_6_2");
                b_6_3.setName("b_6_3");
                b_6_4.setName("b_6_4");
                b_6_5.setName("b_6_5");
                b_6_6.setName("b_6_6");
                b_6_7.setName("b_6_7");
                b_6_8.setName("b_6_8");
                b_7_0.setName("b_7_0");
                b_7_1.setName("b_7_1");
                b_7_2.setName("b_7_2");
                b_7_3.setName("b_7_3");
                b_7_4.setName("b_7_4");
                b_7_5.setName("b_7_5");
                b_7_6.setName("b_7_6");
                b_7_7.setName("b_7_7");
                b_7_8.setName("b_7_8");
                b_8_0.setName("b_8_0");
                b_8_1.setName("b_8_1");
                b_8_2.setName("b_8_2");
                b_8_3.setName("b_8_3");
                b_8_4.setName("b_8_4");
                b_8_5.setName("b_8_5");
                b_8_6.setName("b_8_6");
                b_8_7.setName("b_8_7");
                b_8_8.setName("b_8_8");	
	}
	
	/**CLASE MAIN PARA REALIZAR TEST (PRUBEA) DE LA CLASE*/
	public static void main(String[] args){
		new VistaSwing_KajiMaki("Test Vista KajiMaki");
	}
	
}
