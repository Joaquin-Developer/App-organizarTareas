package gui;
//import java.awt.Color;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Arrays;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
//import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import logica.*;

/**
 *
 * @author joaquin
 */
public class Main extends javax.swing.JFrame {
    
    private int x, y ; /* for possiton of Main JFrame */
    private static Usuario usuarioSesion;

    public Main() {
        initComponents();
        loginFramePropert();
    }
    
    private void loginFramePropert(){
        try{
            this.setLocationRelativeTo(null); //centrar JFrame.-
            
            jCheckBoxShowPsw.setSelected(false);  // por defecto no se debe mostrar la password
            jPasswordField.setEchoChar('*');
            this.jPasswordField.setText("");
            this.txtUsuario.setText("");
            
            //btnSalir.setOpaque(false);
            //btnSalir.setBackground(new Color(0,0,0,0));
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage(),"Se produjo un error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void editMainFrameProperties() {
        AppMainJFrame.setSize(900, 575);
        //AppMainJFrame.setTitle("Organiza Mis Tareas - App"); --no necesario porque la barra de titulo no se va a ver.-
        lblTitulo.setText("Organiza Mis Tareas - App");
        AppMainJFrame.setLocationRelativeTo(null);  //generate center.-
        lblNombreUsuario.setText(usuarioSesion.getNombreUsuario());
    }
    
    public void setUsuarioSesion(Usuario u){
        usuarioSesion = u;
    }
    
    private JDesktopPane inicializarDesktopPane(JDesktopPane jDesktopPane, String imgPath, int scalx, int scaly) { 

        jDesktopPane = new JDesktopPane() { 
            ImageIcon icon = new ImageIcon(imgPath); 
            Image image = icon.getImage(); 
            Image newimage = image.getScaledInstance(scalx, scaly, Image.SCALE_SMOOTH); 

            @Override 
            protected void paintComponent(Graphics g) { 
                super.paintComponent(g); 
                g.drawImage(newimage, 0, 0, this); 
            } 
        }; 
        return jDesktopPane; 
    } 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AppMainJFrame = new javax.swing.JFrame();
        jPanelTitle = new javax.swing.JPanel();
        lblExitApplication = new javax.swing.JLabel();
        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        pnlAbrirNuevaTarea = new javax.swing.JPanel();
        lblCrearNuevaTarea = new javax.swing.JLabel();
        pnlVerTareas = new javax.swing.JPanel();
        lblVerMisTareas = new javax.swing.JLabel();
        lblNombreUsuario = new javax.swing.JLabel();
        cBoxSettingsUser = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        dpFrameContainer = new javax.swing.JDesktopPane();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jPasswordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnClose = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCrearCuenta = new javax.swing.JButton();
        jCheckBoxShowPsw = new javax.swing.JCheckBox();

        AppMainJFrame.setLocationByPlatform(true);
        AppMainJFrame.setUndecorated(true);
        AppMainJFrame.setSize(new java.awt.Dimension(713, 444));
        AppMainJFrame.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTitle.setBackground(new java.awt.Color(1, 1, 1));
        jPanelTitle.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelTitleMouseDragged(evt);
            }
        });
        jPanelTitle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelTitleMousePressed(evt);
            }
        });
        jPanelTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExitApplication.setForeground(new java.awt.Color(254, 254, 254));
        lblExitApplication.setText("x");
        lblExitApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitApplicationMouseClicked(evt);
            }
        });
        jPanelTitle.add(lblExitApplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, 30, 31));

        lblTitulo.setFont(new java.awt.Font("DejaVu Sans", 0, 12)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(254, 254, 254));
        lblTitulo.setText("jLabel5");
        jPanelTitle.add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        AppMainJFrame.getContentPane().add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 910, 30));

        jPanel1.setBackground(new java.awt.Color(0, 150, 136));

        pnlAbrirNuevaTarea.setBackground(new java.awt.Color(255, 255, 255));
        pnlAbrirNuevaTarea.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlAbrirNuevaTareaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAbrirNuevaTareaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAbrirNuevaTareaMouseExited(evt);
            }
        });

        lblCrearNuevaTarea.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblCrearNuevaTarea.setText("Crear nueva Tarea");

        javax.swing.GroupLayout pnlAbrirNuevaTareaLayout = new javax.swing.GroupLayout(pnlAbrirNuevaTarea);
        pnlAbrirNuevaTarea.setLayout(pnlAbrirNuevaTareaLayout);
        pnlAbrirNuevaTareaLayout.setHorizontalGroup(
            pnlAbrirNuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbrirNuevaTareaLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(lblCrearNuevaTarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAbrirNuevaTareaLayout.setVerticalGroup(
            pnlAbrirNuevaTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAbrirNuevaTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCrearNuevaTarea)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlVerTareas.setBackground(new java.awt.Color(255, 255, 255));
        pnlVerTareas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlVerTareasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlVerTareasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlVerTareasMouseExited(evt);
            }
        });

        lblVerMisTareas.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        lblVerMisTareas.setText("Ver mis Tareas");

        javax.swing.GroupLayout pnlVerTareasLayout = new javax.swing.GroupLayout(pnlVerTareas);
        pnlVerTareas.setLayout(pnlVerTareasLayout);
        pnlVerTareasLayout.setHorizontalGroup(
            pnlVerTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlVerTareasLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblVerMisTareas)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlVerTareasLayout.setVerticalGroup(
            pnlVerTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlVerTareasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVerMisTareas)
                .addContainerGap())
        );

        lblNombreUsuario.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        lblNombreUsuario.setText("*nombreUsuario*");

        cBoxSettingsUser.setFont(new java.awt.Font("Ubuntu", 0, 11)); // NOI18N
        cBoxSettingsUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ajustes", "Cerrar Sesión", " " }));
        cBoxSettingsUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxSettingsUserActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 12)); // NOI18N
        jLabel5.setText("*logo*");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAbrirNuevaTarea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlVerTareas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cBoxSettingsUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombreUsuario)
                        .addGap(35, 35, 35))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel5)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel5)
                .addGap(97, 97, 97)
                .addComponent(pnlAbrirNuevaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlVerTareas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(lblNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cBoxSettingsUser, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        AppMainJFrame.getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 220, 560));

        dpFrameContainer.setBackground(new java.awt.Color(66, 154, 242));
        AppMainJFrame.getContentPane().add(dpFrameContainer, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 690, 570));

        jLabel7.setText("jLabel7");
        AppMainJFrame.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        jButton2.setText("Login");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordFieldFocusLost(evt);
            }
        });

        jLabel1.setText("Usuario:");

        jLabel2.setText("Contraseña:");

        btnClose.setText("x");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel3.setText("LOGIN - Organiza Mis Tareas");

        jLabel4.setText("BETA - v1.0");

        btnCrearCuenta.setText("Crear una cuenta");
        btnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCuentaActionPerformed(evt);
            }
        });

        jCheckBoxShowPsw.setText("Mostrar contraseña");
        jCheckBoxShowPsw.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxShowPswStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jCheckBoxShowPsw)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtUsuario)
                                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                    .addComponent(jPasswordField)
                                    .addComponent(btnCrearCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jLabel4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(86, 86, 86))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClose, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnClose)
                .addGap(2, 2, 2)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jCheckBoxShowPsw)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCrearCuenta)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // evento foco perdido
        /**
         * 
         
        if(txtUsuario.getText().length() == 0){
            JOptionPane.showMessageDialog(null,"Debe ingresar un nombre de usuario","Error", JOptionPane.ERROR_MESSAGE);
        }else if(! buscarUsr(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null,"Usuario incorrecto","Error", JOptionPane.ERROR_MESSAGE);
        }
        */
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void jPasswordFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordFieldFocusLost
        // evento foco perdido
        /**
        if(jPasswordField.getPassword().length == 0){
            JOptionPane.showMessageDialog(null,"Debe ingresar una contraseña","Error", JOptionPane.ERROR_MESSAGE);
        }else if(!validarPsw(txtUsuario.getText())){
            JOptionPane.showMessageDialog(null,"Contraseña no coincide con el usuario ingresado","Error", JOptionPane.ERROR_MESSAGE);
            jPasswordField.setText("");
        }
        */
    }//GEN-LAST:event_jPasswordFieldFocusLost

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        /**
         * Boton LOGIN (JFrame1)
         */
        
        try{
            if (txtUsuario.getText().length() == 0 || jPasswordField.getText().length() == 0) {
                JOptionPane.showMessageDialog(null,"faltan datos");
            } else {
                
                ControladorLogica logica = ControladorLogica.getInstance();
                boolean loginExitoso = logica.login(txtUsuario.getText(), obtenerStringPsw(jPasswordField.getPassword()));
                
                if (loginExitoso) {
                    //JOptionPane.showMessageDialog(null, "login exitoso");
                    setUsuarioSesion(logica.obtenerListaUsuarios().obtenerPorNombre(txtUsuario.getText()));
                    this.setVisible(false);
                    AppMainJFrame.setVisible(true);
                    editMainFrameProperties();
                    JOptionPane.showMessageDialog(null, usuarioSesion.toString());
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Error al iniciar sesion.", "Login Fallido", JOptionPane.ERROR_MESSAGE);
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"Se produjo un error al intentar iniciar sesión","Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
    
        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del login?", "Confirme salida", JOptionPane.YES_NO_OPTION , JOptionPane.QUESTION_MESSAGE) == 0){
            System.exit(0);
        }
        
    }//GEN-LAST:event_btnCloseActionPerformed

    private void btnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCuentaActionPerformed
        
        JOptionPane.showMessageDialog(null,"Por ahora esta funcionalidad esta fuera de servicio.", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        
    }//GEN-LAST:event_btnCrearCuentaActionPerformed

    private void jCheckBoxShowPswStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxShowPswStateChanged
        if (jCheckBoxShowPsw.isSelected())
            jPasswordField.setEchoChar((char)0);
        else
            jPasswordField.setEchoChar('*');
    }//GEN-LAST:event_jCheckBoxShowPswStateChanged
    
    private void jPanelTitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMousePressed
        x = evt.getX();
        y = evt.getY();        
    }//GEN-LAST:event_jPanelTitleMousePressed

    private void jPanelTitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTitleMouseDragged
        int nX = evt.getXOnScreen();
        int nY = evt.getYOnScreen();
        AppMainJFrame.setLocation(nX - x, nY - y);
        
    }//GEN-LAST:event_jPanelTitleMouseDragged

    private void lblExitApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitApplicationMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitApplicationMouseClicked

    private void pnlAbrirNuevaTareaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbrirNuevaTareaMouseClicked
        
        // se debe mostrar el internalFrame en el jDesktopPane.-
        IntFrameNuevaTarea frameNuevaTarea = IntFrameNuevaTarea.getInstance();
        dpFrameContainer.removeAll();
        dpFrameContainer.add(frameNuevaTarea);
        frameNuevaTarea.setVisible(true);
    }//GEN-LAST:event_pnlAbrirNuevaTareaMouseClicked

    private void pnlAbrirNuevaTareaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbrirNuevaTareaMouseEntered
        pnlAbrirNuevaTarea.setBackground(Color.decode("#B2DFDB"));
    }//GEN-LAST:event_pnlAbrirNuevaTareaMouseEntered

    private void pnlAbrirNuevaTareaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAbrirNuevaTareaMouseExited
        pnlAbrirNuevaTarea.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_pnlAbrirNuevaTareaMouseExited

    private void pnlVerTareasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVerTareasMouseClicked
        /**
         * Show new jInternalFrame in pnlOpenInternal1
         */
        JOptionPane.showMessageDialog(null, "jPanel2");
    }//GEN-LAST:event_pnlVerTareasMouseClicked

    private void pnlVerTareasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVerTareasMouseEntered
        pnlAbrirNuevaTarea.setBackground(Color.decode("#B2DFDB"));
    }//GEN-LAST:event_pnlVerTareasMouseEntered

    private void pnlVerTareasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlVerTareasMouseExited
        pnlAbrirNuevaTarea.setBackground(Color.decode("#FFFFFF"));
    }//GEN-LAST:event_pnlVerTareasMouseExited

    private void cBoxSettingsUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxSettingsUserActionPerformed
        if (cBoxSettingsUser.getSelectedIndex() == 0) {
            // ajustes
            JOptionPane.showMessageDialog(null, "Por ahora esta funcionalidad está fuera de uso.", "Mensaje", JOptionPane.WARNING_MESSAGE);
            
        } else if (cBoxSettingsUser.getSelectedIndex() == 1) {
            // cerrar sesion
            AppMainJFrame.setVisible(false);
            this.setVisible(true);
            loginFramePropert();
        }
    }//GEN-LAST:event_cBoxSettingsUserActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // al hacer click en logo se vacian los elementos del panel principal
        dpFrameContainer.removeAll();
    }//GEN-LAST:event_jLabel5MouseClicked

    private String obtenerStringPsw(char[] psw){
        String password = "";
        for (char p : psw) {
            password += p;
        }
        return password;        
    }

    /**
     * @param argumentos...
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame AppMainJFrame;
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnCrearCuenta;
    private javax.swing.JComboBox<String> cBoxSettingsUser;
    private javax.swing.JDesktopPane dpFrameContainer;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxShowPsw;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JLabel lblCrearNuevaTarea;
    private javax.swing.JLabel lblExitApplication;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVerMisTareas;
    private javax.swing.JPanel pnlAbrirNuevaTarea;
    private javax.swing.JPanel pnlVerTareas;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}




