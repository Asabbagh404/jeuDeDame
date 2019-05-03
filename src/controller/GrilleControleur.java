package controller;

import model.Grille;
import model.Pion;
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
                    System.out.println("Pion trouvé !");
                    grille.getTableau()[p].setSelected(true);
                }else{
                    grille.getTableau()[p].setSelected(false);
                }
        }

        grilleView.repaint();

    }

    public void findSelectedZone(int x, int y){

        for(int p = 0; p < grille.getTableau().length ; p++) {
            if ((grille.getTableau()[p].getX()== x+1) && (grille.getTableau()[p].getY()== y-1)
                    && (grille.getTableau()[p].getSelected()) && (grille.getTableau()[p].getColor()=="Noir") ) {
                //grille.getTableau()[p].mouvement(droite,x,y, grille)
            }
            else if ((grille.getTableau()[p].getX()== x-1) && (grille.getTableau()[p].getY()== y-1)
                        && (grille.getTableau()[p].getSelected())&& (grille.getTableau()[p].getColor()=="Noir") ){
                //grille.getTableau()[p].mouvement(gauche,x,y, grille)
            }else{

            }
        }

        grilleView.repaint();

    }

    //Getters
    public GrilleView getGrilleView()
    {
        return grilleView;
    }

}