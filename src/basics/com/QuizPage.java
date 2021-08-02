package basics.com;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class QuizPage extends JFrame implements ActionListener {
    public static int ans_given = 0;
    public static int count = 0;
    public static int timer = 15;
    public static int score = 0;
    JButton next, hint, submit;
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup select;
    String[][] q = new String[10][5];
    String[][] qa = new String[10][2];
    String[][] pa = new String[10][1];

    JLabel qno, question;

    QuizPage() {
        setSize(1440, 950);
        setLocationRelativeTo(null);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon banner = new ImageIcon(ClassLoader.getSystemResource("basics/com/Icons/quiz.jpg"));
        JLabel bannerImage = new JLabel(banner);
        bannerImage.setBounds(0, 0, 1440, 350);
        add(bannerImage);

        qno = new JLabel();
        qno.setBounds(150, 400, 900, 30);
        qno.setForeground(Color.BLACK);
        qno.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(qno);

        question = new JLabel();
        question.setBounds(180, 400, 900, 30);
        question.setForeground(Color.BLACK);
        question.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        add(question);

        opt1 = new JRadioButton();
        opt1.setBounds(180, 450, 450, 20);
        opt1.setForeground(Color.BLACK);
        add(opt1);

        opt2 = new JRadioButton();
        opt2.setBounds(180, 480, 450, 20);
        opt2.setForeground(Color.BLACK);
        add(opt2);

        opt3 = new JRadioButton();
        opt3.setBounds(180, 510, 450, 20);
        opt3.setForeground(Color.BLACK);
        add(opt3);

        opt4 = new JRadioButton();
        opt4.setBounds(180, 540, 450, 20);
        opt4.setForeground(Color.BLACK);
        add(opt4);

        next = new JButton("Next");
        next.setBounds(180, 570, 100, 30);
        next.setBackground(new Color(1, 160, 229));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        add(next);

        hint = new JButton("Hint");
        hint.setBounds(1000, 520, 100, 30);
        hint.setBackground(new Color(1, 160, 229));
        hint.setForeground(Color.WHITE);
        hint.addActionListener(this);
        add(hint);

        submit = new JButton("Submit");
        submit.setBounds(1000, 570, 100, 30);
        submit.setBackground(new Color(1, 160, 229));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);

        select = new ButtonGroup();
        select.add(opt1);
        select.add(opt2);
        select.add(opt3);
        select.add(opt4);

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

    public void start(int count) {
        qno.setText("" + (count + 1) + ".");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);

        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);

        opt3.setLabel(q[count][3]);
        opt4.setActionCommand(q[count][3]);

        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);

        select.clearSelection();

    }

    public void paint(Graphics g) {
        super.paint(g);
        String msg = new String("Time -> " + timer + " Seconds");

        if (timer > 0) {
            g.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
            g.setColor(Color.RED);
            g.drawString(msg, 1000, 500);
        } else {
            g.setFont(new Font("SAN_SERIF", Font.BOLD, 20));
            g.setColor(Color.RED);
            g.drawString("TIMES UP !!", 1000, 500);
        }
        timer--;

        try {
            Thread.sleep(1000);
            repaint();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_given == 1) {
            ans_given = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            opt2.setEnabled(true);
            opt4.setEnabled(true);
            opt3.setEnabled(true);
            opt1.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) {
                if (select.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = select.getSelection().getActionCommand();
                }

                for (int z = 0; z < pa.length; z++) {
                    if (pa[z][0].equals(qa[z][1])) {
                        score += 10;
                    } else {
                        score += 0;
                    }
                }
                this.setVisible(false);
                new Score(score).setVisible(true);
            } else {
                if (select.getSelection() == null) {
                    pa[count][0] = "";
                } else {
                    pa[count][0] = select.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }

        }


    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == next) {
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            ans_given = 1;

            if (select.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = select.getSelection().getActionCommand();
            }
            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            start(count);

        }

        if (ae.getSource() == hint) {
            if (count == 1 || count == 2 || count == 3) {
                opt2.setEnabled(false);
                opt4.setEnabled(false);
            } else {
                opt1.setEnabled(false);
                opt3.setEnabled(false);
            }
            hint.setEnabled(false);

        }
        if (ae.getSource() == submit) {
            ans_given = 1;
            if (select.getSelection() == null) {
                pa[count][0] = "";
            } else {
                pa[count][0] = select.getSelection().getActionCommand();
            }
            for (int z = 0; z < pa.length; z++) {
                if (pa[z][0].equals(qa[z][1])) {
                    score += 10;
                } else {
                    score += 0;
                }
            }
            this.setVisible(false);
            new Score(score).setVisible(true);

        }

    }
}






