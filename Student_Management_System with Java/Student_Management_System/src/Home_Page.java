//Libraries......
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
//------------------------------------------------------------------------------


public class Home_Page extends javax.swing.JFrame {
    
    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null; 
    
    public Home_Page() {
        initComponents();
        
        conn = DB_Connection.connection(); // Calling DB_Connection Method... 
        ResultSet rs = null;
        Table_Load();      
    }
//------------------------------------------------------------------------------   
    
    public void Table_Load(){   // <--- Table_Load Method....
        
        try {
            String sql = "SELECT * FROM student";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            tbl_student.setModel(DbUtils.resultSetToTableModel(rs));
          
        } catch (Exception e) {
            System.err.println(e);
        } 
    }
 //-----------------------------------------------------------------------------   
    
    public void Display_Table_data(){  // <--- 'Display_Table_data' Method...
        
    int row = tbl_student.getSelectedRow(); // Declaring a Variable, named as 'row'.
        
        // Assigning Values to Variables...(Using Values of the Table) 
        String id = tbl_student.getValueAt(row, 0).toString();
        String name1 = tbl_student.getValueAt(row, 1).toString();
        String name2 = tbl_student.getValueAt(row, 2).toString();
        String nic = tbl_student.getValueAt(row, 3).toString();
        String dob = tbl_student.getValueAt(row, 4).toString();
        String sex = tbl_student.getValueAt(row, 5).toString();
        String address = tbl_student.getValueAt(row, 6).toString();
        String email = tbl_student.getValueAt(row, 7).toString();
        String tp = tbl_student.getValueAt(row, 8).toString();
        String courseid = tbl_student.getValueAt(row, 9).toString();
        String coursename = tbl_student.getValueAt(row, 10).toString();
        
        // Assigning Vlues to Textboxes...(Using Variables)
        txtStuId.setText(id);
        txtNamewithInitials.setText(name1);
        txtNameinFull.setText(name2);
        txtNIC.setText(nic);
        txtDOB.setText(dob);
        txtGender.setSelectedItem(sex);
        txtAddress.setText(address);
        txtEmail.setText(email);
        txtTP.setText(tp);
        txtCourseId.setSelectedItem(courseid);
        txtCourseName.setText(coursename);
    }
//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtStuId = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTP = new javax.swing.JTextField();
        txtNamewithInitials = new javax.swing.JTextField();
        txtNameinFull = new javax.swing.JTextField();
        txtNIC = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtCourseName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtGender = new javax.swing.JComboBox<>();
        txtCourseId = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_student = new javax.swing.JTable();
        jTextField11 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        txtsearch = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT REGISTRATION SYSTEM");

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setName(""); // NOI18N

        jPanel2.setBackground(new java.awt.Color(200, 226, 252));

