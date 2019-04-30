  import javax.swing.JOptionPane;
  import javax.swing.SwingConstants;
    import javax.swing.table.DefaultTableCellRenderer;
       import javax.swing.table.DefaultTableModel;
 
 
 
public class Hanoi extends javax.swing.JFrame {

  
    int ContNumMov =0;
    Pila PilaTorreA;
     Pila PilaTorreB;
      Pila PilaTorreC;
      
      DefaultTableModel ModeloTablaTorreA, ModeloTablaTorreB,ModeloTablaTorreC;
      
      int Objetivo =0;
      double NumMinMov =0;
      boolean Stop = false;
      
    
    
    public Hanoi() {
        initComponents();
        
        ModeloTablaTorreA = (DefaultTableModel) jTable1.getModel();
         ModeloTablaTorreA.setRowCount(10);
         
          ModeloTablaTorreB = (DefaultTableModel) jTable2.getModel();
         ModeloTablaTorreB.setRowCount(10);
         
         ModeloTablaTorreC = (DefaultTableModel) jTable3.getModel();
         ModeloTablaTorreC.setRowCount(10);
         
         DefaultTableCellRenderer renderA = new DefaultTableCellRenderer();
         renderA.setHorizontalAlignment(SwingConstants.CENTER);
         jTable1.getColumnModel().getColumn(0).setCellRenderer(renderA);
         
         DefaultTableCellRenderer renderB = new DefaultTableCellRenderer();
         renderB.setHorizontalAlignment(SwingConstants.CENTER);
         jTable2.getColumnModel().getColumn(0).setCellRenderer(renderB);
         
         DefaultTableCellRenderer renderC = new DefaultTableCellRenderer();
         renderC.setHorizontalAlignment(SwingConstants.CENTER);
         jTable3.getColumnModel().getColumn(0).setCellRenderer(renderC);
         PresentarCantMov();
        
    }

    private void Limpiar(){
    ContNumMov = 0;
    NumMinMov =0;
    jComboBox1.setSelectedItem(String.valueOf(Objetivo));
    }
    
    private void PresentarCantMov(){
    ContNumMov ++;
    jTextField1.setText(String.valueOf(ContNumMov -1));
 
    }
    private void Reinciar(){
     try{
        if(!jTextField2.getText().equals("")){
        
        Limpiar();
        Iniciar();
        }    
     
     
     }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    }
    
    
    
    private void Iniciar(){
        try{
        PilaTorreA = new Pila();
         PilaTorreB = new Pila();
          PilaTorreC = new Pila();
          
          Objetivo = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        
        NumMinMov = Math.pow(2, Objetivo) -1;
        jTextField2.setText(String.valueOf(ContNumMov));
        jTextField2.setText(String.valueOf(String.format("%.0f",NumMinMov )));
        
        for(int x = Objetivo; x >=1; x--){
        
        Nodo Plataforma = new Nodo();
        String Disco = "";
        
        for( int y = x; y>0; y--){
            
            Disco+= "((0))";

        }
        Plataforma.setDato(Disco);
        PilaTorreA.Push(Plataforma);
        }
        PresentarTorreA();
        PresentarTorreB();
        PresentarTorreC();
        }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
        
        
    
    
    }
    
    private void PresentarTorreA(){
      
         ((DefaultTableModel)jTable1.getModel()).setRowCount(0);
          ModeloTablaTorreA.setRowCount(10);
          Nodo K;
          int RowDisco = (10 - PilaTorreA.getContNodo());
          if(PilaTorreA.getContNodo()>0){
           for(K = PilaTorreA.getCabeza(); K.getAbajo() != null; K= K.getAbajo()){
              
               String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
               RowDisco++;
           }
          
          if(K.getAbajo()== null){
          
           String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreA.insertRow(RowDisco, VectorNormal);
          
          }
          
          }
          jTable1.setModel(ModeloTablaTorreA);
          ModeloTablaTorreA.setRowCount(10);
          
    }
    
    private void PresentarTorreB(){
      
         ((DefaultTableModel)jTable2.getModel()).setRowCount(0);
          ModeloTablaTorreB.setRowCount(10);
          Nodo K;
          int RowDisco = (10 - PilaTorreB.getContNodo());
          if(PilaTorreB.getContNodo()>0){
           for(K = PilaTorreB.getCabeza(); K.getAbajo() != null; K= K.getAbajo()){
              
               String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
               RowDisco++;
           }
          
          if(K.getAbajo()== null){
          
           String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreB.insertRow(RowDisco, VectorNormal);
          
          }
          
          }
          jTable2.setModel(ModeloTablaTorreB);
          ModeloTablaTorreB.setRowCount(10);
          
    }
    
