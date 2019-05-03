package view;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import controller.mouseEventController;

import controller.GrilleControleur;
import model.Pion;

public class MainView extends JFrame {

    public void DessinerGrille(GrilleView grilleView, GrilleControleur grilleControleur) {

        grilleView.addMouseListener(new MouseAdapter() {// provides empty implementation of all
            // MouseListener`s methods, allowing us to
            // override only those which interests us
            @Override //I override only one method for presentation
            public void mousePressed(MouseEvent e) {
                mouseEventController.setX(e.getX());
                mouseEventController.setY(e.getY());
                System.out.println(mouseEventController.getX() + "," + mouseEventController.getY());

                grilleControleur.findPion(mouseEventController.getX(), mouseEventController.getY());


            }
        });
        this.setContentPane(grilleView);
    }

    public void WindowBuilder() {

        this.setTitle("Jeu de dame");
        this.setSize(655, 678);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);


    }


}
