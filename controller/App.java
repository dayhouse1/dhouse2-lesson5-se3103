package controller;

import javax.swing.JFrame;

import model.ScreenModel;
import view.AppWindow;

public class App{

    public static final AppWindow win = new AppWindow();
    public static final ScreenModel model = new ScreenModel();

    public static void main(String[] args){
        win.setTitle("Interface Demo");
        win.setLocation(300,200);
        win.init();

        win.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        win.pack();
        win.setVisible(true);

    }
}