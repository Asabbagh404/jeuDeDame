package model;

public class Pion {
    private int x;
    private int y;
    private String color;
    private int id;
    private boolean selected = false;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getid() {
        return id;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
    public boolean getSelected() {
        return selected;
    }

    public Pion(int x, int y, String color, int id) {
        this.x = x;
        this.y = y;
        this.color = color;
        this.id = id;
    }


    @Override
    public String toString() {
        return "model.Pion{" +
                "x=" + x +
                ", y=" + y +
                ", id=" + id +
                ", color='" + color + '\'' +
                '}';
    }


}
