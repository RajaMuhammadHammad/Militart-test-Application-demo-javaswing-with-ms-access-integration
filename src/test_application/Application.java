package test_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;
import java.sql.*;

public class Application extends JFrame {

    private JLabel nameLabel;
    private JLabel nicLabel;
    private JButton Design;
    private JLabel imgLabel;
    private JLabel resultLabel;
    private Timer timer;
    private JLabel timerLabel;
    private TimerTask timerTask;
    private  JButton homeBtn;
    private  JLabel texthome;

    private IntelligenceQuestion intelligenceQuestion;
    private AcademicQuestion academicQuestion;

    
    
    public Application(String name, String nic) {
        super("ARMED FORCES TEST CONDUCTING APPLICATION");

        JPanel panel = new JPanel(null);
        setContentPane(panel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1300, 800);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\12-120709_png-file-human-icon-png.png");
        imgLabel = new JLabel(imageIcon);
        imgLabel.setBounds(20, 30, 200, 200);
        panel.add(imgLabel);

        Design = new JButton("");
        Design.setBounds(0, 250, 1300, 10);
        Design.setBackground(Color.BLACK);
        panel.add(Design);

        
           homeBtn = new JButton("Home");
        homeBtn.setBounds(650, 710, 150, 30);
        panel.add(homeBtn);
        
         texthome = new JLabel(" To go back to home page click on home button");
          texthome.setBounds(250,685,750,85);
          texthome.setFont(new Font("Times New Romans",Font.PLAIN,18));
          texthome.setForeground(Color.BLACK);
          panel.add(texthome);
          
          
          
        nameLabel = new JLabel(name);
        nameLabel.setBounds(230, 95, 400, 30);
        nameLabel.setFont(new Font("Algerian", Font.PLAIN, 28));
        nameLabel.setForeground(Color.BLACK);
        panel.add(nameLabel);
        
       

        nicLabel = new JLabel(nic);
        nicLabel.setBounds(230, 170, 400, 30);
        nicLabel.setFont(new Font("Algerian", Font.PLAIN, 28));
        nicLabel.setForeground(Color.BLACK);
        panel.add(nicLabel);

        timerLabel = new JLabel();
        timerLabel.setFont(new Font("Arial", Font.BOLD, 30));
        timerLabel.setForeground(Color.RED);
        timerLabel.setBounds(730, 100, 350, 50);
        panel.add(timerLabel);
        
        
        
        
        // Home button action listener
        homeBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to return to the test application form
                dispose(); // Close the "About ISSB" form
                Test_Application.main(new String[0]); // Create a new instance of the test application form
            }
        });
        

               intelligenceQuestion = new IntelligenceQuestion(name, nic); // Initialize the intelligenceQuestion
        academicQuestion = new AcademicQuestion(name, nic);

        displayQuestion();

        // Initialize the timer
        timer = new Timer();
        timerTask = new TimerTask() {
            int timeRemaining = 480; // 10 minutes in seconds

            @Override
            public void run() {
                if (timeRemaining > 0) {
                    int minutes = timeRemaining / 60;
                    int seconds = timeRemaining % 60;
                    String timeText = String.format("%02d:%02d", minutes, seconds);
                    timerLabel.setText("Time Remaining: " + timeText);
                    timeRemaining--;
                } else {
                    timerLabel.setText("Time's up!");
                    timer.cancel();
                    timerTask.cancel();
                    removeQuestionComponents();
                    getContentPane().add(nameLabel);
                    getContentPane().add(nicLabel);
                    getContentPane().add(Design);
                    getContentPane().add(imgLabel);

                    // Display the result when the time is up
                    boolean passed = intelligenceQuestion.showResult();
            if (passed) {
                String resultMessage = " Congratulations! You passed the intelligence test," + "\n" + "Proceed to Academic test click 'Start Academics Test'";
                resultLabel = new JLabel(resultMessage);
                resultLabel.setBounds(50, 450, 1200, 70);
                resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
                resultLabel.setForeground(Color.RED);
                getContentPane().removeAll();
                getContentPane().add(resultLabel);
                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                

                JButton startButton = new JButton("Start Academic Test");
                startButton.setBounds(570, 520, 200, 30);
                getContentPane().add(startButton);

                startButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Initialize the academicQuestion object
                        academicQuestion = new AcademicQuestion(nameLabel.getText(), nicLabel.getText());
                        // Display the first academic question
                        displayAcademicQuestion();
                         timer.cancel();
                                timerTask.cancel();
                                timer = new Timer();
                                timerTask = new TimerTask() {
                                    int timeRemaining = 90; // 1.5 minutes in seconds

                                    @Override
                                    public void run() {
                                        if (timeRemaining > 0) {
                                            int minutes = timeRemaining / 60;
                                            int seconds = timeRemaining % 60;
                                            String timeText = String.format("%02d:%02d", minutes, seconds);
                                            timerLabel.setText("Time Remaining: " + timeText);
                                            timeRemaining--;
                                        } else {
                                            timerLabel.setText("Time's up!");
                                            stopTimer();
                                             // No more questions, show the result
            boolean passed = academicQuestion.showResult();

            String resultMessage = passed ? "You passed the academic test!" : "You failed the academic test.Better luck next time!";
            resultLabel = new JLabel(resultMessage);
            resultLabel.setBounds(150, 450, 600, 30);
            resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
            resultLabel.setForeground(Color.RED);
            getContentPane().removeAll();
            getContentPane().add(resultLabel);
            getContentPane().add(nameLabel);
            getContentPane().add(nicLabel);
            getContentPane().add(Design);
            getContentPane().add(imgLabel);
           getContentPane().add(homeBtn);
           getContentPane().add(texthome);
            
             // Stop the timer if the user completes the test
        stopTimer();
            revalidate();
            repaint();
            setVisible(true);
            
                               if (passed) {
    storeResult(nameLabel.getText(), nicLabel.getText());
}
            
                

                                        }
                                    }
                                };
                                timer.schedule(timerTask, 0, 1000);
 
                            }
                        });
                        getContentPane().add(startButton);
                    

                revalidate();
                repaint();
                setVisible(true);
            } else {
                String resultMessage = "You failed the intelligence test. " + "\n" + "Better luck next time!";
                resultLabel = new JLabel(resultMessage);
                resultLabel.setBounds(250, 450, 800, 70);
                resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
                resultLabel.setForeground(Color.RED);
                getContentPane().removeAll();
                getContentPane().add(resultLabel);
                getContentPane().add(resultLabel);
                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                  getContentPane().add(homeBtn);
                getContentPane().add(texthome);

                revalidate();
                repaint();
                setVisible(true);
            }
        }
