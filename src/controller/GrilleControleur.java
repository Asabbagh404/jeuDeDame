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

    public int findPion(int x, int y){
            int idofPion = 0;
            for(int p = 0; p < grille.getTableau().length ; p++) {
                if ((grille.getTableau()[p].getX()== x) && (grille.getTableau()[p].getY()== y)  ){

                    grille.getTableau()[p].setSelected(true);
                    idofPion = grille.getTableau()[p].getid();

                }else{
                    grille.getTableau()[p].setSelected(false);
                }
        }
        grilleView.repaint();
        return idofPion;
    }

    public void findSelectedZone( int x, int y){
        PionControleur pionControleur = new PionControleur();
        boolean has = false;
            if ((selectedCase.getSelPosxG()== x) && (selectedCase.getSelPosxyG()== y)) {
                if (hasPionOnZoneSel(x,y)){has=true;}
                if (SameColor(grille.getTableau()[findPion(x, y)], grille.getTableau()[selectedCase.getIdPion()])){
                        pionControleur.mouvement("gauche", has, grille.getTableau()[selectedCase.getIdPion()], grille.getTableau()[findPion(x, y)]);
                    }else{System.out.println("nop");}
            }else if ((selectedCase.getSelPosxD()== x) && (selectedCase.getSelPosxyD()== y) ){
               if (hasPionOnZoneSel(x,y)){has=true;}
                if (SameColor(grille.getTableau()[findPion(x, y)], grille.getTableau()[selectedCase.getIdPion()])) {
                    pionControleur.mouvement("droite", has, grille.getTableau()[selectedCase.getIdPion()], grille.getTableau()[findPion(x, y)]);
                }else{System.out.println("nop");}
                }
            else{
                selectedCase.resetSelectedCase();
                grilleView.repaint();

            }
        grille.getTableau()[selectedCase.getIdPion()].setSelected(false);
        selectedCase.resetSelectedCase();
        grilleView.repaint();

        }

    public boolean hasPionOnZoneSel(int x,int y){
        return findPion(x, y) != 0;
    }

    public boolean SameColor(Pion pion1, Pion pion2){
        return pion1.getColor()!=pion2.getColor();
    }

    //Getters
    public GrilleView getGrilleView()
    {
        return grilleView;
    }

}