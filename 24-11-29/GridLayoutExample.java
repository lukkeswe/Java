import java.awt.*;
import javax.swing.*;


public class GridLayoutExample extends JFrame{
    public static void main(String[] args) {
        new GridLayoutExample();
    }

    GridLayoutExample(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(new GridLayout(2, 3));
        getContentPane().add(new JButton("1 January"));
        getContentPane().add(new JButton("2 February"));
        getContentPane().add(new JButton("3 March"));
        getContentPane().add(new JButton("4 April"));
        getContentPane().add(new JButton("5 May"));
        getContentPane().add(new JButton("6 June"));
        setSize(300, 200);
        setVisible(true);
    }
}
