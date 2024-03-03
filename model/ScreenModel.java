package model;

import java.util.ArrayList;

import view.AppWindow;

public class ScreenModel {
    public ArrayList<Containable> shapes = new ArrayList<>();
public int selectedIndex = -1;
public String shapeType = AppWindow.shapeActionCommand[0];
public int addQty = 1;

}
