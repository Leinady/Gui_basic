package JPanal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class GUI extends JFrame {
    
    private static final long serialVersionUID = 1L;
    JPanel jp1 = new JPanel();
    JPanel jp2 = new JPanel();
    JPanel jp3 = new JPanel();
    private JButton bt1 = new JButton("Confirm");
    private final JLabel jl_1 = new JLabel("Choose your Ferrari");
    private JLabel IMA = new JLabel(new ImageIcon("Ferrari-Logo.jpg"));
    private JLabel GIF = new JLabel(new ImageIcon("giphy.gif"));
    private String names[] = {"F8 Tributo","812 superfast","488 ltalia"};
    // private JLabel jl_3 = new JLabel();
    // private JLabel jl_4 = new JLabel(); 
    private JComboBox box = new JComboBox(names);
   // private ImageIcon icons[];
   // private JLabel label;

    public GUI() {
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(3, 1));

        jp1.setLayout(new BoxLayout(jp1, BoxLayout.LINE_AXIS));
            jp1.add(IMA);

        jp2.setLayout(new FlowLayout(FlowLayout.CENTER));
            jp2.add(jl_1);
            jp2.add(box);
            jp2.add(bt1);
                bt1.addActionListener(new Handle());

        jp3.setLayout(new GridLayout(1,1));  
            jp3.add(GIF);  

        c.add(jp1);
        c.add(jp2);
        c.add(jp3);
        setTitle("Ferrari");
        setSize(800, 600);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

        class Handle implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bt1) {
               System.out.println("Good Choice");

            }
        }
        
    }
    public static void main(String[] args) {
        new GUI();
    }

}