     private void PresentarTorreC(){
      
         ((DefaultTableModel)jTable3.getModel()).setRowCount(0);
          ModeloTablaTorreC.setRowCount(10);
          Nodo K;
          int RowDisco = (10 - PilaTorreC.getContNodo());
          if(PilaTorreC.getContNodo()>0){
           for(K = PilaTorreC.getCabeza(); K.getAbajo() != null; K= K.getAbajo()){
              
               String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
               RowDisco++;
           }
          
          if(K.getAbajo()== null){
          
           String [] VectorNormal = {K.getDato()};
               ModeloTablaTorreC.insertRow(RowDisco, VectorNormal);
          
          }
          
          }
          jTable3.setModel(ModeloTablaTorreC);
          ModeloTablaTorreC.setRowCount(10);
          
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE 1"
            }
        ));
        jTable1.setToolTipText("");
        jTable1.setAutoscrolls(false);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setRowSelectionAllowed(false);
        jTable1.setShowHorizontalLines(false);
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 180, 210));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE 2"
            }
        ));
        jTable2.setToolTipText("");
        jTable2.setAutoscrolls(false);
        jTable2.setFocusable(false);
        jTable2.setRowSelectionAllowed(false);
        jTable2.setShowHorizontalLines(false);
        jTable2.setShowVerticalLines(false);
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 180, 210));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "TORRE 3"
            }
        ));
        jTable3.setToolTipText("");
        jTable3.setAutoscrolls(false);
        jTable3.setFocusable(false);
        jTable3.setRowSelectionAllowed(false);
        jTable3.setShowHorizontalLines(false);
        jTable3.setShowVerticalLines(false);
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 180, 210));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("2");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 50, 40));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("3");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 50, 40));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 50, 40));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setText("3");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 50, 40));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton5.setText("1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 50, 40));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 320, 100, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Numero de mov");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Numero de Aros");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Numero min de mov");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, -1));

        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 150, 30));

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 150, 30));

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton7.setText("2");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, 50, 40));

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton9.setText("Reiniciar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton8.setText("Iniciar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(467, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(337, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(18, 18, 18)
                .addComponent(jButton9)
                .addGap(81, 81, 81))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
    
        Iniciar();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
       Reinciar();
       ContNumMov = 0;
       
       
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         MoverAB();
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      MoverAC();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        MoverBA();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        MoverBC();   
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        MoverCA();
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
      MoverCB();
      
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void MoverCB(){
    try{
         if(PilaTorreC.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreC.Peek());
         if(PilaTorreB.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreB.Peek())>0){
            
             return;
             }
         }
         PilaTorreC.Pop();
         PilaTorreB.Push(Plataforma);
         PresentarTorreC();
          PresentarTorreB();
           PresentarCantMov();
         
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    
    
    
    }
    private void MoverCA(){
    try{
         if(PilaTorreC.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreC.Peek());
         if(PilaTorreA.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreA.Peek())>0){
            
             return;
             }
         }
         PilaTorreC.Pop();
         PilaTorreA.Push(Plataforma);
         PresentarTorreC();
          PresentarTorreA();
           PresentarCantMov();
         
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    
    
    
    }
    private void MoverBC(){
    try{
         if(PilaTorreB.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreB.Peek());
         if(PilaTorreC.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreC.Peek())>0){
            
             return;
             }
         }
         PilaTorreB.Pop();
         PilaTorreC.Push(Plataforma);
         PresentarTorreB();
          PresentarTorreC();
           PresentarCantMov();
         
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    
    }
    private void MoverBA(){
     try{
         if(PilaTorreB.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreB.Peek());
         if(PilaTorreA.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreA.Peek())>0){
            
             return;
             }
         }
         PilaTorreB.Pop();
         PilaTorreA.Push(Plataforma);
         PresentarTorreB();
          PresentarTorreA();
           PresentarCantMov();
         
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    
    }
    private void MoverAC(){
     try{
         if(PilaTorreA.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreA.Peek());
         if(PilaTorreC.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreC.Peek())>0){
            
             return;
             }
         }
         PilaTorreA.Pop();
         PilaTorreC.Push(Plataforma);
         PresentarTorreA();
          PresentarTorreC();
           PresentarCantMov();
         
            if(PilaTorreC.getContNodo() == Objetivo && ContNumMov == NumMinMov){
           JOptionPane.showMessageDialog(null, "Objetivo Alcanzado");
           }else if(PilaTorreC.getContNodo()== Objetivo && ContNumMov != NumMinMov){
           JOptionPane.showMessageDialog(null, "Objetivo Alcanzado");
           
           }
           
           
           
           
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
    
    
    }
    private void MoverAB(){
     try{
         if(PilaTorreA.getContNodo() >0){
         
         Nodo Plataforma = new Nodo();
         Plataforma.setDato(PilaTorreA.Peek());
         if(PilaTorreB.getContNodo() >0){
           
             if(Plataforma.getDato().compareTo(PilaTorreB.Peek())>0){
            
             return;
             }
         }
         PilaTorreA.Pop();
         PilaTorreB.Push(Plataforma);
         PresentarTorreA();
          PresentarTorreB();
           PresentarCantMov();
           
          
         
         }
      }catch(Exception E){
        
        System.out.println("ERROR" +E.getMessage());
        }
     }
   
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
            java.util.logging.Logger.getLogger(Hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hanoi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hanoi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
