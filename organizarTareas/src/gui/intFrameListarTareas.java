package gui;

import javax.swing.JOptionPane;
import logica.*;

/**
 * @author joaquin
 */

public class intFrameListarTareas extends javax.swing.JInternalFrame {

    private static intFrameListarTareas instance;
    private static Usuario usuarioSesion;
    private ListaTareas listaTareas = new ListaTareas();
    private ControladorLogica logica;
    
    
    public intFrameListarTareas() {
        initComponents();   // Inicialización del Frame
        /**
         * Obtenemos el objeto estatico UsuarioSesion desde el main JFrame
         * Tambien inicializamos los objetos usuarioSesion y logica
         */
        usuarioSesion = Main.getUsuarioSesion();
        logica = ControladorLogica.getInstance();
        cargarMisTareas();  // al iniciar el Frame se cargará la lista de tareas.
    }
    
    public static intFrameListarTareas getInstance() {
        if (instance == null)
            instance = new intFrameListarTareas();
        return instance;
    }
    
    public void cargarMisTareas() {
        try {
            /**
             * Cargamos el arraylist de listas de tareas del usuario, a partir 
             * de un objeto de ControladorLogica
             */
            listaTareas = logica.obtenerTareasPorUsuario(usuarioSesion);
            
            
            
        } catch(Exception e) {
            System.err.println("Error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "No se pudo cargar los datos de las tareas", 
                    "Se produjo un error.", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(680, 560));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(1, 1, 1));
        jLabel1.setText("Design home");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(397, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

