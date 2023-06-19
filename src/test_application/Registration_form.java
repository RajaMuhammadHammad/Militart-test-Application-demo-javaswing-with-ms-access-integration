/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;



public class Registration_form extends JFrame {
    
     public Registration_form(){
         
          super("REGISTRATION FORM");
        
        // Create the panel with null layout
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);
           
        
        
         JLabel heading1 = new JLabel("INTER-SERVICES SELECTION BOARD");
          heading1.setBounds(200,160,750,85);
          heading1.setFont(new Font("Algerian",Font.BOLD,34));
          heading1.setForeground(Color.RED);
          panel.add(heading1);
          
                   JLabel heading2 = new JLabel("JOIN PAKISTAN ARMED FORCES");
          heading2.setBounds(260,200,750,85);
          heading2.setFont(new Font("Algerian",Font.BOLD,30));
          heading2.setForeground(Color.BLACK);
          panel.add(heading2);
          
       ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ABOUT ISSB.jpg");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(400,10 ,200 ,200);
        panel.add(imgLabel);
        
         
        
        // Add your components to the panel
     /*   ImageIcon backgroundImage = new ImageIcon("C:\\Users\\DELL\\Desktop\\ISSB.PNG");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0, 80, 1000, 800);
        panel.add(background);     */
        
        
         JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(770, 710, 150, 30);
        panel.add(homeBtn);
        
