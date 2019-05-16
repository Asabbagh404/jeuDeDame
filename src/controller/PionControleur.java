package controller;

import model.Grille;
import model.Pion;
import model.selectedCase;
import view.GrilleView;

public class PionControleur {


    public void mouvement(String direction, boolean has, Pion pion, Pion toDestroy) {
        int addIt = 0;
        boolean RightToMove = true;
        if (has){
            addIt=1;
        }
        System.out.println(selectedCase.getSelPosxD()+ addIt);
        if ((direction.equals("droite") && selectedCase.getSelPosxD()+ addIt >= 8) || (direction.equals("gauche") && selectedCase.getSelPosxG()- addIt < 0)  ){
            RightToMove=false;

        }
        if ((selectedCase.getSelPosxyD()+ addIt >= 8) || (selectedCase.getSelPosxyG()- addIt < 0)  ){
            RightToMove=false;

        }

       if (RightToMove){

           if(has){ toDestroy.setDestroyed(true);}
            if (pion.getColor().equals("Noir")) {
                pion.setY(pion.getY() - 1 - addIt);
                pion.setSelected(false);

            }else{
                pion.setY(pion.getY() + 1 + addIt);
                pion.setSelected(false);
            }
            if (direction == "gauche") {
                    pion.setX(selectedCase.getSelPosxG() - addIt);
                } else {
                    pion.setX(selectedCase.getSelPosxD()+ addIt);
                }
        }
    }

  }