package basics.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;

public class Main extends JFrame implements ActionListener {
    JButton rules, submit;
    JTextField name;

    Main(){
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(50,50,1000,500);
        getContentPane().setBackground(new Color(104, 233, 192, 255));
        setLayout(null);
//        FOR PLACING THE IMAGE
        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("basics/com/Icons/login.jpeg"));
        JLabel label1 = new JLabel(i);
        label1.setBounds(0,-10,500,500);
        add(label1);
//        FOR PLACING THE TEXT OF FRAME
        JLabel label2 = new JLabel("SIMPLE QUIZ");
        label2.setFont(new Font("SPRING_DAILY",Font.BOLD, 30));
        label2.setBounds(600, 0, 300, 150);
        label2.setForeground(Color.RED);
        add(label2);

        JLabel firstName = new JLabel("Enter Name");
        firstName.setBounds(550, 200, 100,80);
        firstName.setFont(new Font("Times New Roman",Font.BOLD,15));
        firstName.setForeground(Color.BLACK);
        add(firstName);

        name = new JTextField(50);
        name.setBounds(650,230,200,20);
        name.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(name);

        JLabel checkRules = new JLabel("           Exit Here ->");
        checkRules.setBounds(690, 244, 200, 80);
        checkRules.setFont(new Font("Times New Romans", Font.BOLD, 16));
        checkRules.setForeground(Color.BLACK);
        add(checkRules);

        rules = new JButton("Exit");
        rules.setBounds(855, 270, 80, 25);
        rules.setForeground(Color.WHITE);
        rules.setBackground(Color.DARK_GRAY);
        rules.addActionListener(this);
        add(rules);

        submit = new JButton("Submit");
        submit.setBounds(855, 226, 80, 25);
        submit.setForeground(Color.WHITE);
        submit.setBackground(Color.DARK_GRAY);
        submit.addActionListener(this);
        add(submit);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == submit){
            String Name = name.getText();
            this.setVisible(false);
            new Rules(Name).setVisible(true);

        }
        else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Main().setVisible(true);
    }
}
