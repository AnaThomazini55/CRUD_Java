package br.com.loja.telas;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {
    public TelaPrincipal() {
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

        Desktop = new javax.swing.JDesktopPane();
        user = new javax.swing.JLabel();
        lbldata = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        usuarios = new javax.swing.JMenuItem();
        os = new javax.swing.JMenuItem();
        cliente = new javax.swing.JMenuItem();
        relas = new javax.swing.JMenu();
        servicos = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela principal");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        user.setText("Usu??rio");

        lbldata.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldata.setText("Data");

        jMenu1.setText("Cadastro");

        usuarios.setText("Usu??rios");
        usuarios.setEnabled(false);
        usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosActionPerformed(evt);
            }
        });
        jMenu1.add(usuarios);

        os.setText("OS");
        os.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                osActionPerformed(evt);
            }
        });
        jMenu1.add(os);

        cliente.setText("Cliente");
        cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteActionPerformed(evt);
            }
        });
        jMenu1.add(cliente);

        jMenuBar1.add(jMenu1);

        relas.setText("Relat??rio");
        relas.setEnabled(false);

        servicos.setText("Servi??os");
        relas.add(servicos);

        jMenuBar1.add(relas);

        jMenu3.setText("Ajuda");

        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        jMenu3.add(sobre);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Op????es");

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        jMenu4.add(sair);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user)
                    .addComponent(lbldata))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(user)
                .addGap(18, 18, 18)
                .addComponent(lbldata)
                .addContainerGap(212, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosActionPerformed
        TelaUsuarios tl = new TelaUsuarios();
        tl.setVisible(true);
        Desktop.add(tl);
    }//GEN-LAST:event_usuariosActionPerformed

    private void clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteActionPerformed
        TelaClientes telaNova = new TelaClientes();
        telaNova.setVisible(true);
        Desktop.add(telaNova);
            
    }//GEN-LAST:event_clienteActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        TelaSobre telinha = new TelaSobre();
        telinha.setVisible(true);
    }//GEN-LAST:event_sobreActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        Date data = new Date();
        DateFormat formatador = DateFormat.getDateInstance(DateFormat.SHORT);
        lbldata.setText(formatador.format(data));
    }//GEN-LAST:event_formWindowActivated

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        int sair = JOptionPane.showConfirmDialog(null, "Deseja sair?", "Aten????o", JOptionPane.YES_NO_OPTION);
        if (sair == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_sairActionPerformed

    private void osActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_osActionPerformed
        TelaOs os = new TelaOs();
        os.setVisible(true);
        Desktop.add(os);
    }//GEN-LAST:event_osActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem cliente;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lbldata;
    private javax.swing.JMenuItem os;
    public static javax.swing.JMenu relas;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem servicos;
    private javax.swing.JMenuItem sobre;
    public javax.swing.JLabel user;
    public static javax.swing.JMenuItem usuarios;
    // End of variables declaration//GEN-END:variables
}
