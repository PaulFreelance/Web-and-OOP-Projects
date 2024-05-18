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

public class FilmeDrama extends JFrame {

	private JPanel contentPane;
	String titlu = "Drama";
	int drama =0;
	String LH = "The Lake House";
	String LM = "The Last Man on the Earth";
	String Ti = "Titanic";
	String BS = "Black Swan";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmeDrama frame = new FilmeDrama();
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
	public FilmeDrama() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 787, 351);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HouseLakeLabel = new JLabel("");
		HouseLakeLabel.setBounds(29, 10, 142, 209);
		Image img = new ImageIcon(this.getClass().getResource("/houselake.png")).getImage();
		HouseLakeLabel.setIcon(new ImageIcon(img));
		contentPane.add(HouseLakeLabel);
		
		JLabel LastManLabel = new JLabel("");
		LastManLabel.setBounds(216, 10, 142, 209);
		Image img2 = new ImageIcon(this.getClass().getResource("/the-last-man-on-earth.png")).getImage();
		LastManLabel.setIcon(new ImageIcon(img2));
		contentPane.add(LastManLabel);
		
		JLabel TitanicLabel = new JLabel("");
		TitanicLabel.setBounds(401, 10, 142, 209);
		Image img3 = new ImageIcon(this.getClass().getResource("/titanic.png")).getImage();
		TitanicLabel.setIcon(new ImageIcon(img3));
		contentPane.add(TitanicLabel);
		
		JLabel BlackSwanLabel = new JLabel("");
		BlackSwanLabel.setBounds(588, 10, 142, 209);
		Image img4 = new ImageIcon(this.getClass().getResource("/blackswan.png")).getImage();
		BlackSwanLabel.setIcon(new ImageIcon(img4));
		contentPane.add(BlackSwanLabel);
		
		JButton LakeButton = new JButton("VIZIONEAZA");
		LakeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Lake House",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				drama = bilet + pret;
				String rasp = "Ai cumparat " + drama + "bilet(e) la filmul\t" +LH+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		LakeButton.setBackground(Color.BLACK);
		LakeButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		LakeButton.setForeground(Color.WHITE);
		LakeButton.setBounds(52, 235, 97, 21);
		contentPane.add(LakeButton);
		
		JButton ManButton = new JButton("VIZIONEAZA");
		ManButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "The Last Man on Earth",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				drama = bilet + pret;
				String rasp = "Ai cumparat " + drama + "bilet(e) la filmul\t" +LM+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		ManButton.setForeground(Color.WHITE);
		ManButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		ManButton.setBackground(Color.BLACK);
		ManButton.setBounds(241, 235, 97, 21);
		contentPane.add(ManButton);
		
		JButton TitanicButton = new JButton("VIZIONEAZA");
		TitanicButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Titanic",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				drama = bilet + pret;
				String rasp = "Ai cumparat " + drama + "bilet(e) la filmul\t" +Ti+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		TitanicButton.setForeground(Color.WHITE);
		TitanicButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		TitanicButton.setBackground(Color.BLACK);
		TitanicButton.setBounds(425, 235, 97, 21);
		contentPane.add(TitanicButton);
		
		JButton BlackButton = new JButton("VIZIONEAZA");
		BlackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Black Swan",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				drama = bilet + pret;
				String rasp = "Ai cumparat " + drama + "bilet(e) la filmul\t" +BS+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		BlackButton.setForeground(Color.WHITE);
		BlackButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		BlackButton.setBackground(Color.BLACK);
		BlackButton.setBounds(613, 235, 97, 21);
		contentPane.add(BlackButton);
		
		JButton btnNewButton = new JButton("INAPOI");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ListaFilmelor lf = new ListaFilmelor();
				lf.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setEnabled(true);
		btnNewButton.setBounds(688, 283, 85, 21);
		contentPane.add(btnNewButton);
	}

}
