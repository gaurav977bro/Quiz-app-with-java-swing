package basics.com;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Score extends JFrame implements ActionListener{
    JButton playAgain;

    Score(int userScore){

        setLayout(null);
        setBounds(50, 50,750,240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.pink);

        ImageIcon score0 = new ImageIcon(ClassLoader.getSystemResource("basics/com/Icons/score.png"));
        Image i = score0.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT);
        ImageIcon score1 = new ImageIcon(i);
        JLabel scoreImage = new JLabel(score1);
        scoreImage.setBounds(-10,-15,320, 230);
        add(scoreImage);

        JLabel result = new JLabel("YOUR SCORED : "+userScore);
        result.setBounds(340,120,280,30);
        result.setForeground(Color.BLACK);
        result.setFont(new Font("Times New Roman", Font.ITALIC, 25));
        add(result);

        playAgain  = new JButton("Play Again");
        playAgain.setBounds(340, 150, 100, 30);
        playAgain.addActionListener(this);
        add(playAgain);


    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == playAgain){
            this.setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args){
        new Score(33).setVisible(true);
    }


}
