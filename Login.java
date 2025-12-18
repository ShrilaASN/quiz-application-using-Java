package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton rules,back;
    JTextField tfname;
    
    Login() {
        getContentPane().setBackground(new Color(245, 240, 225));
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(Login.class.getResource("/icons/login.png"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 800, 500);
        add(image);
        
        JLabel heading = new JLabel("Astro Champ");
        heading.setBounds(885, 80, 300, 45);
        heading.setFont(new Font("Script MT Bold", Font.BOLD, 40));
        heading.setForeground(new Color(148, 0, 211));
        add(heading);
        
        JLabel name = new JLabel("Enter your Name");
        name.setBounds(925, 150, 300, 40);
        name.setFont(new Font("Mangolian Baiti", Font.BOLD, 18));
        name.setForeground(new Color(100, 70, 140));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(850, 200, 300, 25);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfname);
        
        rules = new JButton("Rules");
        rules.setBounds(875, 270, 120, 25);
        rules.setBackground(new Color(138, 43, 226));
        rules.setForeground(new Color(255, 255, 255));
        rules.addActionListener(this);
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(1000, 270, 120, 25);
        back.setBackground(new Color(138, 43, 226));
        back.setForeground(new Color(255, 255, 255));
        back.addActionListener(this);
        add(back);
        
        setSize(1200, 525);
        setLocation(200,150);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if (ae.getSource() == rules) {
            String name = tfname.getText();
            setVisible(false);
            new Rules(name);    
        } else if (ae.getSource() == back){
            setVisible(false);
        }
    }
    
    public static void main(String[]args) {
        new Login();
    } 
}
