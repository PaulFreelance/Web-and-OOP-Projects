package Meniu;

import Database.Connect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Plata extends Container{
    private JPanel plataPanel;
    private JButton confirmaButton;
    private JLabel factura;
    String jdbcUrl="jdbc:sqlite:/C:\\Users\\Cristian\\Desktop\\sqllite\\sqlite-tools-win32-x86-3360000";
    Connection connection= Connect.connect();


    public Plata() {
        Connect.connect();
        JFrame frame = new JFrame("Factura");
        frame.setContentPane(plataPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        plataPanel.setPreferredSize(new Dimension(650,450));
        frame.pack();
        frame.setVisible(true);

        try
        {
            Connection connection= DriverManager.getConnection(jdbcUrl);
            String sql="Select";
            Statement statement=connection.createStatement();
            ResultSet result= statement.executeQuery(sql);
            while(result.next()){
                String nume= result.getString("nume");
                String pret= result.getString("pret");
                String bucati=result.getString("bucati");
                factura.setText("produsul:"+nume+"\npretul de: "+pret+"\n cu "+ bucati+"bucati");
            }
        }
        catch(SQLException e){
            System.out.println("A aparut o eroare la conectarea la baza de date");
            e.printStackTrace();
        }
        confirmaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String rasp = JOptionPane.showInputDialog("Alimentarea dumneavoastra a avut nevoie de....litri");
                int comb = Integer.parseInt(rasp);
                JOptionPane.showInputDialog("In valoare de....");
                int pret = 8;
                int total = comb * pret;
                String rasp2 = "Va costa in total"+total+"\t\tde lei";
                JOptionPane.showMessageDialog(null, rasp2);
                JOptionPane.showMessageDialog(null, "Comanda a fost inregistrata, multumim pentru ca ne-ati ales");
                frame.setVisible(false);
            }
        });
    }
}
