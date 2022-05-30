
package ui;
    
import java.sql.*;
import java.util.HashMap;
import java.util.Vector;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;
import src.DB;
import ui.Home;


public class Student extends javax.swing.JInternalFrame {

  
    DefaultTableModel dtm;
    String _ID = "";
    
    public Student() {
        initComponents();
        
        dtm = (DefaultTableModel)tbl_student.getModel();
        loadData();
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_barcode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_adress = new javax.swing.JTextField();
        txt_bd = new javax.swing.JTextField();
        txt_stname = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txt_contact = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_parent = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_filter = new javax.swing.JTextField();
        pnl_report = new javax.swing.JPanel();

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setText("Student Name  :-");

        jTextField7.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        setClosable(true);
        setIconifiable(true);
        setTitle("Student Admission");

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Student Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 16))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Barcode                  :-");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 35, 140, -1));

        txt_barcode.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_barcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_barcodeActionPerformed(evt);
            }
        });
        jPanel2.add(txt_barcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 32, 265, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setText("Student Name         :-");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 79, 140, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel6.setText("Adress                    :-");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 120, 140, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel8.setText("Birthday                  :-");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 161, 140, -1));

        txt_adress.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_adress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_adressActionPerformed(evt);
            }
        });
        jPanel2.add(txt_adress, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 117, 265, -1));

        txt_bd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_bd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bdActionPerformed(evt);
            }
        });
        jPanel2.add(txt_bd, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 158, 265, -1));

        txt_stname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_stname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_stnameActionPerformed(evt);
            }
        });
        jPanel2.add(txt_stname, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 76, 265, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel9.setText("Gender                   :-");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 200, 140, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel10.setText("Parent / Guardian    :-");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 243, 140, -1));

        txt_contact.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contactActionPerformed(evt);
            }
        });
        jPanel2.add(txt_contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 277, 265, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel11.setText("Contact Number    :-");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 280, 140, -1));

        txt_parent.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_parent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_parentActionPerformed(evt);
            }
        });
        jPanel2.add(txt_parent, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 265, -1));

        txt_gender.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });
        jPanel2.add(txt_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 199, 265, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 70, -1));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 80, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 80, -1));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setText("Report");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 11, 440, 510));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Saved Students", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14))); // NOI18N

        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Barcode", "Name", "Adress", "Birthday", "Gender", "Parent", "Contact Number"
            }
        ));
        tbl_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_student);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Search Table  :-");

        txt_filter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txt_filter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_filterKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout pnl_reportLayout = new javax.swing.GroupLayout(pnl_report);
        pnl_report.setLayout(pnl_reportLayout);
        pnl_reportLayout.setHorizontalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );
        pnl_reportLayout.setVerticalGroup(
            pnl_reportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 288, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(pnl_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_filter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnl_report, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 730, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            DB.getConnection().createStatement().executeUpdate("insert into student(barcode,name,adress,birthday,gender,parent,contact) values('"+txt_barcode.getText()+"','"+txt_stname.getText()+"','"+txt_adress.getText()+"','"+txt_bd.getText()+"','"+txt_gender.getText()+"','"+txt_parent.getText()+"','"+txt_contact.getText()+"' )");
            JOptionPane.showMessageDialog(rootPane , "Data Saved Succesfully");
            loadData();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void txt_parentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_parentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_parentActionPerformed

    private void txt_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contactActionPerformed

    private void txt_stnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_stnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_stnameActionPerformed

    private void txt_bdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_bdActionPerformed

    private void txt_adressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_adressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_adressActionPerformed

    private void txt_barcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_barcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_barcodeActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            
            int selection = JOptionPane.showConfirmDialog(rootPane,"want to delete current data");
            if (selection == 0){
                
                DB.getConnection().createStatement().executeUpdate("delete from student where id='"+_ID+"'");
                JOptionPane.showMessageDialog(rootPane, "Data Deleted");
                loadData();
            
            }
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void tbl_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentMouseClicked
        int selected_row = tbl_student.getSelectedRow();
        txt_barcode.setText(dtm.getValueAt(selected_row, 1).toString());
        txt_stname.setText(dtm.getValueAt(selected_row, 2).toString());
        txt_adress.setText(dtm.getValueAt(selected_row, 3).toString());
        txt_bd.setText(dtm.getValueAt(selected_row, 4).toString());
        txt_gender.setText(dtm.getValueAt(selected_row, 5).toString());
        txt_parent.setText(dtm.getValueAt(selected_row, 6).toString());
        txt_contact.setText(dtm.getValueAt(selected_row, 7).toString());
        
        _ID = dtm.getValueAt(selected_row, 0).toString();
    }//GEN-LAST:event_tbl_studentMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try {
            
            int selection = JOptionPane.showConfirmDialog(rootPane,"want to change current data");
            if (selection == 0){
                
                DB.getConnection().createStatement().executeUpdate("update student set barcode = '"+txt_barcode.getText()+"' , name = '"+txt_stname.getText()+"' , adress = '"+txt_adress.getText()+"' , birthday = '"+txt_adress.getText()+"' , birthday = '"+txt_bd.getText()+"' , gender = '"+txt_gender.getText()+"' , parent = '"+txt_parent.getText()+"' , contact = '"+txt_contact.getText()+"' where id = '"+_ID+"' ");
                JOptionPane.showMessageDialog(rootPane, "Data Updated");
                loadData();
            
            }
            
            
            
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_filterKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_filterKeyReleased
        filter_table(txt_filter.getText().toUpperCase());
    }//GEN-LAST:event_txt_filterKeyReleased

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {
            
                HashMap a = new HashMap();
                String path = "src/rep/Student.jrxml";
                
                JasperDesign jdesign = JRXmlLoader.load(path);
                JasperReport report = JasperCompileManager.compileReport(jdesign);
                JasperPrint jprint = JasperFillManager.fillReport(report, a,new JREmptyDataSource());
                JRViewer viwer = new JRViewer(jprint);
                
                pnl_report.add(viwer);
              
                      
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jButton5ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JPanel pnl_report;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txt_adress;
    private javax.swing.JTextField txt_barcode;
    private javax.swing.JTextField txt_bd;
    private javax.swing.JTextField txt_contact;
    private javax.swing.JTextField txt_filter;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_parent;
    private javax.swing.JTextField txt_stname;
    // End of variables declaration//GEN-END:variables
      
void loadData(){
            try {
                dtm.setRowCount(0);
                ResultSet rs  = DB.getConnection().createStatement().executeQuery("select * from student");
                
                
                while(rs.next()){
                    Vector v = new Vector();
                    v.add(rs.getString("id").toUpperCase());
                    v.add(rs.getString("barcode").toUpperCase());
                    v.add(rs.getString("name").toUpperCase());
                    v.add(rs.getString("adress").toUpperCase());
                    v.add(rs.getString("birthday").toUpperCase());
                    v.add(rs.getString("gender").toUpperCase());
                    v.add(rs.getString("parent").toUpperCase());
                    v.add(rs.getString("contact").toUpperCase());
                    
                    dtm.addRow(v);
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            
            }
 
       
        
}

    void filter_table(String query){
        
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
        tbl_student.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(query));
        
        
    }



}
