package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame{
    JTextField textField=new JTextField(20);
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        root.add(textField);

        JButton button=new JButton("OK");
        root.add(button);
        button.addActionListener((e)->{
            test();
        });
    }

    public void test(){
        String str=textField.getText();
        System.out.println(str);
    }
}
