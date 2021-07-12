
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usama Arshad
 */
public class Attendance extends javax.swing.JFrame {

    java.sql.Connection con=null;
    ResultSet rs=null;
    Statement st;
    PreparedStatement pst;
    PreparedStatement pst1;
    
    String tf[]=new String[31];
    int id[]=new int[100];
    /**
     * Creates new form attendance
     */
    ButtonGroup bg1=new ButtonGroup();
    ButtonGroup bg2=new ButtonGroup();
    ButtonGroup bg3=new ButtonGroup();
    ButtonGroup bg4=new ButtonGroup();
    ButtonGroup bg5=new ButtonGroup();
    ButtonGroup bg6=new ButtonGroup();
    ButtonGroup bg7=new ButtonGroup();
    ButtonGroup bg8=new ButtonGroup();
    ButtonGroup bg9=new ButtonGroup();
    ButtonGroup bg10=new ButtonGroup();
    ButtonGroup bg11=new ButtonGroup();
    ButtonGroup bg12=new ButtonGroup();
    ButtonGroup bg13=new ButtonGroup();
    ButtonGroup bg14=new ButtonGroup();
    ButtonGroup bg15=new ButtonGroup();
    ButtonGroup bg16=new ButtonGroup();
    ButtonGroup bg17=new ButtonGroup();
    ButtonGroup bg18=new ButtonGroup();
    ButtonGroup bg19=new ButtonGroup();
    ButtonGroup bg20=new ButtonGroup();
    ButtonGroup bg21=new ButtonGroup();
    ButtonGroup bg22=new ButtonGroup();
    ButtonGroup bg23=new ButtonGroup();
    ButtonGroup bg24=new ButtonGroup();
    ButtonGroup bg25=new ButtonGroup();
    ButtonGroup bg26=new ButtonGroup();
    ButtonGroup bg27=new ButtonGroup();
    ButtonGroup bg28=new ButtonGroup();
    ButtonGroup bg29=new ButtonGroup();
    ButtonGroup bg30=new ButtonGroup();
    
