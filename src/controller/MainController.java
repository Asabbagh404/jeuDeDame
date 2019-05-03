package controller;
import com.sun.tools.javac.Main;
import view.GrilleView;
import view.MainView;


import javax.swing.*;


public class MainController extends JFrame {
    MainView mainView;
    GrilleControleur grilleControleur;
    PionControleur pionControleur;

    public void Run() {
        Instance();
        mainView.WindowBuilder();




        mainView.DessinerGrille(grilleControleur.getGrilleView(), grilleControleur);
        //mainView.DessinerGrille();
        /*
        WindowBuilder();
        DessinerGrille();*/
    }

    public void Instance() {
        mainView = new MainView();
        grilleControleur = new GrilleControleur();
        pionControleur = new PionControleur();
        //PionControleur.mouvement( grilleControleur.findPion(1,1,"noir"),false);
    }
}