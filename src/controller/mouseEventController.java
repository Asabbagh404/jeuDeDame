package controller;

import java.awt.*;
import java.awt.event.*;
public class mouseEventController {

    public static int x;

    public static int y;

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        mouseEventController.x = x/80;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        mouseEventController.y = y/80;
    }


}
