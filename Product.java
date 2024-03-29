/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurant;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;

public class Product extends javax.swing.JInternalFrame {

   
    
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    
    
    public Product() {
        initComponents();
        conn=DBConnect.connect();
        autoId();
        tablelord();
        btnadd.setEnabled(false);
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnadd = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtsname = new javax.swing.JTextField();
        txtsid = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblservice = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtoname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Sitka Text", 3, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Product Manage");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 20));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background4.jpg"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 40));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("P Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unit Cost");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        btnadd.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnadd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/add.png"))); // NOI18N
        btnadd.setText("Add");
        btnadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 100, 40));

        btnupdate.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit-validated-icon (1).png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 100, 40));

        btndelete.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancel1.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 100, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.jpg"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 380, 70));

        jLabel15.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Item No");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, 100, -1));

        txtsearch.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        txtsearch.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsearchActionPerformed(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        getContentPane().add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(729, 60, 140, 30));

        txtemail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(txtemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, 260, 30));

        txtsname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtsname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsnameKeyReleased(evt);
            }
        });
        getContentPane().add(txtsname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 260, 30));

        txtsid.setEditable(false);
        txtsid.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        txtsid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, 260, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background4.jpg"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 460, 50));

        tblservice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblservice.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblservice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblserviceMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblservice);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 440, 320));

        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 460, 340));

        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 480, 430));

        jLabel17.setFont(new java.awt.Font("Sitka Text", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Unit Price");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));
        getContentPane().add(txtoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 260, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 410, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background6.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

     private void autoId()
    {
        try {
             String sql="SELECT `oit_number`, `oit_name`, `price`, `cost` FROM `order_item` ORDER BY oit_number DESC LIMIT 1";
          
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("oit_number");

               int n=Integer.parseInt(rnno);
               n++;
               String snum=Integer.toString(n);

               txtsid.setText(snum);
            
           }
           else
           {
               txtsid.setText("1");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
     private void clear()
    {
       txtsid.setText("");
       txtsname.setText("");
       txtoname.setText("");
      
       txtemail.setText("");
       
        
    }
    
     private void tablelord()
    {
        try {
            String sql="SELECT `oit_number` as 'Item No', `oit_name` as 'Item Name', `price` as 'Price', `cost` as 'Cost' FROM `order_item`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblservice.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
       theader();
    }
    
     private void  theader()
    {
    JTableHeader thead = tblservice.getTableHeader();
       thead.setForeground(Color.BLUE);
    
       thead.setFont(new Font("Tahome", Font.BOLD, 14));
       
        TableColumn col1=tblservice.getColumnModel().getColumn(0);
        col1.setPreferredWidth(80);
        TableColumn col2=tblservice.getColumnModel().getColumn(1);
        col2.setPreferredWidth(130);
        TableColumn col3=tblservice.getColumnModel().getColumn(2);
        col3.setPreferredWidth(150);
        TableColumn col4=tblservice.getColumnModel().getColumn(3);
        col4.setPreferredWidth(100);
        
       
        
    }
    
    
    private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsearchActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        
        String sid=txtsid.getText();
        String sname=txtsname.getText();
        String oname=txtoname.getText();
       
        String email=txtemail.getText();
        
        try {
            String q= "INSERT INTO `order_item`(`oit_number`, `oit_name`, `price`, `cost`) VALUES ('"+sid+"','"+sname+"','"+oname+"','"+email+"' )";
            pst=conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Successfully registered");

        }
        catch (Exception e)
        {

            JOptionPane.showMessageDialog(rootPane,e);
        }
        
        clear();
        autoId();
        tablelord();
        btnadd.setEnabled(false);
        
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
       
         String sid=txtsid.getText();
        String sname=txtsname.getText();
        String oname=txtoname.getText();
       
        String email=txtemail.getText();
        
         int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to update");
        if(x==0)
        {
            try {
                String squpdate = "UPDATE `order_item` SET `oit_number`='"+sid+"',`oit_name`='"+sname+"',`price`='"+oname+"',`cost`='"+email+"' WHERE oit_number='"+txtsid.getText()+"'";
                pst=conn.prepareStatement(squpdate);
                pst.execute();
               JOptionPane.showMessageDialog(rootPane, "Successfully Updated");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }

        }
        clear();
        tablelord();
        autoId();
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
      
        int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to delete");
        if(x==0)
        {
            try {
                String sql="DELETE FROM order_item where oit_number='"+ txtsid.getText() +"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");
                tablelord();
                clear();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        autoId();
        btnupdate.setEnabled(false);
        btndelete.setEnabled(false);
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tblserviceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblserviceMouseClicked
      
           DefaultTableModel tmodel=(DefaultTableModel)tblservice.getModel();
        int selectrowindex=tblservice.getSelectedRow();
        
        txtsid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtsname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtoname.setText(tmodel.getValueAt(selectrowindex, 2).toString());
       
        txtemail.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        
        btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        
    }//GEN-LAST:event_tblserviceMouseClicked

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
       
          try {

            String parseSql="SELECT `oit_number` as 'Item No', `oit_name` as 'Item Name', `price` as 'Price', `cost` as 'Cost' FROM `order_item` where oit_number Like'%"+txtsearch.getText()+"%'";
            pst=conn.prepareStatement(parseSql);
            rs=pst.executeQuery();
            tblservice.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtsnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsnameKeyReleased
       btnadd.setEnabled(true);
    }//GEN-LAST:event_txtsnameKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnupdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblservice;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtoname;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsid;
    private javax.swing.JTextField txtsname;
    // End of variables declaration//GEN-END:variables
}
