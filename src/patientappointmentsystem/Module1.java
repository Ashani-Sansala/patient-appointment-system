package patientappointmentsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.Timer;


public class Module1 extends javax.swing.JFrame {

    /**
     * Creates new form Module1
     */
    public Module1() {
        initComponents();
        showDate(); /*Call showDate() method in constructor*/
        showTime(); /*Call showTime() method in constructor*/
    }

    
    void showDate(){
        /*Set the JLabel Date as the current date*/
        Date d = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-mm-dd");
        datelab.setText(s.format(d));
    }
    
    void showTime(){
        /*Set the JLabel Time as the current time*/
        new Timer(0, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Date d = new Date();
                SimpleDateFormat s = new SimpleDateFormat("hh:mm:ss a");
                timelab.setText(s.format(d));
                throw new UnsupportedOperationException("Not Supported yet.");
            }
        }).start();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lastname = new javax.swing.JLabel();
        firstname = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        lname1 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        lname2 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        gender = new javax.swing.JComboBox<>();
        lname3 = new javax.swing.JLabel();
        lname4 = new javax.swing.JLabel();
        datelab = new javax.swing.JLabel();
        timelab = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        lname5 = new javax.swing.JLabel();
        ill = new javax.swing.JComboBox<>();
        illnesstext = new javax.swing.JTextField();
        lname6 = new javax.swing.JLabel();
        doctor = new javax.swing.JComboBox<>();
        doctortext = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        lname7 = new javax.swing.JLabel();
        datetxt = new javax.swing.JTextField();
        lname8 = new javax.swing.JLabel();
        timetxt = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("APPOINTMENT FORM");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setText("Please enter the following information : ");

        lastname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lastname.setText("Last Name :");

        firstname.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        firstname.setText("First Name : ");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fnameKeyPressed(evt);
            }
        });

        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lnameKeyPressed(evt);
            }
        });

        lname1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname1.setText("Gender : ");

        lname2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname2.setText("Patient illness : ");

        contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactActionPerformed(evt);
            }
        });
        contact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                contactKeyPressed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Female", "Male", "Other" }));
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        lname3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname3.setText("Contact No : ");

        lname4.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname4.setText("Age :");

        datelab.setText("Date : ");

        timelab.setText("Time :");

        age.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageKeyPressed(evt);
            }
        });

        lname5.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname5.setText("Email :");

        ill.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fever", "Blood Pressure", "Cancer", "Allergies", "Asthma", "Other" }));

        illnesstext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                illnesstextActionPerformed(evt);
            }
        });

        lname6.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname6.setText("Choose doctor : ");

        doctor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dr. Henry Pittman", "Dr. Scott Aronson", "Dr. Donald Watren", "Dr. Debble Fink", "Dr. Jane Dacks", "Dr. Don Doman", "Dr. Marks Barry" }));

        doctortext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctortextActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lname7.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname7.setText("Time : ");

        datetxt.setText("dd-mm-yyyy");
        datetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                datetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                datetxtFocusLost(evt);
            }
        });
        datetxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datetxtMouseClicked(evt);
            }
        });
        datetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datetxtActionPerformed(evt);
            }
        });

        lname8.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lname8.setText("Date : ");

        timetxt.setText("hh:mm");
        timetxt.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                timetxtFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                timetxtFocusLost(evt);
            }
        });
        timetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timetxtActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(204, 0, 51));
        jButton2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(datelab, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172)
                .addComponent(timelab, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lname8, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                    .addComponent(lname6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(illnesstext, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(doctortext, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(260, 260, 260))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lname2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ill, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(490, 490, 490))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(170, 170, 170)))))
                        .addGap(125, 125, 125))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(firstname)
                                        .addGap(18, 18, 18)
                                        .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lname5, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(140, 140, 140)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lname3))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(age, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gender, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lname7, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datelab, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timelab, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contact, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ill, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(illnesstext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctortext, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lname8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactActionPerformed

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void illnesstextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_illnesstextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_illnesstextActionPerformed

    private void doctortextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctortextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_doctortextActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        /*Assign user input values to the variables*/
        String fn = fname.getText();
        String ln = lname.getText();
        String mail = email.getText();
        String page = age.getText();
        String phone = contact.getText();
        String date = datetxt.getText();
        String time = timetxt.getText();
        
        /*Get the combo box values and set them in the JTextFields infront of them*/
        illnesstext.setText(ill.getSelectedItem().toString());
        doctortext.setText(doctor.getSelectedItem().toString());
        
        /*-----------Start of the Validations-------------*/
        
        /*If first name field is empty a dialog box opens and displays "First Name is required!"*/
        if(fn.equals("")){
            JOptionPane.showMessageDialog(null, "First Name is required!");
        }
        
        /*If last name field is empty a dialog box opens and displays "Last Name is required!"*/
        else if(ln.equals("")){
            JOptionPane.showMessageDialog(null, "Last Name is required!");
        }
        
        /*If email field is empty a dialog box opens and displays "Email is required!"*/
        else if(mail.equals("")){
            JOptionPane.showMessageDialog(null, "Email is required!");
        }
        
        /*If entered email doesn't fit with the format of an email a dialog box opens and shows "Please enter a valid email" as an error*/
        else if (!(Pattern.matches("^[a-zA-Z0-9]+[@]{1}+[a-zA-Z0-9]+[.]{1}+[a-zA-Z0-9]+$", email.getText()))){
            
            JOptionPane.showMessageDialog(null, "Please enter a valid email", "Error", JOptionPane.ERROR_MESSAGE);
            
        }
        
        /*If age field is empty a dialog box opens and shows "Age is required!"*/
        else if(page.equals("")){
            JOptionPane.showMessageDialog(null, "Age is required!");
        }
        
        /*If contact number field is empty a dialog box opens and shows "Age is required!"*/
        else if(phone.equals("")){
            JOptionPane.showMessageDialog(null, "Contact Number is required!");
        }
        
        /*If datetxt field is empty a dialog box opens and shows "Appointment date is required!"*/
        else if(date.equals("")){
            JOptionPane.showMessageDialog(null, "Appointment date is required!");
        }
        
        /*If datetxt field is not empty it verifies the entered date is in the correct format of a date*/
        else if(!"".equals(date)){
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            
            try {
                sdf.parse(date);
                
                /*If timetxt field is empty a dialog box opens and shows "Appointment time is required!"*/
                if(time.equals("")){
                    JOptionPane.showMessageDialog(null, "Appointment time is required!");
                }
                
                /*If timetxt field is not empty it verifies the entered time is in the correct format of a time*/
                else if(!time.matches("^([01]\\d|2[0-3]):[0-5]\\d$")){
                    JOptionPane.showMessageDialog(null, "Invalid Time!");
                }

                /*If all fields are filled properly a dialog box opens and displays "Appointment has been done"*/
                else{
                    JOptionPane.showMessageDialog(rootPane, "Appointment has been done");
                    fname.setText("");
                    lname.setText("");
                    email.setText("");
                    age.setText("");
                    contact.setText("");
                    gender.setSelectedItem("Female");
                    ill.setSelectedItem("Fever");
                    doctor.setSelectedItem("Dr. Henry Pittman");
                    illnesstext.setText("");
                    doctortext.setText("");
                    datetxt.setText("");
                    timetxt.setText("");
                }
                
            }
            catch(ParseException ex) {
                JOptionPane.showMessageDialog(null, "Invalid Date!");
            }
        }
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        
    }//GEN-LAST:event_fnameActionPerformed

    private void datetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datetxtActionPerformed
        
    }//GEN-LAST:event_datetxtActionPerformed

    private void timetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timetxtActionPerformed
        
    }//GEN-LAST:event_timetxtActionPerformed

    private void fnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyPressed
        // Code for JTextField that accepts letters, whitespaces and delete backspace
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            // iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            
            fname.setEditable(true);
        
        }else{
            fname.setEditable(false);
        }
    }//GEN-LAST:event_fnameKeyPressed

    private void lnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyPressed
        // Code for JTextField that accepts letters, whitespaces and delete backspace
        char c = evt.getKeyChar();
        
        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            // iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            
            lname.setEditable(true);
        
        }else{
            lname.setEditable(false);
        }
    }//GEN-LAST:event_lnameKeyPressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        /*Go back to the Menu Page when user clicks Cancel button*/
        MenuPage obj = new MenuPage();
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            // iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            
            age.setEditable(true);
        
        }else{
            age.setEditable(false);
        }
    }//GEN-LAST:event_ageKeyPressed

    private void contactKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contactKeyPressed
        char c = evt.getKeyChar();
        
        if(Character.isDigit(c)){
            // iso control for edit operation(delete key and backspace key allow)
            //if enter character is letter, space and isocontrol char than allow to edit
            
            contact.setEditable(true);
        
        }else{
            contact.setEditable(false);
        }
    }//GEN-LAST:event_contactKeyPressed

    private void datetxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datetxtMouseClicked
        
    }//GEN-LAST:event_datetxtMouseClicked

    private void datetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datetxtFocusGained
        
        /*If the placeholder text in datetxt is "dd-mm-yyyy" then after user clicks the text field the placeholder will be disappeared.*/
        if(datetxt.getText().equals("dd-mm-yyyy")){
            datetxt.setText("");
        }
    }//GEN-LAST:event_datetxtFocusGained

    private void datetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_datetxtFocusLost
        
        /*If the placeholder text in datetxt is empty then after user clicks the other component, the placeholder will be set to "dd-mm-yyyy".*/
        if(datetxt.getText().equals("")){
            datetxt.setText("dd-mm-yyyy");
        }
    }//GEN-LAST:event_datetxtFocusLost

    private void timetxtFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timetxtFocusGained
        
        /*If the placeholder text in timetxt is "hh:mm" then after user clicks the text field the placeholder will be disappeared.*/
        if(timetxt.getText().equals("hh:mm")){
            timetxt.setText("");
        }
    }//GEN-LAST:event_timetxtFocusGained

    private void timetxtFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_timetxtFocusLost
        
        /*If the placeholder text in timetxt is empty then after user clicks the other component, the placeholder will be set to "hh:mm".*/
        if(timetxt.getText().equals("")){
            timetxt.setText("hh:mm");
        }
    }//GEN-LAST:event_timetxtFocusLost

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
            java.util.logging.Logger.getLogger(Module1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Module1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Module1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Module1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Module1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel datelab;
    private javax.swing.JTextField datetxt;
    private javax.swing.JComboBox<String> doctor;
    private javax.swing.JTextField doctortext;
    private javax.swing.JTextField email;
    private javax.swing.JLabel firstname;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JComboBox<String> ill;
    private javax.swing.JTextField illnesstext;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lastname;
    private javax.swing.JTextField lname;
    private javax.swing.JLabel lname1;
    private javax.swing.JLabel lname2;
    private javax.swing.JLabel lname3;
    private javax.swing.JLabel lname4;
    private javax.swing.JLabel lname5;
    private javax.swing.JLabel lname6;
    private javax.swing.JLabel lname7;
    private javax.swing.JLabel lname8;
    private javax.swing.JLabel timelab;
    private javax.swing.JTextField timetxt;
    // End of variables declaration//GEN-END:variables
}
