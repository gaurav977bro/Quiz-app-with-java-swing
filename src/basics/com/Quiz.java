package basics.com;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.*;

public class Quiz extends JFrame implements ActionListener {
    JLabel qno,question;
    JRadioButton option1, option2, option3, option4;
    ButtonGroup options;
    JButton next, help, submit;
    public static int timer = 15;
    public static int ans_given = 0;
    String[][] pa = new String[10][1];
    String[][] q = new String[10][5];
    String[][] qa = new String[10][2];
public static int score = 0;


    public static int count = 0;

    Quiz(){
        setBounds(0,0,1440,950);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        ImageIcon i = new ImageIcon(ClassLoader.getSystemResource("basics/com/Icons/quiz.jpg"));
        JLabel topImage = new JLabel(i);
        topImage.setBounds(0,0,1440,250);
        add(topImage);

        qno = new JLabel();
        qno.setBounds(30, 350, 700, 30);
        qno.setFont(new Font("Tahoma",Font.BOLD, 20));
        add(qno);
// QUESTION NO 1
        question = new JLabel();
        question.setBounds(65, 350, 1000, 30);
        question.setFont(new Font("Tahoma",Font.BOLD, 20));
        add(question);
// QUESTION NO 1 OPTIONS
        option1 = new JRadioButton();
        option1.setBounds(90, 400, 700, 20);
        option1.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(option1);

        option2 = new JRadioButton();
        option2.setBounds(90, 425, 700, 20);
        option2.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(option2);

        option3 = new JRadioButton();
        option3.setBounds(90, 450, 700, 20);
        option3.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(option3);

        option4 = new JRadioButton();
        option4.setBounds(90, 475, 700, 20);
        option4.setFont(new Font("Dialog", Font.PLAIN, 15));
        add(option4);

//        CREATING BUTTON GROUP SO THAT ONLY ONE OPTION CAN BE SELECTED
        options = new ButtonGroup();
        options.add(option1);
        options.add(option2);
        options.add(option3);
        options.add(option4);

        next = new JButton("Next");
        next.setBounds(850, 450,200,30);
        next.setBackground(Color.DARK_GRAY);
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        help = new JButton("Hint");
        help.setBounds(850, 500, 200,30);
        help.setBackground(Color.DARK_GRAY);
        help.setForeground(Color.WHITE);
        help.addActionListener(this);
        add(help);

        submit = new JButton("Submit");
        submit.setBounds(850, 550, 200,30);
        submit.setBackground(Color.DARK_GRAY);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

//        assigning values to array
        q[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        q[0][1] = "JVM";
        q[0][2] = "JDB";
        q[0][3] = "JDK";
        q[0][4] = "JRE";

        q[1][0] = "What is the return type of the hashCode() method in the Object class?";
        q[1][1] = "int";
        q[1][2] = "Object";
        q[1][3] = "long";
        q[1][4] = "void";

        q[2][0] = "Which package contains the Random class?";
        q[2][1] = "java.util package";
        q[2][2] = "java.lang package";
        q[2][3] = "java.awt package";
        q[2][4] = "java.io package";

        q[3][0] = "An interface with no fields or methods is known as?";
        q[3][1] = "Runnable Interface";
        q[3][2] = "Abstract Interface";
        q[3][3] = "Marker Interface";
        q[3][4] = "CharSequence Interface";

        q[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        q[4][1] = "Stack";
        q[4][2] = "String memory";
        q[4][3] = "Random storage space";
        q[4][4] = "Heap memory";

        q[5][0] = "Which of the following is a marker interface?";
        q[5][1] = "Runnable interface";
        q[5][2] = "Remote interface";
        q[5][3] = "Readable interface";
        q[5][4] = "Result interface";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "In java, jar stands for?";
        q[7][1] = "Java Archive Runner";
        q[7][2] = "Java Archive";
        q[7][3] = "Java Application Resource";
        q[7][4] = "Java Application Runner";

        q[8][0] = "Which of the following is a mutable class in java?";
        q[8][1] = "java.lang.StringBuilder";
        q[8][2] = "java.lang.Short";
        q[8][3] = "java.lang.Byte";
        q[8][4] = "java.lang.String";

        q[9][0] = "Which of the following option leads to the portability and security of Java?";
        q[9][1] = "Bytecode is executed by JVM";
        q[9][2] = "The applet makes the Java code secure and portable";
        q[9][3] = "Use of exception handling";
        q[9][4] = "Dynamic binding between objects";

        qa[0][1] = "JDB";
        qa[1][1] = "int";
        qa[2][1] = "java.util package";
        qa[3][1] = "Marker Interface";
        qa[4][1] = "Heap memory";
        qa[5][1] = "Remote interface";
        qa[6][1] = "import";
        qa[7][1] = "Java Archive";
        qa[8][1] = "java.lang.StringBuilder";
        qa[9][1] = "Bytecode is executed by JVM";

        start(0);
    }
    public void start(int count){
        qno.setText(""+(count+1)+".");
        question.setText(q[count][0]);
        option1.setLabel(q[count][1]);
        option1.setActionCommand(q[count][1]);
        option2.setLabel(q[count][2]);
        option2.setActionCommand(q[count][2]);
        option3.setLabel(q[count][3]);
        option3.setActionCommand(q[count][3]);
        option4.setLabel(q[count][4]);
        option4.setActionCommand(q[count][4]);
        options.clearSelection();
    }

public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
         repaint();
         ans_given = 1;
         if(options.getSelection() == null){
             pa[count][0] = "";
         }
         else{
             pa[count][0] = options.getSelection().getActionCommand();
         }
         if(count == 8){
             next.setEnabled(false);
             submit.setEnabled(true);
         }
         count++;
         start(count);
        }
        else if(ae.getSource() == help){

        }
        else if(ae.getSource() == submit){
            if(options.getSelection() == null){
                pa[count][0] = "";
            }
            else{
                pa[count][0] = options.getSelection().getActionCommand();
            }
            for(int z = 0; z<pa.length; z++){
                if(pa[z][0].equals(qa[z][1])){
                    score += 10;
                }
                else{
                    score += 0;
                }
            }
            this.setVisible(false);

        }
}

public void paint(Graphics g){
        super.paint(g);
    String time = new String("Time left ->  "+timer);
    g.setFont(new Font("SAN_SERIF",Font.BOLD,20));
    g.setColor(Color.RED);
    timer--;

if(timer >= 0 ){
    g.drawString(time, 880,320);
}
else {
    g.setFont(new Font("SAN_SERIF",Font.BOLD,20));
    g.setColor(Color.RED);
    g.drawString("Time is Up !!", 880,320);

}
    try{
        Thread.sleep(1000);
        repaint();
    }
    catch (Exception e){ }

    if(ans_given == 1){
        timer = 15;
    }

if(timer < 0 ) {
    timer = 15;

    if (count == 8 ) {
        next.setEnabled(false);
        submit.setEnabled(true);
    }
    if (count == 9) {
        if (options.getSelection() == null) {
            pa[count][0] = "";
        } else {
            pa[count][0] = options.getSelection().getActionCommand();
        }

        for (int z = 0; z < pa.length; z++) {
            if (pa[z][0].equals(qa[z][1])) {
                score += 10;
            }
            else{
                score += 0;
            }
        }
        this.setVisible(false);
    }
    else
    {
        if(options.getSelection() == null){
            pa[count][0] = "";
        }
        else{
            pa[count][0] = options.getSelection().getActionCommand();
        }
        count++;
        start(count);
    }

}
}




    public static void main(String[] args){
        new Quiz().setVisible(true);
    }

}
