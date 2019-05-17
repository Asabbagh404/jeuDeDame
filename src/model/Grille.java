package model;
import model.Player;
import controller.GrilleControleur;

public class Grille {
    // Attributs
    //private static Grille grille;
    private Pion[] tableau;

    //Constructeurs
    public Grille(int nbCase) {
        this.tableau =  new Pion[nbCase];
        createGrille();
    }


    //Méthodes


    /*  Tableau et creation pion */

    public void createGrille() {
        //grille = new Grille(40);
        creationPion();
        /*grille.selectPion(3,4,"noir");*/
    }

    public void creationPion() {
        int x = -2;
        int y = 0;

        for (int p = 0; p < tableau.length; p++) {
            if (p % 4 == 0 && p != 0) {
                y++;
                if (y % 2 == 1) {
                    x = 1;
                } else {
                    x = 0;
                }
            } else {
                x = x + 2;
                if (x >= 8) {
                    x = 0;
                }
            }
            if (p == tableau.length / 2) {
                y = 5;
            }
            if (p >= tableau.length / 2) {
                tableau[p] = new Pion(x, y, "Noir", p);

            } else {
                tableau[p] = new Pion(x, y, "Blanc", p);

            }
            if (p==24){
                tableau[24] = new Pion(-10, -10, "none", p);
            }

        }
        for (int p = 0; p < tableau.length; p++){
            System.out.println(tableau[p]);
     }
    }

    //Getters
    //public static Grille getGrille() { return  grille; }
    public Pion[] getTableau() {
        return tableau;
    }

    //Setters
   // public void setGrille(Grille grille) { this.grille = grille; }
    public void setTableau(Pion[] tableau) {
        this.tableau = tableau;
    }



    @Override
    public String toString() {
        String strig = "";
        for(int i = 0; i<tableau.length; i++){
            strig += tableau[i] + "\n";
        }
        return "model.Grille{" +
                "Tableau=" + strig +
                '}';
    }

}