// Or you can call displayAcademicQuestion() if you want to show the academic result instead

            }     // Refresh the frame to update the changes
             
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000); // Start the timer with a delay of 0 milliseconds and a period of 1 second
    }
                
    
    private void stopTimer() {
    timer.cancel();
    timerTask.cancel();
    timerLabel.setText("Test Completed!");
}
    
    public void displayQuestion() {
        int currentQuestionIndex = intelligenceQuestion.getQuestionIndex();
        int questionCount = intelligenceQuestion.getQuestionCount();

        if (currentQuestionIndex < 25) {
            String currentQuestion = intelligenceQuestion.getQuestion(currentQuestionIndex);
            String[] currentOptions = intelligenceQuestion.getOptions(currentQuestionIndex);

            JLabel questionLabel = new JLabel("Question " + (currentQuestionIndex + 1) + " Of Question 25");
            questionLabel.setBounds(100, 300, 600, 30);
            questionLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));

            if (currentQuestion != null && currentOptions != null) {
                removeQuestionComponents(); // Remove existing question components

                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                getContentPane().add(questionLabel);
                getContentPane().add(timerLabel);

                // Update the question label
                String questionNumber = "Question " + (currentQuestionIndex + 1) + ":";
                String questionText = questionNumber + " " + currentQuestion;
                JLabel questionTextLabel = new JLabel(questionText);
                questionTextLabel.setBounds(100, 400, 1200, 30);
                questionTextLabel.setFont(new Font("Time New Roman", Font.PLAIN, 18));
                questionTextLabel.setForeground(Color.BLACK);
                getContentPane().add(questionTextLabel);

                // Create buttons for each option
                for (int i = 0; i < currentOptions.length; i++) {
                    JButton optionButton = new JButton(currentOptions[i]);
                    optionButton.setBounds(600, 450 + i * 50, 300, 40);
                    optionButton.addActionListener(new OptionButtonListener(i));
                    getContentPane().add(optionButton);
                }

                // Refresh the frame to update the changes
                revalidate();
                repaint();

                // Make the frame visible
                setVisible(true);
            }
        } else {
            boolean passed = intelligenceQuestion.showResult();
            if (passed) {
                String resultMessage = " Congratulations! You passed the intelligence test," + "\n" + "Proceed to Academic test click 'Start Academics Test'";
                resultLabel = new JLabel(resultMessage);
                resultLabel.setBounds(50, 450, 1200, 70);
                resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
                resultLabel.setForeground(Color.RED);
                getContentPane().removeAll();
                getContentPane().add(resultLabel);
                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                getContentPane().add(timerLabel);
                
                 // Stop the timer if the user completes the test
                stopTimer();

                JButton startButton = new JButton("Start Academic Test");
                startButton.setBounds(570, 520, 200, 30);
                getContentPane().add(startButton);

                startButton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        // Initialize the academicQuestion object
                        academicQuestion = new AcademicQuestion(nameLabel.getText(), nicLabel.getText());
                        // Display the first academic question
                        displayAcademicQuestion();
                        
                  timer = new Timer();
        timerTask = new TimerTask() {
            int timeRemaining2 = 480; // 10 minutes in seconds

            @Override
          public void run() {
                if (timeRemaining2 > 0) {
                    int minutes = timeRemaining2 / 60;
                    int seconds = timeRemaining2 % 60;
                    String timeText = String.format("%02d:%02d", minutes, seconds);
                    timerLabel.setText("Time Remaining: " + timeText);
                    timeRemaining2--;
                } else {
                    timerLabel.setText("Time's up!");
                    timer.cancel();
                    timerTask.cancel();
                    removeQuestionComponents();
                    getContentPane().add(nameLabel);
                    getContentPane().add(nicLabel);
                    getContentPane().add(Design);
                    getContentPane().add(imgLabel);
                    

                    
                    boolean passed = academicQuestion.showResult();
            String resultMessage = passed ? "You passed the academic test!" : "You failed the academic test.Better luck next time!";
            resultLabel = new JLabel(resultMessage);
            resultLabel.setBounds(150, 450, 600, 30);
            resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
            resultLabel.setForeground(Color.RED);
             getContentPane().removeAll();
            getContentPane().add(resultLabel);
            getContentPane().add(nameLabel);
            getContentPane().add(nicLabel);
            getContentPane().add(Design);
            getContentPane().add(imgLabel);
           getContentPane().add(homeBtn);
           getContentPane().add(texthome);
            
             // Stop the timer if the user completes the test
        stopTimer();
            revalidate();
            repaint();
            setVisible(true);
            
                               if (passed) {
    storeResult(nameLabel.getText(), nicLabel.getText());
}      
            }
        }
        };
        timer.scheduleAtFixedRate(timerTask, 0, 1000);
                    }
                    
                });

                revalidate();
                repaint();
                setVisible(true);
            } else {
                String resultMessage = "You failed the intelligence test. " + "\n" + "Better luck next time!";
                resultLabel = new JLabel(resultMessage);
                resultLabel.setBounds(250, 450, 800, 70);
                resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
                resultLabel.setForeground(Color.RED);
                getContentPane().removeAll();
                getContentPane().add(resultLabel);
                getContentPane().add(resultLabel);
                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                  getContentPane().add(homeBtn);
                getContentPane().add(texthome);
                 // Stop the timer if the user completes the test
                  stopTimer();

                revalidate();
                repaint();
                setVisible(true);
            }
        }
    }

    public void displayAcademicQuestion() {
        int currentQuestionIndex = academicQuestion.getQuestionIndex();
        int questionCount = academicQuestion.getQuestionCount();

        if (currentQuestionIndex < questionCount) {

            String currentQuestion = academicQuestion.getAcademicQuestion(currentQuestionIndex);
            String[] currentOptions = academicQuestion.getOptions(currentQuestionIndex);

            JLabel questionLabel = new JLabel("Question " + (currentQuestionIndex + 1) + " Of Question " + questionCount);
            questionLabel.setBounds(100, 300, 600, 30);
            questionLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));

            if (currentQuestion != null && currentOptions != null) {
                removeQuestionComponents(); // Remove existing question components

                getContentPane().add(nameLabel);
                getContentPane().add(nicLabel);
                getContentPane().add(Design);
                getContentPane().add(imgLabel);
                getContentPane().add(questionLabel);
                getContentPane().add(timerLabel);

                // Update the question label
                String questionNumber = "Question " + (currentQuestionIndex + 1) + ":";
                String questionText = questionNumber + " " + currentQuestion;
                JLabel questionTextLabel = new JLabel(questionText);
                questionTextLabel.setBounds(100, 400, 1200, 30);
                questionTextLabel.setFont(new Font("Time New Roman", Font.PLAIN, 18));
                questionTextLabel.setForeground(Color.BLACK);
                getContentPane().add(questionTextLabel);

                // Create buttons for each option
                for (int i = 0; i < currentOptions.length; i++) {
                    JButton optionButton = new JButton(currentOptions[i]);
                    optionButton.setBounds(600, 450 + i * 50, 300, 40);
                    optionButton.addActionListener(new AcademicOptionButtonListener(i)); // Use AcademicOptionButtonListener
                    getContentPane().add(optionButton);
                }

                // Refresh the frame to update the changes
                revalidate();
                repaint();

                // Make the frame visible
                setVisible(true);
            }
        } else {
            // No more questions, show the result
            boolean passed = academicQuestion.showResult();

            String resultMessage = passed ? "You passed the academic test!" : "You failed the academic test.Better luck next time!";
            resultLabel = new JLabel(resultMessage);
            resultLabel.setBounds(150, 450, 600, 30);
            resultLabel.setFont(new Font("Time New Roman", Font.BOLD, 24));
            resultLabel.setForeground(Color.RED);
            getContentPane().removeAll();
            getContentPane().add(resultLabel);
            getContentPane().add(nameLabel);
            getContentPane().add(nicLabel);
            getContentPane().add(Design);
            getContentPane().add(imgLabel);
           getContentPane().add(homeBtn);
           getContentPane().add(texthome);
            
             // Stop the timer if the user completes the test
        stopTimer();
            revalidate();
            repaint();
            setVisible(true);
            
                               if (passed) {
    storeResult(nameLabel.getText(), nicLabel.getText());
}
            
            
        }
 
    }
    
    
     
    

