/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetosistemasw.view;

/**
 *
 * @author danie
 */
public class TelaRelatorio extends javax.swing.JFrame {

    /**
     * Creates new form TelaRelatorio
     */
    public TelaRelatorio() {
        initComponents();
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
        lblRNome = new javax.swing.JLabel();
        lblRCPF = new javax.swing.JLabel();
        txtRNome = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        txtRCPF = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        lblRCausa = new javax.swing.JLabel();
        lblRData = new javax.swing.JLabel();
        lblRLocal = new javax.swing.JLabel();
        txtRData = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        txtRLocal = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        txtRCausa = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        lblRLaudo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do empregado", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        jPanel2.setLayout(null);

        lblRNome.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRNome.setText("Nome");
        jPanel2.add(lblRNome);
        lblRNome.setBounds(30, 50, 50, 20);

        lblRCPF.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRCPF.setText("CPF");
        jPanel2.add(lblRCPF);
        lblRCPF.setBounds(30, 110, 50, 20);

        txtRNome.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRNome.setBorder(null);
        jPanel2.add(txtRNome);
        txtRNome.setBounds(30, 70, 350, 20);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(30, 90, 350, 10);

        txtRCPF.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRCPF.setBorder(null);
        jPanel2.add(txtRCPF);
        txtRCPF.setBounds(30, 130, 180, 20);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(30, 150, 180, 10);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 90, 940, 180);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações do acidente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        jPanel3.setLayout(null);

        lblRCausa.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRCausa.setText("Causa");
        jPanel3.add(lblRCausa);
        lblRCausa.setBounds(30, 140, 50, 20);

        lblRData.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRData.setText("Data");
        jPanel3.add(lblRData);
        lblRData.setBounds(30, 40, 40, 20);

        lblRLocal.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRLocal.setText("Local");
        jPanel3.add(lblRLocal);
        lblRLocal.setBounds(30, 90, 32, 20);

        txtRData.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRData.setBorder(null);
        jPanel3.add(txtRData);
        txtRData.setBounds(30, 60, 140, 20);
        jPanel3.add(jSeparator3);
        jSeparator3.setBounds(30, 80, 140, 10);

        txtRLocal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRLocal.setBorder(null);
        jPanel3.add(txtRLocal);
        txtRLocal.setBounds(30, 110, 470, 20);
        jPanel3.add(jSeparator4);
        jSeparator4.setBounds(30, 130, 470, 10);
        jPanel3.add(jSeparator5);
        jSeparator5.setBounds(30, 180, 470, 10);

        txtRCausa.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtRCausa.setBorder(null);
        jPanel3.add(txtRCausa);
        txtRCausa.setBounds(30, 160, 470, 20);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 290, 940, 200);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações Médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        jPanel4.setLayout(null);

        lblRLaudo.setFont(new java.awt.Font("Candara Light", 0, 15)); // NOI18N
        lblRLaudo.setText("Laudo Médico");
        jPanel4.add(lblRLaudo);
        lblRLaudo.setBounds(30, 50, 120, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 500, 940, 160);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Registro de acidentes");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(380, 20, 230, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 980, 750);

        setSize(new java.awt.Dimension(994, 773));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaRelatorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaRelatorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lblRCPF;
    private javax.swing.JLabel lblRCausa;
    private javax.swing.JLabel lblRData;
    private javax.swing.JLabel lblRLaudo;
    private javax.swing.JLabel lblRLocal;
    private javax.swing.JLabel lblRNome;
    private javax.swing.JTextField txtRCPF;
    private javax.swing.JTextField txtRCausa;
    private javax.swing.JTextField txtRData;
    private javax.swing.JTextField txtRLocal;
    private javax.swing.JTextField txtRNome;
    // End of variables declaration//GEN-END:variables
}
