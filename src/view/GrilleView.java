package view;


import model.Grille;
import model.Pion;
import model.selectedCase;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Graphics;
import javax.swing.JPanel;



public class GrilleView extends JPanel  {


    Image backgroundImage;
    BufferedImage pionImage;
    BufferedImage caseImage;
    Grille grille;





    public void setBackgroundImage(String filename) {
        try {
            this.backgroundImage = ImageIO.read(new File(filename));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void setPionImage(String filename)
    {
        try {
            this.pionImage = ImageIO.read(new File(filename));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void setCaseImage(String filename)
    {
        try {
            this.caseImage = ImageIO.read(new File(filename));
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    public void paintComponent(Graphics g){

            // backgroundImage = ImageIO.read(new File("samples/plateau.jpg"));
            setBackgroundImage("samples/wood-board_d200.png");
            g.drawImage(backgroundImage, 0, 0, this);
            setCaseImage("samples/case.png");

            //g.drawImage(pionImage, grille.getTableau()[0].getX()*72,grille.getTableau()[0].getY()*72, null);
            //g.drawImage(pionImage, grille.getTableau()[1].getX()*72,grille.getTableau()[0].getY()*72, null);
            for(Pion p : grille.getTableau())
            {
                if (p.getColor().equals("Blanc")){
                    setPionImage("samples/wood-piece-1_d200.png");
                    // Creations des carré bleu lors de la selection
                        if (p.getSelected() && !p.isDestroyed()){
                            selectedCase.setted4White(p);
                            g.drawImage(caseImage,p.getX()*80+80, p.getY()*80+80, null);
                            g.drawImage(caseImage,p.getX()*80-80, p.getY()*80+80, null);

                        }
                }else{
                    setPionImage("samples/wood-piece-2_d200.png");
                    if (p.getSelected() && !p.isDestroyed()){
                        // Creations des carré bleu lors de la selection
                        selectedCase.setted4Black(p);
                        g.drawImage(caseImage,selectedCase.getSelPosxD()*80, selectedCase.getSelPosxyD()*80, null);
                        g.drawImage(caseImage,selectedCase.getSelPosxG()*80, selectedCase.getSelPosxyG()*80, null);

                        }
                    }
                if (!p.isDestroyed()) {
                    g.drawImage(pionImage, p.getX() * 80, p.getY() * 80, null);
                }
            }




            //Pour une image de fond
            //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
    }


    public void setGrille(Grille grille)
    {
        this.grille = grille;
    }



}