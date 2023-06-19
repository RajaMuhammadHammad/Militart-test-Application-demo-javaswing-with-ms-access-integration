package test_application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Instructions extends JFrame {
    private JButton START;
    private String name;
    private String nic;

    public Instructions(String name, String nic) {
        super("ARMED FORCES TEST CONDUCTING APPLICATION");

        this.name = name;
        this.nic = nic;

        JPanel panel = new JPanel(null);
        setContentPane(panel);

        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(1000, 800);
        setLocationRelativeTo(null);
        setVisible(true);
        setResizable(false);
        panel.setBackground(Color.WHITE);

        ImageIcon backgroundImage = new ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Project\\images\\Instruction.PNG");
        JLabel background = new JLabel("", backgroundImage, JLabel.CENTER);
        background.setBounds(0, 0, getWidth(), getHeight());
        panel.add(background);

        START = new JButton("START");
        START.setBounds(800, 650, 170, 60);
        Color lightRed = new Color(255, 200, 200);
        START.setBackground(lightRed);
        START.setFont(new Font("Algerian", Font.BOLD, 20));
        panel.add(START);

        START.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Application newForm = new Application(name, nic);
                newForm.setVisible(true);
                dispose();
            }
        });
    }
}
