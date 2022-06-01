package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        root.setLayout(null);

        ColorLabel a1=new ColorLabel("ABC",Color.CYAN);

        root.add(a1);

        a1.setBounds(200,30,100,50);
    }

    private static class ColorLabel extends JLabel {
        public ColorLabel(String text, Color bgColor) {
            this.setText(text);
            this.setOpaque(true);
            this.setBackground(bgColor);
            this.setPreferredSize(new Dimension(60, 30));
            this.setHorizontalAlignment(SwingConstants.CENTER);
        }
    }
}
