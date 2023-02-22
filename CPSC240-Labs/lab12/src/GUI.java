import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static java.lang.Integer.parseInt;

public class GUI implements ActionListener {

    private JFrame frame;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private JTextField textField;

    public GUI(){
        frame = new JFrame();
        button = new JButton("Find factorial");
        label = new JLabel("Factorial is: ");
        panel = new JPanel();
        textField = new JTextField();

        button.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(textField);
        panel.add(button);
        panel.add(label);
        panel.setVisible(true);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Factorial GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GUI();
        }


    int factorial(int n){
        int count =1;
        for (int i=n; i>0; i--){
           count=  count*i;
        }
        return count;
    }

    public void actionPerformed(ActionEvent e){
        String input = textField.getText();;
        int num = parseInt(input);
        int fac= factorial(num);
        label.setText("Factorial is: "+ fac);
    }

}