        JLabel texthome = new JLabel(" To go back to home page click on home button");
          texthome.setBounds(150,680,750,85);
          texthome.setFont(new Font("Times New Romans",Font.PLAIN,18));
          texthome.setForeground(Color.BLACK);
          panel.add(texthome);
        
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                Test_Application.main(new String[0]); // Create a new instance of the test application form
            }
        });

        
        
        ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\army123.png");
        imgLabel = new JLabel(imageIcon2);
        imgLabel.setBounds(20,270 ,500 ,200);
        panel.add(imgLabel);
        
        
        ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\navyreg.png");
        imgLabel = new JLabel(imageIcon3);
        imgLabel.setBounds(250,270 ,500 ,200);
        panel.add(imgLabel);
       
        
        ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\airforce 123.png");
        imgLabel = new JLabel(imageIcon4);
        imgLabel.setBounds(470,270 ,500 ,200);
        panel.add(imgLabel);
        
        
        JButton armyBtn = new JButton("JOIN ARMY");
        armyBtn.setBounds(217, 470, 100, 30);
        panel.add(armyBtn);
        
            armyBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Perform actions when the start button is clicked
        Army_Registration_form armyreg = new Army_Registration_form();
        armyreg.setVisible(true);
        dispose();
    }
}); 
        
        JButton navyBtn = new JButton("JOIN NAVY");
        navyBtn.setBounds(450, 470, 100, 30);
        panel.add(navyBtn);
        
     navyBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Perform actions when the start button is clicked
        Navy_Registration_form navyreg = new Navy_Registration_form();
        navyreg.setVisible(true);
        dispose();
    }
});


      
        
         JButton pafBtn = new JButton("JOIN PAF");
       pafBtn.setBounds(670, 470, 100, 30);
        panel.add(pafBtn);
      
         pafBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Perform actions when the start button is clicked
        PAF_Registration_form pafreg = new PAF_Registration_form();
        pafreg.setVisible(true);
        dispose();
    }
}); 
                  
          JLabel text = new JLabel(" For more information of Pakistan Army visit the website by clicking on button ");
          text.setBounds(150,555,750,85);
          text.setFont(new Font("Times New Romans",Font.PLAIN,18));
          text.setForeground(Color.BLACK);
          panel.add(text);
        
        JButton websiteBtn = new JButton("Visit Website");
        websiteBtn.setBounds(770, 580, 150, 30);
        panel.add(websiteBtn);

        // Website button action listen
        websiteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Open the website in the default browser
                    Desktop.getDesktop().browse(new URI("https://www.pakistanarmy.gov.pk/")); // Replace with the actual website URL
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
       
        
          JLabel textnavy = new JLabel(" For more information of Pakistan Navy visit the website by clicking on button ");
          textnavy.setBounds(150,600,750,85);
          textnavy.setFont(new Font("Times New Romans",Font.PLAIN,18));
          textnavy.setForeground(Color.BLACK);
          panel.add(textnavy);
        
        JButton websiteBtnnavy = new JButton("Visit Website");
        websiteBtnnavy.setBounds(770, 630, 150, 30);
        panel.add(websiteBtnnavy);

        // Website button action listen
        websiteBtnnavy.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Open the website in the default browser
                    Desktop.getDesktop().browse(new URI("https://www.paknavy.gov.pk/")); // Replace with the actual website URL
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
       
        
         JLabel textpaf = new JLabel(" For more information of  PAF visit the website by clicking on button ");
          textpaf.setBounds(150,640,750,85);
          textpaf.setFont(new Font("Times New Romans",Font.PLAIN,18));
          textpaf.setForeground(Color.BLACK);
          panel.add(textpaf);
        
        JButton websiteBtnpaf = new JButton("Visit Website");
        websiteBtnpaf.setBounds(770, 670, 150, 30);
        panel.add(websiteBtnpaf);

        // Website button action listen
        websiteBtnpaf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Open the website in the default browser
                    Desktop.getDesktop().browse(new URI("https://www.paf.gov.pk/")); // Replace with the actual website URL
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });
        
        
        
        // Set the visibility of the form
        setVisible(true);
    }
 
     
     
     
     
     
     //***************************************************************************************************************************************\\
     
     
     
     
     
     
      public class Navy_Registration_form extends JFrame{
          
          private JLabel namelbl;
          private JLabel emailLbl;
          private JLabel genderlbl;
          private JLabel phoneLbl;
          private JLabel emrgContctlbl;
          private JTextField Name;
          private JLabel CNIC;
          private JTextField email;
          private JTextField phone;
          private JTextField emergecenyContact;
          private JRadioButton male;
          private JRadioButton female;
          private ButtonGroup genderBtns;
          private JButton submitBtn ;
          private JButton resetBtn;
          private JTextField CNICfld;
          private JTextField address;

          

         
         public Navy_Registration_form (){
           
             super("NAVY REGISTRATION FORM");
        
                 // panel to call add component on the JFrame
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);
        
        
      
        
         JLabel heading = new JLabel("PAKISTAN NAVY REGISTRATION FORM");
          heading.setBounds(170,90,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.BLUE);
          panel.add(heading);
          
       ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
         JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(300,80 ,1150 ,65);
        panel.add(gifLabel);

        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\navyreg.png");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,0 ,200 ,200);
        panel.add(imgLabel);
        
         // font for all functions 
          Font labelFont  = new Font("Times New Roman",Font.PLAIN,16);
          Font textFont = new Font("Times New Roman",Font.PLAIN,16);
          
          //name label
          namelbl = new JLabel("Name :");
        namelbl.setBounds(80,250,80,60);
        namelbl.setFont(labelFont);
        panel.add(namelbl);
        //name textfield
        //first name
         Name = new JTextField(" ");
        Name.setBounds(140,265,250,30);
        Name.setFont(textFont);
        panel.add(Name);
        //Last name 
        
         CNIC = new JLabel("CNIC No :");
        CNIC.setBounds(470,250,80,60);
        CNIC.setFont(labelFont);
        panel.add(CNIC);

          CNICfld = new JTextField(" ");
        CNICfld.setBounds(550,265,250,30);
        CNICfld.setFont(textFont);
        panel.add(CNICfld);
        
            //email label
        emailLbl = new JLabel("Email :");
        emailLbl.setBounds(80,350,80,60);
        emailLbl.setFont(labelFont);
        panel.add(emailLbl);
        
        
        //email text field
        email = new JTextField("");
        email.setBounds(140,365,250,30);
        email.setFont(textFont);
        panel.add(email);
        
        //gender Jlabel
        genderlbl = new JLabel("Gender :");
        genderlbl.setBounds(470,350,80,60);
        genderlbl.setFont(labelFont);
        panel.add(genderlbl);
        
        
        //gender radiobtns
        male = new JRadioButton("Male");
        male.setBounds(550,365,80,40);
        male.setFont(labelFont);
        panel.add(male);
        
        //female Jradiobtn
        female = new JRadioButton("Female");
        female.setBounds(650,365,110,40);
        female.setFont(labelFont);
        panel.add(female);
        
        //gender raidobtnsGroup
        genderBtns = new ButtonGroup();
        genderBtns.add(male);
        genderBtns.add(female);
        
       
        
        //phone label
        phoneLbl = new JLabel("Phone :");
        phoneLbl.setBounds(80,450,80,60);
        phoneLbl.setFont(labelFont);
        panel.add(phoneLbl);
        
        //phone textfiled
        phone = new JTextField();
        phone.setBounds(140,465,230,30);
        phone.setFont(textFont);
        panel.add(phone);
         
         //emergency Jlabel
        emrgContctlbl= new JLabel("Emergency Contact :");
        emrgContctlbl.setBounds(470,470,170,30);
        emrgContctlbl.setFont(labelFont);   
        panel.add(emrgContctlbl);
        
        //emergency contact textField
        emergecenyContact = new JTextField();
        emergecenyContact.setBounds(610,470,230,30);
        emergecenyContact.setFont(labelFont);
        panel.add(emergecenyContact);
        
        JLabel addresslbl= new JLabel("Address :");
        addresslbl.setBounds(80,550,170,30);
        addresslbl.setFont(labelFont);   
        panel.add(addresslbl);
        
        address = new JTextField();
        address.setBounds(180,550,630,50);
        address.setFont(labelFont);
        panel.add(address);
        
         resetBtn = new JButton("Reset");
        resetBtn.setBounds(330,650,100,30);
        resetBtn.setFont(labelFont);
        panel.add(resetBtn);
        
        
         resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform actions when Clear button is clicked
                clearForm();
            }
        });
        
         submitBtn = new JButton("Submit");
        submitBtn.setBounds(450,650,100,30);
        submitBtn.setFont(labelFont);
        panel.add(submitBtn);
        
       
        
            submitBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String name, nic, mail, mobo, gender, addressValue;
        if (Name.getText().isEmpty() || CNICfld.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        } else {
            // Perform actions when Submit button is clicked and all fields are filled
            name = Name.getText();
            nic = CNICfld.getText().toString();
            mail = email.getText();
            mobo = phone.getText().toString();
            
            // Retrieve selected gender
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            } else {
                gender = "";  // Set default value if no gender is selected
            }
            
            addressValue = address.getText();
            
            
           String appliedValue = ""; // Initialize appliedValue as an empty string

