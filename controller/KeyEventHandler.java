package controller;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import model.MyShape;
import model.StadiumShape;

public class KeyEventHandler implements KeyListener {

    static final int UNIT = 5;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int selectedIndex = App.model.selectedIndex;
        if (selectedIndex < 0)
            return;

        int dx = 0, dy = 0;
        switch (e.getKeyCode()) {
            case KeyEvent.VK_UP:
                dy = -UNIT;
                break;
            case KeyEvent.VK_DOWN:
                dy = UNIT;
                break;
            case KeyEvent.VK_LEFT:
                dx = -UNIT;
                break;
            case KeyEvent.VK_RIGHT:
                dx = UNIT;
                break;
        }
        var s = App.model.shapes.get(selectedIndex);
        if (s instanceof MyShape){
            var shape = (MyShape) s;
            shape.translate(dx, dy);
        }
        else if (s instanceof StadiumShape){
            var shape = (StadiumShape) s;
            shape.translate(dx, dy);
        }
        App.win.repaintCanvas();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
