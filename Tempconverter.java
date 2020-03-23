import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Tempconverter extends JFrame{

    private static final long serialVersionUID = 1L;
    private JTextField bt1 = new JTextField("0");
    private JTextField bt2 = new JTextField("0");
    private JLabel lb1 = new JLabel("Calius :");
    private JLabel lb2 = new JLabel("Farenhi :");
    Tempconverter(){
        
        setLayout(new GridLayout(2,2));
        add(lb1);
        add(bt1);
            bt1.addActionListener(new handle());
        add(lb2);
        add(bt2);
            bt2.addActionListener(new handle());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,100);
    }

        class handle implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource() == bt1){
                    double temper = Double.parseDouble(bt1.getText());
                    System.out.println("Temp :"+temper);
                    System.out.println(change_C(temper));
                }
                if(e.getSource() == bt2){
                    double temper = Double.parseDouble(bt2.getText());
                    System.out.println("Temp :"+temper);
                    System.out.println(change_F(temper));
                }
           
            }
             public double change_C(double a) {
                return (a * 1.8) + 32;
            }
            public double change_F(double b) {
                return (b - 32) / 1.8;
            }
        }
}