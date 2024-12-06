import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MultiButtonExample extends JFrame implements ActionListener {
    public static void main(String[] args) {
        new MultiButtonExample();
    }

    JButton button1;
    JButton button2;

    MultiButtonExample() {
        button1 = new JButton("ボタン１");
        button1.addActionListener(this);
        getContentPane().add(BorderLayout.WEST, button1);

        button2 = new JButton("ボタン２");
        button2.addActionListener(this);
        getContentPane().add(BorderLayout.EAST, button2);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == button1){
            System.out.println("ボタン１を押されました");
        } else if(ae.getSource() == button2) {
            System.out.println("ボタン２を押されました");
        }
    }
}
