package controller;

import model.Grille;
import model.Pion;
import view.GrilleView;

public class PionControleur {


    public void mouvement(String direction, int x, int y,Pion pion) {

                if (direction == "gauche") {
                    pion.setX(pion.getX() - 1);
                    pion.setY(pion.getY() - 1);
                    pion.setSelected(false);
                } else {
                    pion.setX(pion.getX() + 1);
                    pion.setY(pion.getY() - 1);
                    pion.setSelected(false);
                }


    }
}