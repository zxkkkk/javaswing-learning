package top.zxk.javaswing.basic;

import javax.swing.*;
import java.awt.*;

public class FrameIconEx extends JFrame {

    public FrameIconEx() {

        initUI();
    }

    private void initUI() {

        var webIcon = new ImageIcon("src/resources/web.png");

        setIconImage(webIcon.getImage());

        setTitle("Icon");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new FrameIconEx();
            ex.setVisible(true);
        });
    }
}
