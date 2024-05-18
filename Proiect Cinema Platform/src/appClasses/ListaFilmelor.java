package appClasses;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;



import appUI.FilmeAventura;
import appUI.FilmeComedie;
import appUI.FilmeDrama;
import appUI.FilmeGroaza;
import appUI.MainCinema;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class ListaFilmelor extends JFrame{

	private JPanel contentPane;
	String titlu = "Categorii filme";
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListaFilmelor frame = new ListaFilmelor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
		
	public ListaFilmelor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 386);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<- INAPOI");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainCinema ci = new MainCinema();
				ci.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(426, 318, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Categorii:  1.Aventura  2.Drama  3.Groaza  4.Comedie");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBounds(97, 6, 275, 96);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("AVENTURA");
		btnNewButton_1.setBackground(Color.BLACK);
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeAventura fa = new FilmeAventura();
				fa.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1.setBounds(176, 101, 120, 43);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("DRAMA");
		btnNewButton_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeDrama fd = new FilmeDrama();
				fd.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1.setBounds(176, 154, 120, 43);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("GROAZA");
		btnNewButton_1_1_1.setBackground(Color.BLACK);
		btnNewButton_1_1_1.setForeground(Color.WHITE);
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeGroaza fg = new FilmeGroaza();
				fg.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1_1.setBounds(176, 207, 120, 43);
		contentPane.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("COMEDIE");
		btnNewButton_1_1_2.setBackground(Color.BLACK);
		btnNewButton_1_1_2.setForeground(Color.WHITE);
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FilmeComedie fc = new FilmeComedie();
				fc.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton_1_1_2.setBounds(176, 260, 120, 43);
		contentPane.add(btnNewButton_1_1_2);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Adventure-icon2.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(108, 101, 70, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/Drama-icon2.png")).getImage();
		lblNewLabel_1_1.setIcon(new ImageIcon(img2));
		lblNewLabel_1_1.setBounds(107, 154, 59, 43);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/Horror-icon2.png")).getImage();
		lblNewLabel_1_1_1.setIcon(new ImageIcon(img3));
		lblNewLabel_1_1_1.setBounds(107, 207, 59, 43);
		contentPane.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/Comedy-icon2.png")).getImage();
		lblNewLabel_1_1_1_1.setIcon(new ImageIcon(img4));
		lblNewLabel_1_1_1_1.setBounds(108, 260, 59, 43);
		contentPane.add(lblNewLabel_1_1_1_1);
	}
}
