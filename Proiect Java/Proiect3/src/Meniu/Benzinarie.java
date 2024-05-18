/*Lihat Radu-Andrei, Covaci Catalin*/
package Meniu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Tipuri.Tipuri_Benzina;
import Tipuri.Tipuri_Motorina;
import Magazin.Magazin;

public class Benzinarie extends JFrame{
    private JLabel benzinarieLabel;
    private JButton buttonBenzina;
    private JPanel jpanel;
    private JButton motorinaButton;
    private JButton magazinButton;
    private JLabel imagine1;
    private ImageIcon Benzina;
    private ImageIcon benz;

    public Benzinarie(String title){
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(jpanel);
        setBounds(5,5,650,450);
        Imagini();
        this.pack();


        buttonBenzina.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tipuri_Benzina tipuri_benzina = new Tipuri_Benzina() {
                    @Override
                    public int CO95_fara_plumb() {
                        return 0;
                    }

                    @Override
                    public int CO98_fara_plumb() {
                        return 0;
                    }
                };
                tipuri_benzina.setVisible(true);
            }
        });
        motorinaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Tipuri_Motorina tipuri_motorina = new Tipuri_Motorina();
                tipuri_motorina.setVisible(true);
            }
        });
        magazinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin mg = new Magazin();
                mg.setVisible(true);
               // dispose();
            }
        });
    }
    public void Imagini(){
        setLayout(new FlowLayout());
        Benzina = new ImageIcon(getClass().getResource("/Benzina.png"));
        imagine1 = new JLabel(Benzina);
        benz = new ImageIcon(getClass().getResource("/benzinarie.png"));
        benzinarieLabel = new JLabel(benz);
        add(imagine1);
        add(benzinarieLabel);
    }
}
