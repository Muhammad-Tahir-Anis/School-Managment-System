
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonModel;
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

public class Addmisionconfirm extends javax.swing.JFrame{
    java.sql.Connection con=null;
    ResultSet rs=null;
    Statement st;
    PreparedStatement pst;
    PreparedStatement pst1;
    PreparedStatement pst2;
    /**
     * Creates new form admission
     */
    //Java_db database = new Java_db();
    
    
    String file_name = null;
    byte[] person_image=null;
    ButtonGroup bg=new ButtonGroup();
    //JTextField tf[]=new JTextField[30];
         ButtonGroup bg2=new ButtonGroup();
         ButtonGroup bg3=new ButtonGroup();
         ButtonGroup bg4=new ButtonGroup();
         ButtonModel bm = bg.getSelection();
         ButtonModel bm1 = bg4.getSelection();
         ButtonModel bm2 = bg3.getSelection();
         
         String filename ;
    public Addmisionconfirm() {
        initComponents();
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("Admission.jpg")));
         bg.add(Rb_Ad_Nat1);
         bg.add(Rb_Ad_Nat2);
         bg2.add(Rb_Ad_SearchF);
         bg2.add(Rb_Ad_SearchR);
         bg2.add(Rb_Ad_SearchN);
         bg3.add(Rb_Ad_Sec1);
         bg3.add(Rb_Ad_Sec3);
         bg3.add(Rb_Ad_Sec2);
         bg4.add(Rb_Ad_rel1);
         bg4.add(Rb_Ad_rel2);
         bg4.add(Rb_Ad_rel3);
         Rb_Ad_Nat1.setActionCommand("Pakistani");
         Rb_Ad_Nat2.setActionCommand("Forigner");
         Rb_Ad_rel1.setActionCommand("Islam");
         Rb_Ad_rel2.setActionCommand("Cristian");
         Rb_Ad_rel3.setActionCommand("Other");
         
         jXDatePicker1.setFormats("dd/MM/yyyy");
         jXDatePicker2.setFormats("dd/MM/yyyy");
        //Tf_Ad_name.setText(database.data());
         
          Tf_Ad_Pnum.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          
          Tf_Ad_Gpnum.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          Tf_Ad_Adnum.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          Tf_Ad_Rnum.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          Tf_Ad_cnic1.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          Tf_Ad_cnic2.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
          Tf_Ad_cnic3.addKeyListener(new KeyAdapter() {
                @Override
                public void keyTyped(KeyEvent e) {
                    char vChar = e.getKeyChar();
                    if (!(Character.isDigit(vChar)
                            || (vChar == KeyEvent.VK_BACK_SPACE)
                            || (vChar == KeyEvent.VK_DELETE))) {
                        e.consume();
                        JOptionPane.showMessageDialog(null, "Pleaze Enter Numbers Only");
                    }
                }
            });
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        scrollbar1 = new java.awt.Scrollbar();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Tf_Ad_name = new javax.swing.JTextField();
        Tf_Ad_Lname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Tf_Ad_Fname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Tf_Ad_Gname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Tf_Ad_Pnum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Tf_Ad_Gpnum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Tf_Ad_cnic1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Tf_Ad_cnic2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        Tf_Ad_cnic3 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        Tf_Ad_Address = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Tf_Ad_Foccu = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        Rb_Ad_rel1 = new javax.swing.JRadioButton();
        Rb_Ad_rel2 = new javax.swing.JRadioButton();
        Rb_Ad_rel3 = new javax.swing.JRadioButton();
        jLabel18 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        Rb_Ad_Sec1 = new javax.swing.JRadioButton();
        Rb_Ad_Sec2 = new javax.swing.JRadioButton();
        Rb_Ad_Sec3 = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        Tf_Ad_Rnum = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        Rb_Ad_Nat1 = new javax.swing.JRadioButton();
        Rb_Ad_Nat2 = new javax.swing.JRadioButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        Tf_Ad_Adnum = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        Tf_Ad_Fcode = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        Tf_Ad_Im = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel31 = new javax.swing.JLabel();
        Rb_Ad_SearchN = new javax.swing.JRadioButton();
        Rb_Ad_SearchR = new javax.swing.JRadioButton();
        jLabel32 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Tf_Ad_Search = new javax.swing.JTextField();
        Bt_Ad_Search = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        Rb_Ad_SearchF = new javax.swing.JRadioButton();
        Bt_Ad_Save = new javax.swing.JButton();
        Bt_Ad_Reset = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();
        jXDatePicker2 = new org.jdesktop.swingx.JXDatePicker();
        Bt_Ad_Cancle = new javax.swing.JButton();
        lbl_img = new javax.swing.JLabel();
        img_choose = new javax.swing.JButton();
        Bt_Ad_Update = new javax.swing.JButton();
        Bt_ad_Delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximizedBounds(new java.awt.Rectangle(50, 50, 995, 830));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 0));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel4.setBackground(new java.awt.Color(0, 153, 0));

        jLabel1.setBackground(new java.awt.Color(51, 153, 0));
        jLabel1.setFont(new java.awt.Font("Sylfaen", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Admission Form");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnBack.setBackground(new java.awt.Color(255, 204, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBack.setText("<=Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        Tf_Ad_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_nameActionPerformed(evt);
            }
        });

        Tf_Ad_Lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_LnameActionPerformed(evt);
            }
        });

        jLabel4.setText("Father Name");

        Tf_Ad_Fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_FnameActionPerformed(evt);
            }
        });

        jLabel5.setText("Gaurdian Name");

        jLabel6.setText("Phone Number");

        Tf_Ad_Pnum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_PnumActionPerformed(evt);
            }
        });

        jLabel7.setText("Phone Number");

        jLabel8.setText("D.O.B");

        jLabel12.setText("Father CNIC");

        jLabel13.setText("-");

        Tf_Ad_cnic2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_cnic2ActionPerformed(evt);
            }
        });

        jLabel14.setText("-");

        jLabel15.setText("Address");

        Tf_Ad_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_AddressActionPerformed(evt);
            }
        });

        jLabel16.setText("Father's Occupation");

        jLabel17.setText("Religion");

        Rb_Ad_rel1.setText("Islam");
        Rb_Ad_rel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_Ad_rel1ActionPerformed(evt);
            }
        });

        Rb_Ad_rel2.setText("Cristian");

        Rb_Ad_rel3.setText("Hindu");

        jLabel18.setText("Class");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel19.setText("Section");

        Rb_Ad_Sec1.setText("A");

        Rb_Ad_Sec2.setText("B");

        Rb_Ad_Sec3.setText("C");

        jLabel20.setText("Roll Number ");

        jLabel21.setText("Nationality");

        Rb_Ad_Nat1.setText("Pakistani");

        Rb_Ad_Nat2.setText("Forigner");
        Rb_Ad_Nat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rb_Ad_Nat2ActionPerformed(evt);
            }
        });

        jLabel22.setText("Admission Date");

        jLabel26.setText("Admission Number");

        jLabel27.setText("Family Code");

        jLabel28.setText("Identification mark if any");

        Tf_Ad_Im.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_ImActionPerformed(evt);
            }
        });

        jSeparator1.setBackground(new java.awt.Color(51, 0, 51));
        jSeparator1.setForeground(new java.awt.Color(51, 0, 51));

        jLabel31.setText("Search opption");

        Rb_Ad_SearchN.setText("By Name");

        Rb_Ad_SearchR.setText("By Roll Number ");

        jLabel32.setText("Select Class");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        Tf_Ad_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_Ad_SearchActionPerformed(evt);
            }
        });

        Bt_Ad_Search.setText("Search");
        Bt_Ad_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ad_SearchActionPerformed(evt);
            }
        });

        jLabel29.setText(" Usama Arshad & Co contact 03482184556");

        jLabel30.setText("Copy rights Reserved");

        Rb_Ad_SearchF.setText("Family code");

        Bt_Ad_Save.setText("Save");
        Bt_Ad_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ad_SaveActionPerformed(evt);
            }
        });

        Bt_Ad_Reset.setText("Reset");
        Bt_Ad_Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ad_ResetActionPerformed(evt);
            }
        });

        Bt_Ad_Cancle.setText("Cancle");
        Bt_Ad_Cancle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ad_CancleActionPerformed(evt);
            }
        });

        lbl_img.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        img_choose.setText("Choose");
        img_choose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_chooseActionPerformed(evt);
            }
        });

        Bt_Ad_Update.setText("Update");
        Bt_Ad_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_Ad_UpdateActionPerformed(evt);
            }
        });

        Bt_ad_Delete.setText("Delete");
        Bt_ad_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Bt_ad_DeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel30)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Rb_Ad_SearchN)
                        .addGap(18, 18, 18)
                        .addComponent(Rb_Ad_SearchR)
                        .addGap(18, 18, 18)
                        .addComponent(Rb_Ad_SearchF))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(Tf_Ad_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Bt_Ad_Search))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel32)
                            .addGap(5, 5, 5)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(274, 274, 274)
                            .addComponent(jLabel31)))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tf_Ad_Foccu))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(15, 15, 15)))
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Tf_Ad_name, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Tf_Ad_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(1, 1, 1))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tf_Ad_Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Tf_Ad_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(Tf_Ad_Gname, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(Tf_Ad_Gpnum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(Tf_Ad_cnic1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tf_Ad_cnic2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel14)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Tf_Ad_cnic3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Rb_Ad_rel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Rb_Ad_rel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rb_Ad_rel3)))
                        .addGap(90, 90, 90))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rb_Ad_Nat1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Rb_Ad_Nat2))
                            .addComponent(jLabel22)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Tf_Ad_Im, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel15))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Tf_Ad_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 804, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(52, 52, 52)
                                                .addComponent(Bt_Ad_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Bt_Ad_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(Bt_ad_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(Bt_Ad_Cancle, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(29, 29, 29)
                                                        .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel26))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(139, 139, 139)
                                                        .addComponent(jLabel19)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Rb_Ad_Sec1)))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Rb_Ad_Sec2)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Rb_Ad_Sec3))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGap(21, 21, 21)
                                                        .addComponent(Tf_Ad_Adnum, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel20)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Tf_Ad_Rnum, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addComponent(jLabel27)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(Tf_Ad_Fcode)))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbl_img, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addComponent(img_choose)
                                                .addGap(40, 40, 40)))))))
                        .addGap(88, 88, 88))))
            .addComponent(Bt_Ad_Reset, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Ad_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Ad_Lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                    .addComponent(Tf_Ad_Gname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Ad_Fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Ad_Pnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Tf_Ad_Gpnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tf_Ad_cnic1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(Tf_Ad_cnic2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(Tf_Ad_cnic3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jXDatePicker2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(Tf_Ad_Foccu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(Rb_Ad_rel1)
                    .addComponent(Rb_Ad_rel2)
                    .addComponent(Rb_Ad_rel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(Rb_Ad_Nat1)
                    .addComponent(Rb_Ad_Nat2))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tf_Ad_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jLabel26)
                            .addComponent(Tf_Ad_Adnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27)
                            .addComponent(Tf_Ad_Fcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Rb_Ad_Sec1)
                            .addComponent(Rb_Ad_Sec2)
                            .addComponent(Rb_Ad_Sec3)
                            .addComponent(jLabel20)
                            .addComponent(Tf_Ad_Rnum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Tf_Ad_Im, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bt_Ad_Save)
                            .addComponent(Bt_Ad_Reset)
                            .addComponent(Bt_Ad_Cancle)
                            .addComponent(img_choose)
                            .addComponent(Bt_Ad_Update)
                            .addComponent(Bt_ad_Delete)))
                    .addComponent(lbl_img, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel31)
                        .addGap(23, 23, 23))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rb_Ad_SearchN)
                            .addComponent(Rb_Ad_SearchR)
                            .addComponent(Rb_Ad_SearchF))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Tf_Ad_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Bt_Ad_Search))
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel30)
                        .addComponent(jLabel29))))
        );

        jScrollPane1.setViewportView(jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 298, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addGap(6, 6, 6)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Rb_Ad_rel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_Ad_rel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rb_Ad_rel1ActionPerformed

    private void Tf_Ad_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_AddressActionPerformed

    private void Tf_Ad_cnic2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_cnic2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_cnic2ActionPerformed

    private void Tf_Ad_FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_FnameActionPerformed

    private void Tf_Ad_LnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_LnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_LnameActionPerformed

    private void Tf_Ad_ImActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_ImActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_ImActionPerformed

    private void Tf_Ad_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_SearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_SearchActionPerformed

    private void Rb_Ad_Nat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rb_Ad_Nat2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Rb_Ad_Nat2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        MainOption m =new MainOption();
        m.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void Tf_Ad_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_Ad_nameActionPerformed

    private void Tf_Ad_PnumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_Ad_PnumActionPerformed
        // TODO add your handling code
    }//GEN-LAST:event_Tf_Ad_PnumActionPerformed

    private void Bt_Ad_ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ad_ResetActionPerformed
        // TODO add your handling code here:
        Tf_Ad_name.setText("");
        Tf_Ad_Fname.setText("");
        Tf_Ad_Address.setText("");
        Tf_Ad_Adnum.setText("");
        Tf_Ad_Fcode.setText("");
        Tf_Ad_Foccu.setText("");
        Tf_Ad_Gname.setText("");
        Tf_Ad_Gpnum.setText("");
        Tf_Ad_Im.setText("");
        Tf_Ad_Lname.setText("");
        Tf_Ad_Pnum.setText("");
        Tf_Ad_Rnum.setText("");
        Tf_Ad_Search.setText("");
        Tf_Ad_cnic1.setText("");
        Tf_Ad_cnic2.setText("");
        Tf_Ad_cnic3.setText("");
        bg.clearSelection();
        bg2.clearSelection();
        bg3.clearSelection();
        bg4.clearSelection();
        lbl_img.disable();
    }//GEN-LAST:event_Bt_Ad_ResetActionPerformed

    private void Bt_Ad_CancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ad_CancleActionPerformed
        // TODO add your handling code here:
        Tf_Ad_name.setText("");
        Tf_Ad_Fname.setText("");
        Tf_Ad_Address.setText("");
        Tf_Ad_Adnum.setText("");
        Tf_Ad_Fcode.setText("");
        Tf_Ad_Foccu.setText("");
        Tf_Ad_Gname.setText("");
        Tf_Ad_Gpnum.setText("");
        Tf_Ad_Im.setText("");
        Tf_Ad_Lname.setText("");
        Tf_Ad_Pnum.setText("");
        Tf_Ad_Rnum.setText("");
        Tf_Ad_Search.setText("");
        Tf_Ad_cnic1.setText("");
        Tf_Ad_cnic2.setText("");
        Tf_Ad_cnic3.setText("");
        bg.clearSelection();
        bg2.clearSelection();
        bg3.clearSelection();
        bg4.clearSelection();
        this.setVisible(false);
        MainOption m = new MainOption();
        m.setVisible(true);
    }//GEN-LAST:event_Bt_Ad_CancleActionPerformed

    private void img_chooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_chooseActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f =chooser.getSelectedFile();
        filename = f.getAbsolutePath();
        ImageIcon imageicon = new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH));
        lbl_img.setIcon(imageicon); 
    }//GEN-LAST:event_img_chooseActionPerformed

    private void Bt_Ad_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ad_SaveActionPerformed
        // TODO add your handling code here:
        try{
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
         st=(Statement)con.createStatement(); 
        String sql="insert into student (ID,FIRST_NAME,LAST_NAME,FATHER_NAME,GUARDIAN_NAME,PHONE_NUM1,"
                + "PHONE_NUM2,DATE_BIRTH,FATHER_CNIC,FATHER_OCCU,RELIGION,NATIONALITY,ADDRESS,DATE_ADMISSION,"
                + "FAMILY_CODE,CLASS,ROLL_NUM,ID_MARK,IMAGE) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        pst=con.prepareStatement(sql);
        pst1=con.prepareStatement("insert into fee (ID) values (?)");
        pst2=con.prepareStatement("insert into Result (ID) values (?)");
        Integer adnum=Integer.valueOf(Tf_Ad_Adnum.getText());
        Integer rollnum=Integer.parseInt(Tf_Ad_Rnum.getText());
        Integer Class=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        
        File f=new File(filename);
        InputStream inputimage = new FileInputStream(f);
        
        pst.setInt(1,adnum);
        pst1.setInt(1, adnum);
        pst2.setInt(1, adnum);
        pst.setString(2, Tf_Ad_name.getText());
        pst.setString(3,Tf_Ad_Lname.getText());
        pst.setString(4,Tf_Ad_Fname.getText());
        pst.setString(5,Tf_Ad_Gname.getText());
        pst.setString(6, Tf_Ad_Pnum.getText());
        pst.setString(7, Tf_Ad_Gpnum.getText());
        pst.setString(8, jXDatePicker2.getDate().toString());
        pst.setString(9, Tf_Ad_cnic1.getText()+Tf_Ad_cnic2.getText()+Tf_Ad_cnic3.getText());
        pst.setString(10, Tf_Ad_Foccu.getText());
        pst.setString(11, bg4.getSelection().getActionCommand());
        pst.setString(12, bg.getSelection().getActionCommand());
        pst.setString(13, Tf_Ad_Address.getText());
        pst.setString(14, jXDatePicker1.getDate().toString());
        pst.setString(15, Tf_Ad_Fcode.getText());
        pst.setInt(16, Class);
        pst.setInt(17, rollnum);
        pst.setString(18, Tf_Ad_Im.getText());
        pst.setBlob(19, inputimage , (int)(f.length()));
        pst.executeUpdate();
        pst1.executeUpdate();
        pst2.executeUpdate();
        JOptionPane.showMessageDialog(null, "SAVED");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Addmisionconfirm.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_Bt_Ad_SaveActionPerformed

    private void Bt_Ad_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ad_UpdateActionPerformed
        // TODO add your handling code here:
        try{
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
         st=(Statement)con.createStatement(); 
        String sql="UPDATE student SET FIRST_NAME=?,LAST_NAME=?,FATHER_NAME=?,GUARDIAN_NAME=?,PHONE_NUM1=?,"
                + "PHONE_NUM2=?,DATE_BIRTH=?,FATHER_CNIC=?,FATHER_OCCU=?,RELIGION=?,NATIONALITY=?,ADDRESS=?,DATE_ADMISSION=?,"
                + "FAMILY_CODE=?,CLASS=?,ROLL_NUM=?,ID_MARK=?,IMAGE=? where ID = ?";
        pst=con.prepareStatement(sql);
        Integer adnum=Integer.valueOf(Tf_Ad_Adnum.getText());
        Integer rollnum=Integer.parseInt(Tf_Ad_Rnum.getText());
        Integer Class=Integer.parseInt(jComboBox1.getSelectedItem().toString());
        
        File f=new File(filename);
        InputStream inputimage = new FileInputStream(f);
        
        //pst.setInt(1,adnum);
        pst.setString(1, Tf_Ad_name.getText());
        pst.setString(2,Tf_Ad_Lname.getText());
        pst.setString(3,Tf_Ad_Fname.getText());
        pst.setString(4,Tf_Ad_Gname.getText());
        pst.setString(5, Tf_Ad_Pnum.getText());
        pst.setString(6, Tf_Ad_Gpnum.getText());
        pst.setString(7, jXDatePicker2.getDate().toString());
        pst.setString(8, Tf_Ad_cnic1.getText()+Tf_Ad_cnic2.getText()+Tf_Ad_cnic3.getText());
        pst.setString(9, Tf_Ad_Foccu.getText());
        pst.setString(10, bg4.getSelection().getActionCommand());
        pst.setString(11, bg.getSelection().getActionCommand());
        pst.setString(12, Tf_Ad_Address.getText());
        pst.setString(13, jXDatePicker1.getDate().toString());
        pst.setString(14, Tf_Ad_Fcode.getText());
        pst.setInt(15, Class);
        pst.setInt(16, rollnum);
        pst.setString(17, Tf_Ad_Im.getText());
        pst.setBlob(18, inputimage , (int)(f.length()));
        pst.setInt(19,adnum);
        pst.executeUpdate();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Addmisionconfirm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_Bt_Ad_UpdateActionPerformed

    private void Bt_ad_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_ad_DeleteActionPerformed
        // TODO add your handling code here:
        try{
         con=DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
         st=(Statement)con.createStatement();
         Integer adnum=Integer.valueOf(Tf_Ad_Adnum.getText());
         
         String sql ="Delete from student where ID=?";
         pst=con.prepareStatement(sql);
         pst.setInt(1, adnum);
         pst.executeUpdate();
        }catch(SQLException ex){
        }
    }//GEN-LAST:event_Bt_ad_DeleteActionPerformed

    private void Bt_Ad_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Bt_Ad_SearchActionPerformed
        // TODO add your handling code here:
 
        try{ 
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Harmain","tahir","1234");
            st=(Statement) con.createStatement();
            Integer adnum=Integer.valueOf(Tf_Ad_Search.getText());
            
            pst=con.prepareStatement("Select *from Student where id=?");
            pst.setInt(1, adnum);
            rs=pst.executeQuery();
            if(rs.next()){
                Tf_Ad_name.setText(rs.getString("FIRST_NAME"));
                Tf_Ad_Lname.setText(rs.getString("LAST_NAME"));
                Tf_Ad_Fname.setText(rs.getString("FATHER_NAME"));
                Tf_Ad_Gname.setText(rs.getString("gUARDIAN_NAME"));
                Tf_Ad_Pnum.setText(rs.getString("PHONE_NUM1"));
                Tf_Ad_Gpnum.setText(rs.getString("PHONE_NUM2"));
                //---------------------------------------------//
                //Date date=Date.valueOf(rs.getString("DATE_BIRTH"));
                //---------------------------------------------//
                //jXDatePicker2.setDate(rs.getString("DATE_BIRTH"));
                Tf_Ad_cnic1.setText(rs.getString("FATHER_CNIC"));
                Tf_Ad_Foccu.setText(rs.getString("FATHER_OCCU"));
                if(rs.getString("RELIGION").equalsIgnoreCase("islam")){
                 Rb_Ad_rel1.setSelected(true);   
                }
                else if(rs.getString("RELIGION").equalsIgnoreCase("christian")){
                    Rb_Ad_rel2.setSelected(true); 
                }
                else if(rs.getString("RELIGION").equalsIgnoreCase("Hindu")){
                    Rb_Ad_rel3.setSelected(true); 
                }
                
                if(rs.getString("NATIONALITY").equalsIgnoreCase(Rb_Ad_Nat1.getActionCommand())){
                 Rb_Ad_Nat1.setSelected(true);
                }
                else if(rs.getString("NATIONALITY").equalsIgnoreCase(Rb_Ad_Nat2.getActionCommand())){
                    Rb_Ad_Nat2.setSelected(true); 
                }
                Tf_Ad_Address.setText(rs.getString("Address"));
                // jXDatePicker1.setDate(date);
                String rollnum=String.valueOf(rs.getInt("ROLL_NUM"));
                Tf_Ad_Rnum.setText(rollnum);
                Tf_Ad_Im.setText(rs.getString("ID_MARK"));
                Tf_Ad_Fcode.setText(rs.getString("FAMILY_CODE"));
                
                jComboBox1.setSelectedItem(rs.getInt("Class"));
                byte[] imageData =rs.getBytes("image");
                Image image = getToolkit().createImage(imageData).getScaledInstance(lbl_img.getWidth(),lbl_img.getHeight(),Image.SCALE_SMOOTH);
                ImageIcon icon=new ImageIcon(image);
                lbl_img.setIcon(icon);
            }
        }catch(NumberFormatException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_Bt_Ad_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(Addmisionconfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Addmisionconfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Addmisionconfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Addmisionconfirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Addmisionconfirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bt_Ad_Cancle;
    private javax.swing.JButton Bt_Ad_Reset;
    private javax.swing.JButton Bt_Ad_Save;
    private javax.swing.JButton Bt_Ad_Search;
    private javax.swing.JButton Bt_Ad_Update;
    private javax.swing.JButton Bt_ad_Delete;
    private javax.swing.JRadioButton Rb_Ad_Nat1;
    private javax.swing.JRadioButton Rb_Ad_Nat2;
    private javax.swing.JRadioButton Rb_Ad_SearchF;
    private javax.swing.JRadioButton Rb_Ad_SearchN;
    private javax.swing.JRadioButton Rb_Ad_SearchR;
    private javax.swing.JRadioButton Rb_Ad_Sec1;
    private javax.swing.JRadioButton Rb_Ad_Sec2;
    private javax.swing.JRadioButton Rb_Ad_Sec3;
    private javax.swing.JRadioButton Rb_Ad_rel1;
    private javax.swing.JRadioButton Rb_Ad_rel2;
    private javax.swing.JRadioButton Rb_Ad_rel3;
    private javax.swing.JTextField Tf_Ad_Address;
    private javax.swing.JTextField Tf_Ad_Adnum;
    private javax.swing.JTextField Tf_Ad_Fcode;
    private javax.swing.JTextField Tf_Ad_Fname;
    private javax.swing.JTextField Tf_Ad_Foccu;
    private javax.swing.JTextField Tf_Ad_Gname;
    private javax.swing.JTextField Tf_Ad_Gpnum;
    private javax.swing.JTextField Tf_Ad_Im;
    private javax.swing.JTextField Tf_Ad_Lname;
    private javax.swing.JTextField Tf_Ad_Pnum;
    private javax.swing.JTextField Tf_Ad_Rnum;
    private javax.swing.JTextField Tf_Ad_Search;
    private javax.swing.JTextField Tf_Ad_cnic1;
    private javax.swing.JTextField Tf_Ad_cnic2;
    private javax.swing.JTextField Tf_Ad_cnic3;
    private javax.swing.JTextField Tf_Ad_name;
    private javax.swing.JButton btnBack;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton img_choose;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker2;
    private javax.swing.JLabel lbl_img;
    private java.awt.Scrollbar scrollbar1;
    // End of variables declaration//GEN-END:variables
}
