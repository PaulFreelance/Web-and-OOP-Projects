package appUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import appClasses.ListaFilmelor;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FilmeGroaza extends JFrame {

	private JPanel contentPane;
	String titlu = "Groaza";
	int groaza=0;
	String HHH = "House of Haunted Hill";
	String TT = "The Thing";
	String TS = "The Shinning";
	String No = "Nosferatu";
	String MV = "Mark of the Vampire";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmeGroaza frame = new FilmeGroaza();
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
	public FilmeGroaza() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 586, 572);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HauntedHillLabel = new JLabel("");
		HauntedHillLabel.setBounds(25, 10, 142, 209);
		Image img = new ImageIcon(this.getClass().getResource("/hauntedhill.png")).getImage();
		HauntedHillLabel.setIcon(new ImageIcon(img));
		contentPane.add(HauntedHillLabel);
		
		JLabel ThingLabel = new JLabel("");
		ThingLabel.setBounds(206, 10, 142, 209);
		Image img2 = new ImageIcon(this.getClass().getResource("/the-thing.png")).getImage();
		ThingLabel.setIcon(new ImageIcon(img2));
		contentPane.add(ThingLabel);
		
		JLabel ShinningLabel = new JLabel("");
		ShinningLabel.setBounds(390, 10, 142, 209);
		Image img3 = new ImageIcon(this.getClass().getResource("/The_Shiningmovie.png")).getImage();
		ShinningLabel.setIcon(new ImageIcon(img3));
		contentPane.add(ShinningLabel);
		
		JLabel NosferatuLabel = new JLabel("");
		NosferatuLabel.setBounds(25, 279, 142, 209);
		Image img4 = new ImageIcon(this.getClass().getResource("/nosferatu.png")).getImage();
		NosferatuLabel.setIcon(new ImageIcon(img4));
		contentPane.add(NosferatuLabel);
		
		JLabel MarkVampireLabel = new JLabel("");
		MarkVampireLabel.setBounds(206, 279, 142, 209);
		Image img5 = new ImageIcon(this.getClass().getResource("/markvampire.png")).getImage();
		MarkVampireLabel.setIcon(new ImageIcon(img5));
		contentPane.add(MarkVampireLabel);
		
		JButton HauntedHillButton = new JButton("VIZIONEAZA");
		HauntedHillButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "House of Haunted Hill",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				groaza = bilet + pret;
				String rasp = "Ai cumparat " + groaza + "bilet(e) la filmul\t" +HHH+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		HauntedHillButton.setBackground(Color.BLACK);
		HauntedHillButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		HauntedHillButton.setForeground(Color.WHITE);
		HauntedHillButton.setBounds(48, 229, 97, 21);
		contentPane.add(HauntedHillButton);
		
		JButton ThingButton = new JButton("VIZIONEAZA");
		ThingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Thing",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				groaza = bilet + pret;
				String rasp = "Ai cumparat " + groaza + "bilet(e) la filmul\t" +TT+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
				
			}
		});
		ThingButton.setForeground(Color.WHITE);
		ThingButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		ThingButton.setBackground(Color.BLACK);
		ThingButton.setBounds(229, 229, 97, 21);
		contentPane.add(ThingButton);
		
		JButton ShinningButton = new JButton("VIZIONEAZA");
		ShinningButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Shinning",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				groaza = bilet + pret;
				String rasp = "Ai cumparat " + groaza + "bilet(e) la filmul\t" +TS+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		ShinningButton.setForeground(Color.WHITE);
		ShinningButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		ShinningButton.setBackground(Color.BLACK);
		ShinningButton.setBounds(413, 229, 97, 21);
		contentPane.add(ShinningButton);
		
		JButton NosferatuButton = new JButton("VIZIONEAZA");
		NosferatuButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Nosferatu",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				groaza = bilet + pret;
				String rasp = "Ai cumparat " + groaza + "bilet(e) la filmul\t" +No+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		NosferatuButton.setForeground(Color.WHITE);
		NosferatuButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		NosferatuButton.setBackground(Color.BLACK);
		NosferatuButton.setBounds(48, 498, 97, 21);
		contentPane.add(NosferatuButton);
		
		JButton VampireButton = new JButton("VIZIONEAZA");
		VampireButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Mark of the Vampire",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				groaza = bilet + pret;
				String rasp = "Ai cumparat " + groaza + "bilet(e) la filmul\t" +MV+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		VampireButton.setForeground(Color.WHITE);
		VampireButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		VampireButton.setBackground(Color.BLACK);
		VampireButton.setBounds(229, 498, 97, 21);
		contentPane.add(VampireButton);
		
		JButton InapoiButton = new JButton("INAPOI");
		InapoiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaFilmelor lf = new ListaFilmelor();
				lf.setVisible(true);
				dispose();
			}
		});
		InapoiButton.setForeground(Color.RED);
		InapoiButton.setFont(new Font("Tahoma", Font.BOLD, 10));
		InapoiButton.setBackground(Color.BLACK);
		InapoiButton.setBounds(465, 498, 97, 21);
		contentPane.add(InapoiButton);
	}

}
