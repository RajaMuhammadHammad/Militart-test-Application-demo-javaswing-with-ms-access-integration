/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.sql.*;


public class Result extends JFrame  {
    
    
    public Result(){
        
        
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
        
        
      
        
          JLabel heading = new JLabel("INTER-SERVICES SELECTION BOARD");
          heading.setBounds(200,80,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.RED);
          panel.add(heading);
          
       ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
       JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(300,70 ,1150 ,65);
        panel.add(gifLabel);
        
        
          ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\images-2.jpg");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,0 ,200 ,200);
        panel.add(imgLabel);
        
        
                  JLabel heading2 = new JLabel("RESULT");
          heading2.setBounds(460,200,750,85);
          heading2.setFont(new Font("Algerian",Font.BOLD,30));
          heading2.setForeground(Color.BLACK);
          panel.add(heading2);
         
        
          
        JLabel  nicLabel = new JLabel("Enter Your CNIC No");
       nicLabel.setBounds(430,350,250,60);
       nicLabel.setFont(new Font("Algerian",Font.PLAIN,20));
       nicLabel.setForeground(Color.BLACK);
        panel.add(nicLabel);

      JTextField  nicField = new JTextField(13);
       nicField.setBounds(400,400,250,30);
        panel.add(nicField);
        
          
           JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(650, 710, 150, 30);
        panel.add(homeBtn);
        
        JLabel texthome = new JLabel(" To go back to home page click on home button");
          texthome.setBounds(250,685,750,85);
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
        
       JButton   submitBtn = new JButton("Submit");
        submitBtn.setBounds(470,450,100,30);
        panel.add(submitBtn);
        
       
        
submitBtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Check if any of the required fields are empty
        if (nicField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all the required fields.");
        } else {
            // Establish a database connection
            try {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                Connection connection = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb", "", "");
                Statement statement = connection.createStatement();

                // Query the Result table to check the NIC
                String nic = nicField.getText();
                String query = "SELECT NIC FROM Result WHERE NIC = '" + nic + "'";
                ResultSet resultSet = statement.executeQuery(query);

                // Check if the NIC exists in the table
                if (resultSet.next()) {
                    JOptionPane.showMessageDialog(null, "You have passed the initial procedure. Waiting for ISSB call letter.");
                } else {
                    JOptionPane.showMessageDialog(null, "Your test status is Failed.");
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



        
        
    }
    
}
