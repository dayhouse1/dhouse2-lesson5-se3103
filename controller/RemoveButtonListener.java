package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class RemoveButtonListener implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent e) {
        if(App.model.selectedIndex < 0){
            JOptionPane.showMessageDialog(App.win, "Select Shape to Delete");
            return;
        }
        App.model.shapes.remove(App.model.selectedIndex);
        App.model.selectedIndex = -1;
        App.win.repaintCanvas();
    }
    
}
