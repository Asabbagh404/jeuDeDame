package controller;

import model.Grille;
import model.Player;

public class PlayerController {

    PlayerController(){
        Player player1 = new Player("Noire", true);
        Player player2 = new Player("Blanc", false);
    }

    public void nbrPionOfPlayer(Player player, Grille grille){
        int nbrColor = 0;
        for(int p = 0; p < grille.getTableau().length ; p++) {
            if (grille.getTableau()[p].getColor().equals(player.getColorOfPion()) && !grille.getTableau()[p].isDestroyed()){
                nbrColor++;
            }
        }

        player.setNbrOfPion(nbrColor);
        if (player.getNbrOfPion()==0){
            //lose();
        }
    }

    public void changeturn(Player player1,Player player2){
        player1.setTurn();
        player2.setTurn();
    }
}
