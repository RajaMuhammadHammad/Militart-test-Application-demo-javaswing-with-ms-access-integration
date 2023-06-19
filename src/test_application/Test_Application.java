/*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
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

public class Test_Application extends JFrame {
    
    private JButton openbtn;
    private JButton closebtn;
    private JButton FAQsbtn;
    private JButton Applybtn;
    private JButton resultbtn;
    private JButton aboutbtn;
    
    public Test_Application() {
        
    super("ARMED FORCES TEST CONDUCTING APPLICATION");
    
      // Create the panel with null layout
    JPanel panel = new JPanel(null);
    setContentPane(panel);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(1000, 800);
    setLocationRelativeTo(null);
     setResizable(false);
     panel.setBackground(Color.WHITE);
    
   
          JLabel heading1 = new JLabel("INTER-SERVICES SELECTION BOARD");
          heading1.setBounds(200,80,650,85);
          heading1.setFont(new Font("Algerian",Font.BOLD,34));
          heading1.setForeground(Color.RED);
          panel.add(heading1);
          
          JLabel heading = new JLabel("(INITIAL TEST CONDUCTING APPLICATION)");
          heading.setBounds(200,140,750,85);
          heading.setFont(new Font("Arial",Font.BOLD,28));
          heading.setForeground(Color.GRAY);
          panel.add(heading);
          
    
        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\images-2.jpg");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(0,0 ,200 ,200);
        panel.add(imgLabel);
        
         ImageIcon gifIcon2 = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ezgif.com-resize (2).gif");
        JLabel gifLbl = new JLabel(gifIcon2);
        gifLbl.setBounds(300,70 ,1150 ,65);
        panel.add(gifLbl);

    
      ImageIcon gifIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\pakistan-army-pak-army.gif");
       JLabel gifLabel = new JLabel(gifIcon);
        gifLabel.setBounds(0,100 ,1000 ,800);
        panel.add(gifLabel);
    
     /* ImageIcon backgroundImage = new ImageIcon("C:\\Users\\DELL\\Desktop\\Capture back.PNG");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0, 0, getWidth(), getHeight());
        panel.add(background); */   
     
    
         

   

    openbtn = new JButton("Open Test");
    openbtn.setForeground(Color.WHITE);
    openbtn.setBounds(150, 207, 170, 30);
    openbtn.setBackground(Color.BLACK);
    panel.add(openbtn);  // Add openbtn to the panel
    
openbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to open a new form or perform actions on button click
        TestApp newForm = new TestApp(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
         dispose();
    }
});



     FAQsbtn = new JButton("FAQs");
     FAQsbtn.setBounds(315, 207, 170, 30);
     FAQsbtn.setForeground(Color.WHITE);
     FAQsbtn.setBackground(Color.BLACK);
     panel.add(FAQsbtn);
     
     FAQsbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to open a new form or perform actions on button click
        FAQs newForm = new FAQs(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
         dispose();
    }
});
     
     
     
     Applybtn = new JButton("APPLY NOW");
    Applybtn.setForeground(Color.RED);
    Applybtn.setBounds(0, 207, 170, 30);
    Applybtn.setBackground(Color.BLACK);
    panel.add(Applybtn);
    
     Applybtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to open a new form or perform actions on button click
        Registration_form newForm = new Registration_form(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
    }
});

    
    
    
    resultbtn = new JButton("Result");
    resultbtn.setForeground(Color.WHITE);
    resultbtn.setBounds(485, 207, 170, 30);
    resultbtn.setBackground(Color.BLACK);
    panel.add(resultbtn);
    
      resultbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to open a new form or perform actions on button click
        Result newForm = new Result(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
    }
});
    
    

    // Create the reset button
    closebtn = new JButton("Close");
    closebtn.setBounds(650, 207, 170, 30);
    closebtn.setForeground(Color.WHITE);
    closebtn.setBackground(Color.BLACK);
    panel.add(closebtn);
    
           // Close button action listener
        closebtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform actions when Close button is clicked
                System.exit(0);
            }
        });
    
    aboutbtn = new JButton("About ISSB");
    aboutbtn.setBounds(814, 207, 170, 30);
    aboutbtn.setForeground(Color.WHITE);
    aboutbtn.setBackground(Color.BLACK);
    panel.add(aboutbtn);
    
    aboutbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        // Code to open a new form or perform actions on button click
        AboutISSB newForm = new AboutISSB(); // Create an instance of the new form
        newForm.setVisible(true); // Make the new form visible
        dispose();
    }
});


    setVisible(true);
}



public class AboutISSB extends JFrame {
    
    public AboutISSB() {
        super("About ISSB");
        
        // Create the panel with null layout
        JPanel panel = new JPanel(null);
        setContentPane(panel);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        panel.setBackground(Color.WHITE);
        
         JLabel heading1 = new JLabel("ABOUT INTER-SERVICES SELECTION BOARD");
          heading1.setBounds(150,160,750,85);
          heading1.setFont(new Font("Algerian",Font.BOLD,34));
          heading1.setForeground(Color.RED);
          panel.add(heading1);
          
       ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ABOUT ISSB.jpg");
       JLabel imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(400,10 ,200 ,200);
        panel.add(imgLabel);
        
         
        
        // Add your components to the panel
        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\ISSB.PNG");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0, 80, 1000, 800);
        panel.add(background);     
        
        
         JButton homeBtn = new JButton("Home");
        homeBtn.setBounds(630, 710, 150, 30);
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

                  
          JLabel text = new JLabel(" For more information visit the website by clicking on button ");
          text.setBounds(150,650,750,85);
          text.setFont(new Font("Times New Romans",Font.PLAIN,18));
          text.setForeground(Color.BLACK);
          panel.add(text);
        
        JButton websiteBtn = new JButton("Visit Website");
        websiteBtn.setBounds(630, 675, 150, 30);
        panel.add(websiteBtn);

        // Website button action listen
        websiteBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // Open the website in the default browser
                    Desktop.getDesktop().browse(new URI("https://issb.gov.pk/")); // Replace with the actual website URL
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                }
            }
        });

       
        // Set the visibility of the form
        setVisible(true);
    }
    
}

  

    public static void main(String[] args) {
        
        Test_Application T1 = new Test_Application();
        T1.setVisible(true);
        
        
        
    }
}