if (JOptionPane.showConfirmDialog(null, "You Applied For The PAKISTAN NAVY?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    appliedValue = "PAK NAVY";
}

String insertQuery = "INSERT INTO Data ([NAME], CNIC, PHONE, EMAIL, GENDER, ADDRESS, APPLIED) VALUES (?, ?, ?, ?, ?, ?, ?)";
Connection connection = null;
try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    String url = "jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb";
    connection = DriverManager.getConnection(url);
    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, nic);
    preparedStatement.setString(3, mobo);
    preparedStatement.setString(4, mail);
    preparedStatement.setString(5, gender);
    preparedStatement.setString(6, addressValue);
    preparedStatement.setString(7, appliedValue);
    
    
    
                preparedStatement.executeUpdate();
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Data submitted successfully!");
                RegistrationInfoDialog infoDialog = new RegistrationInfoDialog(name, nic, mail, mobo, gender, addressValue, appliedValue);
    infoDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    infoDialog.setSize(500, 300);
    infoDialog.setVisible(true);
      infoDialog.setResizable(false);

                // Rest of the code...
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database driver not found.");
            } catch (SQLException d) {
                d.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while accessing the database.");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        
    }
});
          
            JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(570, 650, 100, 30);
        panel.add(homeBtn);
        
       
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                  Registration_form newForm = new Registration_form(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
    
            }
        });
         }
          private void clearForm() {
    Name.setText("");
    CNICfld.setText("");
    email.setText("");
    genderBtns.clearSelection();
    phone.setText("");
    emergecenyContact.setText("");
    address.setText("");

         
         }
     }
  
         
         
     
  
      
      //**************************************************************************************************************************************************\\
        
      
      
       public class Army_Registration_form extends JFrame{
          
          private JLabel namelbl;
          private JLabel emailLbl;
          private JLabel genderlbl;
          private JLabel phoneLbl;
          private JLabel emrgContctlbl;
          private JTextField Name;
          private JLabel CNIC;
          private JTextField email;
          private JTextField phone;
          private JTextField emergecenyContact;
          private JRadioButton male;
          private JRadioButton female;
          private ButtonGroup genderBtns;
          private JButton submitBtn;
            private JButton resetBtn;
          private JTextField CNICfld;
          private JTextField address;

         
         public Army_Registration_form (){
           
             
              super("ARMY REGISTRATION FORM");
             
        
                 // panel to call add component on the JFrame
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);
        
        
      
        
         JLabel heading = new JLabel("PAKISTAN ARMY REGISTRATION FORM");
          heading.setBounds(170,90,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.BLACK);
          panel.add(heading);
          
       ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
         JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(300,80 ,1150 ,65);
        panel.add(gifLabel);

        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\army12.png");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,10 ,200 ,200);
        panel.add(imgLabel);
        
         // font for all functions 
          Font labelFont  = new Font("Times New Roman",Font.PLAIN,16);
          Font textFont = new Font("Times New Roman",Font.PLAIN,16);
          
          
          
          //name label
          namelbl = new JLabel("Name :");
        namelbl.setBounds(80,250,80,60);
        namelbl.setFont(labelFont);
        panel.add(namelbl);
        //name textfield
        //first name
         Name = new JTextField(" ");
        Name.setBounds(140,265,250,30);
        Name.setFont(textFont);
        panel.add(Name);
        //Last name 
        
         CNIC = new JLabel("CNIC No :");
        CNIC.setBounds(470,250,80,60);
        CNIC.setFont(labelFont);
        panel.add(CNIC);

         CNICfld = new JTextField(" ");
        CNICfld.setBounds(550,265,250,30);
        CNICfld.setFont(textFont);
        panel.add(CNICfld);
        
            //email label
        emailLbl = new JLabel("Email :");
        emailLbl.setBounds(80,350,80,60);
        emailLbl.setFont(labelFont);
        panel.add(emailLbl);
        
        
        //email text field
        email = new JTextField("");
        email.setBounds(140,365,250,30);
        email.setFont(textFont);
        panel.add(email);
        
        //gender Jlabel
        genderlbl = new JLabel("Gender :");
        genderlbl.setBounds(470,350,80,60);
        genderlbl.setFont(labelFont);
        panel.add(genderlbl);
        
        
        //gender radiobtns
        male = new JRadioButton("Male");
        male.setBounds(550,365,80,40);
        male.setFont(labelFont);
        panel.add(male);
        
        //female Jradiobtn
        female = new JRadioButton("Female");
        female.setBounds(650,365,110,40);
        female.setFont(labelFont);
        panel.add(female);
        
        //gender raidobtnsGroup
        genderBtns = new ButtonGroup();
        genderBtns.add(male);
        genderBtns.add(female);
        
       
        
        //phone label
        phoneLbl = new JLabel("Phone :");
        phoneLbl.setBounds(80,450,80,60);
        phoneLbl.setFont(labelFont);
        panel.add(phoneLbl);
        
        //phone textfiled
        phone = new JTextField();
        phone.setBounds(140,465,230,30);
        phone.setFont(textFont);
        panel.add(phone);
         
         //emergency Jlabel
        emrgContctlbl= new JLabel("Emergency Contact :");
        emrgContctlbl.setBounds(470,470,170,30);
        emrgContctlbl.setFont(labelFont);   
        panel.add(emrgContctlbl);
        
        //emergency contact textField
        emergecenyContact = new JTextField();
        emergecenyContact.setBounds(610,470,230,30);
        emergecenyContact.setFont(labelFont);
        panel.add(emergecenyContact);
        
        JLabel addresslbl= new JLabel("Address :");
        addresslbl.setBounds(80,550,170,30);
        addresslbl.setFont(labelFont);   
        panel.add(addresslbl);
        
        address = new JTextField();
        address.setBounds(180,550,630,50);
        address.setFont(labelFont);
        panel.add(address);
        
              resetBtn = new JButton("Reset");
        resetBtn.setBounds(330,650,100,30);
        resetBtn.setFont(labelFont);
        panel.add(resetBtn);
        
        
         resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform actions when Clear button is clicked
                clearForm();
            }
        });
        
         submitBtn = new JButton("Submit");
        submitBtn.setBounds(450,650,100,30);
        submitBtn.setFont(labelFont);
        panel.add(submitBtn);
        
       
   submitBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String name, nic, mail, mobo, gender, addressValue;
        if (Name.getText().isEmpty() || CNICfld.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        } else {
            // Perform actions when Submit button is clicked and all fields are filled
            name = Name.getText();
            nic = CNICfld.getText().toString();
            mail = email.getText();
            mobo = phone.getText().toString();
            
            // Retrieve selected gender
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            } else {
                gender = "";  // Set default value if no gender is selected
            }
            
            addressValue = address.getText();
            
            
           String appliedValue = ""; // Initialize appliedValue as an empty string

