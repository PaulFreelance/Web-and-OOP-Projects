package Tipuri;

import Interfaces.Benzina;
import Magazin.Magazin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;

public abstract class Tipuri_Benzina extends Container implements Benzina {
    public JPanel panelBenzina;
    private JRadioButton extra_99RadioButton;
    private JRadioButton CO98_fara_plumbRadioButton;
    private JRadioButton CO95_fara_plumbRadioButton;
    private JRadioButton standard_95RadioButton;
    private JSlider slider1;
    private JTextField a1102030TextField;
    private JPanel pret;
    private JButton platesteButton;

    public Tipuri_Benzina(){
        JFrame frame = new JFrame("Benzina");
        frame.setContentPane(panelBenzina);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelBenzina.setPreferredSize(new Dimension(650,450));
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
    public int Standard_95() {
        return 0;
    }

    @Override
    public int Extra_99() {
        return 0;
    }

    public void itemStateChanged(ItemEvent e) {
        String name = standard_95RadioButton.getText().split(" - RON ")[0];
        String value = standard_95RadioButton.getText().split(" - RON ")[1];
    }
    {
        String name = extra_99RadioButton.getText().split(" - RON ")[0];
        String value = extra_99RadioButton.getText().split(" - RON ")[1];
    }
    {
        String name = CO95_fara_plumbRadioButton.getText().split(" - RON ")[0];
        String value = CO95_fara_plumbRadioButton.getText().split(" - RON ")[1];
    }
    {
        String name = CO98_fara_plumbRadioButton.getText().split(" - RON ")[0];
        String value = CO98_fara_plumbRadioButton.getText().split(" - RON ")[1];
    }
}
