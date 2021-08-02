package basics.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton next, exit;
    JTextField textField;
    public String name;
    Login(){
        setBounds(200, 50,900,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon image = new ImageIcon(ClassLoader.getSystemResource("basics/com/Icons/login.jpeg"));
        JLabel loginImage = new JLabel(image);
        loginImage.setBounds(0, 0, 450, 480);
        add(loginImage);

        JLabel heading = new JLabel("SIMPLE QUIZ");
        heading.setBounds(580, 30, 200, 30);
        heading.setFont(new Font("Areaman", Font.BOLD, 30));
        heading.setForeground(new Color(1, 160, 229));
        add(heading);

        JLabel userName = new JLabel("Enter Your Name");
        userName.setBounds(585, 150, 200,30);
        userName.setFont(new Font("Times New Roman",Font.BOLD, 25));
        userName.setForeground(Color.BLACK);
        add(userName);

        textField = new JTextField();
        textField.setBounds(550,200,250, 30);
        add(textField);

        next = new JButton("Next");
        next.setBounds(550, 260, 100,25);
        next.setBackground(new Color(1, 160, 229));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        exit = new JButton("Exit");
        exit.setBounds(700, 260, 100, 25);
        exit.setBackground(new Color(1,160,229 ));
        exit.setForeground(Color.WHITE);
        exit.addActionListener(this);
        add(exit);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            name = textField.getText();
            if(name.equals("")){ }

            else{
                new RulePage(name).setVisible(true);
                this.setVisible(false);
            }
    }
        if(ae.getSource() == exit){
            System.exit(0);
        }

    }

    public static void main(String[] args){
        new Login().setVisible(true);
    }

}
