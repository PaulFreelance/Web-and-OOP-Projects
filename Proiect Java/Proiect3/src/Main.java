/*Lihat Radu-Andrei*/
import Database.Connect;
import Magazin.Magazin;
import Meniu.Benzinarie;
import Tipuri.Tipuri_Benzina;
import Tipuri.Tipuri_Motorina;

import javax.swing.JFrame;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try{
                    JFrame frame = new Benzinarie("Benzinarie");
                    frame.setSize(750,550);
                    frame.setVisible(true);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
            }
        });

    }
}
