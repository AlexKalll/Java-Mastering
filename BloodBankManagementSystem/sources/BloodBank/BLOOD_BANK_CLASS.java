package BloodBank;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
/* loaded from: BloodBankManagementSystem.jar:BloodBank/BLOOD_BANK_CLASS.class */
public class BLOOD_BANK_CLASS extends JFrame implements ActionListener {
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;
    private JButton b7;
    private JButton b8;
    private JButton b9;
    private JButton b10;
    private JButton b11;
    private JButton b12;
    private JButton b13;
    private JButton b14;
    private JButton b15;
    private JButton b16;
    private JButton b17;
    private JButton b18;
    private JButton b19;
    private JButton b20;
    private JButton b21;
    private JButton b22;
    private JButton b23;
    private JButton b24;
    private JButton b25;
    private JButton b26;
    private JButton b27;
    private JButton b28;
    private JButton b29;
    private JButton b30;
    private JButton b31;
    private JButton b32;
    private JButton b33;
    private JButton b34;
    private JButton b35;
    private JButton b36;
    private JButton b37;
    private JButton b38;
    private JButton b39;
    private JButton b40;
    private JButton b41;
    private JButton b42;
    private JButton b43;
    private JButton b44;
    private JButton b45;
    private JButton b46;
    private JButton b47;
    private JButton b48;
    private JButton b49;
    private JButton b50;
    private JButton b51;
    private JButton b52;
    private JButton b53;
    private JButton b54;
    private JButton b55;
    private JButton b56;
    private JButton b57;
    private JButton b58;
    private JButton b59;
    private JButton b60;
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField t6;
    private JTextField t7;
    private JTextField t8;
    private JTextField t9;
    private JTextField t10;
    private JTextField t11;
    private JTextField t12;
    private JTextField t13;
    private JTextField t14;
    private JTextField t15;
    private JTextField t16;
    private JTextField t17;
    private JTextField t18;
    private JTextField t19;
    private JTextField t20;
    private JTextField t21;
    private JTextField t22;
    private JTextField t23;
    private JTextField t24;
    private JTextField t25;
    private JTextField t26;
    private JTextField t27;
    private JTextField t28;
    private JTextField t29;
    private JTextField t30;
    private JTextField t31;
    private JTextField t32;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JLabel l4;
    private JLabel l5;
    private JLabel l6;
    private JLabel l7;
    private JLabel l8;
    private JLabel l9;
    private JLabel l10;
    private JLabel l11;
    private JLabel l12;
    private JLabel l13;
    private JLabel l14;
    private JLabel l15;
    private JLabel l16;
    private JLabel l17;
    private JLabel l18;
    private JLabel l19;
    private JLabel l20;
    private JLabel l21;
    private JLabel l22;
    private JLabel l23;
    private JLabel l24;
    private JLabel l25;
    private JLabel l26;
    private JLabel l27;
    private JLabel l28;
    private JLabel l29;
    private JLabel l30;
    private JLabel l31;
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    private JPanel p8;
    private JPanel p9;
    private JPanel p10;
    private JPanel p11;
    private JPanel p12;
    private JPanel p13;
    private JPanel p14;
    private JPanel p15;
    private JPanel p16;
    private JPanel p17;
    private JOptionPane op1;
    private JTextArea QueryArea1;
    private JTextArea QueryArea2;
    private JTextArea QueryArea3;
    private JTextArea QueryArea4;
    private JTextArea QueryArea5;
    private JTextArea QueryArea6;
    private JScrollPane scrollPane1;
    private JScrollPane scrollPane2;
    private JScrollPane scrollPane3;
    private JScrollPane scrollPane4;
    private JScrollPane scrollPane5;
    private JScrollPane scrollPane6;
    private Box box1;
    private Box box2;
    private Box box3;
    private Box box4;
    private Box box5;
    private Box box6;
    private Box box7;
    private JTable resultTable1;
    private JTable resultTable2;
    private JTable resultTable3;
    private JTable resultTable4;
    private JTable resultTable5;
    private JTable resultTable6;
    private ResultSeTableModel tableModel1;
    private ResultSeTableModel tableModel2;
    private ResultSeTableModel tableModel3;
    private ResultSeTableModel tableModel4;
    private ResultSeTableModel tableModel5;
    private ResultSeTableModel tableModel6;
    private Color color;
    private JPasswordField password;
    private TableRowSorter<TableModel> sorter1;
    private TableRowSorter<TableModel> sorter2;
    private TableRowSorter<TableModel> sorter3;
    private TableRowSorter<TableModel> sorter4;
    private TableRowSorter<TableModel> sorter5;
    private TableRowSorter<TableModel> sorter6;

    public BLOOD_BANK_CLASS() {
        super("                                                                                                                        THIS IS SIMPLE PROJECT ");
        setup();
    }

    public static void main(String[] args) {
        new BLOOD_BANK_CLASS();
    }

