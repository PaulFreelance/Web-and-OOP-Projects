package appUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import appClasses.ListaFilmelor;
import appClasses.Portofelul;
import appClasses.Snacks;
import appInterfaces.Cinema;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class MainCinema extends JFrame{

	private JPanel contentPane;
	String titlu = "Cinema Menu";
	ImageIcon icon;
	
	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		Scanner al = new Scanner(System.in);
		String rasp ="DA";
		String rasp1="NU";
		System.out.println("Salut! Vrei sa vezi un film? :" );
		ll.add("DA sau NU");
		System.out.println(ll);
		rasp = al.next();
		System.out.println(rasp + "Super!Te rog, alege ce film doresti sa-l vezi?");
		MainCinema c = new MainCinema();
		/*Cinema cinema = new Portofelul();
		Portofelul po = new Portofelul(0,0,0);
		po.getSuma();*/
		//Portofelul po = new Portofelul();
		//po.getSuma();
		//po.setSuma(20);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainCinema frame = new MainCinema();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainCinema() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle(titlu);
		icon = new ImageIcon("/Movies-icon2.png");
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Categorii filme");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaFilmelor lf = new ListaFilmelor();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(46, 202, 98, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Snacks");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Snacks sn = new Snacks();
				sn.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setBounds(306, 202, 98, 29);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("CINEMA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(193, 26, 73, 29);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/movie-icon3.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(114, 57, 257, 135);
		contentPane.add(lblNewLabel_1);
	}
}
