/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import javax.swing.JOptionPane;

/**
 *
 * @author Professor
 */
public class ViagemV2 extends javax.swing.JFrame {

    /**
     * Creates new form Viagem
     */
    public ViagemV2() {
        initComponents();
        setSize(500, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldVeiculo = new javax.swing.JTextField();
        jTextFieldDistancia = new javax.swing.JTextField();
        jTextFieldMediaKmGasolina = new javax.swing.JTextField();
        jTextFieldMediaKmEtanol = new javax.swing.JTextField();
        jButtonCalcular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Cálculo de Viagem");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(118, 26, 296, 75);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Veículo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(146, 136, 72, 25);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Distância:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(143, 185, 75, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Média Km/Litro gasolina:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(21, 234, 197, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Média Km/Litro Etanol:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(38, 283, 180, 25);

        jTextFieldVeiculo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldVeiculo);
        jTextFieldVeiculo.setBounds(250, 133, 184, 31);

        jTextFieldDistancia.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldDistancia);
        jTextFieldDistancia.setBounds(250, 182, 184, 31);

        jTextFieldMediaKmGasolina.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldMediaKmGasolina);
        jTextFieldMediaKmGasolina.setBounds(250, 231, 116, 31);

        jTextFieldMediaKmEtanol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(jTextFieldMediaKmEtanol);
        jTextFieldMediaKmEtanol.setBounds(250, 280, 116, 31);

        jButtonCalcular.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButtonCalcular.setText("Calcular");
        jButtonCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalcularActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCalcular);
        jButtonCalcular.setBounds(108, 341, 326, 39);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalcularActionPerformed
        // Variáveis fixas
        final float VALOR_LITRO_GASOLINA = 5.39f;
        final float VALOR_LITRO_ETANOL = 3.49f;

        // Recuperando os dados do formulário
        String veiculo = jTextFieldVeiculo.getText();
        short distancia = Short.parseShort(jTextFieldDistancia.getText());
        byte mediaKmGasolina = Byte.parseByte(jTextFieldMediaKmGasolina.getText());
        byte mediaKmEtanol = Byte.parseByte(jTextFieldMediaKmEtanol.getText());
        
        // Processamento
        float valorTotalGasolina = (distancia / mediaKmGasolina) * VALOR_LITRO_GASOLINA;
        float valorTotalEtanol = (distancia / mediaKmEtanol) * VALOR_LITRO_ETANOL;
        
        String mensagemCombustivel = "";
        
        // Tratando a condição do combustível mais barato
        if (valorTotalGasolina < valorTotalEtanol) {
            // Gasolina mais barato
            mensagemCombustivel = String.format("\nPara gasolina será gasto R$ %.2f", valorTotalGasolina);
        } else {
            // Etanol mais barato
            mensagemCombustivel = String.format("\nPara etanol será gasto R$ %.2f", valorTotalEtanol);
        }
        
        // Saída
        String titulo = "Prezado cliente segue as informações da viagem com veículo " + veiculo;
        String mensagem = titulo.concat(mensagemCombustivel);
        JOptionPane.showMessageDialog(rootPane, mensagem);
        
        // Limpa os campos
        jTextFieldVeiculo.setText("");
        jTextFieldDistancia.setText("");
        jTextFieldMediaKmEtanol.setText("");
        jTextFieldMediaKmGasolina.setText("");
    }//GEN-LAST:event_jButtonCalcularActionPerformed

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
            java.util.logging.Logger.getLogger(ViagemV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViagemV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViagemV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViagemV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViagemV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalcular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextFieldDistancia;
    private javax.swing.JTextField jTextFieldMediaKmEtanol;
    private javax.swing.JTextField jTextFieldMediaKmGasolina;
    private javax.swing.JTextField jTextFieldVeiculo;
    // End of variables declaration//GEN-END:variables
}