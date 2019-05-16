package model;

import model.Pion;


public class Player {
    private String colorOfPion;
    private int nbrOfPion;
    private boolean turn;

    public String getColorOfPion() {
        return colorOfPion;
    }

    public void setColorOfPion(String colorOfPion) {
        this.colorOfPion = colorOfPion;
    }

    public int getNbrOfPion() {
        return nbrOfPion;
    }

    public void setNbrOfPion(int nbrOfPion) {
        this.nbrOfPion = nbrOfPion;
    }

    public boolean isTurn() {
        return turn;
    }

    public void setTurn() {
        this.turn = !this.turn;
    }

    public Player(String colorOfPion, boolean turn) {
        this.colorOfPion = colorOfPion;
        this.turn = turn;
    }
}
