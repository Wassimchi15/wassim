
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.sql.Connection;
//import com.mysql.jdbc.Connection;
import java.awt.HeadlessException;
import java.awt.print.PrinterException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Sales extends javax.swing.JInternalFrame {

    
    Connection conn=null;
    PreparedStatement pst;
    ResultSet rs;
    String buyPrice="";
    Double cost=0.0;
    Double fulTotal=0.0;
    Double totalcost=0.0;
    Double balance=0.0;
    
    public Sales() {
        initComponents();
        conn=DBConnect.connect();
        autosellId();
        billlord();
        customerbill();
        btnprocess.setEnabled(false);
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cmbitname = new javax.swing.JComboBox();
        txtitno = new javax.swing.JTextField();
        txtuprice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtquentity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_oit = new javax.swing.JTextField();
        oitname = new javax.swing.JComboBox();
        oituprice = new javax.swing.JTextField();
        oitquentity = new javax.swing.JTextField();
        oittotal = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        oderBill = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsell = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        cusBill = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        btnprocess = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtcash = new javax.swing.JTextField();
        txtbalance = new javax.swing.JTextField();
        txtfulltotal = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtsino = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(930, 530));

        jPanel1.setPreferredSize(new java.awt.Dimension(930, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background4.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 910, 30));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Item number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Item Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        cmbitname.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                cmbitnamePopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jPanel1.add(cmbitname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, 30));

        txtitno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtitnoKeyReleased(evt);
            }
        });
        jPanel1.add(txtitno, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 30));
        jPanel1.add(txtuprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 30));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Unit Price");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtquentity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtquentityKeyReleased(evt);
            }
        });
        jPanel1.add(txtquentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, 40));

        jLabel8.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Total");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));
        jPanel1.add(txttotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 180, 30));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quentity");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jButton1.setBackground(new java.awt.Color(153, 255, 153));
        jButton1.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton1.setText("Add Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 300, 50));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 320, 290));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Item Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, -1, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Item Name");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Unit Price");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 130, -1, -1));

        jLabel14.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Quentity");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, -1, -1));

        txt_oit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_oitKeyReleased(evt);
            }
        });
        jPanel1.add(txt_oit, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 50, 160, 30));

        jPanel1.add(oitname, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 160, 30));
        jPanel1.add(oituprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 160, 30));

        oitquentity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                oitquentityKeyReleased(evt);
            }
        });
        jPanel1.add(oitquentity, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 160, 40));
        jPanel1.add(oittotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, 160, 30));

        jButton3.setBackground(new java.awt.Color(153, 255, 153));
        jButton3.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        jButton3.setText("Add Item");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 270, 50));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 290, 290));

        jButton5.setBackground(new java.awt.Color(153, 255, 153));
        jButton5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/reset.png"))); // NOI18N
        jButton5.setText("Order");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, 240, 40));

        oderBill.setColumns(20);
        oderBill.setRows(5);
        jScrollPane3.setViewportView(oderBill);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 240, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 90, 260, 180));

        tblsell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblsell);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 300, 130));

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 320, 150));

        cusBill.setColumns(20);
        cusBill.setRows(5);
        jScrollPane2.setViewportView(cusBill);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 280, 240, 110));

        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 260, 130));

        jButton7.setBackground(new java.awt.Color(255, 51, 51));
        jButton7.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/clear.png"))); // NOI18N
        jButton7.setText("Clear");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 350, 100, 30));

        btnprocess.setBackground(new java.awt.Color(153, 255, 153));
        btnprocess.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        btnprocess.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/process.png"))); // NOI18N
        btnprocess.setText("Process");
        btnprocess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprocessActionPerformed(evt);
            }
        });
        jPanel1.add(btnprocess, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 250, 70));

        jLabel19.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Cash");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 410, -1, -1));

        jLabel20.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Balance");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, -1, -1));

        txtcash.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcashKeyReleased(evt);
            }
        });
        jPanel1.add(txtcash, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 400, 130, 35));
        jPanel1.add(txtbalance, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 440, 130, 35));
        jPanel1.add(txtfulltotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 130, 35));

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 290, 150));

        txtsino.setEditable(false);
        txtsino.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtsino.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtsino, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 50, 260, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background6.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 930, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemNameLord()
    {
            try {
                cmbitname.removeAllItems();
                cmbitname.addItem("Select Item");
                
                    String sq="SELECT `item_name` FROM `receivestock` WHERE item_number='"+txtitno.getText()+"'";

                    pst=conn.prepareStatement(sq);
                   
                    rs=pst.executeQuery();
                   
                    
                    while(rs.next()){
                        cmbitname.addItem(rs.getString("item_name"));
                    }
                }
                catch(SQLException e)
                {
                JOptionPane.showMessageDialog(rootPane, e);
                }
    }
    
    
    
    private void allItemLord()
    {
           try {

                
                    String sq="SELECT `item_name`,`buying_price`,`selling_price` FROM `receivestock` WHERE item_number='"+txtitno.getText()+"'";

                    pst=conn.prepareStatement(sq);
                    rs=pst.executeQuery();
                    while(rs.next()){
                        buyPrice=(rs.getString("buying_price"));
                        txtuprice.setText(rs.getString("selling_price"));
                        String name=(rs.getString("item_name"));
                        cmbitname.removeAllItems();
                        cmbitname.addItem(name);
                    }
                }
                catch(SQLException e)
                {
                JOptionPane.showMessageDialog(rootPane, e);
                } 
    }
    
    private void fildClear()
    {
    txtitno.setText("");
    cmbitname.removeAllItems();
    txtuprice.setText("");
    txtquentity.setText("");
    txttotal.setText("");
    
    txt_oit.setText("");
    oitname.removeAllItems();
    oituprice.setText("");
    oitquentity.setText("");
    oittotal.setText("");
    
    }
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        int upri=txtuprice.getText().length();
        if(upri>0)
        {
            if(txtquentity.getText().length()>0)
            {
        
                    String sin=txtsino.getText();
                    String itno=txtitno.getText();
                    String iname=cmbitname.getSelectedItem().toString();
                    String uprice=txtuprice.getText();
                    String quentity=txtquentity.getText();
                    String total=txttotal.getText();
                   // String cost=null;

                     try {
                            String q= "INSERT INTO `sale`( `sin`, `date`, `time`, `itno`, `itname`, `unprice`, `quntity`, `total`, `cost`) VALUES ('"+sin+"','"+Home.date+"' ,'"+Home.time+"' ,'"+itno+"' ,'"+iname+"' ,'"+uprice+"' ,'"+quentity+"' ,'"+total+"' ,'"+cost+"')";
                             pst=conn.prepareStatement(q);
                            pst.execute(); 
                            stockupdate();
                            JOptionPane.showMessageDialog(rootPane,"save success");

                                } 
                            catch (HeadlessException | SQLException e) 
                            {

                             JOptionPane.showMessageDialog(rootPane,e);                    
                            } 

                      /////customer bill

                     cusBill.setText(cusBill.getText()+cmbitname.getSelectedItem().toString()+"  -  "+txtquentity.getText()+"\t"+txttotal.getText()+"\n");
                     /////////////////////////////////

                     Double itotal=Double.valueOf(total);
                     fulTotal=fulTotal+itotal;
                     txtfulltotal.setText(fulTotal.toString());

                     totalcost=totalcost+cost;

                     saletablelord();
                     fildClear();
                     cost = 0.0;
                    }
                else
                {
                        JOptionPane.showMessageDialog(rootPane, "Add Quentity");
                }
            }

        
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Select Item");
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

     private void stockupdate()
    {
     try {
              String squpdate = "UPDATE receivestock SET quentity=quentity -'"+txtquentity.getText()+"' WHERE item_number='"+txtitno.getText()+"' and item_name='"+cmbitname.getSelectedItem().toString()+"'";
              pst=conn.prepareStatement(squpdate);
                pst.execute();                  
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(rootPane,e);              
            }
    
    }
    
     private  void saletablelord()
    {
         try {
            String sql="SELECT `itname` as 'Item Name', `quntity` as 'Quentity', `total` as 'Total' FROM `sale` where sin='"+txtsino.getText()+"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsell.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }
    
    
    
     private void autosellId()
    {
        try {
            String sql="SELECT sin FROM payment ORDER BY sin DESC LIMIT 1";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
               String rnno=rs.getString("sin");
               int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtsino.setText(ftxt);            
           }
           else
           {
               txtsino.setText("SI1000");
           }                                       
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }       
    }
    
    
    private void txtitnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtitnoKeyReleased

        int x=0;
          try {
                
                    String sq="SELECT count(*) FROM `receivestock` WHERE item_number='"+txtitno.getText()+"'";

                    pst=conn.prepareStatement(sq);
                    rs=pst.executeQuery();
                    while(rs.next()){
                        x =  rs.getInt("count(*)");
                    //   JOptionPane.showMessageDialog(rootPane, x);
                    }
                    
                    if(x>1)
                    {
                       itemNameLord(); 
                    }
                    else
                    {
                      allItemLord();  
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                }
                catch(SQLException e)
                {
                JOptionPane.showMessageDialog(rootPane, e);
                }  
        
        
        
        
        
        
    }//GEN-LAST:event_txtitnoKeyReleased

    private void cmbitnamePopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_cmbitnamePopupMenuWillBecomeInvisible

        
        if(txtitno.getText().length()>0)
        {
        
       try {

                
                    String sq="SELECT `buying_price`,`selling_price` FROM `receivestock` WHERE item_number='"+txtitno.getText()+"' and item_name='"+cmbitname.getSelectedItem().toString()+"'";

                    pst=conn.prepareStatement(sq);
                    rs=pst.executeQuery();
                    while(rs.next()){
                        buyPrice=(rs.getString("buying_price"));
                        txtuprice.setText(rs.getString("selling_price"));
                    }
                }
                catch(Exception e)
                {
                JOptionPane.showMessageDialog(rootPane, e);
                } 
        }
        else
        {
         //   cmbitname.setSelectedIndex(0);
     //   JOptionPane.showMessageDialog(rootPane, "Invalid Request");
        }
        
        
    }//GEN-LAST:event_cmbitnamePopupMenuWillBecomeInvisible

    private void txtquentityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtquentityKeyReleased
     
        int x=txtquentity.getText().length();
        if(x>0)
        {
        Double upri = Double.parseDouble(txtuprice.getText());
        Double aque = Double.parseDouble(txtquentity.getText());
        Double total= upri * aque;
        txttotal.setText(total.toString());
        
            Double bprice=Double.parseDouble(buyPrice);
            cost=bprice*aque;
            
       
        }
        else
        {
            txttotal.setText("");
            cost=0.0;
        }
        
        
        
        
    }//GEN-LAST:event_txtquentityKeyReleased

    private void btnprocessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprocessActionPerformed

        Double profit=fulTotal- totalcost;
        String pro =profit.toString();
        
        String sin=txtsino.getText();
        String cash=txtcash.getText();
        String balan=txtbalance.getText();
        
        try {
                String q= "INSERT INTO `payment`(`sin`, `total`, `cash`, `balance`, `cost`, `profit`, `date`, `time`) VALUES ('"+sin+"','"+fulTotal+"' ,'"+cash+"' ,'"+balan+"' ,'"+totalcost+"' ,'"+pro+"' ,'"+Home.date+"' ,'"+Home.time+"')";
                 pst=conn.prepareStatement(q);
                pst.execute(); 
                JOptionPane.showMessageDialog(rootPane,"save success");
                
                    } 
                catch (Exception e) 
                {
       
                 JOptionPane.showMessageDialog(rootPane,e);                    
                } 
        
        //////////////////////////////
         cusBill.setText(cusBill.getText()+"------------------------------------\n");
         cusBill.setText(cusBill.getText()+"Total: \t "+ txtfulltotal.getText()+"\n");
         cusBill.setText(cusBill.getText()+"Cash: \t "+ txtcash.getText()+"\n");
         cusBill.setText(cusBill.getText()+"------------------------------------\n");
         cusBill.setText(cusBill.getText()+"Balance: \t "+ txtbalance.getText()+"\n");
         cusBill.setText(cusBill.getText()+"==============================\n");
   
        
         
          try {
            cusBill.print();
            cusBill.setText("");
            billlord();
            customerbill();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
         
        ///////////////////////////
        autosellId();
        txtfulltotal.setText("");
        txtcash.setText("");
        txtbalance.setText("");
        fulTotal=0.0;
        totalcost=0.0;
        balance=0.0;
        saletablelord();
        billlord();
        btnprocess.setEnabled(false);
        
    }//GEN-LAST:event_btnprocessActionPerformed

    private void txtcashKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcashKeyReleased
       
        
        try {
           
            Double cash = Double.valueOf(txtcash.getText());
            balance= cash- fulTotal;
            txtbalance.setText(balance.toString());
            
            btnprocess.setEnabled(true);
            
            
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
        
    }//GEN-LAST:event_txtcashKeyReleased

    private void txt_oitKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_oitKeyReleased
       
        try {

                
                    String sq="SELECT `oit_number`, `oit_name`, `price`, `cost` FROM `order_item` WHERE oit_number='"+txt_oit.getText()+"'";

                    pst=conn.prepareStatement(sq);
                    rs=pst.executeQuery();
                    if(rs.next()){
                        
                        oitname.removeAllItems();
                        oitname.addItem(rs.getString("oit_name"));
                       
                        oituprice.setText(rs.getString("price"));
                        buyPrice=(rs.getString("cost"));
                        
                    }
                    else
                    {
                    oitname.removeAllItems();
                    oituprice.setText("");
                    oittotal.setText("");
                    oitquentity.setText("");
                    buyPrice="";
                    
                    }
                }
                catch(Exception e)
                {
                JOptionPane.showMessageDialog(rootPane, e);
                } 
        
        
    }//GEN-LAST:event_txt_oitKeyReleased

     private  void billlord()
    {
        
    
        
    oderBill.setText("==============================\n");
    oderBill.setText(oderBill.getText()+"*\t"+txtsino.getText()+"\n");
    oderBill.setText(oderBill.getText()+"----------------------------------------------------\n");
    oderBill.setText(oderBill.getText()+"Date: "+Home.date +"  Time: "+Home.time+"\n\n");
    oderBill.setText(oderBill.getText()+"==============================\n");
    }
     
     
      private  void customerbill()
    {
        
    
        
    cusBill.setText("==============================\n");
    cusBill.setText(cusBill.getText()+"xxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    cusBill.setText(cusBill.getText()+"xxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    cusBill.setText(cusBill.getText()+"xxxxxxxxxxxxxxxxxxxxxxxxxxx\n");
    cusBill.setText(cusBill.getText()+"--------------------------------------------\n");
    cusBill.setText(cusBill.getText()+"*Invoice No\t"+txtsino.getText()+"\n");
   // oderBill.setText(oderBill.getText()+"==============================\n");
    cusBill.setText(cusBill.getText()+"Date: "+Home.date +"  Time: "+Home.time+"\n");
    cusBill.setText(cusBill.getText()+"---------------------------------------------\n");
    }
    
    
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      
        if(oituprice.getText().length()>0)
        {
            if(oitquentity.getText().length()>0)
            {
                String sin=txtsino.getText();
                String itno=txt_oit.getText();
                String iname=oitname.getSelectedItem().toString();
                String uprice=oituprice.getText();
                String quentity=oitquentity.getText();
                String total=oittotal.getText();
               // String cost=null;

                 try {
                        String q= "INSERT INTO `sale`( `sin`, `date`, `time`, `itno`, `itname`, `unprice`, `quntity`, `total`, `cost`) VALUES ('"+sin+"','"+Home.date+"' ,'"+Home.time+"' ,'"+itno+"' ,'"+iname+"' ,'"+uprice+"' ,'"+quentity+"' ,'"+total+"' ,'"+cost+"')";
                         pst=conn.prepareStatement(q);
                        pst.execute(); 
                        JOptionPane.showMessageDialog(rootPane,"save success");

                            } 
                        catch (Exception e) 
                        {

                         JOptionPane.showMessageDialog(rootPane,e);                    
                        } 
                 ////////////////////////////////// bill receipt
                 oderBill.setText(oderBill.getText()+oitname.getSelectedItem().toString()+"\t\t"+oitquentity.getText()+"\n");

                 /////customer bill

                 cusBill.setText(cusBill.getText()+oitname.getSelectedItem().toString()+"  -  "+oitquentity.getText()+"\t"+oittotal.getText()+"\n");
                 /////////////////////////////////
                 Double itotal=Double.valueOf(total);
                 fulTotal=fulTotal+itotal;
                 txtfulltotal.setText(fulTotal.toString());

                 totalcost=totalcost+cost;

                 saletablelord();
                 fildClear();
                 cost = 0.0;
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Add Quentity");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Select Item");
        }
        
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void oitquentityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_oitquentityKeyReleased
     
        
         int x=oitquentity.getText().length();
        if(x>0)
        {
        Double upri = Double.parseDouble(oituprice.getText());
        Double aque = Double.parseDouble(oitquentity.getText());
        Double total= upri * aque;
        oittotal.setText(total.toString());
        
            Double bprice=Double.parseDouble(buyPrice);
            cost=bprice*aque;
            
       
        }
        else
        {
            oittotal.setText("");
            cost=0.0;
        }
        
    }//GEN-LAST:event_oitquentityKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     
         oderBill.setText(oderBill.getText()+"==============================\n");
         
          try {
            oderBill.print();
            oderBill.setText("");
            billlord();
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
         
         
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed

     buyPrice="";
     cost=0.0;
     fulTotal=0.0;
     totalcost=0.0;
     balance=0.0;
     
        autosellId();
        billlord();
        customerbill();
        btnprocess.setEnabled(false);
        fildClear();
        txtfulltotal.setText("");
        
    }//GEN-LAST:event_jButton7ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnprocess;
    private javax.swing.JComboBox cmbitname;
    private javax.swing.JTextArea cusBill;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea oderBill;
    private javax.swing.JComboBox oitname;
    private javax.swing.JTextField oitquentity;
    private javax.swing.JTextField oittotal;
    private javax.swing.JTextField oituprice;
    private javax.swing.JTable tblsell;
    private javax.swing.JTextField txt_oit;
    private javax.swing.JTextField txtbalance;
    private javax.swing.JTextField txtcash;
    private javax.swing.JTextField txtfulltotal;
    private javax.swing.JTextField txtitno;
    private javax.swing.JTextField txtquentity;
    private javax.swing.JTextField txtsino;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtuprice;
    // End of variables declaration//GEN-END:variables
}
