/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordermanagementsystem;

import static java.lang.Integer.parseInt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public final class Refund extends javax.swing.JFrame {

    DBOperations dbOps = new DBOperations();
    
    Connection con=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String oid="";
    int rowcount=0;
    int row=0;
    int q=0;
    int delivery=0;
    String query;
 
    public Refund() {
        query = "SELECT `orderid` as 'Order Id',`pid` as 'Product Id',`pname` as 'Product Name',`quantity` as 'Quantity',`price` as 'Price' From `order`";
        initComponents();
        con = dbOps.connect();      //Set DB Connection
        tableLoad();       //Load Data to Table
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        find = new javax.swing.JButton();
        refund = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        order = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Refund Order");
        setPreferredSize(new java.awt.Dimension(850, 500));

        jPanel1.setBackground(new java.awt.Color(204, 255, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jTable1.setAutoCreateRowSorter(true);
        jTable1.setBackground(new java.awt.Color(204, 255, 255));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order Id", "Prroduct Id", "Product Name", "Quantity"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Search Order");

        find.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Search.png"))); // NOI18N
        find.setText("Find");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        refund.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        refund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/changeqty.png"))); // NOI18N
        refund.setText("Refund");
        refund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refundActionPerformed(evt);
            }
        });

        clear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Refresh.png"))); // NOI18N
        clear.setText("Clear");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        order.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                orderKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Enter Refund Quantity");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("               Refund Orders");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(qty, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(order)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(refund)
                        .addGap(5, 5, 5)
                        .addComponent(find)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clear)))
                .addGap(11, 11, 11))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3)
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(order, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(refund, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleName("Refund Orders");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        
        order.setText("");      //Tex Boxes clear
        qty.setText("");
        query = "SELECT `orderid` as 'Order Id',`pid` as 'Product Id',`pname` as 'Product Name',`quantity` as 'Quantity',`price` as 'Price'  From `order`";
        tableLoad();       //Load Table Data
        
    }//GEN-LAST:event_clearActionPerformed

    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        
        oid=order.getText();
        query="SELECT `orderid` as 'Order Id',`pid` as 'Product Id',`pname` as 'Product Name',`quantity` as 'Quantity',`price` as 'Price'  From `order` where `orderid` like '"+oid+"'";
        tableLoad();
        
        if(!oid.equalsIgnoreCase("")){      //Check whether order id is set
            
            rowcount=jTable1.getRowCount();     //count tables row
            
                if(rowcount<1){     //check Table Have Data
                    JOptionPane.showMessageDialog(null, "No Orders Found!","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                
                    this.tableLoad();   
                }
               
        }else{
                this.tableLoad();
                JOptionPane.showMessageDialog(null, "No Orders set!","Error",JOptionPane.ERROR_MESSAGE);
             }
        
    }                                    

   /* private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        
        row=jTable1.getSelectedRow();   //assign selected row number
        q=(int) jTable1.getValueAt(row, 2);
        qty.setText(jTable1.getValueAt(row, 2).toString()); // set row quantity in to the set quantity box
        
    }//GEN-LAST:event_findActionPerformed
*/
    private void refundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refundActionPerformed
        
        oid=order.getText();
        rowcount=jTable1.getRowCount();
        if(!oid.equalsIgnoreCase("")){  //check the oid is set
               
                if(rowcount<1){ // check wether records found
                    JOptionPane.showMessageDialog(null, "No Orders Found!","Error",JOptionPane.ERROR_MESSAGE);
                }else{
                    
                        this.setQuerry();
                   }      
        }else if(!qty.getText().equalsIgnoreCase("")&&(rowcount>=1)){
            
             this.setQuerry();  // Query Send to the set query method
    }else{
               this.tableLoad();
               JOptionPane.showMessageDialog(null, "No Orders Set!","Error",JOptionPane.ERROR_MESSAGE);
             }
        
    }//GEN-LAST:event_refundActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        row=jTable1.getSelectedRow();   //assign selected row number
        q=(int) jTable1.getValueAt(row, 3);
        qty.setText(jTable1.getValueAt(row, 3).toString()); // set row quantity in to the set quantity box
        order.setText(jTable1.getValueAt(row, 0).toString());
        oid=order.getText();
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void orderKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_orderKeyReleased
        
    }//GEN-LAST:event_orderKeyReleased

