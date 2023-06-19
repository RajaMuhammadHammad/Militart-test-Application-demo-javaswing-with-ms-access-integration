/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_application;


import javax.swing.*;
import java.awt.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class TestApp extends JFrame {
    
    
    private JTextField nameField;
    private JTextField nicField;
    private JButton startButton;
    private JButton resetButton;
    private JLabel heading;
   // private ArmyInitialTest initialTest;
    private Timer timer;
    private JLabel timerLabel;
    private boolean passedInitialTest = false;
    private JLabel namelbl;
    private JLabel nicLabel;
    private JLabel gifLabel;
    private JLabel imgLabel;

   // private TimerTask timerTask;
   // private AcademicQuestion academicTest;
    
    
    
    public TestApp() {
        
        
         super("ARMED FORCES TEST CONDUCTING APPLICATION");
        
                 // panel to call add component on the JFrame
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);
        
        
      
        
          heading = new JLabel("INTER-SERVICES SELECTION BOARD");
          heading.setBounds(200,80,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.RED);
          panel.add(heading);
          
       ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
        gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(300,70 ,1150 ,65);
        panel.add(gifLabel);

        
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\images-2.jpg");
        imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,0 ,200 ,200);
        panel.add(imgLabel);
          
        
        
        ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\army123.png");
        imgLabel = new JLabel(imageIcon2);
        imgLabel.setBounds(20,170 ,500 ,200);
        panel.add(imgLabel);
        
        
        ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\navyreg.png");
        imgLabel = new JLabel(imageIcon3);
        imgLabel.setBounds(250,170 ,500 ,200);
        panel.add(imgLabel);
       
        
        ImageIcon imageIcon4 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Test_Application\\images\\airforce 123.png");
        imgLabel = new JLabel(imageIcon4);
        imgLabel.setBounds(470,170 ,500 ,200);
        panel.add(imgLabel);
               //name label
         namelbl = new JLabel("Name:");
        namelbl.setBounds(320,400,80,60);
        namelbl.setFont(new Font("Algerian",Font.PLAIN,20));
        namelbl.setForeground(Color.BLACK);
         panel.add(namelbl);
        
          
        nameField = new JTextField(20);
        nameField.setBounds(400,410,250,30);
        panel.add(nameField);
     
        nicLabel = new JLabel("CNIC No:");
       nicLabel.setBounds(320,450,80,60);
       nicLabel.setFont(new Font("Algerian",Font.PLAIN,20));
       nicLabel.setForeground(Color.BLACK);
        panel.add(nicLabel);

        nicField = new JTextField(13);
       nicField.setBounds(400,465,250,30);
        panel.add(nicField);

          
        startButton = new JButton("Start Test");
        startButton.setBounds(450,510,100,30);
       // startButton.addActionListener(this);
        panel.add(startButton);
        
           // TestApp.java
// ...

startButton.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Perform actions when start button is clicked
        if (nicField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        } else {
            String name = nameField.getText();
            String nic = nicField.getText();

            // Establish a database connection
     try {
    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
    Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb", "", "");

    String query = "SELECT CNIC FROM Data WHERE CNIC = ? ";
    PreparedStatement statement = connection.prepareStatement(query);
    statement.setString(1, nic);  // Set the parameter to the uppercase version of nic
    ResultSet resultSet = statement.executeQuery();

    // Check if the NIC and NAME match the records in the table
    if (resultSet.next()) {
        Instructions instruction = new Instructions(name, nic);
        instruction.setVisible(true);
        dispose();
    } else {
        JOptionPane.showMessageDialog(null, "Please register yourself.");
    }

    // Close the database connection
    resultSet.close();
    statement.close();
    connection.close();

} catch (ClassNotFoundException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database driver not found.");
} catch (SQLException ex) {
    ex.printStackTrace();
    JOptionPane.showMessageDialog(null, "An error occurred while accessing the database.");
}

        }
    }
});



// ...

   JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(450, 590, 100, 30);
        panel.add(homeBtn);
        
       
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                Test_Application.main(new String[0]); // Create a new instance of the test application form
            }
        });

      

        
        
     
        
        
        

        resetButton = new JButton("Reset");
        resetButton.setBounds(450,550,100,30);
        panel.add(resetButton);

        
        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform actions when Clear button is clicked
                clearForm();
            }
        });
        
        
    }
    
    private void clearForm() {
        nameField.setText("");
        nicField.setText("");
       
    }
    
}
