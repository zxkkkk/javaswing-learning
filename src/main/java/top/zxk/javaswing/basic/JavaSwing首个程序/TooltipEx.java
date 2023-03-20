package top.zxk.javaswing.basic;

import javax.swing.*;
import java.awt.*;

public class TooltipEx extends JFrame {

    public TooltipEx(){

        initUI();
    }

    private void initUI(){

        var btn = new JButton("Button");
        btn.setToolTipText("A button component");

        createLayout(btn);

        setTitle("Tooltip");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void createLayout(JComponent... arg){
        var pane = (JPanel) getContentPane();
        var gl = new GroupLayout(pane);
        pane.setLayout(gl);

        pane.setToolTipText("Content pane");

        gl.setAutoCreateContainerGaps(true);

        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addComponent(arg[0])
                .addGap(200)
        );
        pack();
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            var ex = new TooltipEx();
            ex.setVisible(true);
        });
    }
}
