package model;

import controller.PlayerController;
import model.Pion;


public  class  Player {
    private static Player[] players = new Player[2];
    private String colorOfPion;
    private boolean turn;
    private Pion pion[];



    public Pion[] getPion() {
        return pion;
    }

    public void setPion(Pion[] pion) {
        this.pion = pion;
    }

    public String getColorOfPion() {
        return colorOfPion;
    }

    public void setColorOfPion(String colorOfPion) {
        this.colorOfPion = colorOfPion;
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
        pion = new Pion[12];
    }


    static public Player[] getTableau() {
        return players;
    }
}
