package controller;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class QtyItemListener implements ItemListener {

    @Override
    public void itemStateChanged(ItemEvent e) {
        if (e.getStateChange() == ItemEvent.SELECTED){
        int qty = (Integer) e.getItem();
        App.model.addQty = qty;
    }
    }

   
    
}
