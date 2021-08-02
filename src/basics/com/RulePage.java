package basics.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class RulePage extends JFrame implements ActionListener{
    JButton start, back;

    RulePage(String username){
        setBounds(200, 50, 900,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel rulesHeading = new JLabel(username.toUpperCase() + ", Make sure you read all rules below.");
        rulesHeading.setBounds(80, 30, 900, 30);
        rulesHeading.setForeground(Color.RED);
        rulesHeading.setFont(new Font("Times New Roman", Font.BOLD, 30));
        add(rulesHeading);

        JLabel rule1 = new JLabel("1. Make sure your webcam is open.");
        rule1.setBounds(80, 80, 900, 20);
        rule1.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rule1.setForeground(Color.BLACK);
        add(rule1);

        JLabel rule2 = new JLabel("2. Make sure you are audible.");
        rule2.setBounds(80, 100, 900, 20);
        rule2.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rule2.setForeground(Color.BLACK);
        add(rule2);

        JLabel rule3 = new JLabel("3. Do not switch the make window while taking the test.");
        rule3.setBounds(80, 120, 900, 20);
        rule3.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rule3.setForeground(Color.BLACK);
        add(rule3);


        JLabel rule4 = new JLabel("4. Make sure your face is clearly visible.");
        rule4.setBounds(80, 140, 900, 20);
        rule4.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rule4.setForeground(Color.BLACK);
        add(rule4);

        JLabel rule5 = new JLabel("5. Use of any electronic device is prohibited.Make sure your webcam is open.");
        rule5.setBounds(80, 160, 900, 20);
        rule5.setFont(new Font("Tahoma", Font.PLAIN, 15));
        rule5.setForeground(Color.BLACK);
        add(rule5);

        start = new JButton("Start");
        start.setBounds(80, 200, 100,30);
        start.setForeground(Color.WHITE);
        start.setBackground(new Color(1, 160, 229));
        start.addActionListener(this);
        add(start);

        back = new JButton("Back");
        back.setBounds(250, 200, 100,30);
        back.setForeground(Color.WHITE);
        back.setBackground(new Color(1, 160, 229));
        back.addActionListener(this);
        add(back);

    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            this.setVisible(false);
            new QuizPage().setVisible(true);
        }
        if(ae.getSource() == back){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }



}