    public void setup() {
        this.b1 = new JButton("INSERT ");
        this.b2 = new JButton("DELETE ");
        this.b3 = new JButton("UPDATE ");
        this.b4 = new JButton("CLEAR ");
        this.b5 = new JButton("SELECT QUERY");
        this.b6 = new JButton("****");
        this.b7 = new JButton("BACK TO START");
        this.b8 = new JButton("MANIPULATE DATA");
        this.b8.setForeground(Color.red);
        this.b9 = new JButton(" PATIENT'S DATA");
        this.b9.setForeground(Color.DARK_GRAY);
        this.b10 = new JButton("BLOOD'S DATA");
        this.b10.setForeground(Color.PINK);
        this.b11 = new JButton("DONOR'S DATA");
        this.b11.setForeground(Color.black);
        this.b12 = new JButton("BRANCH'S DATA");
        this.b12.setForeground(Color.darkGray);
        this.b13 = new JButton("BloodDonEvent's DATA");
        this.b13.setForeground(Color.MAGENTA);
        this.b14 = new JButton("INSERT ");
        this.b15 = new JButton("DELETE ");
        this.b16 = new JButton("UPDATE ");
        this.b17 = new JButton("CLEAR ");
        this.b18 = new JButton("INSERT ");
        this.b19 = new JButton("DELETE ");
        this.b20 = new JButton("UPDATE ");
        this.b21 = new JButton("CLEAR ");
        this.b22 = new JButton("SELECT QUERY");
        this.b23 = new JButton("****");
        this.b24 = new JButton("BACK TO START");
        this.b25 = new JButton("BloodPatient's DATA");
        this.b25.setForeground(Color.BLUE);
        this.b26 = new JButton("START");
        this.b26.setForeground(Color.BLUE);
        this.b27 = new JButton("BACK TO START");
        this.b28 = new JButton("BACK TO START");
        this.b29 = new JButton("BACK TO START");
        this.b30 = new JButton("BACK TO START");
        this.b31 = new JButton("INSERT");
        this.b32 = new JButton("DELETE");
        this.b33 = new JButton("UPDATE");
        this.b34 = new JButton("CLEAR");
        this.b35 = new JButton("INSERT");
        this.b36 = new JButton("DELETE");
        this.b37 = new JButton("UPDATE");
        this.b38 = new JButton("CLEAR");
        this.b39 = new JButton("INSERT");
        this.b40 = new JButton("DELETE");
        this.b41 = new JButton("UPDATE");
        this.b42 = new JButton("CLEAR");
        this.b43 = new JButton("SUBMIT QUERY");
        this.b44 = new JButton("BACK");
        this.b45 = new JButton("SELECT QUERY");
        this.b46 = new JButton("BACK");
        this.b47 = new JButton("SUBMIT QUERY");
        this.b48 = new JButton(" CHENGE COLOR");
        this.b49 = new JButton(" SUBMIT");
        this.b50 = new JButton("SUBMIT QUERY");
        this.b51 = new JButton("SUBMIT QUERY");
        this.b52 = new JButton("SUBMIT QUERY");
        this.b53 = new JButton("SUBMIT QUERY");
        this.b54 = new JButton("BACK");
        this.b55 = new JButton("BACK");
        this.b56 = new JButton("BACK");
        this.b57 = new JButton("BACK");
        this.b58 = new JButton("SELECT QUERY");
        this.b59 = new JButton("SELECT QUERY");
        this.b60 = new JButton("SELECT QUERY");
        try {
            this.QueryArea1 = new JTextArea("SELECT * FROM PATIENT", 3, 100);
            this.scrollPane1 = new JScrollPane(this.QueryArea1, 20, 30);
            this.box1 = Box.createHorizontalBox();
            this.box1.add(this.scrollPane1);
            this.box1.add(this.b43);
            this.tableModel1 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM patient");
            this.resultTable1 = new JTable(this.tableModel1);
            this.QueryArea2 = new JTextArea("SELECT * FROM blood", 3, 100);
            this.scrollPane2 = new JScrollPane(this.QueryArea2, 20, 30);
            this.box2 = Box.createHorizontalBox();
            this.box2.add(this.scrollPane2);
            this.box2.add(this.b47);
            this.tableModel2 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM BLOOD");
            this.resultTable2 = new JTable(this.tableModel2);
            this.QueryArea3 = new JTextArea("SELECT * FROM donor", 3, 100);
            this.scrollPane3 = new JScrollPane(this.QueryArea3, 20, 30);
            this.box3 = Box.createHorizontalBox();
            this.box3.add(this.scrollPane3);
            this.box3.add(this.b50);
            this.tableModel3 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM donor");
            this.resultTable3 = new JTable(this.tableModel3);
            this.QueryArea4 = new JTextArea("SELECT * FROM branch", 3, 100);
            this.scrollPane4 = new JScrollPane(this.QueryArea4, 20, 30);
            this.box4 = Box.createHorizontalBox();
            this.box4.add(this.scrollPane4);
            this.box4.add(this.b51);
            this.tableModel4 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM branch");
            this.resultTable4 = new JTable(this.tableModel4);
            this.QueryArea5 = new JTextArea("SELECT * FROM bloodDonEvent", 3, 100);
            this.scrollPane5 = new JScrollPane(this.QueryArea5, 20, 30);
            this.box5 = Box.createHorizontalBox();
            this.box5.add(this.scrollPane5);
            this.box5.add(this.b52);
            this.tableModel5 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM bloodDonEvent");
            this.resultTable5 = new JTable(this.tableModel5);
            this.QueryArea6 = new JTextArea("SELECT * FROM BloodPatient", 3, 100);
            this.scrollPane6 = new JScrollPane(this.QueryArea6, 20, 30);
            this.box6 = Box.createHorizontalBox();
            this.box6.add(this.scrollPane6);
            this.box6.add(this.b53);
            this.tableModel6 = new ResultSeTableModel("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu", "SELECT * FROM BloodPatient");
            this.resultTable6 = new JTable(this.tableModel6);
            this.sorter1 = new TableRowSorter<>(this.tableModel1);
            this.resultTable1.setRowSorter(this.sorter1);
            this.sorter2 = new TableRowSorter<>(this.tableModel2);
            this.resultTable2.setRowSorter(this.sorter2);
            this.sorter3 = new TableRowSorter<>(this.tableModel3);
            this.resultTable3.setRowSorter(this.sorter3);
            this.sorter4 = new TableRowSorter<>(this.tableModel4);
            this.resultTable4.setRowSorter(this.sorter4);
            this.sorter5 = new TableRowSorter<>(this.tableModel5);
            this.resultTable5.setRowSorter(this.sorter5);
            this.sorter6 = new TableRowSorter<>(this.tableModel6);
            this.resultTable6.setRowSorter(this.sorter6);
        } catch (SQLException sqlException) {
            JOptionPane.showMessageDialog((Component) null, sqlException.getMessage(), "Database error", 0);
            this.tableModel1.disconnectFromDatabase();
            this.tableModel2.disconnectFromDatabase();
            this.tableModel3.disconnectFromDatabase();
            this.tableModel4.disconnectFromDatabase();
            this.tableModel5.disconnectFromDatabase();
            this.tableModel6.disconnectFromDatabase();
            System.exit(1);
        }
        this.t1 = new JTextField(20);
        this.t2 = new JTextField(20);
        this.t3 = new JTextField(20);
        this.t4 = new JTextField(20);
        this.t5 = new JTextField(20);
        this.t6 = new JTextField(20);
        this.t7 = new JTextField(20);
        this.t8 = new JTextField(20);
        this.t9 = new JTextField(20);
        this.t10 = new JTextField(20);
        this.t11 = new JTextField(20);
        this.t12 = new JTextField(20);
        this.t13 = new JTextField(20);
        this.t14 = new JTextField(20);
        this.t15 = new JTextField(20);
        this.t16 = new JTextField(20);
        this.t17 = new JTextField(20);
        this.t18 = new JTextField(20);
        this.t19 = new JTextField(20);
        this.t20 = new JTextField(20);
        this.t21 = new JTextField(20);
        this.t22 = new JTextField(20);
        this.t23 = new JTextField(20);
        this.t23 = new JTextField(20);
        this.t24 = new JTextField(20);
        this.t25 = new JTextField(20);
        this.t26 = new JTextField(20);
        this.t27 = new JTextField(20);
        this.t28 = new JTextField(20);
        this.t29 = new JTextField(20);
        this.t30 = new JTextField(20);
        this.t31 = new JTextField(20);
        this.t32 = new JTextField(20);
        this.l1 = new JLabel("             first name ");
        this.l2 = new JLabel("             middile name ");
        this.l3 = new JLabel("            last name ");
        this.l4 = new JLabel("            age");
        this.l5 = new JLabel("           sex ");
        this.l6 = new JLabel("          SSN");
        this.l7 = new JLabel("           phone number");
        this.l8 = new JLabel("             Blood Id ");
        this.l9 = new JLabel("             Donor Id ");
        this.l10 = new JLabel("            Event Id ");
        this.l11 = new JLabel("            Blood Quantity");
        this.l12 = new JLabel("          first name ");
        this.l13 = new JLabel("             middile name ");
        this.l14 = new JLabel("             last name ");
        this.l15 = new JLabel("            sex");
        this.l16 = new JLabel("           Blood Type ");
        this.l17 = new JLabel("          SSN");
        this.l18 = new JLabel("           phone number");
        this.l19 = new JLabel("            Branch NUMBER");
        this.l20 = new JLabel("            CITY ");
        this.l21 = new JLabel("           Streate");
        this.l22 = new JLabel("           postcode number");
        this.l23 = new JLabel("            EVENT ID  ");
        this.l24 = new JLabel("           BRANCH NUMBER");
        this.l25 = new JLabel("           EVENT DATE ");
        this.l26 = new JLabel("            Patient's SSN");
        this.l27 = new JLabel("            Blood Id  ");
        this.l28 = new JLabel("           Blood Date");
        this.l29 = new JLabel("           Blood Quantity ");
        this.l30 = new JLabel("           PASSWORD");
        this.l31 = new JLabel("           Date ");
        this.color = new Color(150, 240, 110);
        this.password = new JPasswordField("                    ");
        this.box7 = Box.createHorizontalBox();
        this.box7.add(this.l30);
        this.box7.add(this.password);
        this.box7.add(this.b49);
        this.p1 = new JPanel(new GridLayout(7, 3, 5, 5));
        this.p2 = new JPanel(new GridLayout(5, 3, 10, 10));
        this.p3 = new JPanel(new GridLayout(8, 3, 5, 5));
        this.p4 = new JPanel(new GridLayout(5, 3, 10, 10));
        this.p5 = new JPanel(new GridLayout(4, 3, 5, 5));
        this.p6 = new JPanel(new GridLayout(5, 3, 10, 10));
        this.p7 = new JPanel(new GridLayout(2, 3, 5, 5));
        this.p8 = new JPanel(new BorderLayout());
        this.p9 = new JPanel(new BorderLayout());
        this.p10 = new JPanel(new BorderLayout());
        this.p11 = new JPanel(new BorderLayout());
        this.p12 = new JPanel(new BorderLayout());
        this.p13 = new JPanel(new BorderLayout());
        this.p14 = new JPanel(new BorderLayout());
        this.p15 = new JPanel(new BorderLayout());
        this.p16 = new JPanel(new BorderLayout());
        this.p17 = new JPanel();
        this.t1.addActionListener(this);
        this.t2.addActionListener(this);
        this.t3.addActionListener(this);
        this.t4.addActionListener(this);
        this.t5.addActionListener(this);
        this.t6.addActionListener(this);
        this.t7.addActionListener(this);
        this.t8.addActionListener(this);
        this.t9.addActionListener(this);
        this.t10.addActionListener(this);
        this.t11.addActionListener(this);
        this.t12.addActionListener(this);
        this.t13.addActionListener(this);
        this.t14.addActionListener(this);
        this.t15.addActionListener(this);
        this.t16.addActionListener(this);
        this.t17.addActionListener(this);
        this.t18.addActionListener(this);
        this.t19.addActionListener(this);
        this.t20.addActionListener(this);
        this.t21.addActionListener(this);
        this.t22.addActionListener(this);
        this.t23.addActionListener(this);
        this.t24.addActionListener(this);
        this.t25.addActionListener(this);
        this.t26.addActionListener(this);
        this.t27.addActionListener(this);
        this.t28.addActionListener(this);
        this.t29.addActionListener(this);
        this.t30.addActionListener(this);
        this.t31.addActionListener(this);
        this.t32.addActionListener(this);
        this.b1.addActionListener(this);
        this.b2.addActionListener(this);
        this.b3.addActionListener(this);
        this.b4.addActionListener(this);
        this.b5.addActionListener(this);
        this.b6.addActionListener(this);
        this.b7.addActionListener(this);
        this.b8.addActionListener(this);
        this.b9.addActionListener(this);
        this.b10.addActionListener(this);
        this.b11.addActionListener(this);
        this.b12.addActionListener(this);
        this.b13.addActionListener(this);
        this.b14.addActionListener(this);
        this.b15.addActionListener(this);
        this.b16.addActionListener(this);
        this.b17.addActionListener(this);
        this.b18.addActionListener(this);
        this.b19.addActionListener(this);
        this.b20.addActionListener(this);
        this.b21.addActionListener(this);
        this.b22.addActionListener(this);
        this.b23.addActionListener(this);
        this.b24.addActionListener(this);
        this.b25.addActionListener(this);
        this.b26.addActionListener(this);
        this.b27.addActionListener(this);
        this.b28.addActionListener(this);
        this.b29.addActionListener(this);
        this.b30.addActionListener(this);
        this.b31.addActionListener(this);
        this.b32.addActionListener(this);
        this.b33.addActionListener(this);
        this.b34.addActionListener(this);
        this.b35.addActionListener(this);
        this.b36.addActionListener(this);
        this.b37.addActionListener(this);
        this.b38.addActionListener(this);
        this.b39.addActionListener(this);
        this.b40.addActionListener(this);
        this.b41.addActionListener(this);
        this.b42.addActionListener(this);
        this.b43.addActionListener(this);
        this.b44.addActionListener(this);
        this.b45.addActionListener(this);
        this.b46.addActionListener(this);
        this.b47.addActionListener(this);
        this.b48.addActionListener(this);
        this.b49.addActionListener(this);
        this.password.addActionListener(this);
        this.b50.addActionListener(this);
        this.b51.addActionListener(this);
        this.b52.addActionListener(this);
        this.b53.addActionListener(this);
        this.b54.addActionListener(this);
        this.b55.addActionListener(this);
        this.b56.addActionListener(this);
        this.b57.addActionListener(this);
        this.b58.addActionListener(this);
        this.b59.addActionListener(this);
        this.b60.addActionListener(this);
        this.p1.add(this.l1);
        this.p1.add(this.t1);
        this.p1.add(this.b1);
        this.p1.add(this.l2);
        this.p1.add(this.t2);
        this.p1.add(this.b2);
        this.p1.add(this.l3);
        this.p1.add(this.t3);
        this.p1.add(this.b3);
        this.p1.add(this.l4);
        this.p1.add(this.t4);
        this.p1.add(this.b4);
        this.p1.add(this.l5);
        this.p1.add(this.t5);
        this.p1.add(this.b5);
        this.p1.add(this.l6);
        this.p1.add(this.t6);
        this.p1.add(this.b6);
        this.p1.add(this.l7);
        this.p1.add(this.t7);
        this.p1.add(this.b7);
        this.p2.add(this.l8);
        this.p2.add(this.t8);
        this.p2.add(this.b14);
        this.p2.add(this.l9);
        this.p2.add(this.t9);
        this.p2.add(this.b15);
        this.p2.add(this.l10);
        this.p2.add(this.t10);
        this.p2.add(this.b16);
        this.p2.add(this.l11);
        this.p2.add(this.t11);
        this.p2.add(this.b17);
        this.p2.add(this.b27);
        this.p2.add(this.b45);
        this.p3.add(this.l12);
        this.p3.add(this.t12);
        this.p3.add(this.b18);
        this.p3.add(this.l13);
        this.p3.add(this.t13);
        this.p3.add(this.b19);
        this.p3.add(this.l14);
        this.p3.add(this.t14);
        this.p3.add(this.b20);
        this.p3.add(this.l15);
        this.p3.add(this.t15);
        this.p3.add(this.b21);
        this.p3.add(this.l16);
        this.p3.add(this.t16);
        this.p3.add(this.b22);
        this.p3.add(this.l17);
        this.p3.add(this.t17);
        this.p3.add(this.b23);
        this.p3.add(this.l18);
        this.p3.add(this.t18);
        this.p3.add(this.b24);
        this.p3.add(this.l31);
        this.p3.add(this.t32);
        this.p4.add(this.l19);
        this.p4.add(this.t21);
        this.p4.add(this.b31);
        this.p4.add(this.l20);
        this.p4.add(this.t22);
        this.p4.add(this.b32);
        this.p4.add(this.l21);
        this.p4.add(this.t23);
        this.p4.add(this.b33);
        this.p4.add(this.l22);
        this.p4.add(this.t24);
        this.p4.add(this.b34);
        this.p4.add(this.b28);
        this.p4.add(this.b58);
        this.p5.add(this.l23);
        this.p5.add(this.t25);
        this.p5.add(this.b35);
        this.p5.add(this.l24);
        this.p5.add(this.t26);
        this.p5.add(this.b36);
        this.p5.add(this.l25);
        this.p5.add(this.t27);
        this.p5.add(this.b37);
        this.p5.add(this.b38);
        this.p5.add(this.b29);
        this.p5.add(this.b59);
        this.p6.add(this.l26);
        this.p6.add(this.t28);
        this.p6.add(this.b39);
        this.p6.add(this.l27);
        this.p6.add(this.t29);
        this.p6.add(this.b40);
        this.p6.add(this.l28);
        this.p6.add(this.t30);
        this.p6.add(this.b41);
        this.p6.add(this.l29);
        this.p6.add(this.t31);
        this.p6.add(this.b42);
        this.p6.add(this.b30);
        this.p6.add(this.b60);
        this.p7.add(this.b9);
        this.p7.add(this.b10);
        this.p7.add(this.b11);
        this.p7.add(this.b12);
        this.p7.add(this.b13);
        this.p7.add(this.b25);
        this.p8.add(this.p1, "Center");
        this.p8.add(this.p2, "North");
        this.p8.add(this.p3, "East");
        this.p8.add(this.p4, "West");
        this.p8.add(this.b8, "South");
        this.p9.add(new JScrollPane(this.resultTable1), "Center");
        this.p9.add(this.box1, "North");
        this.p9.add(this.b44, "South");
        this.p10.add(new JScrollPane(this.resultTable2), "Center");
        this.p10.add(this.box2, "North");
        this.p10.add(this.b46, "South");
        this.p11.add(new JScrollPane(this.resultTable3), "Center");
        this.p11.add(this.box3, "North");
        this.p11.add(this.b54, "South");
        this.p12.add(new JScrollPane(this.resultTable4), "Center");
        this.p12.add(this.box4, "North");
        this.p12.add(this.b55, "South");
        this.p13.add(new JScrollPane(this.resultTable5), "Center");
        this.p13.add(this.box5, "North");
        this.p13.add(this.b56, "South");
        this.p14.add(new JScrollPane(this.resultTable6), "Center");
        this.p14.add(this.box6, "North");
        this.p14.add(this.b57, "South");
        this.p15.add(this.p9, "Center");
        this.p15.add(this.p10, "North");
        this.p15.add(this.p11, "East");
        this.p15.add(this.p12, "West");
        this.p15.add(this.p13, "South");
        this.p16.add(this.p14, "South");
        this.p16.add(this.p6, "North");
        this.p16.add(this.p5, "East");
        this.p16.add(this.p7, "West");
        this.p16.add(this.p17, "Center");
        this.p17.add(this.box7);
        add(this.p16, "West");
        add(this.p15, "East");
        add(this.p8, "Center");
        add(this.b26, "South");
        add(this.b48, "North");
        this.p1.setVisible(false);
        this.p2.setVisible(false);
        this.p3.setVisible(false);
        this.p4.setVisible(false);
        this.p5.setVisible(false);
        this.p6.setVisible(false);
        this.p7.setVisible(false);
        this.p8.setVisible(false);
        this.p9.setVisible(false);
        this.p10.setVisible(false);
        this.p11.setVisible(false);
        this.p12.setVisible(false);
        this.p13.setVisible(false);
        this.p14.setVisible(false);
        this.p15.setVisible(false);
        this.b26.setVisible(false);
        setSize(1200, 650);
        setLocation(40, 20);
        setVisible(true);
        setDefaultCloseOperation(3);
    }

