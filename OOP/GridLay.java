import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // GridLayout - places components in a grid of cells
        //              each component takes all the available space within its cell
        //              and each cell is the same size

        // new MyFrame();

        JFrame frame = new JFrame();
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        
        frame.setLocationRelativeTo(null);
        frame.setTitle("Grid Layout");
        frame.setResizable(false);
        frame.setLayout(new GridLayout(3,3,10,10)); // row and column || horizontal and vertical spacing

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));

        frame.setVisible(true);

    }
}
