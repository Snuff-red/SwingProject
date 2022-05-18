package my;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;

public class MyDemo {
    public static void main(String[] args){
        JFrame frame=new JFrame("Swing Example 222");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel root=new JPanel();
        frame.setContentPane(root);

        JButton button=new JButton("test");
        root.add(button);

        JLabel label=new JLabel("afanihao");
        root.add(label);

        root.add(new JLabel("afanihao.cn"));

        frame.setSize(400,300);
        frame.setVisible(true);
    }
}