    public void actionPerformed(ActionEvent e) {
        String x1 = this.t1.getText();
        String x2 = this.t2.getText();
        String x3 = this.t3.getText();
        String x4 = this.t4.getText();
        String x5 = this.t5.getText();
        String x6 = this.t6.getText();
        String x7 = this.t7.getText();
        String x8 = this.t8.getText();
        String x9 = this.t9.getText();
        String x10 = this.t10.getText();
        String x11 = this.t11.getText();
        String x12 = this.t12.getText();
        String x13 = this.t13.getText();
        String x14 = this.t14.getText();
        String x15 = this.t15.getText();
        String x16 = this.t16.getText();
        String x17 = this.t17.getText();
        String x18 = this.t18.getText();
        this.t19.getText();
        this.t20.getText();
        String x21 = this.t21.getText();
        String x22 = this.t22.getText();
        String x23 = this.t23.getText();
        String x24 = this.t24.getText();
        String x25 = this.t25.getText();
        String x26 = this.t26.getText();
        String x27 = this.t27.getText();
        String x28 = this.t28.getText();
        String x29 = this.t29.getText();
        String x30 = this.t30.getText();
        String x31 = this.t31.getText();
        String x32 = this.t32.getText();
        if (e.getSource() == this.b1) {
            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement = connection.prepareStatement("insert  into PATIENT   values (?,?,?,?,?,?,?)");
                preparedStatement.setString(1, x1);
                preparedStatement.setString(2, x2);
                preparedStatement.setString(3, x3);
                preparedStatement.setString(4, x4);
                preparedStatement.setString(5, x5);
                preparedStatement.setString(6, x6);
                preparedStatement.setString(7, x7);
                preparedStatement.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e2) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b4) {
            this.t1.setText("");
            this.t2.setText("");
            this.t3.setText("");
            this.t4.setText("");
            this.t5.setText("");
            this.t6.setText("");
            this.t7.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b3) {
            try {
                Connection connection2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement2 = connection2.prepareStatement("update  patient set fname =? ,mname=?,lname=?,pasex=?,age=?,paphonenumber=? where passn=? ");
                preparedStatement2.setString(1, x1);
                preparedStatement2.setString(2, x2);
                preparedStatement2.setString(3, x3);
                preparedStatement2.setString(4, x4);
                preparedStatement2.setString(5, x5);
                preparedStatement2.setString(6, x7);
                preparedStatement2.setString(7, x6);
                preparedStatement2.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e3) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b2) {
            try {
                Connection connection3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement3 = connection3.prepareStatement("delete from  patient where passn=? ");
                preparedStatement3.setString(1, x6);
                preparedStatement3.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e4) {
                System.out.println("Error while connecting to the database");
            }
        }
        if (e.getSource() == this.b14) {
            try {
                Connection connection4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement4 = connection4.prepareStatement("insert  into BLOOD   values (?,?,?,?)");
                preparedStatement4.setString(1, x8);
                preparedStatement4.setString(2, x9);
                preparedStatement4.setString(3, x10);
                preparedStatement4.setString(4, x11);
                preparedStatement4.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e5) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b15) {
            try {
                Connection connection5 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement5 = connection5.prepareStatement("delete from  BLOOD where Blood_Id=? ");
                preparedStatement5.setString(1, x8);
                preparedStatement5.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e6) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b16) {
            try {
                Connection connection6 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement6 = connection6.prepareStatement("update  BLOOD set ssn =? ,Event_Id=?,Blood_Quantity=? where Blood_Id=? ");
                preparedStatement6.setString(1, x9);
                preparedStatement6.setString(2, x10);
                preparedStatement6.setString(3, x11);
                preparedStatement6.setString(4, x8);
                preparedStatement6.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e7) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b17) {
            this.t8.setText("");
            this.t9.setText("");
            this.t10.setText("");
            this.t11.setText("");
            this.t12.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b18) {
            try {
                Connection connection7 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement7 = connection7.prepareStatement("insert  into DONOR   values (?,?,?,?,?,?,?,?)");
                preparedStatement7.setString(1, x12);
                preparedStatement7.setString(2, x13);
                preparedStatement7.setString(3, x14);
                preparedStatement7.setString(4, x15);
                preparedStatement7.setString(5, x16);
                preparedStatement7.setString(6, x17);
                preparedStatement7.setString(7, x18);
                preparedStatement7.setString(8, x32);
                preparedStatement7.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e8) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b19) {
            try {
                Connection connection8 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement8 = connection8.prepareStatement("delete from  DONOR where DonSSN=? ");
                preparedStatement8.setString(1, x17);
                preparedStatement8.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e9) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b20) {
            try {
                Connection connection9 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement9 = connection9.prepareStatement("update  donor set Donfname =? ,Donmname=?,Donlname=?,sex =? ,blood_type=?,phonenumber=?,Date=? where DonSSN=? ");
                preparedStatement9.setString(1, x12);
                preparedStatement9.setString(2, x13);
                preparedStatement9.setString(3, x14);
                preparedStatement9.setString(4, x15);
                preparedStatement9.setString(5, x16);
                preparedStatement9.setString(6, x18);
                preparedStatement9.setString(7, x32);
                preparedStatement9.setString(8, x17);
                preparedStatement9.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e10) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b21) {
            this.t12.setText("");
            this.t13.setText("");
            this.t14.setText("");
            this.t15.setText("");
            this.t16.setText("");
            this.t17.setText("");
            this.t18.setText("");
            this.t32.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b31) {
            try {
                Connection connection10 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement10 = connection10.prepareStatement("insert  into branch   values (?,?,?,?)");
                preparedStatement10.setString(1, x21);
                preparedStatement10.setString(2, x22);
                preparedStatement10.setString(3, x23);
                preparedStatement10.setString(4, x24);
                preparedStatement10.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e11) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b32) {
            try {
                Connection connection11 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement11 = connection11.prepareStatement("delete from  branch where Branch_Number=? ");
                preparedStatement11.setString(1, x21);
                preparedStatement11.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e12) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b33) {
            try {
                Connection connection12 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement12 = connection12.prepareStatement("update  branch set City =? ,Streate=?,postcode_number=? where branch_number =? ");
                preparedStatement12.setString(1, x22);
                preparedStatement12.setString(2, x23);
                preparedStatement12.setString(3, x24);
                preparedStatement12.setString(4, x21);
                preparedStatement12.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e13) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b34) {
            this.t21.setText("");
            this.t22.setText("");
            this.t23.setText("");
            this.t24.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b35) {
            try {
                Connection connection13 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement13 = connection13.prepareStatement("insert  into BloodDonEvent   values (?,?,?)");
                preparedStatement13.setString(1, x25);
                preparedStatement13.setString(2, x26);
                preparedStatement13.setString(3, x27);
                preparedStatement13.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e14) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b36) {
            try {
                Connection connection14 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement14 = connection14.prepareStatement("delete from  BloodDonEvent where Event_id=? ");
                preparedStatement14.setString(1, x25);
                preparedStatement14.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e15) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b37) {
            try {
                Connection connection15 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement15 = connection15.prepareStatement("update  BloodDonEvent set branch_Number =? ,Event_Date=? where Event_id =? ");
                preparedStatement15.setString(1, x26);
                preparedStatement15.setString(2, x27);
                preparedStatement15.setString(3, x25);
                preparedStatement15.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e16) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b38) {
            this.t25.setText("");
            this.t26.setText("");
            this.t27.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b39) {
            try {
                Connection connection16 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement16 = connection16.prepareStatement("insert  into BloodPatient   values (?,?,?,?)");
                preparedStatement16.setString(1, x28);
                preparedStatement16.setString(2, x29);
                preparedStatement16.setString(3, x30);
                preparedStatement16.setString(4, x31);
                preparedStatement16.executeUpdate();
                System.out.println("Data Inserted successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Inserted successfully !!!", "            OKEY", -1);
            } catch (SQLException e17) {
                System.out.println("Error while connecting to the database");
                JOptionPane.showMessageDialog((Component) null, "There Might Happpen Braking  Of Key Constriants !!!", "            WARNING", -1);
            }
        } else if (e.getSource() == this.b40) {
            try {
                Connection connection17 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement17 = connection17.prepareStatement("delete from  BloodPatient where ssn=?  AND Blood_id=? ");
                preparedStatement17.setString(1, x28);
                preparedStatement17.setString(2, x29);
                preparedStatement17.executeUpdate();
                System.out.println("Data Deleted  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data Deleted successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e18) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b41) {
            try {
                Connection connection18 = DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank_man", "root", "habtamu");
                System.out.println("Connected With the database successfully");
                PreparedStatement preparedStatement18 = connection18.prepareStatement("update  BloodPatient set Blood_Date =? ,Blood_Quantity=? where ssn=? AND Blood_id=? ");
                preparedStatement18.setString(1, x30);
                preparedStatement18.setString(2, x31);
                preparedStatement18.setString(3, x28);
                preparedStatement18.setString(4, x29);
                preparedStatement18.executeUpdate();
                System.out.println("Data updated  successfully");
                JOptionPane.showMessageDialog((Component) null, " Data updated successfully if present  !!!", "            OKEY", -1);
            } catch (SQLException e19) {
                System.out.println("Error while connecting to the database");
            }
        } else if (e.getSource() == this.b42) {
            this.t28.setText("");
            this.t29.setText("");
            this.t30.setText("");
            this.t31.setText("");
            JOptionPane.showMessageDialog((Component) null, " Data Cleared successfully !!!", "            OKEY", -1);
        } else if (e.getSource() == this.b26) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(true);
            this.b26.setVisible(false);
            this.p9.setVisible(false);
            this.p10.setVisible(false);
            this.p11.setVisible(false);
            this.p12.setVisible(false);
            this.p13.setVisible(false);
            this.p14.setVisible(false);
            this.p15.setVisible(false);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b7 || e.getSource() == this.b24 || e.getSource() == this.b27 || e.getSource() == this.b28) {
            this.p8.setVisible(false);
            this.b26.setVisible(true);
            this.b8.setVisible(true);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b29 || e.getSource() == this.b30) {
            this.p8.setVisible(false);
            this.b26.setVisible(true);
            this.b8.setVisible(true);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b9) {
            this.p1.setVisible(true);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(true);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b10) {
            this.p1.setVisible(false);
            this.p2.setVisible(true);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(true);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b11) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(true);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(true);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b12) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(true);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(true);
            this.p16.setVisible(false);
        } else if (e.getSource() == this.b8) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(true);
            this.p8.setVisible(true);
            this.b8.setVisible(false);
            this.p16.setVisible(true);
        } else if (e.getSource() == this.b25) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(true);
            this.p7.setVisible(false);
            this.p8.setVisible(false);
            this.p16.setVisible(true);
        } else if (e.getSource() == this.b13) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(true);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(false);
            this.p16.setVisible(true);
        } else if (e.getSource() == this.b5) {
            this.p1.setVisible(false);
            this.p2.setVisible(false);
            this.p3.setVisible(false);
            this.p4.setVisible(false);
            this.p5.setVisible(false);
            this.p6.setVisible(false);
            this.p7.setVisible(false);
            this.p8.setVisible(false);
            this.p16.setVisible(false);
            this.p9.setVisible(true);
            this.p15.setVisible(true);
        } else if (e.getSource() == this.b44) {
            this.p1.setVisible(true);
            this.p8.setVisible(true);
            this.p16.setVisible(false);
            this.p15.setVisible(false);
        } else if (e.getSource() == this.b22) {
            this.p11.setVisible(true);
            this.p8.setVisible(false);
            this.p16.setVisible(false);
            this.p15.setVisible(true);
        } else if (e.getSource() == this.b54) {
            this.p3.setVisible(true);
            this.p8.setVisible(true);
            this.p11.setVisible(false);
        } else if (e.getSource() == this.b55) {
            this.p4.setVisible(true);
            this.p8.setVisible(true);
            this.p12.setVisible(false);
        } else if (e.getSource() == this.b56) {
            this.p5.setVisible(true);
            this.p16.setVisible(true);
            this.p13.setVisible(false);
        } else if (e.getSource() == this.b57) {
            this.p6.setVisible(true);
            this.p16.setVisible(true);
            this.p14.setVisible(false);
        } else if (e.getSource() == this.b58) {
            this.p12.setVisible(true);
            this.p8.setVisible(false);
            this.p16.setVisible(false);
            this.p15.setVisible(true);
        } else if (e.getSource() == this.b59) {
            this.p13.setVisible(true);
            this.p8.setVisible(false);
            this.p16.setVisible(false);
            this.p15.setVisible(true);
        } else if (e.getSource() == this.b60) {
            this.p14.setVisible(true);
            this.p8.setVisible(false);
            this.p6.setVisible(false);
            this.p16.setVisible(true);
            this.p17.setVisible(false);
            this.p15.setVisible(false);
        } else if (e.getSource() == this.b45) {
            this.p8.setVisible(false);
            this.p16.setVisible(false);
            this.p10.setVisible(true);
            this.p15.setVisible(true);
            this.p9.setVisible(false);
            this.p11.setVisible(false);
            this.p12.setVisible(false);
            this.p13.setVisible(false);
        } else if (e.getSource() == this.b46) {
            this.p8.setVisible(true);
            this.p16.setVisible(false);
            this.p2.setVisible(true);
            this.p10.setVisible(false);
            this.p15.setVisible(false);
        } else if (e.getSource() == this.b49) {
            if (Integer.parseInt(this.password.getText()) == 1234) {
                this.b26.setVisible(true);
                this.box7.setVisible(false);
                this.p16.setVisible(false);
            }
        } else if (e.getSource() == this.b48) {
            this.color = JColorChooser.showDialog(this, "Choose a color", this.color);
            if (this.color == null) {
                this.color = this.color;
            }
            this.p1.setBackground(this.color);
            this.p2.setBackground(this.color);
            this.p3.setBackground(this.color);
            this.p4.setBackground(this.color);
            this.p5.setBackground(this.color);
            this.p6.setBackground(this.color);
            this.p7.setBackground(this.color);
            this.p8.setBackground(this.color);
            this.p9.setBackground(this.color);
            this.p10.setBackground(this.color);
            this.p11.setBackground(this.color);
            this.p12.setBackground(this.color);
            this.p13.setBackground(this.color);
            this.p14.setBackground(this.color);
            this.p15.setBackground(this.color);
            this.p16.setBackground(this.color);
            this.p17.setBackground(this.color);
        } else if (e.getSource() == this.b43) {
            try {
                this.tableModel1.setQuery(this.QueryArea1.getText());
            } catch (SQLException sqlException) {
                JOptionPane.showMessageDialog((Component) null, sqlException.getMessage(), "Database error", 0);
                try {
                    this.tableModel1.setQuery("SELECT * FROM patient");
                    this.QueryArea1.setText("SELECT * FROM patient");
                } catch (SQLException sqlException2) {
                    JOptionPane.showMessageDialog((Component) null, sqlException2.getMessage(), "Database error", 0);
                    this.tableModel1.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        } else if (e.getSource() == this.b47) {
            try {
                this.tableModel2.setQuery(this.QueryArea2.getText());
            } catch (SQLException sqlException3) {
                JOptionPane.showMessageDialog((Component) null, sqlException3.getMessage(), "Database error", 0);
                try {
                    this.tableModel2.setQuery("SELECT * FROM blood");
                    this.QueryArea2.setText("SELECT * FROM blood");
                } catch (SQLException sqlException22) {
                    JOptionPane.showMessageDialog((Component) null, sqlException22.getMessage(), "Database error", 0);
                    this.tableModel2.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        } else if (e.getSource() == this.b50) {
            try {
                this.tableModel3.setQuery(this.QueryArea3.getText());
            } catch (SQLException sqlException4) {
                JOptionPane.showMessageDialog((Component) null, sqlException4.getMessage(), "Database error", 0);
                try {
                    this.tableModel3.setQuery("SELECT * FROM donor");
                    this.QueryArea3.setText("SELECT * FROM donor");
                } catch (SQLException sqlException23) {
                    JOptionPane.showMessageDialog((Component) null, sqlException23.getMessage(), "Database error", 0);
                    this.tableModel3.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        } else if (e.getSource() == this.b51) {
            try {
                this.tableModel4.setQuery(this.QueryArea4.getText());
            } catch (SQLException sqlException5) {
                JOptionPane.showMessageDialog((Component) null, sqlException5.getMessage(), "Database error", 0);
                try {
                    this.tableModel4.setQuery("SELECT * FROM branch");
                    this.QueryArea4.setText("SELECT * FROM branch");
                } catch (SQLException sqlException24) {
                    JOptionPane.showMessageDialog((Component) null, sqlException24.getMessage(), "Database error", 0);
                    this.tableModel4.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        } else if (e.getSource() == this.b52) {
            try {
                this.tableModel5.setQuery(this.QueryArea5.getText());
            } catch (SQLException sqlException6) {
                JOptionPane.showMessageDialog((Component) null, sqlException6.getMessage(), "Database error", 0);
                try {
                    this.tableModel5.setQuery("SELECT * FROM BloodDonEvent");
                    this.QueryArea5.setText("SELECT * FROM BloodDonEvent");
                } catch (SQLException sqlException25) {
                    JOptionPane.showMessageDialog((Component) null, sqlException25.getMessage(), "Database error", 0);
                    this.tableModel5.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        } else if (e.getSource() == this.b53) {
            try {
                this.tableModel6.setQuery(this.QueryArea6.getText());
            } catch (SQLException sqlException7) {
                JOptionPane.showMessageDialog((Component) null, sqlException7.getMessage(), "Database error", 0);
                try {
                    this.tableModel6.setQuery("SELECT * FROM BloodPatient");
                    this.QueryArea6.setText("SELECT * FROM BloodPatient");
                } catch (SQLException sqlException26) {
                    JOptionPane.showMessageDialog((Component) null, sqlException26.getMessage(), "Database error", 0);
                    this.tableModel6.disconnectFromDatabase();
                    System.exit(1);
                }
            }
        }
    }
}
