package controller;

import model.Grille;
import model.Pion;
import model.selectedCase;
import view.GrilleView;
import view.MainView;


public class GrilleControleur {

    public Grille grille;
    GrilleView grilleView;

    public GrilleControleur(){
        grille = new Grille(24);
        grilleView = new GrilleView();
        grilleView.setGrille(grille);
    }

    public void findPion(int x, int y){

            for(int p = 0; p < grille.getTableau().length ; p++) {
                if ((grille.getTableau()[p].getX()== x) && (grille.getTableau()[p].getY()== y)  ){
                    System.out.println("Pion trouvé !" + grille.getTableau()[p]);
                    grille.getTableau()[p].setSelected(true);
                }else{
                    grille.getTableau()[p].setSelected(false);
                }
        }

        grilleView.repaint();

    }

    public void findSelectedZone( int x, int y){
        PionControleur pionControleur = new PionControleur();

            if ((selectedCase.getSelPosxG()== x) && (selectedCase.getSelPosxyG()== y)) {
                for(int p = 0; p < grille.getTableau().length ; p++) {
                    if((grille.getTableau()[p].getX()==x+1) && (grille.getTableau()[p].getY()==y+1)) {
                        pionControleur.mouvement("gauche", x, y, grille.getTableau()[p]);
                        grille.getTableau()[p].setSelected(false);
                        selectedCase.resetSelectedCase();
                        grilleView.repaint();
                    }
                }
            }
            else if ((selectedCase.getSelPosxD()== x) && (selectedCase.getSelPosxyD()== y) ){
                for(int p = 0; p < grille.getTableau().length ; p++) {
                    if((grille.getTableau()[p].getX()==x-1) && (grille.getTableau()[p].getY()==y+1)) {
                        pionControleur.mouvement("droite", x, y, grille.getTableau()[p]);
                        grille.getTableau()[p].setSelected(false);
                        selectedCase.resetSelectedCase();
                        grilleView.repaint();
                    }
                }
            }else{
                selectedCase.setSelPosxG(0);
                selectedCase.setSelPosxyG(0);
                selectedCase.setSelPosxD(0);
                selectedCase.setSelPosxyD(0);
                grilleView.repaint();

            }

        }


    //Getters
    public GrilleView getGrilleView()
    {
        return grilleView;
    }

}