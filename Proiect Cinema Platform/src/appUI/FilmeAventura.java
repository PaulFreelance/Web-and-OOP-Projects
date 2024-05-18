package appUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import appClasses.ListaFilmelor;
import java.io.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class FilmeAventura extends JFrame {

	private JPanel contentPane;
	String titlu = "Aventura";
	int aventura=0;
	String IJ = "Indiana Jones";
	String Ju = "Jumanji";
	String TL = "The Librarian";
	String GE = "007: Golden Eye";
	String TI = "The Invaders";
	String TS = "The Saint";
	String JP = "Jurassic Park";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmeAventura frame = new FilmeAventura();
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
	public FilmeAventura() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 789, 572);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel IndianaJonesLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/indianajones2.png")).getImage();
		IndianaJonesLabel.setIcon(new ImageIcon(img));
		IndianaJonesLabel.setBounds(31, 25, 142, 209);
		contentPane.add(IndianaJonesLabel);
		
		JLabel JumanjiLabel = new JLabel("");
		JumanjiLabel.setBounds(213, 25, 142, 209);
		Image img2 = new ImageIcon(this.getClass().getResource("/jumanji.png")).getImage();
		JumanjiLabel.setIcon(new ImageIcon(img2));
		contentPane.add(JumanjiLabel);
		
		JLabel LibrarianLabel = new JLabel("");
		LibrarianLabel.setBounds(398, 25, 142, 209);
		Image img3 = new ImageIcon(this.getClass().getResource("/librarian.png")).getImage();
		LibrarianLabel.setIcon(new ImageIcon(img3));
		contentPane.add(LibrarianLabel);
		
		JLabel GoldenEyeLabel = new JLabel("");
		GoldenEyeLabel.setBounds(577, 25, 142, 209);
		Image img4 = new ImageIcon(this.getClass().getResource("/james-bond-007.png")).getImage();
		GoldenEyeLabel.setIcon(new ImageIcon(img4));
		contentPane.add(GoldenEyeLabel);
		
		JLabel InvadersLabel = new JLabel("");
		InvadersLabel.setBounds(31, 291, 142, 209);
		Image img5 = new ImageIcon(this.getClass().getResource("/the-invaders.png")).getImage();
		InvadersLabel.setIcon(new ImageIcon(img5));
		contentPane.add(InvadersLabel);
		
		JLabel SaintLabel = new JLabel("");
		SaintLabel.setBounds(213, 291, 142, 209);
		Image img6 = new ImageIcon(this.getClass().getResource("/TheSaint.png")).getImage();
		SaintLabel.setIcon(new ImageIcon(img6));
		contentPane.add(SaintLabel);
		
		JLabel JurassicParkLabel = new JLabel("");
		JurassicParkLabel.setBounds(398, 291, 142, 209);
		Image img7 = new ImageIcon(this.getClass().getResource("/jurassicpark.png")).getImage();
		JurassicParkLabel.setIcon(new ImageIcon(img7));
		contentPane.add(JurassicParkLabel);
		
		JButton JonesButton = new JButton("VIZIONEAZA");
		JonesButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//try {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Indiana Jones",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +IJ+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
				/*if(JOptionPane.YES_OPTION == 'y' || JOptionPane.YES_OPTION == 'Y') {
					Scanner co = new Scanner(System.in);
	    			aventura = co.nextInt();
	    			JOptionPane.showMessageDialog(JonesButton,"Poftim biletul");
	    			
	    		}
	    		else if(JOptionPane.NO_OPTION == 'n' || JOptionPane.NO_OPTION == 'N'){
	    			
	    		}
				}catch(Exception ex) {
					
				}finally {
					
				}*/

			}
		});
		JonesButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		JonesButton.setBackground(Color.BLACK);
		JonesButton.setForeground(Color.WHITE);
		JonesButton.setBounds(56, 244, 97, 21);
		contentPane.add(JonesButton);
		
		JButton JumanjiButton = new JButton("VIZIONEAZA");
		JumanjiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Jumanji",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +Ju+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		JumanjiButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		JumanjiButton.setBackground(Color.BLACK);
		JumanjiButton.setForeground(Color.WHITE);
		JumanjiButton.setBounds(238, 244, 97, 21);
		contentPane.add(JumanjiButton);
		
		JButton LibrarianButton = new JButton("VIZIONEAZA");
		LibrarianButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Librarian",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +TL+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		LibrarianButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		LibrarianButton.setForeground(Color.WHITE);
		LibrarianButton.setBackground(Color.BLACK);
		LibrarianButton.setEnabled(true);
		LibrarianButton.setBounds(421, 244, 97, 21);
		contentPane.add(LibrarianButton);
		
		JButton GEButton = new JButton("VIZIONEAZA");
		GEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "007: Golden Eye",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +GE+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		GEButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		GEButton.setBackground(Color.BLACK);
		GEButton.setForeground(Color.WHITE);
		GEButton.setEnabled(true);
		GEButton.setBounds(600, 244, 97, 21);
		contentPane.add(GEButton);
		
		JButton InvadersButton = new JButton("VIZIONEAZA");
		InvadersButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Invaders",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +TI+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		InvadersButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		InvadersButton.setForeground(Color.WHITE);
		InvadersButton.setBackground(Color.BLACK);
		InvadersButton.setEnabled(true);
		InvadersButton.setBounds(56, 510, 97, 21);
		contentPane.add(InvadersButton);
		
		JButton SaintButton = new JButton("VIZIONEAZA");
		SaintButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Saint",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t\t" +TS+ "\t\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		SaintButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		SaintButton.setBackground(Color.BLACK);
		SaintButton.setForeground(Color.WHITE);
		SaintButton.setEnabled(true);
		SaintButton.setBounds(238, 510, 97, 21);
		contentPane.add(SaintButton);
		
		JButton JPButton = new JButton("VIZIONEAZA");
		JPButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Jurassic Park",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				aventura = bilet + pret;
				String rasp = "Ai cumparat " + aventura + "bilet(e) la filmul\t" +JP+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		JPButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		JPButton.setForeground(Color.WHITE);
		JPButton.setBackground(Color.BLACK);
		JPButton.setEnabled(true);
		JPButton.setBounds(421, 510, 97, 21);
		contentPane.add(JPButton);
		
		JButton btnNewButton = new JButton("INAPOI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaFilmelor lf = new ListaFilmelor();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		btnNewButton.setBounds(680, 504, 85, 21);
		contentPane.add(btnNewButton);
	}

}