if (JOptionPane.showConfirmDialog(null, "You Applied For The PAKISTAN ARMY?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    appliedValue = "PAK ARMY";
}

String insertQuery = "INSERT INTO Data ([NAME], CNIC, PHONE, EMAIL, GENDER, ADDRESS, APPLIED) VALUES (?, ?, ?, ?, ?, ?, ?)";
Connection connection = null;
try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    String url = "jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb";
    connection = DriverManager.getConnection(url);
    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, nic);
    preparedStatement.setString(3, mobo);
    preparedStatement.setString(4, mail);
    preparedStatement.setString(5, gender);
    preparedStatement.setString(6, addressValue);
    preparedStatement.setString(7, appliedValue);
    
    
    
                preparedStatement.executeUpdate();
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Data submitted successfully!");
                RegistrationInfoDialog infoDialog = new RegistrationInfoDialog(name, nic, mail, mobo, gender, addressValue, appliedValue);
    infoDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    infoDialog.setSize(500, 300);
    infoDialog.setVisible(true);
    infoDialog.setResizable(false);

                // Rest of the code...
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database driver not found.");
            } catch (SQLException d) {
                d.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while accessing the database.");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        
    }
});

    
       
          JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(570, 650, 100, 30);
        panel.add(homeBtn);
        
       
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                 Registration_form newForm = new Registration_form(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
     // Create a new instance of the test application form
            }
        });
         }
         private void clearForm() {
    Name.setText("");
    CNICfld.setText("");
    email.setText("");
    genderBtns.clearSelection();
    phone.setText("");
    emergecenyContact.setText("");
    address.setText("");

        
         
         }
         
     }
  
       
       
       //*******************************************************************************************************************************************************\\
       
       
       
       
         public class PAF_Registration_form extends JFrame{
          
          private JLabel namelbl;
          private JLabel emailLbl;
          private JLabel genderlbl;
          private JLabel phoneLbl;
          private JLabel emrgContctlbl;
          private JTextField Name;
          private JLabel CNIC;
          private JTextField email;
          private JTextField phone;
          private JTextField emergecenyContact;
          private JRadioButton male;
          private JRadioButton female;
          private ButtonGroup genderBtns;
          private JButton submitBtn;
          private JButton resetBtn;
          private JTextField CNICfld;
          private JTextField address;

         
         public PAF_Registration_form (){
           
             
              super("PAF REGISTRATION FORM");
             
        
                 // panel to call add component on the JFrame
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);
        
        
      
        
         JLabel heading = new JLabel("PAK AIRFORCE REGISTRATION FORM");
          heading.setBounds(190,90,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.BLACK);
          panel.add(heading);
          
       ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
         JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(300,80 ,1150 ,65);
        panel.add(gifLabel);

        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\airforce.png");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,10 ,200 ,200);
        panel.add(imgLabel);
        
         // font for all functions 
          Font labelFont  = new Font("Times New Roman",Font.PLAIN,16);
          Font textFont = new Font("Times New Roman",Font.PLAIN,16);
          
          //name label
          namelbl = new JLabel("Name :");
        namelbl.setBounds(80,250,80,60);
        namelbl.setFont(labelFont);
        panel.add(namelbl);
        //name textfield
        //first name
         Name = new JTextField(" ");
        Name.setBounds(140,265,250,30);
        Name.setFont(textFont);
        panel.add(Name);
        //Last name 
        
         CNIC = new JLabel("CNIC No :");
        CNIC.setBounds(470,250,80,60);
        CNIC.setFont(labelFont);
        panel.add(CNIC);

         CNICfld = new JTextField(" ");
        CNICfld.setBounds(550,265,250,30);
        CNICfld.setFont(textFont);
        panel.add(CNICfld);
        
            //email label
        emailLbl = new JLabel("Email :");
        emailLbl.setBounds(80,350,80,60);
        emailLbl.setFont(labelFont);
        panel.add(emailLbl);
        
        
        //email text field
        email = new JTextField("");
        email.setBounds(140,365,250,30);
        email.setFont(textFont);
        panel.add(email);
        
        //gender Jlabel
        genderlbl = new JLabel("Gender :");
        genderlbl.setBounds(470,350,80,60);
        genderlbl.setFont(labelFont);
        panel.add(genderlbl);
        
        
        //gender radiobtns
        male = new JRadioButton("Male");
        male.setBounds(550,365,80,40);
        male.setFont(labelFont);
        panel.add(male);
        
        //female Jradiobtn
        female = new JRadioButton("Female");
        female.setBounds(650,365,110,40);
        female.setFont(labelFont);
        panel.add(female);
        
        //gender raidobtnsGroup
        genderBtns = new ButtonGroup();
        genderBtns.add(male);
        genderBtns.add(female);
        
       
        
        //phone label
        phoneLbl = new JLabel("Phone :");
        phoneLbl.setBounds(80,450,80,60);
        phoneLbl.setFont(labelFont);
        panel.add(phoneLbl);
        
        //phone textfiled
        phone = new JTextField();
        phone.setBounds(140,465,230,30);
        phone.setFont(textFont);
        panel.add(phone);
         
         //emergency Jlabel
        emrgContctlbl= new JLabel("Emergency Contact :");
        emrgContctlbl.setBounds(470,470,170,30);
        emrgContctlbl.setFont(labelFont);   
        panel.add(emrgContctlbl);
        
        //emergency contact textField
        emergecenyContact = new JTextField();
        emergecenyContact.setBounds(610,470,230,30);
        emergecenyContact.setFont(labelFont);
        panel.add(emergecenyContact);
        
        JLabel addresslbl= new JLabel("Address :");
        addresslbl.setBounds(80,550,170,30);
        addresslbl.setFont(labelFont);   
        panel.add(addresslbl);
        
       address = new JTextField();
        address.setBounds(180,550,630,50);
        address.setFont(labelFont);
        panel.add(address);
        
        
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(330,650,100,30);
        resetBtn.setFont(labelFont);
        panel.add(resetBtn);
        
        
         resetBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform actions when Clear button is clicked
                clearForm();
            }
        });
        
         submitBtn = new JButton("Submit");
        submitBtn.setBounds(450,650,100,30);
        submitBtn.setFont(labelFont);
        panel.add(submitBtn);
        
        
  
   submitBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String name, nic, mail, mobo, gender, addressValue;
        if (Name.getText().isEmpty() || CNICfld.getText().isEmpty() || email.getText().isEmpty() || phone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        } else {
            // Perform actions when Submit button is clicked and all fields are filled
            name = Name.getText();
            nic = CNICfld.getText().toString();
            mail = email.getText();
            mobo = phone.getText().toString();
            
            // Retrieve selected gender
            if (male.isSelected()) {
                gender = "Male";
            } else if (female.isSelected()) {
                gender = "Female";
            } else {
                gender = "";  // Set default value if no gender is selected
            }
            
            addressValue = address.getText();
            
            
           String appliedValue = ""; // Initialize appliedValue as an empty string

if (JOptionPane.showConfirmDialog(null, "You Applied For The PAF?", "Confirmation", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    appliedValue = "PAF";
}

String insertQuery = "INSERT INTO Data ([NAME], CNIC, PHONE, EMAIL, GENDER, ADDRESS, APPLIED) VALUES (?, ?, ?, ?, ?, ?, ?)";
Connection connection = null;
try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    String url = "jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb";
    connection = DriverManager.getConnection(url);
    PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
    preparedStatement.setString(1, name);
    preparedStatement.setString(2, nic);
    preparedStatement.setString(3, mobo);
    preparedStatement.setString(4, mail);
    preparedStatement.setString(5, gender);
    preparedStatement.setString(6, addressValue);
    preparedStatement.setString(7, appliedValue);
    
    
    
                preparedStatement.executeUpdate();
                preparedStatement.close();
                JOptionPane.showMessageDialog(null, "Data submitted successfully!");
                RegistrationInfoDialog infoDialog = new RegistrationInfoDialog(name, nic, mail, mobo, gender, addressValue, appliedValue);
    infoDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    infoDialog.setSize(500, 300);
    infoDialog.setVisible(true);
      infoDialog.setResizable(false);

                
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "Database driver not found.");
            } catch (SQLException d) {
                d.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred while accessing the database.");
            } finally {
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        
        
    }
});



          
          JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(570, 650, 100, 30);
        panel.add(homeBtn);
        
       
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                  Registration_form newForm = new Registration_form(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
     // Create a new instance of the test application form
            }
        });
         
         }
         
                private void clearForm() {
    Name.setText("");
    CNICfld.setText("");
    email.setText("");
    genderBtns.clearSelection();
    phone.setText("");
    emergecenyContact.setText("");
    address.setText("");
}
     }
  
         
      //**********************************************************************************************************************************************************************''\\   
         
         public class RegistrationInfoDialog extends JDialog {

        
    public RegistrationInfoDialog(String name, String nic, String mail, String mobo, String gender, String address,String appliedValue) {
       
        // Display the registration information
        JTextArea infoTextArea = new JTextArea();
        infoTextArea.setEditable(false);
        
        JPanel panel = new JPanel();
        setContentPane(panel);
        panel.setBackground(Color.WHITE);
        
          JLabel heading2 = new JLabel(appliedValue + "\t REGISTRATION FORM");
          heading2.setBounds(20,10,750,85);
          heading2.setFont(new Font("Algerian",Font.BOLD,30));
          heading2.setForeground(Color.BLACK);
          panel.add(heading2);
      //  infoTextArea.append("<html><span style='font-family: Algerian; font-size: 26px; color: red;'>\t REGISTRATION FORM \t</span></html>");

        infoTextArea.append("\n");
        infoTextArea.append("\n");
        infoTextArea.append("Name: " + name + "\n");
        infoTextArea.append("CNIC: " + nic + "\n");
        infoTextArea.append("Email: " + mail + "\n");
        infoTextArea.append("Phone: " + mobo + "\n");
        infoTextArea.append("Gender: " + gender + "\n");
        infoTextArea.append("Address: " + address + "\n");
        infoTextArea.append("\n");
       
        
        
      SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
      String currentDate = dateFormat.format(new Date());

infoTextArea.append(" Your Test for " + appliedValue + "  date is: " + currentDate + "\n"+"\n");
        
        
        

        JScrollPane scrollPane = new JScrollPane(infoTextArea);
        add(scrollPane);
    }
    }
     
         
         
     
    }

  
   
    


