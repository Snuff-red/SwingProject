package my;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyFrame extends JFrame{
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JButton button = new JButton("test");
        root.add(button);

        button.addActionListener(new MyActionListener());
	}

	private class MyActionListener implements ActionListener{
		public void  actionPerformed(ActionEvent e){
			System.out.println("*** 被点击了!");
		}
	}
}
