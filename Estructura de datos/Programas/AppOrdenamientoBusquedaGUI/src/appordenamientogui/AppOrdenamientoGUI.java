/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appordenamientogui;

import Utilerias.JTable.ColorCeldas;
import java.awt.Color;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AppOrdenamientoGUI extends javax.swing.JFrame {

    //modelo de la tabla
    DefaultTableModel modelo;

    // Clasae para los ordenamientos
    Ordenamientos ordenar = new Ordenamientos();

    //matriz para guardar los datos
    int vec[];

    //clase random para datos aleatorios 
    Random azar = new Random();

    //clase para repintar la tabla 
    ColorCeldas repintar;
    
    
    public AppOrdenamientoGUI() {
        initComponents();

        //lineas de la tabla visibles 
        jTableDatos.setShowGrid(true);
        
        //desactivar JRadioButton para evitar errores
        
        jRadioButDatosAleatorios.setEnabled(false);
        jRadioButDatosCapturados.setEnabled(false);
        jRadioButOrdenAscendente.setEnabled(false);
        jRadioButOrdenDescendente.setEnabled(false);
        jRadioButMetodoBurbuja.setEnabled(false);
        jRadioButMetodoBurbujaConSeñal.setEnabled(false);
        jRadioButMetodoShaker.setEnabled(false);
        jRadioButMetodoShell.setEnabled(false);
        jRadioButMetodoQuickSort.setEnabled(false);
        jRadioButtExP1.setEnabled(false);
        jRadioButExP2OP1.setEnabled(false);   
        jRadioButBusquedaDesordenada.setEnabled(false);
        jRadioButBusquedaOrdenada.setEnabled(false);
        jRadioButBusquedaBinaria.setEnabled(false);
    }
    
    public void agregarDatos(){
        //llenado de informacion en matriz 
    for(int i=0;i<modelo.getRowCount();i++){ // se extraen los datos de la tabla
        try{ //se utiliza el try si en la tabla se encuentra un dato erróneo (un dato alfabetico)
             // este se modificara con un dato random de 3 dígitos
        vec[i] = Integer.parseInt(jTableDatos.getValueAt(i, 1)+"");
        
        }catch(NumberFormatException ex){
        int num = azar.nextInt(900)+100; //dato random de 3 dígitos
        JOptionPane.showMessageDialog(null,"Dato erróneo en la posicion: "+(i+1)+" = "+ex.getMessage()
                                      +"\n, Se modificara con un dato random de 3 dígitos = "+num);
        vec[i] = num;
        }
        }
    }
    
    public void mostrar(){
    //mostrar información de la matriz en la tabla
    for(int i=0;i<jTableDatos.getRowCount();i++){
        // posicion de los datos 
        jTableDatos.setValueAt((i+1), i, 0);
        // datos
        jTableDatos.setValueAt(vec[i], i, 1);
    }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        butGroupDatos = new javax.swing.ButtonGroup();
        butGroupOrden = new javax.swing.ButtonGroup();
        butGroupMetodo = new javax.swing.ButtonGroup();
        butGroupBusqueda = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jSpinNumDatos = new javax.swing.JSpinner();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButDatosCapturados = new javax.swing.JRadioButton();
        jRadioButDatosAleatorios = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jRadioButOrdenAscendente = new javax.swing.JRadioButton();
        jRadioButOrdenDescendente = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jRadioButMetodoBurbuja = new javax.swing.JRadioButton();
        jRadioButMetodoBurbujaConSeñal = new javax.swing.JRadioButton();
        jRadioButMetodoShaker = new javax.swing.JRadioButton();
        jRadioButMetodoShell = new javax.swing.JRadioButton();
        jRadioButMetodoQuickSort = new javax.swing.JRadioButton();
        jRadioButtExP1 = new javax.swing.JRadioButton();
        jRadioButExP2OP1 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabNumComparaciones = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabNumIntercambios = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextBuscar = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jRadioButBusquedaDesordenada = new javax.swing.JRadioButton();
        jRadioButBusquedaOrdenada = new javax.swing.JRadioButton();
        jRadioButBusquedaBinaria = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setText("No. de Datos");

        jSpinNumDatos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jSpinNumDatos.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinNumDatosStateChanged(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(102, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "DATOS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jRadioButDatosCapturados.setBackground(new java.awt.Color(51, 51, 255));
        butGroupDatos.add(jRadioButDatosCapturados);
        jRadioButDatosCapturados.setText("Capturarlos");
        jRadioButDatosCapturados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButDatosCapturadosActionPerformed(evt);
            }
        });

        jRadioButDatosAleatorios.setBackground(new java.awt.Color(51, 51, 255));
        butGroupDatos.add(jRadioButDatosAleatorios);
        jRadioButDatosAleatorios.setText("Aleatorios");
        jRadioButDatosAleatorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButDatosAleatoriosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButDatosCapturados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButDatosAleatorios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jRadioButDatosCapturados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jRadioButDatosAleatorios)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ORDEN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jRadioButOrdenAscendente.setBackground(new java.awt.Color(51, 51, 255));
        butGroupOrden.add(jRadioButOrdenAscendente);
        jRadioButOrdenAscendente.setText("Ascendente");
        jRadioButOrdenAscendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButOrdenAscendenteActionPerformed(evt);
            }
        });

        jRadioButOrdenDescendente.setBackground(new java.awt.Color(51, 51, 255));
        butGroupOrden.add(jRadioButOrdenDescendente);
        jRadioButOrdenDescendente.setText("Descendente");
        jRadioButOrdenDescendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButOrdenDescendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButOrdenAscendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButOrdenDescendente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jRadioButOrdenAscendente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jRadioButOrdenDescendente)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(102, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "METODO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jRadioButMetodoBurbuja.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButMetodoBurbuja);
        jRadioButMetodoBurbuja.setText("Burbuja");
        jRadioButMetodoBurbuja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButMetodoBurbujaActionPerformed(evt);
            }
        });

        jRadioButMetodoBurbujaConSeñal.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButMetodoBurbujaConSeñal);
        jRadioButMetodoBurbujaConSeñal.setText("Burbuja Con Señal");
        jRadioButMetodoBurbujaConSeñal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButMetodoBurbujaConSeñalActionPerformed(evt);
            }
        });

        jRadioButMetodoShaker.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButMetodoShaker);
        jRadioButMetodoShaker.setText("Shaker sort");
        jRadioButMetodoShaker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButMetodoShakerActionPerformed(evt);
            }
        });

        jRadioButMetodoShell.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButMetodoShell);
        jRadioButMetodoShell.setText("Shell");
        jRadioButMetodoShell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButMetodoShellActionPerformed(evt);
            }
        });

        jRadioButMetodoQuickSort.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButMetodoQuickSort);
        jRadioButMetodoQuickSort.setText("QuickSort");
        jRadioButMetodoQuickSort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButMetodoQuickSortActionPerformed(evt);
            }
        });

        jRadioButtExP1.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButtExP1);
        jRadioButtExP1.setText("Examen P1");
        jRadioButtExP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtExP1ActionPerformed(evt);
            }
        });

        jRadioButExP2OP1.setBackground(new java.awt.Color(51, 51, 255));
        butGroupMetodo.add(jRadioButExP2OP1);
        jRadioButExP2OP1.setText("Examen P2 OP1");
        jRadioButExP2OP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButExP2OP1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButMetodoShaker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButMetodoBurbuja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButMetodoShell, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButMetodoQuickSort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtExP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jRadioButMetodoBurbujaConSeñal)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jRadioButExP2OP1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jRadioButMetodoBurbuja)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButMetodoBurbujaConSeñal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButMetodoShaker)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButMetodoShell)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButMetodoQuickSort)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButtExP1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButExP2OP1))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Posición", "Datos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDatos.setEnabled(false);
        jScrollPane1.setViewportView(jTableDatos);
        if (jTableDatos.getColumnModel().getColumnCount() > 0) {
            jTableDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
        }

        jLabel2.setText("No. Comparaciones: ");

        jLabNumComparaciones.setBackground(new java.awt.Color(255, 255, 255));
        jLabNumComparaciones.setOpaque(true);

        jLabel3.setText("No. Intercambios:");

        jLabNumIntercambios.setBackground(new java.awt.Color(255, 255, 255));
        jLabNumIntercambios.setText(" ");
        jLabNumIntercambios.setOpaque(true);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabNumComparaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabNumIntercambios, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabNumComparaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabNumIntercambios))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel5.setText("Buscar dato :");

        jTextBuscar.setToolTipText("Intro para buscar");
        jTextBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextBuscarActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(102, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "BUSQUEDA", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 11), new java.awt.Color(0, 0, 0))); // NOI18N

        jRadioButBusquedaDesordenada.setBackground(new java.awt.Color(51, 51, 255));
        butGroupBusqueda.add(jRadioButBusquedaDesordenada);
        jRadioButBusquedaDesordenada.setText("Desordenada");
        jRadioButBusquedaDesordenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButBusquedaDesordenadaActionPerformed(evt);
            }
        });

        jRadioButBusquedaOrdenada.setBackground(new java.awt.Color(51, 51, 255));
        butGroupBusqueda.add(jRadioButBusquedaOrdenada);
        jRadioButBusquedaOrdenada.setText("Ordenada");
        jRadioButBusquedaOrdenada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButBusquedaOrdenadaActionPerformed(evt);
            }
        });

        jRadioButBusquedaBinaria.setBackground(new java.awt.Color(51, 51, 255));
        butGroupBusqueda.add(jRadioButBusquedaBinaria);
        jRadioButBusquedaBinaria.setText("Binaria");
        jRadioButBusquedaBinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButBusquedaBinariaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jRadioButBusquedaDesordenada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButBusquedaOrdenada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButBusquedaBinaria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButBusquedaDesordenada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButBusquedaOrdenada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButBusquedaBinaria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel1)
                        .addGap(19, 19, 19)
                        .addComponent(jSpinNumDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel1))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jSpinNumDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(jTextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSpinNumDatosStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinNumDatosStateChanged
       
        // se extrae la cantidad de numeros en el spinner
        int numDatos = (int)jSpinNumDatos.getValue();

        //renglones en tabla
        modelo = (DefaultTableModel)jTableDatos.getModel();
        modelo.setRowCount(numDatos);
        
        //cantidad de datos a ordenar // cantidad maxima del arreglo 
        vec = new int[numDatos];
        
        //se activar JRadioButton 
        jRadioButDatosAleatorios.setEnabled(true);
        jRadioButDatosCapturados.setEnabled(true);
        jRadioButBusquedaDesordenada.setEnabled(true);
       
        // se ponen las posiciones en el jTable
        for(int i=0;i<numDatos;i++)
            jTableDatos.setValueAt((i+1), i, 0);
        
    }//GEN-LAST:event_jSpinNumDatosStateChanged

    private void jRadioButDatosCapturadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButDatosCapturadosActionPerformed

        
        //se limpia la tabla del color 
         repintar = new ColorCeldas(jTableDatos);
        
        // Tabla editable 
        jTableDatos.setEnabled(true); 
        
        // limpiar tabla de los datos
        for(int i=0;i<jTableDatos.getRowCount();i++){
            jTableDatos.setValueAt((i+1), i, 0);
            jTableDatos.setValueAt("", i, 1);
        }
        
        //activar JRadio
        jRadioButOrdenAscendente.setEnabled(true);
        jRadioButOrdenDescendente.setEnabled(true);
        
         // se quita la seleccion de los jRadioButton
         butGroupOrden.clearSelection();
         butGroupMetodo.clearSelection();
         butGroupBusqueda.clearSelection();
    }//GEN-LAST:event_jRadioButDatosCapturadosActionPerformed

    private void jRadioButDatosAleatoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButDatosAleatoriosActionPerformed

        
         //se limpia la tabla del color
         repintar = new ColorCeldas(jTableDatos);
        
       //se llena de numeros enteros de 3 dígitos la tabla y posicion 
        for(int i=0;i<jTableDatos.getRowCount();i++){
        jTableDatos.setValueAt(azar.nextInt(900)+100, i, 1); // datos
        jTableDatos.setValueAt((i+1), i, 0); // posiciones
        }
        
        //activar JRadioButton
        jRadioButOrdenAscendente.setEnabled(true);
        jRadioButOrdenDescendente.setEnabled(true);
        
        // se quita la seleccion de los jRadioButton
         butGroupOrden.clearSelection();
         butGroupMetodo.clearSelection();
         butGroupBusqueda.clearSelection();
    }//GEN-LAST:event_jRadioButDatosAleatoriosActionPerformed

    private void jRadioButOrdenAscendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButOrdenAscendenteActionPerformed
        
        //activar JRadioButton
        jRadioButMetodoBurbuja.setEnabled(true);
        jRadioButMetodoBurbujaConSeñal.setEnabled(true);
        jRadioButMetodoShaker.setEnabled(true);
        jRadioButMetodoShell.setEnabled(true);
        jRadioButMetodoQuickSort.setEnabled(true);
        jRadioButtExP1.setEnabled(true);
        jRadioButExP2OP1.setEnabled(true);
        
        // se quita la seleccion de los jRadioButton
         butGroupMetodo.clearSelection();
         butGroupBusqueda.clearSelection();
        
    }//GEN-LAST:event_jRadioButOrdenAscendenteActionPerformed

    private void jRadioButMetodoBurbujaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButMetodoBurbujaActionPerformed

        
        // seleccion del ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
            //se agregan los datos a la matriz
            agregarDatos();
        
           // se ordenam por el metodo de burbuja ascendente
           ordenar.burbujaAsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
          // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
            //se agregan los datos a la matriz
            agregarDatos();
           
           // se ordena por el metodo de burbuja descendente
           ordenar.burbujaDsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            // en caso de que no se seleccionara un ordenamiento se muestra una 
            // notificacion desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
       
         //se limpia la tabla del color
         repintar = new ColorCeldas(jTableDatos);
         
        jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
         
    }//GEN-LAST:event_jRadioButMetodoBurbujaActionPerformed

    private void jRadioButMetodoBurbujaConSeñalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButMetodoBurbujaConSeñalActionPerformed
    
        
        //se selecciona el tipo de ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
           // se agregan los datos a la matriz
            agregarDatos();
            
           // se ordena por el metodo de burbuja con señal ascendente
           ordenar.burbujaConSeñalAsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
           // se agregan los datos a la matriz
           agregarDatos();

           // se ordena por el metodo de burbuja con señal descendente
           ordenar.burbujaConSeñalDsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            // en caso de no seleccionar un ordenamiento se muestra un mensaje 
            // desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
        
         
         //se limpia la tabla del color 
         repintar = new ColorCeldas(jTableDatos);
         
         jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
    }//GEN-LAST:event_jRadioButMetodoBurbujaConSeñalActionPerformed

    private void jRadioButOrdenDescendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButOrdenDescendenteActionPerformed
        //activar JRadioButton
        jRadioButMetodoBurbuja.setEnabled(true);
        jRadioButMetodoBurbujaConSeñal.setEnabled(true);
        jRadioButMetodoShaker.setEnabled(true);
        jRadioButMetodoShell.setEnabled(true);
        jRadioButMetodoQuickSort.setEnabled(true);
        jRadioButtExP1.setEnabled(true);
        jRadioButExP2OP1.setEnabled(true);
        
         // se quita la seleccion de los jRadioButton
         butGroupMetodo.clearSelection();
    }//GEN-LAST:event_jRadioButOrdenDescendenteActionPerformed

    private void jRadioButMetodoShakerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButMetodoShakerActionPerformed

         
         // se selecciona el ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
           // se agregan los datos a la matriz
           agregarDatos();           

           // se ordena con el metodo de la sacuidada ascendente
           ordenar.SacudidaAsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
          // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
           // se agregan los datos a la matriz
            agregarDatos();

           // se ordena con el metodo de la sacuidada descendente 
           ordenar.SacudidaDsc(vec,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            //En caso de no seleccionar un ordenamiento se muestra un mensaje en 
            // un JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
            // se limpia la tabla del color 
            repintar = new ColorCeldas(jTableDatos);
            
        jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
           
    }//GEN-LAST:event_jRadioButMetodoShakerActionPerformed

    private void jTextBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextBuscarActionPerformed

         //clase color para pintar el jTable
         ColorCeldas colores = new ColorCeldas(jTableDatos);
       
        // clase para obtener la posicion del numero
        Numero pos = new Numero();
        
        //dato entero a buscar
        int dato = 0;
        
        // if para verificar que el jTextBuscar tenga informacion 
        if(jTextBuscar.getText().length()>0){
   
        // se agregan los datos a la matriz 
        agregarDatos();
   
        try{ // en caso de tener un dato erroneo (alfabético) en en jTextBuscar, se muestra 
             // un mensaje en un JOptionPane
        dato = Integer.parseInt(jTextBuscar.getText()+"");
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error = "+ex.getMessage());
        }
        
        // se busca el dato y la posicion y se regresa un booleano  
        if(Busquedas.secuencialDatosOrdenadosGUI(vec, dato, pos)){ // si encuentra el dato se muestra junto con la posicion
            JOptionPane.showMessageDialog(null, "Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
           // se colorea la fila de la posicion encontrada de color verde
            colores.addCelda(pos.num,0,Color.green);
            colores.addCelda(pos.num,1,Color.green);
            colores.repaint();
            }else
         // se muestra un mensaje en caso de no encontrar el dato a buscar
         JOptionPane.showMessageDialog(null, "Dato no encontrado"); 
        }else // en caso de no ingresar un dato en el jText se mandara un mensaje
              // desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Ingresa un Dato");
        
        // se quita el dato de jTextBuscar para continuar buscando datos 
        jTextBuscar.setText("");
    }//GEN-LAST:event_jTextBuscarActionPerformed

    private void jRadioButMetodoShellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButMetodoShellActionPerformed

        
         // se selecciona el ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
           // se agregan los datos a la matriz
           agregarDatos();

           // se ordena con el metodo de shell ascendente
           ordenar.shellAsc(vec, vec.length-1, jLabNumComparaciones, jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
           // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo de shell descendente 
           ordenar.shellDsc(vec ,vec.length-1 ,jLabNumComparaciones, jLabNumIntercambios);
           
          // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            //En caso de no seleccionar un ordenamiento se muestra un mensaje en 
            // un JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
            // se limpia la tabla del color 
            repintar = new ColorCeldas(jTableDatos);
            
         
        jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
  
    }//GEN-LAST:event_jRadioButMetodoShellActionPerformed

    private void jRadioButMetodoQuickSortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButMetodoQuickSortActionPerformed
       
         //numero de comparaciones e intercambios
         Numero compp = new Numero();
         Numero intercp = new Numero();
         
         // se selecciona el ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
            // se agregan los datos a la matriz
            agregarDatos();
            
            // se ordena con el metodo de QuickSortAsc ascendente
           ordenar.QuickSortAsc(vec,0,vec.length-1,compp,intercp,jLabNumComparaciones,jLabNumIntercambios);
           
           //se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
           // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo de QuickSortDsc descendente 
           ordenar.QuickSortDsc(vec,0,vec.length-1,compp,intercp,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        
        else 
            //En caso de no seleccionar un ordenamiento se muestra un mensaje en 
            // un JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
            // se limpia la tabla del color 
            repintar = new ColorCeldas(jTableDatos);
            
         jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
    }//GEN-LAST:event_jRadioButMetodoQuickSortActionPerformed

    private void jRadioButtExP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtExP1ActionPerformed
      
        
         // se selecciona el ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
            // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo del Examen punto 1 ascendente
           ordenar.OrdenamientoP1Asc(vec, vec.length-1, jLabNumComparaciones, jLabNumIntercambios);
           
           //se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
            // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo del Examen punto 1 descendente 
           ordenar.OrdenamientoP1Dsc(vec,vec.length-1,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            //En caso de no seleccionar un ordenamiento se muestra un mensaje en 
            // un JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
            // se limpia la tabla del color 
            repintar = new ColorCeldas(jTableDatos);
            
        jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
    }//GEN-LAST:event_jRadioButtExP1ActionPerformed

    private void jRadioButExP2OP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButExP2OP1ActionPerformed
 
        //numero de comparaciones e intercambios            
        Numero compp = new Numero();
        Numero inter = new Numero();
       
         // se selecciona el ordenamiento
        if(jRadioButOrdenAscendente.isSelected()){
            // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo del Examen punto 2 op1 ascendente
           ordenar.OrdenamientoP2OP1Asc(vec, 0, vec.length-1,compp,inter,jLabNumComparaciones,jLabNumIntercambios);
           
           //se muestram los datos ordenados en la tabla
           mostrar();
        }
        else if(jRadioButOrdenDescendente.isSelected()){
            // se agregan los datos a la matriz
           agregarDatos();
            
           // se ordena con el metodo del Examen punto 2 op1 descendente 
           ordenar.OrdenamientoP2OP1Dsc(vec, 0, vec.length-1,compp,inter,jLabNumComparaciones,jLabNumIntercambios);
           
           // se muestram los datos ordenados en la tabla
           mostrar();
        }
        else 
            //En caso de no seleccionar un ordenamiento se muestra un mensaje en 
            // un JOptionPane
            JOptionPane.showMessageDialog(null, "Seleccionar el ordenamiento");
            // se limpia la tabla del color 
            repintar = new ColorCeldas(jTableDatos);
            
        jRadioButBusquedaOrdenada.setEnabled(true);
        jRadioButBusquedaBinaria.setEnabled(true);
           
    }//GEN-LAST:event_jRadioButExP2OP1ActionPerformed

    private void jRadioButBusquedaOrdenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButBusquedaOrdenadaActionPerformed

         //clase color para pintar el jTable
         ColorCeldas colores = new ColorCeldas(jTableDatos);
       
        // clase para obtener la posicion del numero
        Numero pos = new Numero();
        
        //dato entero a buscar
        int dato = 0;
        
        // if para verificar que el jTextBuscar tenga informacion 
        if(jTextBuscar.getText().length()>0){
   
        // se agregan los datos a la matriz 
        agregarDatos();
   
        try{ // en caso de tener un dato erroneo (alfabético) en en jTextBuscar, se muestra 
             // un mensaje en un JOptionPane
        dato = Integer.parseInt(jTextBuscar.getText()+"");
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error = "+ex.getMessage());
        }
        
        // se busca el dato y la posicion y se regresa un booleano  
        if(Busquedas.secuencialDatosOrdenadosGUI(vec, dato, pos)){ // si encuentra el dato se muestra junto con la posicion
            JOptionPane.showMessageDialog(null, "Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
           // se colorea la fila de la posicion encontrada de color verde
            colores.addCelda(pos.num,0,Color.green);
            colores.addCelda(pos.num,1,Color.green);
            colores.repaint();
            }else
         // se muestra un mensaje en caso de no encontrar el dato a buscar
         JOptionPane.showMessageDialog(null, "Dato no encontrado"); 
        }else{ // en caso de no ingresar un dato en el jText se mandara un mensaje
              // desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Ingresa un Dato");
            butGroupBusqueda.clearSelection();
        }
        // se quita el dato de jTextBuscar para continuar buscando datos 
        jTextBuscar.setText("");
    }//GEN-LAST:event_jRadioButBusquedaOrdenadaActionPerformed

    private void jRadioButBusquedaDesordenadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButBusquedaDesordenadaActionPerformed
     
         //clase color para pintar el jTable
         ColorCeldas colores = new ColorCeldas(jTableDatos);
       
        // clase para obtener la posicion del numero
        Numero pos = new Numero();
        
        //dato entero a buscar
        int dato = 0;
        
        // if para verificar que el jTextBuscar tenga informacion 
        if(jTextBuscar.getText().length()>0){
   
        // se agregan los datos a la matriz 
        agregarDatos();
   
        try{ // en caso de tener un dato erroneo (alfabético) en en jTextBuscar, se muestra 
             // un mensaje en un JOptionPane
        dato = Integer.parseInt(jTextBuscar.getText()+"");
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error = "+ex.getMessage());
        }
        
         // se busca el dato y la posicion y se regresa un booleano  
          Busquedas.secuencialDatosDesordenados(vec,dato,pos); // si encuentra el dato se muestra junto con la posicion
           if(pos.num != -1){
           JOptionPane.showMessageDialog(null, "Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
           // se colorea la fila de la posicion encontrada de color verde
            colores.addCelda(pos.num,0,Color.green);
            colores.addCelda(pos.num,1,Color.green);
            colores.repaint();
            }else
         // se muestra un mensaje en caso de no encontrar el dato a buscar
         JOptionPane.showMessageDialog(null, "Dato no encontrado"); 
        }else{ // en caso de no ingresar un dato en el jText se mandara un mensaje
              // desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Ingresa un Dato");
            butGroupBusqueda.clearSelection();
        }
        // se quita el dato de jTextBuscar para continuar buscando datos 
        jTextBuscar.setText("");
        
    }//GEN-LAST:event_jRadioButBusquedaDesordenadaActionPerformed

    private void jRadioButBusquedaBinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButBusquedaBinariaActionPerformed
         //clase color para pintar el jTable
         ColorCeldas colores = new ColorCeldas(jTableDatos);
       
        // clase para obtener la posicion del numero
        Numero pos = new Numero();
        
        //dato entero a buscar
        int dato = 0;
        
        
        // if para verificar que el jTextBuscar tenga informacion 
        if(jTextBuscar.getText().length()>0){
    
        // se agregan los datos a la matriz 
        agregarDatos();
   
        try{ // en caso de tener un dato erroneo (alfabético) en en jTextBuscar, se muestra 
             // un mensaje en un JOptionPane
        dato = Integer.parseInt(jTextBuscar.getText()+"");
        }catch(NumberFormatException ex){
        JOptionPane.showMessageDialog(null, "Error = "+ex.getMessage());
        }
        
         // se busca el dato y la posicion y se regresa un booleano  
          Busquedas.busquedaBinaria(vec,dato,pos); // si encuentra el dato se muestra junto con la posicion
           if(pos.num != -1){
           JOptionPane.showMessageDialog(null, "Dato: "+dato+" se encuentra en la posicision: "+(pos.num+1));
           // se colorea la fila de la posicion encontrada de color verde
            colores.addCelda(pos.num,0,Color.green);
            colores.addCelda(pos.num,1,Color.green);
            colores.repaint();
            }else
         // se muestra un mensaje en caso de no encontrar el dato a buscar
         JOptionPane.showMessageDialog(null, "Dato no encontrado"); 
        }else{ // en caso de no ingresar un dato en el jText se mandara un mensaje
              // desde el JOptionPane
            JOptionPane.showMessageDialog(null, "Ingresa un Dato");
             butGroupBusqueda.clearSelection();
        }
        
        // se quita el dato de jTextBuscar para continuar buscando datos 
        jTextBuscar.setText("");
        
    }//GEN-LAST:event_jRadioButBusquedaBinariaActionPerformed

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
            java.util.logging.Logger.getLogger(AppOrdenamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppOrdenamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppOrdenamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppOrdenamientoGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppOrdenamientoGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup butGroupBusqueda;
    private javax.swing.ButtonGroup butGroupDatos;
    private javax.swing.ButtonGroup butGroupMetodo;
    private javax.swing.ButtonGroup butGroupOrden;
    private javax.swing.JLabel jLabNumComparaciones;
    private javax.swing.JLabel jLabNumIntercambios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButBusquedaBinaria;
    private javax.swing.JRadioButton jRadioButBusquedaDesordenada;
    private javax.swing.JRadioButton jRadioButBusquedaOrdenada;
    private javax.swing.JRadioButton jRadioButDatosAleatorios;
    private javax.swing.JRadioButton jRadioButDatosCapturados;
    private javax.swing.JRadioButton jRadioButExP2OP1;
    private javax.swing.JRadioButton jRadioButMetodoBurbuja;
    private javax.swing.JRadioButton jRadioButMetodoBurbujaConSeñal;
    private javax.swing.JRadioButton jRadioButMetodoQuickSort;
    private javax.swing.JRadioButton jRadioButMetodoShaker;
    private javax.swing.JRadioButton jRadioButMetodoShell;
    private javax.swing.JRadioButton jRadioButOrdenAscendente;
    private javax.swing.JRadioButton jRadioButOrdenDescendente;
    private javax.swing.JRadioButton jRadioButtExP1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinNumDatos;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField jTextBuscar;
    // End of variables declaration//GEN-END:variables
}