public void tableLoad(){
        
                            try{
                                
                                 pst =(PreparedStatement)con.prepareStatement(query);  //Prepare Query for Execute
                                 rs=pst.executeQuery();     //get Result with execute query
                                 jTable1.setModel(DbUtils.resultSetToTableModel(rs));   //set records to table

                            }catch(Exception e){}
                                    
                          }

public void setQuerry(){
                        if(jTable1.getSelectedRowCount()<1){    //check update record set 
                            JOptionPane.showMessageDialog(null, "No Selected Record!","Error",JOptionPane.ERROR_MESSAGE);
                        }else{
                            deliveryCheck();
                            if(delivery!=0){
                            String qy=qty.getText();
                            if(q>=parseInt(qy)){
                                int x=JOptionPane.showConfirmDialog(null, "Do You Realy Want to Refound?");
        
                                    if(x==0) {  // check confirm the update
                                            
                                            
                                            int refund=q-parseInt(qy); //calculate refound
                                            String result="0";  //create new variable for assign value get from database column 
                                            int newRes =0;
                                            int totprice=0;
                                            String sql1="";
                                            String sql2="";     //set default Query
                                            String sql="";
                                            String product=jTable1.getValueAt(row, 1).toString();
                                            String sql3="select `quantity` from `products` where `pid`='"+product+"'";
                                            String sql4="select `pprice` from `products` where `pid`='"+product+"'";
                                            
                                                if(refund==0){  //check whether the product quantity is 0 in order table 
                                                    sql1="Delete From `order` where `orderid`='"+oid+"' and `pid`='"+product+"'";
                                                    JOptionPane.showMessageDialog(this, "successfully!");
                                                }else{
                                                    sql1="Update `order` set `quantity`='"+refund+"' where `orderid`='"+oid+"' and `pid`='"+product+"'";
                                                    
                                                    JOptionPane.showMessageDialog(this, "successfully!");
                                                }
                                            

                                            try{ 
                                                pst=con.prepareStatement(sql1);
                                                pst.execute();  
                                                
                                                
                                                pst=con.prepareStatement(sql3);     // product table updatable queries load quantity
                                                rs=pst.executeQuery();
                                                
                                                if(rs.next())  //Check if there is a Reuslt set
                                                  result = rs.getString(1);  //Take the first one (quantity)from result set
                                                  newRes = parseInt(result);
                                                  newRes=newRes+parseInt(qy);
                                                
                                                pst=con.prepareStatement(sql4);     // product table updatable queries load price
                                                rs=pst.executeQuery();  
                                                
                                                if(rs.next())  //Check if there is a Reuslt set
                                                    result = rs.getString(1); //Take the first one (pprice)from result set
                                                    int pprice=parseInt(result);
                                                    totprice=refund*pprice; //calculate price
                                                    
                                                  sql2="Update `products` set `quantity`='"+newRes+"' where `pid`='"+product+"'";
                                                  sql="update `order` set `price`='"+totprice+"' where `pid`='"+product+"'";
                                                
                                                pst=con.prepareStatement(sql2);
                                                pst.execute();
                                                pst=con.prepareStatement(sql);
                                                pst.execute();
                                            }catch(Exception e){}

                                            this.tableLoad(); // set values into the table   
                                              
                                }   
                            }else{
                                JOptionPane.showMessageDialog(null, "Can't Refund! (Over Limit)","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        
                            }else{
                                JOptionPane.showMessageDialog(null, "Order is Not delivered","Error",JOptionPane.ERROR_MESSAGE);
                            }
                            }    
    
                        
}

private void deliveryCheck(){
    
    String qu="select `delivered` from `order` where `pid`='"+jTable1.getValueAt(row, 1)+"'";
    try{
            pst=con.prepareStatement(qu);
            rs=pst.executeQuery();
            
            if(rs.next())  //Check if there is a Reuslt set
            if(rs.getString(1).equalsIgnoreCase("0")){
                delivery=0;
            }else{
                delivery=1;
            }
    }catch(Exception e){
        
    }
    
    
}
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Refund().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clear;
    private javax.swing.JButton find;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField order;
    private javax.swing.JTextField qty;
    private javax.swing.JButton refund;
    // End of variables declaration//GEN-END:variables
}
