package top.zxk.javaswing.basic;


import javax.swing.*;
import java.awt.*;

public class SimpleEx extends JFrame{
    public SimpleEx(){
        initUI();
    }
    private void initUI(){

        setTitle("Simple example");
        setSize(300,200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var ex = new SimpleEx();
            ex.setVisible(true);
        });
    }
}
