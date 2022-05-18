package my;
import javax.swing.JFrame;

public class MyDemo {
    public static void main(String[] args){

        JFrame frame=new MyFrame("Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