        txtNamewithInitials.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamewithInitialsActionPerformed(evt);
            }
        });

        txtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCourseNameActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel1.setText("Stu_ID");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel2.setText("Name in Full");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel3.setText("Name with Initials");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel4.setText("Gender");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel5.setText("NIC No");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel6.setText("Date of Birth");

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel7.setText("Email");

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel8.setText("Address");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel9.setText("Course_ID");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel10.setText("Telephone");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        jLabel11.setText("Course Name");

        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));

        txtCourseId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "NVQ5ICT", "NVQCBA", "" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 9, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCourseName)
                    .addComponent(txtAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                    .addComponent(txtDOB)
                    .addComponent(txtNIC)
                    .addComponent(txtNameinFull)
                    .addComponent(txtTP)
                    .addComponent(txtEmail)
                    .addComponent(txtGender, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtStuId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNamewithInitials, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCourseId, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAddress, txtGender});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStuId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNamewithInitials, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNameinFull, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNIC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTP, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtCourseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addGap(52, 52, 52))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAddress, txtGender});

        tbl_student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Stu_ID", "Name _with_Initials", "Name _in_Full", "NIC", "DOB", "Gender", "Address", "Email", "Telephone", "Course_ID", "Cours_Name"
            }
        ));
        tbl_student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_studentMouseClicked(evt);
            }
        });
        tbl_student.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_studentKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_student);

        jTextField11.setText("jTextField1");

        jPanel3.setBackground(new java.awt.Color(153, 204, 255));

        btn_delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("DELETE");
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("CLEAR");
        btn_clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        btn_Insert.setBackground(new java.awt.Color(0, 0, 0));
        btn_Insert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_Insert.setText("INSERT");
        btn_Insert.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });

        btn_update.setBackground(new java.awt.Color(0, 0, 0));
        btn_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_update.setForeground(new java.awt.Color(255, 255, 255));
        btn_update.setText("UPDATE");
        btn_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btn_Insert)
                .addGap(27, 27, 27)
                .addComponent(btn_update)
                .addGap(18, 18, 18)
                .addComponent(btn_delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btn_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40))
        );

        txtsearch.setFont(new java.awt.Font("Tahoma", 1, 17)); // NOI18N
        txtsearch.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("      SEARCH :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1277, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(641, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(605, 605, 605)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 771, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(590, Short.MAX_VALUE)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(308, 308, 308)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        // INSERT Button.....
         try{
            String stu_id = txtStuId.getText();
            String name_with_initials = txtNamewithInitials.getText();
            String name_in_full = txtNameinFull.getText();
            String nic = txtNIC.getText();
            String dob = txtDOB.getText();
            String gender = (String) txtGender.getSelectedItem();
            String address = txtAddress.getText();   
            String email = txtEmail.getText();
            String tp = txtTP.getText();
            String course_id = (String)txtCourseId.getSelectedItem();
            String course_name = txtCourseName.getText();
            
            if(!name_with_initials.isEmpty()){
                if(!name_in_full.isEmpty()){
                    if(!nic.isEmpty()){
                        if(!dob.isEmpty()){
                            if(!gender.isEmpty()){
                                if(!address.isEmpty()){
                                    if(!email.isEmpty()){
                                        if(!tp.isEmpty()){
                                            if(!course_id.isEmpty()){
                                                if(!course_name.isEmpty()){
                                               
                                                    String sql = "INSERT INTO student (Name_with_Initials, Name_in_Full, NIC, DOB, Gender, Address, Email, Telephone, Course_ID, Course_Name ) VALUES ('"+name_with_initials+"','"+name_in_full+ "','"+nic+"','"+dob+"','"+gender+"','"+address+"','"+email+"','"+ tp+"','"+course_id+"','"+course_name+"')";
        
                                                    stmt = conn.prepareStatement(sql);
                                                    stmt.execute(sql);
                                                    Table_Load(); // Called the Table_Load() Method (Wants to refresh the table after inserting a new raw..)
                                                    JOptionPane.showMessageDialog(null, "New Record Added Successfully...");
            
                                                }else{JOptionPane.showMessageDialog(null, "Please Enter CourseName of the Student");}
                                            }else{JOptionPane.showMessageDialog(null, "Please Enter Course_ID of the Student");}
                                        }else{JOptionPane.showMessageDialog(null, "Please Enter TP of the Student");}
                                    }else{JOptionPane.showMessageDialog(null, "Please Enter Email of the Student");}
                                }else{JOptionPane.showMessageDialog(null, "Please Enter Address of the Student");}
                            }else{JOptionPane.showMessageDialog(null, "Please Enter Gender of the Student");}
                        }else{JOptionPane.showMessageDialog(null, "Please Enter Date of Birth of the Student");}
                    }else{JOptionPane.showMessageDialog(null, "Please Enter NIC of the Student");}
                }else{JOptionPane.showMessageDialog(null, "Please Enter Name in Full of the Student");}
            }else{JOptionPane.showMessageDialog(null, "Please Enter Name with Initials of the Student");}
                
            
        }catch (Exception e) {
            System.out.println(e);
        }     
    }//GEN-LAST:event_btn_InsertActionPerformed
//------------------------------------------------------------------------------
    
    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // CLEAR Button...........
        txtStuId.setText("");
        txtNamewithInitials.setText("");
        txtNameinFull.setText("");
        txtNIC.setText("");
        txtDOB.setText("");
       
        txtAddress.setText("");   
        txtEmail.setText("");
        txtTP.setText("");
      
        txtCourseName.setText("");  
      
    }//GEN-LAST:event_btn_clearActionPerformed
