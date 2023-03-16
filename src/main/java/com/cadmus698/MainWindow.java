package com.cadmus698;

import javax.swing.*;

import com.formdev.flatlaf.FlatDarkLaf;

import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class MainWindow extends JFrame{
    private JList list1;
    private JPanel window;

    public MainWindow(){
        setContentPane(window);
    }
    public static void main(String[] args) {
        GraphicsDevice device = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
        FlatDarkLaf.setup();
        MainWindow gui = new MainWindow();
        gui.setDefaultCloseOperation(EXIT_ON_CLOSE);
        gui.setTitle("Task Management");
        gui.setVisible(true);
        gui.pack();
    }
}
