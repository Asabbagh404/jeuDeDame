package controller;

import model.Grille;
import model.Pion;
import model.selectedCase;
import model.Player;
import view.GrilleView;
import view.MainView;


public class GrilleControleur {

    private Grille grille;
    GrilleView grilleView;
    Player player1 = new Player("Noire", true);
    Player player2 = new Player("Blanc", false);

    public GrilleControleur(){
        grille = new Grille(25);
        grilleView = new GrilleView();
        grilleView.setGrille(grille);

    }

    public int findPion(int x, int y){
            int idofPion = 24;
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
        Player playerAct;


            if (!Direction.equals("none")) {
                boolean hasPionFurther = hasPionFurther(x,y,grille.getTableau()[selectedCase.getIdPion()],Direction);
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
        return findPion(x, y) != 24;
    }

    private boolean SameColor(Pion pion1, Pion pion2){
        if (pion1.getid()==24){

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
        int addY = -1;
        int addX = 1;
        if (direction.equals("gauche")) {
            addX = -1;
        }
        if (pion.getColor().equals("Blanc")) {
            addY = 1;
        }

        return findPion(x + addX, y + addY) != 24;
    }

    private String GorD(int x, int y){
        if ((selectedCase.getSelPosxG()== x) && (selectedCase.getSelPosxyG()== y)) {
            return "gauche";
        }else if ((selectedCase.getSelPosxD()== x) && (selectedCase.getSelPosxyD()== y) ){
            return "droite";
        }
        return "none";
    }


    private void WhoWin(Player player1, Player player2){

    }


}