//------------------------------------------------------------------------------
    
    private void tbl_studentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_studentMouseClicked
        
        Display_Table_data();   // <--- Called the Method - 'Display_Table_data()'  
        
    }//GEN-LAST:event_tbl_studentMouseClicked
//------------------------------------------------------------------------------
    
    private void tbl_studentKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_studentKeyReleased
     
        Display_Table_data();   // <--- Called the Method - 'Display_Table_data()'  
          
    }//GEN-LAST:event_tbl_studentKeyReleased
//------------------------------------------------------------------------------
    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        
        // DELETE Button...
        
        String stu_id = txtStuId.getText();
        
        try {
            String sql = "DELETE FROM student WHERE Student_ID = '"+stu_id+"' ";
            stmt = conn.prepareStatement(sql);
            stmt.execute(sql);
            JOptionPane.showMessageDialog(null, "The Selected Row will be Deleted Permenetly !");
            Table_Load();
           
            txtStuId.setText("");
            txtNamewithInitials.setText("");
            txtNameinFull.setText("");
            txtNIC.setText("");
            txtDOB.setText("");
            
            txtAddress.setText("");   
            txtEmail.setText("");
            txtTP.setText("");
            //txtCourseId.setText("");
            txtCourseName.setText(""); 
                
        } catch (Exception e) {
            System.err.println(e);
        }   
    }//GEN-LAST:event_btn_deleteActionPerformed
//------------------------------------------------------------------------------
    
    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // UPDATE Button...
            String stu_id = txtStuId.getText();
            String name_with_initials = txtNamewithInitials.getText();
            String name_in_full = txtNameinFull.getText();
            String nic = txtNIC.getText();
            String dob = txtDOB.getText();
            String gender = (String) txtGender.getSelectedItem();
            String address = txtAddress.getText();   
            String email = txtEmail.getText();
            String tp = txtTP.getText();
            String course_id = (String)txtCourseId.getSelectedItem();
            String course_name = txtCourseName.getText();
            
            try {
                String sql = "UPDATE student SET Name_with_Initials = '"+name_with_initials+"', Name_in_Full = '"+name_in_full+"', NIC = '"+ nic +"', DOB = '"+dob+"', Gender = '"+gender+"', Address = '"+address+"', Email = '"+email+"', Telephone = '"+tp+"', Course_ID = '"+course_id+"', Course_Name = '"+course_name+"' WHERE Student_ID = '"+stu_id+"' ";
                stmt = conn.prepareStatement(sql);
                stmt.execute(sql);
                Table_Load();
                JOptionPane.showMessageDialog(null, "The Record Updated Succesfully...");
                
            } catch (Exception e) {
                System.err.println(e);
            }      
    }//GEN-LAST:event_btn_updateActionPerformed
//------------------------------------------------------------------------------
    
    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
        // SEARCH Bar...
        try {
            String search = txtsearch.getText();
            
            String sql = "SELECT * FROM student WHERE Student_ID LIKE  '%"+search+"%' OR  Name_with_Initials LIKE '%"+search+"%' OR  Name_in_Full LIKE '%"+search+"%' OR  NIC LIKE '%"+search +"%' OR DOB LIKE '%"+search+"%' OR Gender LIKE '%"+search+"%' OR Address LIKE '%"+search+"%' OR Email LIKE '%"+search+"%' OR Telephone LIKE '%"+search+"%' OR Course_ID LIKE '%"+search+"%' OR Course_Name LIKE '%"+search+"%' ";
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery(sql);
            tbl_student.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            System.err.println(e);
        }
    }//GEN-LAST:event_txtsearchKeyReleased

    private void txtNamewithInitialsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamewithInitialsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamewithInitialsActionPerformed

    private void txtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCourseNameActionPerformed
//------------------------------------------------------------------------------
    
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
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTable tbl_student;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JComboBox<String> txtCourseId;
    private javax.swing.JTextField txtCourseName;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtNIC;
    private javax.swing.JTextField txtNameinFull;
    private javax.swing.JTextField txtNamewithInitials;
    private javax.swing.JTextField txtStuId;
    private javax.swing.JTextField txtTP;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
