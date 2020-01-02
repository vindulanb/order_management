
package ordermanagementsystem;

import com.mysql.jdbc.PreparedStatement;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;


public class Confirmorder extends javax.swing.JFrame {

    DBOperations db=new DBOperations();
    
    String order="";
    String seller="";
    
    String query;
    String query1;          // Declare Variables
    String query2;
    
    String msg1;
    String msg2;
       
    public Confirmorder() {
        initComponents();
        
        db.con = db.connect(); //calling DBoerators class method
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ordertext = new javax.swing.JTextField();
        sellertext = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Confirm = new javax.swing.JButton();
        cancelorder = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Delivery confirmaton");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setText("Order ID");

        ordertext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        sellertext.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sellertext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sellertextActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Seller ID");

        Confirm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Confirm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeqty.png"))); // NOI18N
        Confirm.setText("Confirm");
        Confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmActionPerformed(evt);
            }
        });

        cancelorder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cancelorder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete1.png"))); // NOI18N
        cancelorder.setText("Cancel Order");
        cancelorder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelorderActionPerformed(evt);
            }
        });

        Clear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        Clear.setText("Clear");
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });

        jButton1.setText("ireport");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(50, 50, 50)
                .addComponent(cancelorder)
                .addGap(26, 26, 26)
                .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(ordertext, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sellertext)))
                .addGap(369, 469, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(ordertext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sellertext, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelorder, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(32, 32, 32))))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sellertextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sellertextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sellertextActionPerformed

    private void ConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmActionPerformed
        
        variableClear();
        order=ordertext.getText();
        seller=sellertext.getText();        //get Text Boxes Values
        
        //query set
        query="update `order` set `delivered`='1',`delivererID`='"+seller+"' where `orderid`='"+order+"'";
        query1="select `orderid` from `order` where `orderid`='"+order+"' and `delivered`='0'"; 
        msg1="Do You Realy Want to Delivery Confirm..?";
        msg2="Succesfully Confirm..!";                      //set message dialog
        
        setQuery();     // calling set query method
        
    }//GEN-LAST:event_ConfirmActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        
            clear();    // Text Box Clear method
            variableClear();
    }//GEN-LAST:event_ClearActionPerformed

    private void cancelorderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelorderActionPerformed
        
        variableClear();
        order=ordertext.getText();
        seller=sellertext.getText();
        
        //Query set
        query="Delete from `order` where `orderid`='"+order+"'";
        query1="select `orderid` from `order` where `orderid`='"+order+"' and `delivered`='0'";

        msg1="Do You Realy Want to Cancell Order..?";
        msg2="Succesfully Canceled Order..!";           //set message dialog
        
        setQuery();
    }//GEN-LAST:event_cancelorderActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            String reportPath = "E:\\Documents\\IT16111752\\Assignments, Presentations, Projects\\ST2\\OrderManagementSystem\\reportings\\Confirmations.jrxml";
            JasperReport jar = JasperCompileManager.compileReport(reportPath);
            JasperPrint jp = JasperFillManager.fillReport(jar, null, db.con);
            JasperViewer.viewReport(jp, false);
            //jar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            //JasperViewer.viewReport(jp, false);
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public void clear(){
        
        ordertext.setText("");
        sellertext.setText("");
        
    }
    
    public void variableClear(){
        msg1="";
        msg2="";
        query="";
        query1="";
    }
    
    public void setQuery(){
        if(!order.equalsIgnoreCase("")){
            
            if(!seller.equalsIgnoreCase("")){
                
                
                try{
                    
                    db.pst=(PreparedStatement) db.con.prepareStatement(query1);
                    db.rs=db.pst.executeQuery();
                    
                    if(db.rs.next()){
                        int x=JOptionPane.showConfirmDialog(null,msg1);
                        if(x==0){
                            db.pst=(PreparedStatement) db.con.prepareStatement(query);
                            db.pst.execute();
                            JOptionPane.showMessageDialog(null,msg2);
                            clear();
                        }
                    }else{
                        JOptionPane.showMessageDialog(null, "Operation Failed","Error",JOptionPane.ERROR_MESSAGE);
                   
                    }
                    
                }catch(Exception e){
                    
                     
                }
                
            
            }else{
                JOptionPane.showMessageDialog(null, "Seller Id field is Empty!","Error",JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Order Id field is Empty!","Error",JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(Confirmorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirmorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirmorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirmorder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirmorder().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clear;
    private javax.swing.JButton Confirm;
    private javax.swing.JButton cancelorder;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField ordertext;
    private javax.swing.JTextField sellertext;
    // End of variables declaration//GEN-END:variables
}