    public Attendance() {
        
        
        initComponents();
        bg1.add(Bt_At_A1);
         bg1.add(Bt_At_p1);
         Bt_At_p1.setSelected(true);
         bg2.add(Bt_At_a2);
         bg2.add(Bt_At_p2);
         Bt_At_p2.setSelected(true);
         bg3.add(Bt_At_a3);
         bg3.add(Bt_At_p3);
         Bt_At_p3.setSelected(true);
         bg4.add(Bt_At_a4);
         bg4.add(Bt_At_p4);
         Bt_At_p4.setSelected(true);
         bg5.add(Bt_At_a5);
         bg5.add(Bt_At_p5);
         Bt_At_p5.setSelected(true);
         bg6.add(Bt_At_a6);
         bg6.add(Bt_At_p6);
         Bt_At_p6.setSelected(true);
         bg7.add(Bt_At_a7);
         bg7.add(Bt_At_p7);
         Bt_At_p7.setSelected(true);
         bg8.add(Bt_At_a8);
         bg8.add(Bt_At_p8);
         Bt_At_p8.setSelected(true);
         bg9.add(Bt_At_a9);
         bg9.add(Bt_At_p9);
         Bt_At_p9.setSelected(true);
         bg10.add(Bt_At_a10);
         bg10.add(Bt_At_p10);
         Bt_At_p10.setSelected(true);
         bg11.add(Bt_At_a11);
         bg11.add(Bt_At_p11);
         Bt_At_p11.setSelected(true);
         bg12.add(Bt_At_a12);
         bg12.add(Bt_At_p12);
         Bt_At_p12.setSelected(true);
         bg13.add(Bt_At_a13);
         bg13.add(Bt_At_p13);
         Bt_At_p13.setSelected(true);
         bg14.add(Bt_At_a14);
         bg14.add(Bt_At_p14);
         Bt_At_p14.setSelected(true);
         bg15.add(Bt_At_a15);
         bg15.add(Bt_At_p15);
         Bt_At_p15.setSelected(true);
         bg16.add(Bt_At_a16);
         bg16.add(Bt_At_p16);
         Bt_At_p16.setSelected(true);
         bg17.add(Bt_At_a17);
         bg17.add(Bt_At_p17);
         Bt_At_p17.setSelected(true);
         bg18.add(Bt_At_a18);
         bg18.add(Bt_At_p18);
         Bt_At_p18.setSelected(true);
         bg19.add(Bt_At_a19);
         bg19.add(Bt_At_p19);
         Bt_At_p19.setSelected(true);
         bg20.add(Bt_At_a20);
         bg20.add(Bt_At_p20);
         Bt_At_p20.setSelected(true);
         bg21.add(Bt_At_a21);
         bg21.add(Bt_At_p21);
         Bt_At_p21.setSelected(true);
         bg22.add(Bt_At_a22);
         bg22.add(Bt_At_p22);
         Bt_At_p22.setSelected(true);
         bg23.add(Bt_At_a23);
         bg23.add(Bt_At_p23);
         Bt_At_p23.setSelected(true);
         bg24.add(Bt_At_a24);
         bg24.add(Bt_At_p24);
         Bt_At_p24.setSelected(true);
         bg25.add(Bt_At_a25);
         bg25.add(Bt_At_p25);
         Bt_At_p25.setSelected(true);
         bg26.add(Bt_At_a26);
         bg26.add(Bt_At_p26);
         Bt_At_p26.setSelected(true);
         bg27.add(Bt_At_a27);
         bg27.add(Bt_At_p27);
         Bt_At_p27.setSelected(true);
         bg28.add(Bt_At_a28);
         bg28.add(Bt_At_p28);
         Bt_At_p28.setSelected(true);
         bg29.add(Bt_At_a29);
         bg29.add(Bt_At_p29);
         Bt_At_p29.setSelected(true);
         bg30.add(Bt_At_a30);
         bg30.add(Bt_At_p30);
         Bt_At_p30.setSelected(true);
         
         Tf_At_name1.setEditable(false);
         Tf_At_name2.setEditable(false);
         Tf_At_name3.setEditable(false);
         Tf_At_name4.setEditable(false);
         Tf_At_name5.setEditable(false);
         Tf_At_name6.setEditable(false);
         Tf_At_name7.setEditable(false);
         Tf_At_name8.setEditable(false);
         Tf_At_name9.setEditable(false);
         Tf_At_name10.setEditable(false);
         Tf_At_name11.setEditable(false);
         Tf_At_name12.setEditable(false);
         Tf_At_name13.setEditable(false);
         Tf_At_name14.setEditable(false);
         Tf_At_name15.setEditable(false);
         Tf_At_name16.setEditable(false);
         Tf_At_name17.setEditable(false);
         Tf_At_name18.setEditable(false);
         Tf_At_name19.setEditable(false);
         Tf_At_name20.setEditable(false);
         Tf_At_name21.setEditable(false);
         Tf_At_name22.setEditable(false);
         Tf_At_name23.setEditable(false);
         Tf_At_name24.setEditable(false);
         Tf_At_name25.setEditable(false);
         Tf_At_name26.setEditable(false);
         Tf_At_name27.setEditable(false);
         Tf_At_name28.setEditable(false);
         Tf_At_name29.setEditable(false);
         Tf_At_name30.setEditable(false);
         
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel5 = new javax.swing.JPanel();
        Tf_At_name1 = new javax.swing.JTextField();
        Bt_At_p1 = new javax.swing.JRadioButton();
        Bt_At_A1 = new javax.swing.JRadioButton();
        Tf_At_name19 = new javax.swing.JTextField();
        Tf_At_name20 = new javax.swing.JTextField();
        Tf_At_name21 = new javax.swing.JTextField();
        Tf_At_name22 = new javax.swing.JTextField();
        Tf_At_name23 = new javax.swing.JTextField();
        Tf_At_name24 = new javax.swing.JTextField();
        Tf_At_name25 = new javax.swing.JTextField();
        Tf_At_name26 = new javax.swing.JTextField();
        Tf_At_name27 = new javax.swing.JTextField();
        Tf_At_name28 = new javax.swing.JTextField();
        Tf_At_name29 = new javax.swing.JTextField();
        Bt_At_p19 = new javax.swing.JRadioButton();
        Bt_At_p20 = new javax.swing.JRadioButton();
        Bt_At_p21 = new javax.swing.JRadioButton();
        Bt_At_p22 = new javax.swing.JRadioButton();
        Bt_At_p23 = new javax.swing.JRadioButton();
        Bt_At_p24 = new javax.swing.JRadioButton();
        Bt_At_p25 = new javax.swing.JRadioButton();
        Bt_At_p26 = new javax.swing.JRadioButton();
        Bt_At_p27 = new javax.swing.JRadioButton();
        Bt_At_p28 = new javax.swing.JRadioButton();
        Bt_At_p29 = new javax.swing.JRadioButton();
        Bt_At_a19 = new javax.swing.JRadioButton();
        Bt_At_a20 = new javax.swing.JRadioButton();
        Bt_At_a21 = new javax.swing.JRadioButton();
        Bt_At_a22 = new javax.swing.JRadioButton();
        Bt_At_a23 = new javax.swing.JRadioButton();
        Bt_At_a24 = new javax.swing.JRadioButton();
        Bt_At_a25 = new javax.swing.JRadioButton();
        Bt_At_a26 = new javax.swing.JRadioButton();
        Bt_At_a27 = new javax.swing.JRadioButton();
        Bt_At_a28 = new javax.swing.JRadioButton();
        Bt_At_a29 = new javax.swing.JRadioButton();
        Tf_At_name8 = new javax.swing.JTextField();
        Bt_At_p8 = new javax.swing.JRadioButton();
        Bt_At_a8 = new javax.swing.JRadioButton();
        Tf_At_name9 = new javax.swing.JTextField();
        Bt_At_p9 = new javax.swing.JRadioButton();
        Bt_At_a9 = new javax.swing.JRadioButton();
        Tf_At_name10 = new javax.swing.JTextField();
        Bt_At_p10 = new javax.swing.JRadioButton();
        Bt_At_a10 = new javax.swing.JRadioButton();
        Tf_At_name11 = new javax.swing.JTextField();
        Bt_At_p11 = new javax.swing.JRadioButton();
        Bt_At_a11 = new javax.swing.JRadioButton();
        Tf_At_name12 = new javax.swing.JTextField();
        Bt_At_p12 = new javax.swing.JRadioButton();
        Bt_At_a12 = new javax.swing.JRadioButton();
        Tf_At_name13 = new javax.swing.JTextField();
        Bt_At_p13 = new javax.swing.JRadioButton();
        Bt_At_a13 = new javax.swing.JRadioButton();
        Tf_At_name14 = new javax.swing.JTextField();
        Bt_At_p14 = new javax.swing.JRadioButton();
        Bt_At_a14 = new javax.swing.JRadioButton();
        Tf_At_name15 = new javax.swing.JTextField();
        Bt_At_p15 = new javax.swing.JRadioButton();
        Bt_At_a15 = new javax.swing.JRadioButton();
        Tf_At_name16 = new javax.swing.JTextField();
        Bt_At_p16 = new javax.swing.JRadioButton();
        Bt_At_a16 = new javax.swing.JRadioButton();
        Tf_At_name17 = new javax.swing.JTextField();
        Bt_At_p17 = new javax.swing.JRadioButton();
        Bt_At_a17 = new javax.swing.JRadioButton();
        Tf_At_name18 = new javax.swing.JTextField();
        Bt_At_p18 = new javax.swing.JRadioButton();
        Bt_At_a18 = new javax.swing.JRadioButton();
        Tf_At_name2 = new javax.swing.JTextField();
        Bt_At_p2 = new javax.swing.JRadioButton();
        Bt_At_a2 = new javax.swing.JRadioButton();
        Tf_At_name3 = new javax.swing.JTextField();
        Bt_At_p3 = new javax.swing.JRadioButton();
        Bt_At_a3 = new javax.swing.JRadioButton();
        Tf_At_name4 = new javax.swing.JTextField();
        Bt_At_p4 = new javax.swing.JRadioButton();
        Bt_At_a4 = new javax.swing.JRadioButton();
        Tf_At_name5 = new javax.swing.JTextField();
        Bt_At_p5 = new javax.swing.JRadioButton();
        Bt_At_a5 = new javax.swing.JRadioButton();
        Tf_At_name6 = new javax.swing.JTextField();
        Bt_At_p6 = new javax.swing.JRadioButton();
        Bt_At_a6 = new javax.swing.JRadioButton();
        Tf_At_name7 = new javax.swing.JTextField();
        Bt_At_p7 = new javax.swing.JRadioButton();
        Bt_At_a7 = new javax.swing.JRadioButton();
        Tf_At_name30 = new javax.swing.JTextField();
        Bt_At_p30 = new javax.swing.JRadioButton();
        Bt_At_a30 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        Bt_At_Reset = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jXDatePicker3 = new org.jdesktop.swingx.JXDatePicker();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        jLabel4.setText("jLabel4");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Al Harmain School System");
        setMaximizedBounds(new java.awt.Rectangle(50, 50, 600, 900));
        setMinimumSize(new java.awt.Dimension(600, 900));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 0));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jLabel10.setText("Enter Roll no");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel11.setText("Name");

        jLabel12.setText("Present");

        jLabel13.setText("Absenties");

        jTextField18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField18ActionPerformed(evt);
            }
        });

        jLabel14.setText(" Usama Arshad contact 03482184556");

        jLabel15.setText("Copy rights Reserved");

        jButton2.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton2.setText("search");

        jScrollPane1.setBackground(new java.awt.Color(204, 255, 204));

        jPanel5.setBackground(new java.awt.Color(255, 204, 102));

        Bt_At_p1.setText("Present");
        Bt_At_p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_At_p1ActionPerformed(evt);
            }
        });

        Bt_At_A1.setText("Absent");

        Bt_At_p19.setText("Present");

        Bt_At_p20.setText("Present");

        Bt_At_p21.setText("Present");

        Bt_At_p22.setText("Present");

        Bt_At_p23.setText("Present");

        Bt_At_p24.setText("Present");

        Bt_At_p25.setText("Present");

        Bt_At_p26.setText("Present");

        Bt_At_p27.setText("Present");

        Bt_At_p28.setText("Present");

        Bt_At_p29.setText("Present");

        Bt_At_a19.setText("Absent");

        Bt_At_a20.setText("Absent");

        Bt_At_a21.setText("Absent");

        Bt_At_a22.setText("Absent");

        Bt_At_a23.setText("Absent");

        Bt_At_a24.setText("Absent");

        Bt_At_a25.setText("Absent");

        Bt_At_a26.setText("Absent");

        Bt_At_a27.setText("Absent");

        Bt_At_a28.setText("Absent");

        Bt_At_a29.setText("Absent");

        Bt_At_p8.setText("Present");

        Bt_At_a8.setText("Absent");

        Bt_At_p9.setText("Present");

        Bt_At_a9.setText("Absent");

        Bt_At_p10.setText("Present");

        Bt_At_a10.setText("Absent");

        Bt_At_p11.setText("Present");

        Bt_At_a11.setText("Absent");

        Bt_At_p12.setText("Present");

        Bt_At_a12.setText("Absent");

        Bt_At_p13.setText("Present");

        Bt_At_a13.setText("Absent");

        Bt_At_p14.setText("Present");

        Bt_At_a14.setText("Absent");

        Bt_At_p15.setText("Present");

        Bt_At_a15.setText("Absent");

        Bt_At_p16.setText("Present");

        Bt_At_a16.setText("Absent");

        Bt_At_p17.setText("Present");

        Bt_At_a17.setText("Absent");

        Bt_At_p18.setText("Present");

        Bt_At_a18.setText("Absent");

        Bt_At_p2.setText("Present");

        Bt_At_a2.setText("Absent");

        Bt_At_p3.setText("Present");

        Bt_At_a3.setText("Absent");

        Bt_At_p4.setText("Present");

        Bt_At_a4.setText("Absent");

        Bt_At_p5.setText("Present");

        Bt_At_a5.setText("Absent");

        Bt_At_p6.setText("Present");

        Bt_At_a6.setText("Absent");

        Bt_At_p7.setText("Present");

        Bt_At_a7.setText("Absent");

        Bt_At_p30.setText("Present");

        Bt_At_a30.setText("Absent");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name8, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a8))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name9, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a9))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name10, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a10))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name11, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a11))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name12, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a12))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name13, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a13))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name14, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a14))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name15, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a15))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name16, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a16))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name17, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a17))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name18, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a2))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name3, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a3))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name4, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a5))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name6, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(Tf_At_name7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(Bt_At_p7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Bt_At_a7))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(Tf_At_name30, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(64, 64, 64)
                            .addComponent(Bt_At_p30)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Bt_At_a30))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Tf_At_name1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name19, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name20, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name21, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name22, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name23, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name24, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name25, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name26, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name27, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name28, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Tf_At_name29, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p29)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a29))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p28)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a28))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p27)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a27))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p26)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a26))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p25)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a25))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p24)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a24))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p23)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a23))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p22)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a22))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p19)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Bt_At_a19))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(Bt_At_p1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Bt_At_A1))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bt_At_p20)
                                        .addComponent(Bt_At_p21))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Bt_At_a20)
                                        .addComponent(Bt_At_a21)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p1)
                    .addComponent(Bt_At_A1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p2)
                    .addComponent(Bt_At_a2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p3)
                    .addComponent(Bt_At_a3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p4)
                    .addComponent(Bt_At_a4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p5)
                    .addComponent(Bt_At_a5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p6)
                    .addComponent(Bt_At_a6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p7)
                    .addComponent(Bt_At_a7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p8)
                    .addComponent(Bt_At_a8))
                .addGap(7, 7, 7)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p9)
                    .addComponent(Bt_At_a9))
                .addGap(6, 6, 6)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p10)
                    .addComponent(Bt_At_a10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p11)
                    .addComponent(Bt_At_a11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p12)
                    .addComponent(Bt_At_a12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p13)
                    .addComponent(Bt_At_a13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p14)
                    .addComponent(Bt_At_a14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p15)
                    .addComponent(Bt_At_a15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p16)
                    .addComponent(Bt_At_a16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p17)
                    .addComponent(Bt_At_a17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p18)
                    .addComponent(Bt_At_a18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Tf_At_name19, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Bt_At_p19)
                        .addComponent(Bt_At_a19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p20)
                    .addComponent(Bt_At_a20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p21)
                    .addComponent(Bt_At_a21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p22)
                    .addComponent(Bt_At_a22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p23)
                    .addComponent(Bt_At_a23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p24)
                    .addComponent(Bt_At_a24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p25)
                    .addComponent(Bt_At_a25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p26)
                    .addComponent(Bt_At_a26))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p27)
                    .addComponent(Bt_At_a27))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p28)
                    .addComponent(Bt_At_a28))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p29)
                    .addComponent(Bt_At_a29))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_At_name30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Bt_At_p30)
                    .addComponent(Bt_At_a30))
                .addContainerGap())
        );

        jScrollPane1.setViewportView(jPanel5);

        jButton1.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Bt_At_Reset.setFont(new java.awt.Font("Trebuchet MS", 1, 12)); // NOI18N
        Bt_At_Reset.setText("Reset");
        Bt_At_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_At_ResetActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Class");

        jLabel5.setText("Names");

        jLabel6.setText("Select Date");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(14, 14, 14))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bt_At_Reset)
                .addGap(107, 107, 107))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(172, 172, 172)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(35, 35, 35)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jXDatePicker3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(15, 15, 15)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(Bt_At_Reset))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)))
        );

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        jLabel2.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Attendance");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(255, 204, 51));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("<=Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(65, 65, 65)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(3, 3, 3)))
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

    private void jTextField18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField18ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField18ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
         this.setVisible(false);
        MainOption f = new MainOption ();
         f.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
            try {
                con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
                st=(Statement)con.createStatement();
                pst=con.prepareStatement("select * from student where class =?");
                pst1=con.prepareStatement("insert into attandance (ID,NAME,CLASS,Date) values (?,?,?,?)");
                Integer Int = Integer.valueOf(jComboBox1.getSelectedItem().toString());
        int Class = Int;
        int i=1;
        pst.setInt(1, Class);
        rs=pst.executeQuery();
        while(rs.next()){
        switch(Class){
            case 1:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 2:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 3:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 4:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 5:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 6:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 7:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;
                break;
            case 8:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                i++;
                break;
            case 9:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;      
                break;
            case 10:
                tf[i]=rs.getString("FIRST_NAME")+" "+rs.getString("Last_Name");
                pst1.setInt(1, rs.getInt("ID"));
                pst1.setString(2,tf[i]);
                pst1.setInt(3,Class);
                pst1.setString(4, jXDatePicker3.getDate().toString());
                pst1.executeUpdate();
                i++;      
                break;
        }
        }
       //pst=con.prepareStatement("Delete from STUDENT where id=id");
        //pst.executeUpdate();
        i=1;
        Tf_At_name1.setText(tf[1]);
        Tf_At_name2.setText(tf[2]);
        Tf_At_name3.setText(tf[3]);
        Tf_At_name4.setText(tf[4]);
        Tf_At_name5.setText(tf[5]);
        Tf_At_name6.setText(tf[6]);
        Tf_At_name7.setText(tf[7]);
        Tf_At_name8.setText(tf[8]);
        Tf_At_name9.setText(tf[9]);
        Tf_At_name10.setText(tf[10]);
        Tf_At_name11.setText(tf[12]);
        Tf_At_name12.setText(tf[13]);
        Tf_At_name13.setText(tf[14]);
        Tf_At_name14.setText(tf[15]);
        Tf_At_name15.setText(tf[16]);
        Tf_At_name16.setText(tf[17]);
        Tf_At_name17.setText(tf[18]);
        Tf_At_name18.setText(tf[19]);
        Tf_At_name19.setText(tf[10]);
        Tf_At_name20.setText(tf[20]);
        Tf_At_name21.setText(tf[21]);
        Tf_At_name22.setText(tf[22]);
        Tf_At_name23.setText(tf[23]);
        Tf_At_name24.setText(tf[24]);
        Tf_At_name25.setText(tf[25]);
        Tf_At_name26.setText(tf[26]);
        Tf_At_name27.setText(tf[27]);
        Tf_At_name28.setText(tf[28]);
        Tf_At_name29.setText(tf[29]);
        Tf_At_name30.setText(tf[30]);
            } catch (SQLException ex) {
                Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void Bt_At_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_At_ResetActionPerformed
        // TODO add your handling code here:
        Bt_At_p1.setSelected(true);
        Bt_At_p2.setSelected(true);
        Bt_At_p3.setSelected(true);
        Bt_At_p4.setSelected(true);
        Bt_At_p5.setSelected(true);
        Bt_At_p6.setSelected(true);
        Bt_At_p7.setSelected(true);
        Bt_At_p8.setSelected(true);
        Bt_At_p9.setSelected(true);
        Bt_At_p10.setSelected(true);
        Bt_At_p12.setSelected(true);
        Bt_At_p13.setSelected(true);
        Bt_At_p14.setSelected(true);
        Bt_At_p15.setSelected(true);
        Bt_At_p16.setSelected(true);
        Bt_At_p17.setSelected(true);
        Bt_At_p18.setSelected(true);
        Bt_At_p19.setSelected(true);
        Bt_At_p20.setSelected(true);
        Bt_At_p21.setSelected(true);
        Bt_At_p22.setSelected(true);
        Bt_At_p23.setSelected(true);
        Bt_At_p24.setSelected(true);
        Bt_At_p25.setSelected(true);
        Bt_At_p26.setSelected(true);
        Bt_At_p27.setSelected(true);
        Bt_At_p28.setSelected(true);
        Bt_At_p29.setSelected(true);
        Bt_At_p30.setSelected(true);
        Tf_At_name1.setText("");
        Tf_At_name2.setText("");
        Tf_At_name3.setText("");
        Tf_At_name4.setText("");
        Tf_At_name5.setText("");
        Tf_At_name6.setText("");
        Tf_At_name7.setText("");
        Tf_At_name8.setText("");
        Tf_At_name9.setText("");
        Tf_At_name10.setText("");
        Tf_At_name11.setText("");
        Tf_At_name12.setText("");
        Tf_At_name13.setText("");
        Tf_At_name14.setText("");
        Tf_At_name15.setText("");
        Tf_At_name16.setText("");
        Tf_At_name17.setText("");
        Tf_At_name18.setText("");
        Tf_At_name19.setText("");
        Tf_At_name20.setText("");
        Tf_At_name21.setText("");
        Tf_At_name22.setText("");
        Tf_At_name23.setText("");
        Tf_At_name24.setText("");
        Tf_At_name25.setText("");
        Tf_At_name26.setText("");
        Tf_At_name27.setText("");
        Tf_At_name28.setText("");
        Tf_At_name29.setText("");
        Tf_At_name30.setText("");
        for(int a=0;a<=30;a++){
            tf[a]="";
        }
    }//GEN-LAST:event_Bt_At_ResetActionPerformed

    private void Bt_At_p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_At_p1ActionPerformed
        // TODO add your handling code here:
        try{
             con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
                st=(Statement)con.createStatement();
                pst=con.prepareStatement("select * from student where ID=?");
                
        }catch(SQLException ex){
            
        }
    }//GEN-LAST:event_Bt_At_p1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            // TODO add your handling code here:
            con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
            st=(Statement)con.createStatement();
            Integer Int = Integer.valueOf(jComboBox1.getSelectedItem().toString());
            pst=con.prepareStatement("Update attandance set PRESENT=? where (NAME =? and DATE=?)");
             if(Bt_At_p1.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name1.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p2.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name2.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p3.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name3.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p4.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name4.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p5.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name5.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p6.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name6.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p7.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             
             pst.setString(2,Tf_At_name7.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             if(Bt_At_p8.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             pst.setString(2,Tf_At_name7.getText());
             pst.setString(3, jXDatePicker3.getDate().toString());
             pst.executeUpdate();
             /*if(Bt_At_p9.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             if(Bt_At_p10.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             if(Bt_At_p11.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             if(Bt_At_p12.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             if(Bt_At_p13.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }
             if(Bt_At_p14.isSelected()==true){
                    pst.setBoolean(1, true);
                }else{
                    pst.setBoolean(1, false);
                }*/
            // pst.setString(3, jXDatePicker3.getDate().toString());
                 JOptionPane.showMessageDialog(null, "SAVED");
        } catch (SQLException ex) {
            Logger.getLogger(Attendance.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Attendance().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bt_At_A1;
    private javax.swing.JButton Bt_At_Reset;
    private javax.swing.JRadioButton Bt_At_a10;
    private javax.swing.JRadioButton Bt_At_a11;
    private javax.swing.JRadioButton Bt_At_a12;
    private javax.swing.JRadioButton Bt_At_a13;
    private javax.swing.JRadioButton Bt_At_a14;
    private javax.swing.JRadioButton Bt_At_a15;
    private javax.swing.JRadioButton Bt_At_a16;
    private javax.swing.JRadioButton Bt_At_a17;
    private javax.swing.JRadioButton Bt_At_a18;
    private javax.swing.JRadioButton Bt_At_a19;
    private javax.swing.JRadioButton Bt_At_a2;
    private javax.swing.JRadioButton Bt_At_a20;
    private javax.swing.JRadioButton Bt_At_a21;
    private javax.swing.JRadioButton Bt_At_a22;
    private javax.swing.JRadioButton Bt_At_a23;
    private javax.swing.JRadioButton Bt_At_a24;
    private javax.swing.JRadioButton Bt_At_a25;
    private javax.swing.JRadioButton Bt_At_a26;
    private javax.swing.JRadioButton Bt_At_a27;
    private javax.swing.JRadioButton Bt_At_a28;
    private javax.swing.JRadioButton Bt_At_a29;
    private javax.swing.JRadioButton Bt_At_a3;
    private javax.swing.JRadioButton Bt_At_a30;
    private javax.swing.JRadioButton Bt_At_a4;
    private javax.swing.JRadioButton Bt_At_a5;
    private javax.swing.JRadioButton Bt_At_a6;
    private javax.swing.JRadioButton Bt_At_a7;
    private javax.swing.JRadioButton Bt_At_a8;
    private javax.swing.JRadioButton Bt_At_a9;
    private javax.swing.JRadioButton Bt_At_p1;
    private javax.swing.JRadioButton Bt_At_p10;
    private javax.swing.JRadioButton Bt_At_p11;
    private javax.swing.JRadioButton Bt_At_p12;
    private javax.swing.JRadioButton Bt_At_p13;
    private javax.swing.JRadioButton Bt_At_p14;
    private javax.swing.JRadioButton Bt_At_p15;
    private javax.swing.JRadioButton Bt_At_p16;
    private javax.swing.JRadioButton Bt_At_p17;
    private javax.swing.JRadioButton Bt_At_p18;
    private javax.swing.JRadioButton Bt_At_p19;
    private javax.swing.JRadioButton Bt_At_p2;
    private javax.swing.JRadioButton Bt_At_p20;
    private javax.swing.JRadioButton Bt_At_p21;
    private javax.swing.JRadioButton Bt_At_p22;
    private javax.swing.JRadioButton Bt_At_p23;
    private javax.swing.JRadioButton Bt_At_p24;
    private javax.swing.JRadioButton Bt_At_p25;
    private javax.swing.JRadioButton Bt_At_p26;
    private javax.swing.JRadioButton Bt_At_p27;
    private javax.swing.JRadioButton Bt_At_p28;
    private javax.swing.JRadioButton Bt_At_p29;
    private javax.swing.JRadioButton Bt_At_p3;
    private javax.swing.JRadioButton Bt_At_p30;
    private javax.swing.JRadioButton Bt_At_p4;
    private javax.swing.JRadioButton Bt_At_p5;
    private javax.swing.JRadioButton Bt_At_p6;
    private javax.swing.JRadioButton Bt_At_p7;
    private javax.swing.JRadioButton Bt_At_p8;
    private javax.swing.JRadioButton Bt_At_p9;
    private javax.swing.JTextField Tf_At_name1;
    private javax.swing.JTextField Tf_At_name10;
    private javax.swing.JTextField Tf_At_name11;
    private javax.swing.JTextField Tf_At_name12;
    private javax.swing.JTextField Tf_At_name13;
    private javax.swing.JTextField Tf_At_name14;
    private javax.swing.JTextField Tf_At_name15;
    private javax.swing.JTextField Tf_At_name16;
    private javax.swing.JTextField Tf_At_name17;
    private javax.swing.JTextField Tf_At_name18;
    private javax.swing.JTextField Tf_At_name19;
    private javax.swing.JTextField Tf_At_name2;
    private javax.swing.JTextField Tf_At_name20;
    private javax.swing.JTextField Tf_At_name21;
    private javax.swing.JTextField Tf_At_name22;
    private javax.swing.JTextField Tf_At_name23;
    private javax.swing.JTextField Tf_At_name24;
    private javax.swing.JTextField Tf_At_name25;
    private javax.swing.JTextField Tf_At_name26;
    private javax.swing.JTextField Tf_At_name27;
    private javax.swing.JTextField Tf_At_name28;
    private javax.swing.JTextField Tf_At_name29;
    private javax.swing.JTextField Tf_At_name3;
    private javax.swing.JTextField Tf_At_name30;
    private javax.swing.JTextField Tf_At_name4;
    private javax.swing.JTextField Tf_At_name5;
    private javax.swing.JTextField Tf_At_name6;
    private javax.swing.JTextField Tf_At_name7;
    private javax.swing.JTextField Tf_At_name8;
    private javax.swing.JTextField Tf_At_name9;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker3;
    // End of variables declaration//GEN-END:variables
}
