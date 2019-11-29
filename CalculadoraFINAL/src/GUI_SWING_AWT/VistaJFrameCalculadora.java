/* <pre>
 * Proyecto: Calculadora
 * Materia: Estructuras de datos
 * Maestra: Silvia Guardati
 * Fecha de entrega: 21/02/2019
 * Equipo: Daniela Coello, Diego Merodio, Alvaro Romo , Diego Hernández
 * Clase: VistaJFrameCalculadora
 *</pre>
 */

package GUI_SWING_AWT;
import calculadora.*;
import java.util.ArrayList;

public class VistaJFrameCalculadora extends javax.swing.JFrame {

  
    /**
     * Construye una interfaz grafica amigable de una calculadora para interactuar con el usuario. 
     */
    public VistaJFrameCalculadora() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        panel1 = new java.awt.Panel();
        res = new javax.swing.JLabel();
        parA = new javax.swing.JButton();
        parC = new javax.swing.JButton();
        bPor = new javax.swing.JButton();
        AC = new javax.swing.JButton();
        bDiv = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        bMenos = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        bMas = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();
        b0 = new javax.swing.JButton();
        bSigno = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        op = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel1.setLayout(new java.awt.GridBagLayout());

        res.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.insets = new java.awt.Insets(8, 0, 10, 0);
        panel1.add(res, gridBagConstraints);

        parA.setText("(");
        parA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parAActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        panel1.add(parA, gridBagConstraints);

        parC.setText(")");
        parC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                parCActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        panel1.add(parC, gridBagConstraints);

        bPor.setText("x");
        bPor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        panel1.add(bPor, gridBagConstraints);

        AC.setText("AC");
        AC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ACActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        panel1.add(AC, gridBagConstraints);

        bDiv.setText("÷");
        bDiv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        panel1.add(bDiv, gridBagConstraints);

        b7.setText("7");
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        panel1.add(b7, gridBagConstraints);

        b8.setText("6");
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        panel1.add(b8, gridBagConstraints);

        b4.setText("4");
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        panel1.add(b4, gridBagConstraints);

        b9.setText("9");
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        panel1.add(b9, gridBagConstraints);

        b5.setText("5");
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        panel1.add(b5, gridBagConstraints);

        b6.setText("6");
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        panel1.add(b6, gridBagConstraints);

        b3.setText("3");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        panel1.add(b3, gridBagConstraints);

        bMenos.setText("-");
        bMenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMenosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        panel1.add(bMenos, gridBagConstraints);

        b1.setText("1");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        panel1.add(b1, gridBagConstraints);

        b2.setText("2");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        panel1.add(b2, gridBagConstraints);

        bMas.setText("+");
        bMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        panel1.add(bMas, gridBagConstraints);

        bPunto.setText(".");
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        panel1.add(bPunto, gridBagConstraints);

        b0.setText("0");
        b0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b0ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 6;
        panel1.add(b0, gridBagConstraints);

        bSigno.setText("+/-");
        bSigno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSignoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        panel1.add(bSigno, gridBagConstraints);

        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 6;
        panel1.add(bIgual, gridBagConstraints);

        op.setText("");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 3;
        panel1.add(op, gridBagConstraints);

