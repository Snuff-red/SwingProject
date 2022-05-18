package my;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JButton button = new JButton("test");
        root.add(button);

        JLabel label = new JLabel("afanihao");
        root.add(label);

        root.add(new JLabel("afanihao.cn"));
    }
}
