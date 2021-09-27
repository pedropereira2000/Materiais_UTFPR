/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Bean.Ambiente;
import Bean.Leitura;
import Dao.AmbienteDAO;
import java.util.List;
import javax.swing.JOptionPane;

public class CadastroAmbiente extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAmbiente
     */
    public CadastroAmbiente() {
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

        tituloCadastro = new javax.swing.JLabel();
        bloco = new javax.swing.JLabel();
        numero = new javax.swing.JLabel();
        tipo = new javax.swing.JLabel();
        txtBloco = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(796, 480));
        setResizable(false);
        getContentPane().setLayout(null);

        tituloCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tituloCadastro.setText("Cadastro de Salas");
        getContentPane().add(tituloCadastro);
        tituloCadastro.setBounds(330, 80, 140, 22);

        bloco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bloco.setText("Bloco :");
        getContentPane().add(bloco);
        bloco.setBounds(160, 190, 55, 22);

        numero.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        numero.setText("Numero :");
        getContentPane().add(numero);
        numero.setBounds(160, 230, 74, 22);

        tipo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tipo.setText("Tipo :");
        getContentPane().add(tipo);
        tipo.setBounds(160, 270, 47, 22);

        txtBloco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBlocoActionPerformed(evt);
            }
        });
        getContentPane().add(txtBloco);
        txtBloco.setBounds(240, 190, 350, 20);
        getContentPane().add(txtNumero);
        txtNumero.setBounds(240, 230, 350, 20);

        btnSalvar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSalvar.setText("SALVAR");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvar);
        btnSalvar.setBounds(360, 370, 80, 40);

        btnVoltar.setText("VOLTAR");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar);
        btnVoltar.setBounds(30, 20, 71, 23);

        jLabel1.setText(TelaLogin.userNome);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(630, 20, 103, 14);

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Teórica" }));
        cbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTipoActionPerformed(evt);
            }
        });
        getContentPane().add(cbTipo);
        cbTipo.setBounds(240, 270, 350, 20);

        setSize(new java.awt.Dimension(812, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtBlocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBlocoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBlocoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        try{
            Ambiente ambi = new Ambiente();
            AmbienteDAO ambiDao = new AmbienteDAO();
            
            
            ambi.setBloco(txtBloco.getText());
            ambi.setSalaNum(txtNumero.getText());
            ambi.setTipoSala(cbTipo.getSelectedItem().toString());
        
            ambiDao.cadastrarAmbiente(ambi);
        
            JOptionPane.showMessageDialog(null, "Ambiente Cadastrado com Sucesso!");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Erro ao Cadastrar:"+erro);
        }
        
        
        
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        // Voltar para tela pricipal e fechar a atual
        new PrincipalAmbiente().show();
        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void cbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTipoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroAmbiente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroAmbiente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bloco;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel numero;
    private javax.swing.JLabel tipo;
    private javax.swing.JLabel tituloCadastro;
    private javax.swing.JTextField txtBloco;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
