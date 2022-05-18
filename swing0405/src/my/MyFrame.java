package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame{
    JLabel timeLabel=new JLabel("00:00:00");
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JButton button = new JButton("test");
        root.add(button);

        root.add(timeLabel);

        button.addActionListener((e)->{
            showTime();
        });
	}
    public void showTime(){
        SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
        String timeStr=sdf.format(new Date());
        System.out.println(timeStr);

        timeLabel.setText(timeStr);
    }
}
