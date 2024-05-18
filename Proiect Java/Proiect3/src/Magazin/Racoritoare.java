/*Lihat Paul-Sorin*/
package Magazin;

import Database.Connect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Racoritoare extends JFrame{
    private JButton Adauga;
    private JButton renunta;
    private JTextField textNum;
    private JTextField textPR;
    private JTextField textBuc;
    private JTextField textTip;
    private JButton INAPOIButton;
    private JPanel panel3;
    private JLabel imgmeniu;
    private JTable tableBauturi;
    private ImageIcon rac;

    PreparedStatement ps = null;
    Connection con=Connect.connect();

    public Racoritoare() {
        Connect.connect();
        JFrame frame = new JFrame("Magazin");
        frame.setContentPane(panel3);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel3.setPreferredSize(new Dimension(650,450));
        Imagini();
        frame.pack();

        frame.setVisible(true);
        Adauga.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume, pret, bucati,tip;
                nume = textNum.getText();
                pret = textPR.getText();
                bucati = textBuc.getText();
                tip = textTip.getText();
                try{
                    String sql = "INSERT INTO drinks(nume,pret,bucati,tip) VALUES(?,?,?,?)";
                    ps = con.prepareStatement(sql);
                    ps.setString(1, nume);
                    ps.setString(2, pret);
                    ps.setString(3, bucati);
                    ps.setString(4,tip);
                    ps.executeUpdate();
                    textNum.setText("");
                    textPR.setText("");
                    textBuc.setText("");
                    textTip.setText("");
                    textNum.requestFocus();
                    JOptionPane.showMessageDialog(null,"Adaugat in cos!");
                }catch (SQLException ex){
                    ex.printStackTrace();
                }
            }
        });
        renunta.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nume,pret,bucati,tip;
                nume = textNum.getText();
                pret = textPR.getText();
                bucati = textBuc.getText();
                tip = textTip.getText();
                try{
                    String sql = "DELETE FROM drinks WHERE nume = ? ";
                    ps = con.prepareStatement(sql);
                    ps.setString(1,nume);
                    ps.setString(2, pret);
                    ps.setString(3,bucati);
                    ps.setString(4,tip);
                    textNum.setText("");
                    textPR.setText("");
                    textBuc.setText("");
                    textTip.setText("");
                    textNum.requestFocus();
                    JOptionPane.showMessageDialog(null,"Ai renuntat!");
                }catch (SQLException ex){
                    ex.printStackTrace();
                }finally {
                    try {
                        ps.close();
                        con.close();
                    }catch (SQLException e2){
                        e2.printStackTrace();
                    }
                }
            }
        });
        INAPOIButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Magazin mg = new Magazin();
                mg.setVisible(true);
                //dispose();
            }
        });
    }
    public void Imagini(){
        setLayout(new FlowLayout());
        rac = new ImageIcon(getClass().getResource("/racoritoare.png"));
        imgmeniu = new JLabel(rac);
        add(imgmeniu);
    }

    private void createUIComponents() {
        ResultSet rs = null;
        try{
            String sql = "SELECT * FROM drinks";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                String nume,pret,bucati,tip;
                nume = rs.getString("nume");
                pret = rs.getString("pret");
                bucati = rs.getString("bucati");
                tip = rs.getString("tip");
                tableBauturi.add(nume,null);
                tableBauturi.add(pret,null);
                tableBauturi.add(bucati,null);
                tableBauturi.add(tip,null);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            try{
                rs.close();
                ps.close();
                con.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
