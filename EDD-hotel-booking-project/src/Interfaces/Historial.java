/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Functions.Client;
import edd.Lista;
import javax.swing.JOptionPane;
import static main.Main.historial;

/**
 *
 * @author Camila Garcia
 */
public class Historial extends javax.swing.JFrame {


    public Historial() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false); 
        hab.setText("");
        datos.setEditable(false);
        datos.setText("");
        title.setText("Historial de la Habitacion");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        hab = new javax.swing.JTextField();
        Buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        datos = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel2.setText("Historial");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jButton1.setText("<VOLVER");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 80, 30));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logohotel.jpg"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 110));

        hab.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        hab.setForeground(new java.awt.Color(102, 102, 102));
        hab.setText("   Numero Habitacion");
        hab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                habActionPerformed(evt);
            }
        });
        jPanel1.add(hab, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 210, 30));

        Buscar.setBackground(new java.awt.Color(210, 192, 137));
        Buscar.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Buscar.setText("Buscar");
        Buscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 80, 30));

        datos.setEditable(false);
        datos.setBackground(new java.awt.Color(255, 255, 255));
        datos.setColumns(20);
        datos.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        datos.setRows(5);
        jScrollPane1.setViewportView(datos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 370, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/habitacion (1).jpg"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, -1, -1));

        title.setFont(new java.awt.Font("Times New Roman", 2, 13)); // NOI18N
        title.setText("Historial de la habitación");
        jPanel1.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 48)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondo.jpg"))); // NOI18N
        jLabel4.setText("jLabel1");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_habActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_habActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        try{
            String habStr = hab.getText().trim();
            int room = Integer.parseInt(habStr);
            if(room<301 && room>0){
            Lista history = historial.searchRoomHis(room, historial.getRoot());
            if (history != null){
                title.setText("Historial de la Habitacion N°"+room);
                String info = "";
                for (int i = 0; i < history.getSize(); i++) {
                    Client cliente = (Client) history.getDato(i).getElement();
                    info += "~ "+cliente.getName()+" "+cliente.getLastName()+" CI: "+cliente.getCedula()+"\n";
                }
                datos.setText(info);
                hab.setText("");
            } else {
                JOptionPane.showMessageDialog(null, "Ningun cliente se ha hospedado en esta habitacion");
                hab.setText("");
                title.setText("Historial de la Habitacion N°");
                datos.setText("Ningun cliente se ha hospedado en esta habitacion");
            }} else{
                JOptionPane.showMessageDialog(null, "ERROR - Recuerde ingresar unicamente numeros y que solo\ntenemos 300 habitaciones");    
                hab.setText("");
                title.setText("Historial de la Habitacion N°");
                datos.setText("");
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "ERROR - Recuerde ingresar unicamente numeros y que solo\ntenemos 300 habitaciones");
            hab.setText("");
            title.setText("Historial de la Habitacion N°");
            datos.setText("");
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        InterfaceFunctions.VolverNosotros();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Historial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Historial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JTextArea datos;
    private javax.swing.JTextField hab;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