        borrar.setText("←");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        panel1.add(borrar, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Establece la accion que cada boton debe realizar segun sea un operando (Realizara entonces alguna operacion) o numero. 
     * Aplica para los siguientes metodos. 
     * @param evt 
     */
    private void ACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ACActionPerformed
        this.op.setText("");
        this.res.setText("");
    }//GEN-LAST:event_ACActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"2");
    }//GEN-LAST:event_b2ActionPerformed

    private void parAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parAActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"(");
    }//GEN-LAST:event_parAActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"7");
    }//GEN-LAST:event_b7ActionPerformed

    /** 
     * Elimina los elementos que hay en el campo de texto donde se recibe el String
    */
    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        try{
            String str= this.op.getText();
            this.op.setText( str.substring(0, str.length()-1) );
            this.res.setText("");
        }
        catch(Exception e){
        }
    }//GEN-LAST:event_borrarActionPerformed

    private void parCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_parCActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+")");
    }//GEN-LAST:event_parCActionPerformed

    private void bDivActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"÷");
    }//GEN-LAST:event_bDivActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"8");
    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"9");
    }//GEN-LAST:event_b9ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"4");
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"5");
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"6");
    }//GEN-LAST:event_b6ActionPerformed

    private void bPorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPorActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"x");
    }//GEN-LAST:event_bPorActionPerformed

    private void bMenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMenosActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"–");
    }//GEN-LAST:event_bMenosActionPerformed

    private void bMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMasActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"+");
    }//GEN-LAST:event_bMasActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
       this.res.setText("");
        this.op.setText(this.op.getText()+"1");
    }//GEN-LAST:event_b1ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"3");
    }//GEN-LAST:event_b3ActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+".");
    }//GEN-LAST:event_bPuntoActionPerformed

    private void b0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b0ActionPerformed
        this.res.setText("");
        this.op.setText(this.op.getText()+"0");
    }//GEN-LAST:event_b0ActionPerformed

    /**
     * Permite realizar la operacion de acuerdo al signo utilizando los botones de la interfaz grafica
     * @param evt 
     */
    private void bSignoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSignoActionPerformed
        try{
            String str=this.op.getText();
            
            char last=str.charAt(str.length()-1);

            if(!AnalizaErrores.esOperadorOParentesis(last)){    
                if(str.length()>1){    
                    char antiLast=str.charAt(str.length()-2);
                    if(antiLast== '-'){
                        this.op.setText(str.substring(0, str.length()-2)+last);
                        System.out.println("a"+str.substring(0, str.length()-2)+last);
                    }else{
                        this.op.setText(str.substring(0, str.length()-1)+"-"+last);
                        System.out.println("c"+str.substring(0, str.length()-1)+last);
                    }

                }else{
                    this.op.setText(str.substring(0, str.length()-1)+"-"+last);
                    System.out.println("c"+str.substring(0, str.length()-1)+last);
                }
            }  
        }catch(Exception e){
         }
    }//GEN-LAST:event_bSignoActionPerformed

    
    /**
     * Permite realizar la operacion "=" del usuario utilizando los botones de la interfaz grafica
     * @param evt 
     */
    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
        //0)Obtenemos la cadena de las operaciones de la calculadora:
        String entrada = this.op.getText();
        
        //0.1)Preguntamos si la cadena no esta vacía:
        if(!entrada.equals("")){
            
            try{
                //1)Verificamos errores:
                AnalizaErrores.analizaErrores(entrada);

                //2)Convertimos la expresión dada en una expresión postfija
                ArrayList<Object> list1= ConvierteAPostFija.convierteAPostFija(entrada);

                //3)Solucionamos la expresión:
                System.out.println(entrada);
                System.out.println(list1.toString());
                double resultado=ResuelveExpresion.ejecutaOperaciones(list1);

                //4)Colocamos resultado en la calculadora:
                String resp= ""+resultado;
                System.out.println(resp+"\n");
                this.res.setText(resp);
            }
            catch(Exception e){
                this.res.setText(e.getMessage());
                System.out.println(e.getMessage());
            }
        }
    
    }//GEN-LAST:event_bIgualActionPerformed

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaJFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaJFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaJFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaJFrameCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaJFrameCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AC;
    private javax.swing.JButton b0;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bDiv;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMas;
    private javax.swing.JButton bMenos;
    private javax.swing.JButton bPor;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton bSigno;
    private javax.swing.JButton borrar;
    private javax.swing.JLabel op;
    private java.awt.Panel panel1;
    private javax.swing.JButton parA;
    private javax.swing.JButton parC;
    private javax.swing.JLabel res;
    // End of variables declaration//GEN-END:variables
}