public void storeResult(String name, String nic) {
    String insertQuery = "INSERT INTO Result ([NAME], NIC, APPLIED) VALUES (?, ?, ?)";  // [NAME] is used to handle reserved keyword conflicts
    Connection connection = null;

    try {
        Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        String url = "jdbc:ucanaccess://C:\\Users\\DELL\\Documents\\Databaseproject.accdb";
        connection = DriverManager.getConnection(url);

        // Create an array of forces
        String[] forces = {"PAK ARMY", "PAK NAVY", "PAF"};

        // Prompt the user to select the force using an option dialog
        String force = (String) JOptionPane.showInputDialog(null, "Select the force for which you gave the test:",
                "Force Selection", JOptionPane.PLAIN_MESSAGE, null, forces, forces[0]);

        if (force == null) {
            // User cancelled the selection, return without storing the result
            return;
        }

        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setString(1, name);
        preparedStatement.setString(2, nic);
        preparedStatement.setString(3, force);
        preparedStatement.executeUpdate();
        preparedStatement.close();

        JOptionPane.showMessageDialog(null, "Only Shortlisted Candidates Will be called For Further Formalities");

        String selectQuery = "SELECT * FROM Result";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(selectQuery);
            resultSet.close();
        } catch (SQLException f) {
            f.printStackTrace();
        }
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

    
    
    
    
     private void removeQuestionComponents() {
        Component[] components = getContentPane().getComponents();
        for (Component component : components) {
            if (component instanceof JLabel || component instanceof JButton) {
                getContentPane().remove(component);
            }
        }
    }




 
    private class OptionButtonListener implements ActionListener {
        private int optionIndex;

        public OptionButtonListener(int index) {
            optionIndex = index;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            intelligenceQuestion.setUserResponse(intelligenceQuestion.getQuestionIndex(), optionIndex);
            displayQuestion(); // Display the next question
        }
    }
    
    private class AcademicOptionButtonListener implements ActionListener {
    private int optionIndex;

    public AcademicOptionButtonListener(int index) {
        optionIndex = index;
    }

    
    @Override
    public void actionPerformed(ActionEvent e) {
        academicQuestion.setUserResponse(academicQuestion.getQuestionIndex(), optionIndex);
        displayAcademicQuestion(); // Display the next academic question
    }
}


        }