/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.neu.csye6200.daycare.gui;

import edu.neu.csye6200.daycare.DayCare;
import edu.neu.csye6200.daycare.gui.AllocateClass;
import edu.neu.csye6200.daycare.immunization.Immunization;
import edu.neu.csye6200.daycare.student.Student;
import edu.neu.csye6200.daycare.student.StudentGroup;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_A;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_B;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_C;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_D;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_E;
import static edu.neu.csye6200.daycare.student.StudentGroup.GROUP_F;
import edu.neu.csye6200.daycare.teacher.MainTeacherFactory;
import edu.neu.csye6200.daycare.teacher.Teacher;
import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.Dialog.ModalityType;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/**
 *
 * @author anjali
 */
public class AddStudentUI extends javax.swing.JFrame {
    
    
    /**
     * Creates new form UserInterface
     */
    Immunization imz;
    Student obj;
    
    public AddStudentUI() {
        initComponents();
        imz = new Immunization();
        obj = new Student();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register a New Student");

        jLabel1.setText("StudentID");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon("/Users/anjali/Desktop/CSYE 6200/DayCare/src/Pics/save.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Name");

        jLabel3.setText("Age");

        jLabel5.setText("Parent's Name");

        jLabel6.setText("Address");

        jLabel7.setText("Phone no.");

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jLabel11.setText("Sex");

        jLabel15.setText("Enter Student Information");

        jButton2.setIcon(new javax.swing.ImageIcon("/Users/anjali/Desktop/CSYE 6200/DayCare/src/Pics/clear.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setIcon(new javax.swing.ImageIcon("/Users/anjali/Desktop/CSYE 6200/DayCare/src/Pics/add.png")); // NOI18N
        jButton3.setText("Add Vaccine Details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButton2))
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(189, 189, 189)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel2))
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(1, 1, 1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addGap(148, 148, 148)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField5.getText().isEmpty() ||
                jTextField6.getText().isEmpty()|| jTextField10.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty()){
           JOptionPane.showMessageDialog(null, "Below fields are Mandatory!\n*Name\n*Age\n*Sex\n*Parents Name\n*Address\n*Phone number", "InfoBox: " + "Success", JOptionPane.INFORMATION_MESSAGE);  

        }else{
        try {
//called when Add student button is pressed
        DayCare dc = DayCare.getInstance();
        
        
        String SId = jTextField1.getText();
        int s_id = Integer.parseInt(SId);
        obj.setStudentID(s_id);
        
        String name = jTextField2.getText();
        obj.setName(name);
        
        String sAge = jTextField5.getText();
        int age = Integer.parseInt(sAge);
        obj.setAge(age);
       
        obj.setGroupID(age);
        
        String sex = jTextField10.getText();
        obj.setSex(sex);
        
        String parentName = jTextField6.getText();
        obj.setParentsName(parentName);
        
        String address = jTextField7.getText();
        obj.setAddress(address);
        
        String phNo = jTextField8.getText();
        obj.setPhoneNumber(phNo);
        
        //String date = jTextField9.getText();
        String date = "09/08/2020"; //dummy value
          
            Date regDate = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            obj.setRegistrationDate(regDate);
        
      /*         
        String tId = jTextField11.getText();
        int t_id = Integer.parseInt(tId);
        obj.setTeacherID(t_id);
        
        String classID = jTextField12.getText();
        obj.setClassID(classID);
        */
        

        imz.setStudentID(obj.getStudentID());
         
         dc.addImmzDetails(imz);

         
        //Calling AllocateClass to add student to a class 
        AllocateClass allocObj = new AllocateClass();
	//Adding Teacher Factory to classroom
	
        allocObj.setTeachFact(MainTeacherFactory.getInstance());
	
		
	//Instantiating teacher object		
	allocObj.setTeacher(allocObj.getTeachFact().getObject(age));
        
	//Show list of teachers for PreCare Class
	allocObj.getTeacher().showall();
		
	// Checks available teacher and adds the student
        //Required records - studentid,age, name, sex, ParentName, Address, Phone, RegistrationDate
	//teacherid and classif passed null at this point.
         String studString = (s_id+",0,,"+age+","+age+","+name+","+sex+","+parentName+","+address+","+phNo+","+"11/08/20");	

        System.out.println("Adding student now!\n"+studString);
       try {
           Teacher teacher = allocObj.getTeacher();
           teacher.checkTeacher();
           if(teacher.checkTeacher() == null){
                        JOptionPane.showMessageDialog(null, "Teachers are not available for this student age group!", "InfoBox: " + "Success", JOptionPane.INFORMATION_MESSAGE);  
           }else{
            System.out.println("The teacher is: " + teacher);
            teacher.add(teacher.checkTeacher(),new Student(studString));
            JOptionPane.showMessageDialog(null, "Student Added", "InfoBox: " + "Success", JOptionPane.INFORMATION_MESSAGE); 
        setVisible(false);
           }
        } catch (Exception ex) {
            System.out.println("ParseException" + ex);
            //Logger.getLogger(AddStudentUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        } catch (ParseException ex) {
            System.out.println("Exception while entering date");
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // Clear button
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField8.setText("");
        //jTextField9.setText("");
        jTextField10.setText("");
        //jTextField11.setText("");
        //jTextField12.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private StudentGroup getGrpIdFromAge(int age){
        
        if(age>=6 && age<=12)
                return GROUP_A;
            else if(age>=13 && age<=24)
                return GROUP_B;
            else if(age>=25 && age<=35)
                return GROUP_C;
            else if(age>=36 && age<=47)
                return GROUP_D;
            else if(age>=48 && age<=59)
                return GROUP_E;
            else return GROUP_F;
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //This will be called when add vaccine is pressed
        String sAge = jTextField5.getText();
        int age = Integer.parseInt(sAge);
        if(age<=24){
            System.out.println("Open dialog box A");
            AddStudentUI frame = new AddStudentUI();
            JDialog dA = new JDialog(new AddStudentUI(), true);
            JPanel P = new JPanel();
            P.setLayout(new GridLayout(6,5,10,10));
            P.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            
            //adding interface for polio
            JCheckBox polioCB = new JCheckBox("Polio");
            JLabel polioDoses = new JLabel("Polio doses given");
            JTextField polioDose = new JTextField(10);
            JLabel polioLast = new JLabel("Polio last received on:");
            JTextField polioDate = new JTextField(10);
            
            //add to dialog box
            P.add(polioCB);
            P.add(polioDoses);
            P.add(polioDose);
            P.add(polioLast);
            P.add(polioDate);
            
            JCheckBox dtapCB = new JCheckBox("Dtap");
            JLabel dtapDoses = new JLabel("DTap doses given");
            JTextField dtapDose = new JTextField(10);
            JLabel dtapLast = new JLabel("DTap last received on:");
            JTextField dtapDate = new JTextField(10);
            
            P.add(dtapCB);
            P.add(dtapDoses);
            P.add(dtapDose);
            P.add(dtapLast);
            P.add(dtapDate);
            
            JCheckBox hibCB = new JCheckBox("Hib");
            JLabel hibDoses = new JLabel("Hib doses given");
            JTextField hibDose = new JTextField(10);
            JLabel hibLast = new JLabel("Hib last received on:");
            JTextField hibDate = new JTextField(10);
            
            P.add(hibCB);
            P.add(hibDoses);
            P.add(hibDose);
            P.add(hibLast);
            P.add(hibDate);
            
            JCheckBox hepaCB = new JCheckBox("Hepatitis B");
            JLabel hepaDoses = new JLabel("Hepatitis B doses given");
            JTextField hepaDose = new JTextField(10);
            JLabel hepaLast = new JLabel("Hepatitis B last received on:");
            JTextField hepaDate = new JTextField(10);
            
            P.add(hepaCB);
            P.add(hepaDoses);
            P.add(hepaDose);
            P.add(hepaLast);
            P.add(hepaDate);
       
            JCheckBox mmrCB = new JCheckBox("MMR");
            JLabel mmrDoses = new JLabel("MMR doses given");
            JTextField mmrDose = new JTextField(10);
            JLabel mmrLast = new JLabel("MMR last received on:");
            JTextField mmrDate = new JTextField(10);
            
            P.add(mmrCB);
            P.add(mmrDoses);
            P.add(mmrDose);
            P.add(mmrLast);
            P.add(mmrDate);
            
            JCheckBox varCB = new JCheckBox("Varicella");
            JLabel varDoses = new JLabel("Varicella doses given");
            JTextField varDose = new JTextField(10);
            JLabel varLast = new JLabel("Varicella last received on:");
            JTextField varDate = new JTextField(10);
            
            P.add(varCB);
            P.add(varDoses);
            P.add(varDose);
            P.add(varLast);
            P.add(varDate);
            
            JButton submitButton = new JButton ("Submit");
            //submitButton.setIcon(defaultIcon);

            submitButton.addActionListener (new ActionListener()  {  
                public void actionPerformed( ActionEvent e )  {
                    
                     
                    String sAge = jTextField5.getText();
                    int age = Integer.parseInt(sAge); 
                    StudentGroup id = getGrpIdFromAge(age);
                    //imz.setGroupID(obj.getGroupID());
                    imz.setGroupID(id);
                     
                    System.out.println(polioDate.getText());
                    try {
                        if(polioCB.isSelected()){
                        imz.setPolioStatus(true);
                        imz.setPolioDosesDone(Integer.parseInt(polioDose.getText()));
                        Date polio_date = new SimpleDateFormat("dd/MM/yyyy").parse(polioDate.getText());
                        imz.setPolioDate(polio_date);
                    }
                    if(dtapCB.isSelected()){
                        imz.setDtapStatus(true);
                        imz.setDtapDosesDone(Integer.parseInt(dtapDose.getText()));
                        Date dtap_date = new SimpleDateFormat("dd/MM/yyyy").parse(dtapDate.getText());
                        imz.setDtapDate(dtap_date);
                    }
                    if(hibCB.isSelected()){
                        imz.setHibStatus(true);
                        imz.setHibDosesDone(Integer.parseInt(hibDose.getText()));
                        Date hib_date = new SimpleDateFormat("dd/MM/yyyy").parse(hibDate.getText());
                        imz.setHibDate(hib_date);
                    }
                    if(hepaCB.isSelected()){
                        imz.setHepaStatus(true);
                        imz.setHepaDosesDone(Integer.parseInt(hepaDose.getText()));
                        Date hepa_date = new SimpleDateFormat("dd/MM/yyyy").parse(hepaDate.getText());
                        imz.setHepaDate(hepa_date);
                    }
                    if(mmrCB.isSelected()){
                        imz.setMmrStatus(true);
                        imz.setMmrDosesDone(Integer.parseInt(mmrDose.getText()));
                        Date mmr_date = new SimpleDateFormat("dd/MM/yyyy").parse(mmrDate.getText());
                        imz.setMmrDate(mmr_date);
                    }
                    if(varCB.isSelected()){
                        imz.setVarStatus(true);
                        imz.setVarDosesDone(Integer.parseInt(varDose.getText()));
                        Date var_date = new SimpleDateFormat("dd/MM/yyyy").parse(varDate.getText());
                        imz.setVarDate(var_date);
                    }
                   } catch (Exception ex) {
                        System.out.println("Exception while parsing date " + ex);
                   }
                    
                    
                    imz.setMaxPolioDoses();
                    System.out.println(imz.getMaxPolioDoses());
                    System.out.println(imz.getPolioDosesDone());
                    int remPolDoses = imz.getMaxPolioDoses()-imz.getPolioDosesDone();
                    System.out.println(remPolDoses);
                    imz.setRemainingPolioDoses(remPolDoses);
                    
                    imz.setMaxDtapDoses();
                    int remDtapDoses = imz.getMaxDtapDoses()-imz.getDtapDosesDone();
                    imz.setRemainingDtapDoses(remDtapDoses);
                    
                    imz.setMaxHibDoses();
                    int remHibDoses = imz.getMaxHibDoses()-imz.getHibDosesDone();
                    imz.setRemainingHibDoses(remHibDoses);
                    
                    imz.setMaxHepaDoses();
                    int remHepaDoses = imz.getMaxHepaDoses()-imz.getHepaDosesDone();
                    imz.setRemainingHepaDoses(remHepaDoses);
                    
                    imz.setMaxMmrDoses();
                    int remMmrDoses = imz.getMaxMmrDoses()-imz.getMmrDosesDone();
                    imz.setRemainingMmrDoses(remMmrDoses);
                    
                    imz.setMaxVarDoses();
                    int remVarDoses = imz.getMaxVarDoses()-imz.getVarDosesDone();
                    imz.setRemainingPolioDoses(remVarDoses);
                    
                    //close dialog box
                    dA.setVisible(false);
                }  
            }); 
            
            dA.add(P,BorderLayout.WEST);
            dA.add(submitButton);
            dA.setLayout( new FlowLayout() );     
            dA.setSize(900,350);    
            dA.setVisible(true);
   
        } else if(age > 24) {
            System.out.println("Open dialog box B");
            JDialog dB = new JDialog(new AddStudentUI(), true);
            
            //adding interface for polio
            JCheckBox polioCB = new JCheckBox("Polio");
            JLabel polioDoses = new JLabel("Polio doses given");
            JTextField polioDose = new JTextField(10);
            JLabel polioLast = new JLabel("Polio last received on:");
            JTextField polioDate = new JTextField(10);
            
            JPanel p = new JPanel();
            p.setLayout(new GridLayout(5,5,10,10));
            p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            
            //add to dialog box
            p.add(polioCB);
            p.add(polioDoses);
            p.add(polioDose);
            p.add(polioLast);
            p.add(polioDate);
            
            JCheckBox dtapCB = new JCheckBox("Dtap");
            JLabel dtapDoses = new JLabel("DTap doses given");
            JTextField dtapDose = new JTextField(10);
            JLabel dtapLast = new JLabel("DTap last received on:");
            JTextField dtapDate = new JTextField(10);
            
            p.add(dtapCB);
            p.add(dtapDoses);
            p.add(dtapDose);
            p.add(dtapLast);
            p.add(dtapDate);
            
            JCheckBox hepaCB = new JCheckBox("Hepatitis B");
            JLabel hepaDoses = new JLabel("Hepatitis B doses given");
            JTextField hepaDose = new JTextField(10);
            JLabel hepaLast = new JLabel("Hepatitis B last received on:");
            JTextField hepaDate = new JTextField(10);
            
            p.add(hepaCB);
            p.add(hepaDoses);
            p.add(hepaDose);
            p.add(hepaLast);
            p.add(hepaDate);
            
            JCheckBox mmrCB = new JCheckBox("MMR");
            JLabel mmrDoses = new JLabel("MMR doses given");
            JTextField mmrDose = new JTextField(10);
            JLabel mmrLast = new JLabel("MMR last received on:");
            JTextField mmrDate = new JTextField(10);
            
            p.add(mmrCB);
            p.add(mmrDoses);
            p.add(mmrDose);
            p.add(mmrLast);
            p.add(mmrDate);
            
            JCheckBox varCB = new JCheckBox("Varicella");
            JLabel varDoses = new JLabel("Varicella doses given");
            JTextField varDose = new JTextField(10);
            JLabel varLast = new JLabel("Varicella last received on:");
            JTextField varDate = new JTextField(10);
            
            p.add(varCB);
            p.add(varDoses);
            p.add(varDose);
            p.add(varLast);
            p.add(varDate);
            
            JButton submitButton = new JButton ("Submit");

             submitButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                     
                    String sAge = jTextField5.getText();
                    int age = Integer.parseInt(sAge); 
                    StudentGroup id = getGrpIdFromAge(age);
                    //imz.setGroupID(obj.getGroupID());
                    imz.setGroupID(id);
                     
                    System.out.println(polioDate.getText());
                    try {
                        Date polio_date = new SimpleDateFormat("dd/MM/yyyy").parse(polioDate.getText());
                        Date dtap_date = new SimpleDateFormat("dd/MM/yyyy").parse(dtapDate.getText());
                        Date hepa_date = new SimpleDateFormat("dd/MM/yyyy").parse(hepaDate.getText());
                        Date mmr_date = new SimpleDateFormat("dd/MM/yyyy").parse(mmrDate.getText());
                        Date var_date = new SimpleDateFormat("dd/MM/yyyy").parse(varDate.getText());
                        
                        
                        imz.setPolioDate(polio_date); 
                        imz.setDtapDate(dtap_date);
                        imz.setHepaDate(hepa_date);
                        imz.setMmrDate(mmr_date);
                        imz.setVarDate(var_date);
                        
                    } catch (Exception ex) {
                        System.out.println("Exception while parsing date " + ex);
                    }
                    if(polioCB.isSelected()){
                        imz.setPolioStatus(true);
                        imz.setPolioDosesDone(Integer.parseInt(polioDose.getText()));
                    }
                    if(dtapCB.isSelected()){
                        imz.setDtapStatus(true);
                        imz.setDtapDosesDone(Integer.parseInt(dtapDose.getText()));
                    }
                    if(hepaCB.isSelected()){
                        imz.setHepaStatus(true);
                        imz.setHepaDosesDone(Integer.parseInt(hepaDose.getText()));
                    }
                    if(mmrCB.isSelected()){
                        imz.setMmrStatus(true);
                        imz.setMmrDosesDone(Integer.parseInt(mmrDose.getText()));
                    }
                    if(varCB.isSelected()){
                        imz.setVarStatus(true);
                        imz.setVarDosesDone(Integer.parseInt(varDose.getText()));
                    }
                    
                    imz.setMaxPolioDoses();
                    int remPolDoses = imz.getMaxPolioDoses()-imz.getPolioDosesDone();
                    imz.setRemainingPolioDoses(remPolDoses);
                    
                    imz.setMaxDtapDoses();
                    int remDtapDoses = imz.getMaxDtapDoses()-imz.getDtapDosesDone();
                    imz.setRemainingDtapDoses(remDtapDoses);
                    
                    imz.setMaxHepaDoses();
                    int remHepaDoses = imz.getMaxHepaDoses()-imz.getHepaDosesDone();
                    imz.setRemainingHepaDoses(remHepaDoses);
                    
                    imz.setMaxMmrDoses();
                    int remMmrDoses = imz.getMaxMmrDoses()-imz.getMmrDosesDone();
                    imz.setRemainingMmrDoses(remMmrDoses);
                    
                    imz.setMaxVarDoses();
                    int remVarDoses = imz.getMaxVarDoses()-imz.getVarDosesDone();
                    imz.setRemainingPolioDoses(remVarDoses);
                    
                    dB.setVisible(false);
                }
            });
             dB.add(p);
            dB.add(submitButton);
            dB.setLayout( new FlowLayout() );     
            dB.setSize(900,300);    
            dB.setVisible(true);
        }  
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(UserInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new UserInterface().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}