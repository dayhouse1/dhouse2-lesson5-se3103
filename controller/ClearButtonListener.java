package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClearButtonListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        App.model.shapes.clear();
        App.model.selectedIndex = -1;
        App.win.repaintCanvas();
    }
    
}
