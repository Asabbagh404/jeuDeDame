package controller;

import model.Grille;
import model.Pion;
import model.selectedCase;
import view.GrilleView;
import view.MainView;


public class GrilleControleur {

    private Grille grille;
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
        String Direction = GorD(x,y);
        boolean hasPionFurther = hasPionFurther(x,y,grille.getTableau()[selectedCase.getIdPion()],Direction);

            if (!Direction.equals("none")) {
                if (hasPionOnZoneSel(x,y)){has=true;}
                if (has && hasPionFurther){
                    return;
                }
                if (SameColor(grille.getTableau()[findPion(x, y)], grille.getTableau()[selectedCase.getIdPion()])){
                        pionControleur.mouvement(Direction, has, grille.getTableau()[selectedCase.getIdPion()], grille.getTableau()[findPion(x, y)]);
                    }else{System.out.println("nope");}
            }
        grille.getTableau()[selectedCase.getIdPion()].setSelected(false);
        selectedCase.resetSelectedCase();
        grilleView.repaint();

        }

    private boolean hasPionOnZoneSel(int x,int y){
        return findPion(x, y) != 0;
    }

    private boolean SameColor(Pion pion1, Pion pion2){
        if (pion1.getid()==0){
            return true;
        }
        return !pion1.getColor().equals(pion2.getColor());
    }

    //Getters
    public GrilleView getGrilleView()
    {
        return grilleView;
    }
    private boolean hasPionFurther(int x,int y,Pion pion, String direction){
        int addY = 2;
        int addX = 2;
        if (direction.equals("gauche")) {
            addX = -2;
        }
        if (pion.getColor().equals("blanc")) {
            addY = -2;
        }
        return findPion(x + addX, y + addY) == 0;
    }

    private String GorD(int x, int y){
        if ((selectedCase.getSelPosxG()== x) && (selectedCase.getSelPosxyG()== y)) {
            return "gauche";
        }else if ((selectedCase.getSelPosxD()== x) && (selectedCase.getSelPosxyD()== y) ){
            return "droite";
        }
        return "none";
    }

}