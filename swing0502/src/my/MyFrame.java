package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame{
    JCheckBox agreeField=new JCheckBox("同意用户协议");
    JButton nextButton=new JButton("下一步");
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);


        root.add(agreeField);
        root.add(nextButton);

        agreeField.setSelected(false);
        nextButton.setEnabled(false);

        agreeField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(agreeField.isSelected()){
                    nextButton.setEnabled(true);
                }
                else{
                    nextButton.setEnabled(false);
                }
            }
        });
    }
}

