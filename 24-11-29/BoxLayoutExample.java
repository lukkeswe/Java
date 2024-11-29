import java.awt.*;
import javax.swing.*;

public class BoxLayoutExample extends JFrame{
    public static void main(String[] args) {
        new BoxLayoutExample();
    }

    BoxLayoutExample (){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
        getContentPane().add(new JButton("1 January"));
        getContentPane().add(new JButton("2 February"));
        getContentPane().add(new JButton("3 March"));
        getContentPane().add(new JButton("4 April"));
        getContentPane().add(new JButton("5 May"));
        getContentPane().add(new JButton("6 June"));
        getContentPane().add(new JButton("7 July"));

        setSize(300, 250);
        setVisible(true);
    }
}
