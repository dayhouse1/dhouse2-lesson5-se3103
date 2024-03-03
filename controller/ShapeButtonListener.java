package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShapeButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        App.model.shapeType = e.getActionCommand();
    }
}
