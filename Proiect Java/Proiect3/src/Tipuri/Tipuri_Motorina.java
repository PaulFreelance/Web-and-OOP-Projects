package Tipuri;

import Interfaces.Motorina;
import Magazin.Magazin;
import Meniu.Benzinarie;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;


public class Tipuri_Motorina extends Container implements Motorina {
    private JPanel motorinaPanel;
    private JRadioButton extraRadioButton;
    private JRadioButton superioaraRadioButton;
    private JRadioButton standardRadioButton;
    private JSlider slider1;
    private JTextField a1102030TextField;
    private JButton platesteButton;
    private Object dealer;

    public Tipuri_Motorina() {
        JFrame frame = new JFrame("Motorina");
        frame.setContentPane(motorinaPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        motorinaPanel.setPreferredSize(new Dimension(650,450));
        frame.pack();
        frame.setVisible(true);

        platesteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin m = new Magazin();
                m.setVisible(true);
            }
        });
    }


    @Override
    public int Superioara() {
        return 0;
    }

    @Override
    public int Standard() {
        return 0;
    }

    @Override
    public int Extra() {
        return 0;
    }

    public void itemStateChanged(ItemEvent e) {
        String name = standardRadioButton.getText().split(" - RON ")[0];
        String value = standardRadioButton.getText().split(" - RON ")[1];
    }
     {
        String name = extraRadioButton.getText().split(" - RON ")[0];
        String value = extraRadioButton.getText().split(" - RON ")[1];
    }
   {
        String name = superioaraRadioButton.getText().split(" - RON ")[0];
        String value = superioaraRadioButton.getText().split(" - RON ")[1];
    }
}


