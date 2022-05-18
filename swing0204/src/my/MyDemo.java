package my;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MyDemo {
    public static void main(String[] args){
        //JFrame frame=new JFrame("Swing Example 222");

        MyFrame frame=new MyFrame("哈哈");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
