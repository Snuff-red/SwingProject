package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame{
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        JComboBox colorField=new JComboBox();
        root.add(colorField);

        colorField.addItem("Blue");
        colorField.addItem("Red");
        colorField.addItem("Green");

        colorField.setSelectedIndex(2);

        JButton testButton=new JButton("test");
        root.add(testButton);

        testButton.addActionListener((e)->{
            test();
        });
    }
    public void test(){
        int index=colorField.getSelectedIndex();
    }
}

