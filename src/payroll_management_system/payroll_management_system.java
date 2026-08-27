package payroll_management_system;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

public class payroll_management_system extends javax.swing.JFrame {
    
   private static final String DB_URL = "jdbc:mysql://localhost:3306/payroll_database";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "your_MySQL_password";

 

    public payroll_management_system() {

        initEmployeeNumberCounter();

        
        initComponents();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        model.setColumnCount(0);
        
        model.addColumn("Employee Name");
        model.addColumn("Addres");
        model.addColumn("Department");
        model.addColumn("Gross Salary");
        model.addColumn("Tax");
        model.addColumn("Pension");
        model.addColumn("Net Salary");
        model.addColumn("Employee Number");
        makeTable();
        
        table1.addMouseListener(new java.awt.event.MouseAdapter() {
    public void mouseClicked(java.awt.event.MouseEvent evt) {
        int selectedRow = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();

        empnametxt.setText(model.getValueAt(selectedRow, 0).toString()); // Employee Name
        empnumtxt.setText(model.getValueAt(selectedRow, 7).toString()); // Employee Number
        addresstxt.setText(model.getValueAt(selectedRow, 1).toString()); // Address
        departmenttxt.setText(model.getValueAt(selectedRow, 2).toString()); // Department
        gross_salarytxt.setText(model.getValueAt(selectedRow, 3).toString()); // Gross Salary
        taxtxt.setText(model.getValueAt(selectedRow, 4).toString()); // Tax
        pensiontxt.setText(model.getValueAt(selectedRow, 5).toString()); // Pension
        net_salarytxt.setText(model.getValueAt(selectedRow, 6).toString()); // Net Salary
    }
});

    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        empnumtxt = new javax.swing.JTextField();
        empnametxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        addresstxt = new javax.swing.JTextField();
        departmenttxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        taxtxt = new javax.swing.JTextField();
        gross_salarytxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pensiontxt = new javax.swing.JTextField();
        net_salarytxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        add_toTablebtn = new javax.swing.JButton();
        update_btn = new javax.swing.JButton();
        delete_btn = new javax.swing.JButton();
        reset_btn = new javax.swing.JButton();
        exit_btn = new javax.swing.JButton();
        Calculate_netsalarybtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new javax.swing.JTable();
        errortextfield = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setSize(new java.awt.Dimension(1360, 1000));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Employee number");

        empnumtxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        empnametxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        empnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empnametxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Employee name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Department");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Address");

        addresstxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        addresstxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstxtActionPerformed(evt);
            }
        });

        departmenttxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Tax");

        taxtxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        taxtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taxtxtActionPerformed(evt);
            }
        });

        gross_salarytxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Gross salary");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Net Salary");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("Pension");

        pensiontxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        net_salarytxt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        net_salarytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                net_salarytxtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(138, 138, 138)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pensiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(taxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(net_salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(gross_salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(gross_salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6)
                        .addGap(24, 24, 24)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(taxtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(pensiontxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(net_salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        add_toTablebtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        add_toTablebtn.setText("Add to table");
        add_toTablebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_toTablebtnActionPerformed(evt);
            }
        });

        update_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        update_btn.setText("Update table");
        update_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_btnActionPerformed(evt);
            }
        });

        delete_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        delete_btn.setText("Delete row");
        delete_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_btnActionPerformed(evt);
            }
        });

        reset_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reset_btn.setText("Reset");
        reset_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset_btnActionPerformed(evt);
            }
        });

        exit_btn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        exit_btn.setText("Exit");
        exit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exit_btnActionPerformed(evt);
            }
        });

        Calculate_netsalarybtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Calculate_netsalarybtn.setText("Calculate netsalary");
        Calculate_netsalarybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Calculate_netsalarybtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(exit_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(reset_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(delete_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(update_btn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(add_toTablebtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Calculate_netsalarybtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(Calculate_netsalarybtn, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(add_toTablebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(update_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delete_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(reset_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exit_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
        );

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee name", "Employee number", "Address", "Department", "Gross salary", "Tax", "Pension", "Net Salary"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);

        errortextfield.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(empnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3))
                                        .addGap(75, 75, 75)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(departmenttxt, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                            .addComponent(addresstxt)
                                            .addComponent(empnumtxt)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(44, 44, 44)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(errortextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 1048, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1138, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(1181, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jLabel2)
                    .addContainerGap(2111, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(empnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(empnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel4))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addresstxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)))
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(departmenttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(38, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addComponent(errortextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(264, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(29, 29, 29)
                    .addComponent(jLabel2)
                    .addContainerGap(1209, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 967, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel9.setText("ENTER EMPLOYEE DETAILS");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 754, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private int employeeNumberCounter = 1;

    private void saveToDatabase() {
    String employeeNumber = "EMP" + String.format("%04d", employeeNumberCounter);
    
    
    DefaultTableModel model = (DefaultTableModel) table1.getModel();
    model.addRow(new Object[]{
        empnametxt.getText(), // Employee Name
        addresstxt.getText(), // Address
        departmenttxt.getText(), // Department
        gross_salarytxt.getText(), // Gross Salary
        taxtxt.getText(), // Tax
        pensiontxt.getText(), // Pension
        net_salarytxt.getText(), // Net Salary
        employeeNumber // Employee Number
    });
    employeeNumberCounter++;
    empnumtxt.setText(employeeNumber); // Set the employee number in the text field

    
    
    
            String DB_URL = "jdbc:mysql://localhost:3306/payroll_database?useSSL=false";
    String USER = "root";
    String PASS = "your_MySQL_password";

    try  {
        
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        String query = "INSERT INTO employees (employee_name, employee_number, address, department, gross_salary, tax, pension, net_salary) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, empnametxt.getText());
        pstmt.setString(2, empnumtxt.getText());
        pstmt.setString(3, addresstxt.getText());
        pstmt.setString(4, departmenttxt.getText());

        // Assuming gross_salary, tax, pension, and net_salary are numeric columns
        pstmt.setBigDecimal(5, new BigDecimal(gross_salarytxt.getText()));
        pstmt.setBigDecimal(6, new BigDecimal(taxtxt.getText()));
        pstmt.setBigDecimal(7, new BigDecimal(pensiontxt.getText()));
        pstmt.setBigDecimal(8, new BigDecimal(net_salarytxt.getText()));

        pstmt.executeUpdate();
        makeTable();
        errortextfield.setText("Data saved successfully!");
    } catch (SQLException e) {
        errortextfield.setText("Error saving to database: " + e.getMessage());
        System.out.println("Error saving to database: " + e.getMessage());
    }

    }
    
    
    
    private void initEmployeeNumberCounter() {
    try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
        String query = "SELECT MAX(employee_number) FROM employees";
        PreparedStatement pstmt = conn.prepareStatement(query);
        ResultSet result = pstmt.executeQuery();
        if (result.next()) {
            String lastEmployeeNumber = result.getString(1);
            if (lastEmployeeNumber != null) {
                int lastNumber = Integer.parseInt(lastEmployeeNumber.substring(3)); // Remove "EMP" prefix
                employeeNumberCounter = lastNumber + 1;
            }
        }
    } catch (SQLException e) {
        errortextfield.setText("Error initializing employee number counter: " + e.getMessage());
    }
}

    
    
    
    
    
    
    private void updateDatabase(String empNum) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "UPDATE employees SET employee_name = ?, address = ?, department = ?, gross_salary = ?, tax = ?, pension = ?, net_salary = ? WHERE employee_number = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, empnametxt.getText());
            pstmt.setString(2, addresstxt.getText());
            pstmt.setString(3, departmenttxt.getText());
            pstmt.setString(4, gross_salarytxt.getText());
            pstmt.setString(5, taxtxt.getText());
            pstmt.setString(6, pensiontxt.getText());
            pstmt.setString(7, net_salarytxt.getText());
            pstmt.setString(8, empNum);
            pstmt.executeUpdate();
            errortextfield.setText("Updated successfuly");
            
        } catch (SQLException e) {
            errortextfield.setText("Error updating database: " + e.getMessage());
        }
    }
    private void deleteFromDatabase(String empNo) {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "DELETE FROM employees WHERE employee_number = ? ;";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setString(1, empNo);
            pstmt.executeUpdate();
            makeTable();
            errortextfield.setText("Deleted successfully!");
            
        } catch (SQLException e) {
         //   errortextfield.setText("Error deleting from database: " + e.getMessage());
        }
    }
    private void addresstxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstxtActionPerformed

    private void taxtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taxtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_taxtxtActionPerformed

    private void Calculate_netsalarybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Calculate_netsalarybtnActionPerformed
        try {
            String department = departmenttxt.getText().trim().toLowerCase();
            double grossSalary = 0.0;

            switch (department) {
                case "lecturer":
                grossSalary = 5000.0;
                break;
                case "cook":
                grossSalary = 2000.0;
                break;
                case "security guard":
                grossSalary = 2500.0;
                break;
                case "gardener":
                grossSalary = 1500.0;
                break;
                default:
                errortextfield.setText("Invalid department. Please check the department name.");
                gross_salarytxt.setText("");
                taxtxt.setText("");
                pensiontxt.setText("");
                net_salarytxt.setText("");
                return;
            }gross_salarytxt.setText(String.valueOf(grossSalary));
            double taxRate = 0.15;
            double pensionRate = 0.10;
            double taxAmount = grossSalary * taxRate;
            double pensionAmount = grossSalary * pensionRate;
            double netSalary = grossSalary - taxAmount - pensionAmount;

            net_salarytxt.setText(String.format("%.2f", netSalary));
            taxtxt.setText(String.format("%.2f", taxAmount));
            pensiontxt.setText(String.format("%.2f", pensionAmount));
        } catch (Exception e) {
            errortextfield.setText("An error occurred: " + e.getMessage());
        }

    }//GEN-LAST:event_Calculate_netsalarybtnActionPerformed

    private void exit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exit_btnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exit_btnActionPerformed

    private void reset_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reset_btnActionPerformed
        empnametxt.setText(null);
        empnumtxt.setText(null);
        addresstxt.setText(null);
        departmenttxt.setText(null);
        gross_salarytxt.setText(null);
        taxtxt.setText(null);
        pensiontxt.setText(null);
        net_salarytxt.setText(null);
    }//GEN-LAST:event_reset_btnActionPerformed

    private void delete_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_btnActionPerformed
        errortextfield.setText(null);
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if(table1.getSelectedRow()==-1){
            if(table1.getRowCount()==0){
                errortextfield.setText("NO DATA TO DELETE");
            }else{
                errortextfield.setText("SELECT ROW TO DELETE!");
            }
        }else{
            
            String empNo = model.getValueAt(table1.getSelectedRow(), 7).toString();
            updateDatabase(empNo);
            makeTable();

            deleteFromDatabase(empNo);
        }
    }//GEN-LAST:event_delete_btnActionPerformed

    private void update_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_btnActionPerformed
        int selectedRow = table1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        if (selectedRow == -1) {
            errortextfield.setText("SELECT ROW TO UPDATE!");
        } else {
      
       
            String empNo = model.getValueAt(selectedRow, 7).toString();
            updateDatabase(empNo);
            makeTable();
        }
    }//GEN-LAST:event_update_btnActionPerformed

    private void makeTable(){

        String DB_URL = "jdbc:mysql://localhost:3306/payroll_database?useSSL=false";
        String USER = "root";
        String PASS = "your_MySQL_password";
        
        try {
            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement st = con.createStatement();
            String sql = "select * from employees;";
            ResultSet result = st.executeQuery(sql);
            
            DefaultTableModel model = (DefaultTableModel) table1.getModel();
            
            model.setRowCount(0);
            while (result.next()){
                model.addRow(new Object [] {
                    result.getString("employee_name"),
                    result.getString("address"),
                    result.getString("department"),
                    result.getString("gross_salary"),
                    result.getString("tax"),
                    result.getString("pension"),
                    result.getString("net_salary"),
                    result.getString("employee_number")
                });
            }
            
        }
        catch (SQLException e){
            
        }
    }
    
    private void add_toTablebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_toTablebtnActionPerformed

        
        DefaultTableModel model = (DefaultTableModel) table1.getModel();
        makeTable();

     
        saveToDatabase();
    }//GEN-LAST:event_add_toTablebtnActionPerformed

    private void net_salarytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_net_salarytxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_net_salarytxtActionPerformed

    private void empnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empnametxtActionPerformed

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
            java.util.logging.Logger.getLogger(payroll_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(payroll_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(payroll_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(payroll_management_system.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new payroll_management_system().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calculate_netsalarybtn;
    private javax.swing.JButton add_toTablebtn;
    private javax.swing.JTextField addresstxt;
    private javax.swing.JButton delete_btn;
    private javax.swing.JTextField departmenttxt;
    private javax.swing.JTextField empnametxt;
    private javax.swing.JTextField empnumtxt;
    private javax.swing.JTextField errortextfield;
    private javax.swing.JButton exit_btn;
    private javax.swing.JTextField gross_salarytxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField net_salarytxt;
    private javax.swing.JTextField pensiontxt;
    private javax.swing.JButton reset_btn;
    private javax.swing.JTable table1;
    private javax.swing.JTextField taxtxt;
    private javax.swing.JButton update_btn;
    // End of variables declaration//GEN-END:variables
}
