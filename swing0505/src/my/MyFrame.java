package my;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyFrame extends JFrame {
    public MyFrame(String title) {
        super(title);
        JPanel root = new JPanel();
        this.setContentPane(root);

        ColorLabel a1=new ColorLabel("1",Color.YELLOW);
        ColorLabel a2=new ColorLabel("2",Color.GREEN);
        ColorLabel a3=new ColorLabel("3",Color.LIGHT_GRAY);
        ColorLabel a4=new ColorLabel("4",Color.BLUE);

        root.add(a1);
        root.add(a2);
        root.add(a3);
        root.add(a4);
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
