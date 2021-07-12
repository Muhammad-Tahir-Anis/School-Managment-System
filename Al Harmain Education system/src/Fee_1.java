
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.print.PrinterException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usama Arshad
 */
public class Fee_1 extends javax.swing.JFrame {

    /**
     * Creates new form Fee
     */
    
    java.sql.Connection con=null;
    ResultSet rs=null;
    Statement st;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    
    public void print(){
jTextArea1.setText("         **********************************************************\n");
        jTextArea1.setText(jTextArea1.getText()+"         ***                              Al Harmain School System                            ***\n");
        jTextArea1.setText(jTextArea1.getText()+"         **********************************************************\n\n");
        jTextArea1.setText(jTextArea1.getText()+"         *****************************************\n");
        jTextArea1.setText(jTextArea1.getText()+"         ***                             Fee Slip                           ***\n");
        jTextArea1.setText(jTextArea1.getText()+"         *****************************************\n\n");
        Date obj = new Date();
        String date = obj.toString();
        jTextArea1.setText(jTextArea1.getText()+"\n"+"          "+date+"\n\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Addmission no of Student is :       "+Tf_Ff_rollnum.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Student Name  :                              "+Tf_Ff_rollnum.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Father Name :                                 "+Tf_Ff_rollnum.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Class :                                              "+Tf_Ff_rollnum.getText()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Fee Month  :                                   "+jComboBox2.getSelectedItem()+"\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Fee  :                                                "+Tf_Ff_EFee.getText()+"Rs\n\n");
        jTextArea1.setText(jTextArea1.getText()+"          Dues :                                               "+Tf_Ff_Adue.getText()+"Rs\n\n\n\n\n\n");
        jTextArea1.setText(jTextArea1.getText()+"                                                          Signature_______________________");

}
    
    
    public Fee_1() {
        initComponents();
        Tf_Ff_EFee.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                    }
                }
            });
        
        Tf_Ff_Adue.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                    }
                }
            });
        Tf_Ff_rollnum.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                    }
                }
            });
        //Object source = Cb_Ff_Ad.getSelectedObjects();
        Tf_Ff_Adue.setEditable(false);
        this.setLocationRelativeTo(null);
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
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Tf_Ff_rollnum = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        Tf_Ff_EFee = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        Bt_Ff_Change = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        Tf_Ff_Adue = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        Cb_Ff_Ad = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Al Harmain Education System");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 630, 690));
        setMinimumSize(new java.awt.Dimension(800, 700));
        setPreferredSize(new java.awt.Dimension(800, 700));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        jPanel3.setMinimumSize(new java.awt.Dimension(800, 650));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 650));

        jLabel2.setText("Admission No");

        jLabel3.setText("Month");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "Octuber", "November", "December" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Enter Fee");

        jButton1.setText("Add Fee");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Bt_Ff_Change.setText("Change");
        Bt_Ff_Change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ff_ChangeActionPerformed(evt);
            }
        });

        jLabel6.setText("Any Due");

        jLabel14.setText(" Usama Arshad contact 03482184556");

        jLabel15.setText("Copy rights Reserved");

        jButton2.setText("Print slip");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        Cb_Ff_Ad.setText("jCheckBox1");
        Cb_Ff_Ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Cb_Ff_AdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tf_Ff_rollnum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(45, 45, 45)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tf_Ff_Adue))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(Tf_Ff_EFee, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cb_Ff_Ad, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Bt_Ff_Change)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(462, 462, 462))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(384, 384, 384)
                                .addComponent(jLabel15)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(Tf_Ff_rollnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(Tf_Ff_EFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(Tf_Ff_Adue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Cb_Ff_Ad))
                        .addGap(140, 140, 140)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bt_Ff_Change, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Fee Form");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(54, 54, 54))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton4.setBackground(new java.awt.Color(255, 204, 51));
        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("<=Back");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 768, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addGap(170, 170, 170)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FeeOption m = new FeeOption();
        m.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try
        {
            jTextArea1.print();
        }
        catch(PrinterException e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Bt_Ff_ChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ff_ChangeActionPerformed

        try {
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
            st=(Statement) con.createStatement();
            Integer Id=Integer.valueOf(Tf_Ff_rollnum.getText());
            Integer due=Integer.valueOf(Tf_Ff_Adue.getText());
            pst = con.prepareStatement("update fee set Due=? where ID=?");
            pst.setInt(1, due);
            pst.setInt(2,Id);
            pst.executeUpdate();
            print();
            JOptionPane.showMessageDialog(null, "Your Due Is Successfully Changed");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
            Logger.getLogger(Fee_1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt_Ff_ChangeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        try{
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
            st=(Statement) con.createStatement();
            Integer Id=Integer.valueOf(Tf_Ff_rollnum.getText());
            Integer Fee = Integer.valueOf(Tf_Ff_EFee.getText());
            
            pst2=con.prepareStatement("Select * from FEE where ID = ?");
                pst2.setInt(1, Id);
                rs=pst2.executeQuery();
            
            pst1=con.prepareStatement("Update fee set TOTAL=5000,GTOTAL=60000 where ID =?");
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("january")){
                pst1.setInt(1,Id);
                pst1.executeUpdate();
                
            pst=con.prepareStatement("Update FEE set JAN=?,PAID=?,DUE=? where ID=?");
            
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }
                
            }
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("february")){
            pst=con.prepareStatement("Update FEE set FEB=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }
            }
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("march")){
            pst=con.prepareStatement("Update FEE set MAR=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("april")){
            pst=con.prepareStatement("Update FEE set APR=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("may")){
            pst=con.prepareStatement("Update FEE set MAY=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("june")){
            pst=con.prepareStatement("Update FEE set JUN=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("july")){
            pst=con.prepareStatement("Update FEE set JUL=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("august")){
            pst=con.prepareStatement("Update FEE set AUG=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("september")){
            pst=con.prepareStatement("Update FEE set SEP=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("octuber")){
            pst=con.prepareStatement("Update FEE set OCT=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("november")){
            pst=con.prepareStatement("Update FEE set NOV=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("TOTAL")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            if(jComboBox2.getSelectedItem().toString().equalsIgnoreCase("december")){
            pst=con.prepareStatement("Update FEE set DCE=?,PAID=?,DUE=? where ID=?");
            if(rs.next()){
                String d=String.valueOf(rs.getInt("GTOTAL")-rs.getInt("JAN")-rs.getInt("FEB")
                -rs.getInt("MAR")-rs.getInt("APR")-rs.getInt("MAY")-rs.getInt("JUN")
                        -rs.getInt("JUL")-rs.getInt("AUG")-rs.getInt("SEP")-rs.getInt("OCT")
                        -rs.getInt("NOV")-Fee);
                Tf_Ff_Adue.setText(d);
                
            Integer du=Integer.valueOf(d);
            pst.setInt(1,Fee);
            pst.setBoolean(2, true);
            pst.setInt(3,du);
            pst.setInt(4,Id);
            pst.executeUpdate();
            }}
            print();
            JOptionPane.showMessageDialog(null, "Please Print Your Challan");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
// TODO add your handling code here:
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void Cb_Ff_AdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Cb_Ff_AdActionPerformed
        // TODO add your handling code here:
if(Cb_Ff_Ad.isSelected()){
            Tf_Ff_Adue.setEditable(true);
        }else{
            Tf_Ff_Adue.setEditable(false);
        }        
    }//GEN-LAST:event_Cb_Ff_AdActionPerformed

    /**
     * @param args the command line arguments
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
            java.util.logging.Logger.getLogger(Fee_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fee_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fee_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fee_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fee_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Ff_Change;
    private javax.swing.JCheckBox Cb_Ff_Ad;
    private javax.swing.JTextField Tf_Ff_Adue;
    private javax.swing.JTextField Tf_Ff_EFee;
    private javax.swing.JTextField Tf_Ff_rollnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    private String getText(JTextField Tf_Ff_rollnum) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
