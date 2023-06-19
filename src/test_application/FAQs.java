
package test_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FAQs extends JFrame {
    
    
    private JLabel heading;
    
    public FAQs(){
        
        super("ARMED FORCES TEST CONDUCTING APPLICATION");
        
                 // panel to call add component on the JFrame
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
       
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1100, 850);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
         int red = 173;    // Red component value (0-255)
        int green = 216;  // Green component value (0-255)
        int blue = 230;   // Blue component value (0-255)
        Color lightBlue = new Color(red, green, blue);
        panel.setBackground(lightBlue);
        
      
          heading = new JLabel("FREQUENTLY ASKS QUESTION (FAQs)");
          heading.setBounds(250,80,650,85);
          heading.setFont(new Font("Algerian",Font.BOLD,34));
          heading.setForeground(Color.BLACK);
          panel.add(heading);
          
          
          ImageIcon imageIcon2 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\Capture.PNG");
       JLabel imgLabel = new JLabel(imageIcon2);
        imgLabel.setBounds(0,190 ,550 ,500);
        panel.add(imgLabel);
        
        
         ImageIcon imageIcon3 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\Capture2.PNG");
        imgLabel = new JLabel(imageIcon3);
        imgLabel.setBounds(370,190 ,900 ,500);
        panel.add(imgLabel);
       
        
          
           JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(750, 710, 150, 30);
        panel.add(homeBtn);
        
        JLabel texthome = new JLabel(" To go back to home page click on home button");
          texthome.setBounds(350,685,750,85);
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
        
       
      
        
    }
    
}
