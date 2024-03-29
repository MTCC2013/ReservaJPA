package br.com.view;

/**
 * @author mauricio_p_cardoso
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipalGUI
     */
    public JanelaPrincipal() {
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
        botaoCliente = new javax.swing.JButton();
        btReserva = new javax.swing.JButton();
        PainelReserva = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoCliente.setBackground(new java.awt.Color(0, 0, 0));
        botaoCliente.setForeground(new java.awt.Color(255, 255, 255));
        botaoCliente.setText("Professor");
        botaoCliente.setToolTipText("Professor");
        botaoCliente.setBorderPainted(false);
        botaoCliente.setContentAreaFilled(false);
        botaoCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoCliente.setOpaque(true);
        botaoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClienteActionPerformed(evt);
            }
        });

        btReserva.setBackground(new java.awt.Color(0, 0, 0));
        btReserva.setForeground(new java.awt.Color(255, 255, 255));
        btReserva.setText("Reserva");
        btReserva.setToolTipText("Reserva");
        btReserva.setBorderPainted(false);
        btReserva.setContentAreaFilled(false);
        btReserva.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btReserva.setFocusable(false);
        btReserva.setOpaque(true);
        btReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btReservaActionPerformed(evt);
            }
        });

        PainelReserva.setBackground(new java.awt.Color(255, 255, 255));
        PainelReserva.setToolTipText("Escolha uma das opções ao lado!");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Locação de Salas");

        javax.swing.GroupLayout PainelReservaLayout = new javax.swing.GroupLayout(PainelReserva);
        PainelReserva.setLayout(PainelReservaLayout);
        PainelReservaLayout.setHorizontalGroup(
            PainelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PainelReservaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(30, 30, 30))
        );
        PainelReservaLayout.setVerticalGroup(
            PainelReservaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PainelReservaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PainelReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReserva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(PainelReserva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(botaoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClienteActionPerformed
        PesquisaProfessor pc = new PesquisaProfessor();
        pc.setLocationRelativeTo(null);
        pc.setVisible(true);
    }//GEN-LAST:event_botaoClienteActionPerformed

    private void btReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btReservaActionPerformed
        PesquisaReserva pc = new PesquisaReserva();
        pc.setLocationRelativeTo(null);
        pc.setVisible(true);
    }//GEN-LAST:event_btReservaActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelReserva;
    private javax.swing.JButton botaoCliente;
    private javax.swing.JButton btReserva;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
