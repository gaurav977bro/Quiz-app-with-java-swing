package basics.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{
    JLabel rule1, rule2, rule3, rule4;
    JButton back;
    JButton start;

    Rules(String userName){
        setLayout(null);
        setBounds(50,50, 1200,700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);

        JLabel rulesIntro = new JLabel(""+userName.toUpperCase()+" ENSURE YOU FOLLOW THIS RULES DURING TEST:");
        rulesIntro.setFont(new Font("Times New Roman", Font.BOLD, 30));
        rulesIntro.setBounds(0,0, 1000, 150);
        rulesIntro.setForeground(Color.blue);
        add(rulesIntro);

        rule1 = new JLabel("1). Do not close the main window while taking the test.");
        rule1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rule1.setForeground(Color.BLACK);
        rule1.setBounds(50, 140, 1000,20);
        add(rule1);

        rule2 = new JLabel("2). Do not switch the window while taking the test.");
        rule2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rule2.setForeground(Color.BLACK);
        rule2.setBounds(50, 190, 1000,20);
        add(rule2);
        
        rule3 = new JLabel("3). Make sure your WebCam is open and the video is clear. ");
        rule3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rule3.setForeground(Color.BLACK);
        rule3.setBounds(50, 240, 1000,20);
        add(rule3);
        
        rule4 = new JLabel("4). Make sure your face is clearly visible to camera.");
        rule4.setFont(new Font("Times New Roman", Font.PLAIN, 14));
        rule4.setForeground(Color.BLACK);
        rule4.setBounds(50, 290, 1000,20);
        add(rule4);

        back = new JButton("BACK");
        back.setBounds(50,320, 80,30);
        back.setBackground(Color.DARK_GRAY);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);

        start = new JButton("Start");
        start.setBounds(200, 320, 80, 30);
        start.setBackground(Color.DARK_GRAY);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);


    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == start){
            this.setVisible(false);
            new Quiz().setVisible(true);


        }
        else if(ae.getSource() == back){
            this.setVisible(false);
            new Main().setVisible(true);

        }
    }


}
