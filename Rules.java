package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton start, back;

    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(new Color(245, 240, 225));
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome to Astro Champ, " + name+ "!");
        heading.setBounds(60, 20, 700, 45);
        heading.setFont(new Font("Script MT Bold", Font.BOLD, 40));
        heading.setForeground(new Color(148, 0, 211));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setText(
            "<html>"+
                "1. Each question has four options; choose the correct one." + "<br><br>" +
                "2. You have 15 seconds to answer each question." + "<br><br>" +
                "3. You can use the 50–50 lifeline only once, which removes two incorrect options." + "<br><br>" +
                "4. No skipping questions once the quiz starts." + "<br><br>" +
                "5. Each correct answer earns points." + "<br><br>" +
                "6. Wrong answers do not deduct points." + "<br><br>" +
                "7. The quiz includes planets, stars, and space facts." + "<br><br>" +
                "8. Your final score is shown at the end of the quiz." + "<br><br>" +
            "<html>"    
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(138, 43, 226));
        back.setForeground(new Color(255, 255, 255));
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(138, 43, 226));
        start.setForeground(new Color(255, 255, 255));
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[]args) {
        new Rules("User");
    }
}
