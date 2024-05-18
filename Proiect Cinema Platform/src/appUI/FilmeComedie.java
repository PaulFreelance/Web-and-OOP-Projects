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
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FilmeComedie extends JFrame {

	private JPanel contentPane;
	String titlu= "Comedie";
	int comedie=0;
	String HM = "How to Murder your Wife";
	String Hi = "Hibernatus";
	String JE = "Johnny English";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FilmeComedie frame = new FilmeComedie();
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
	public FilmeComedie() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 656, 340);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel HowKillLabel = new JLabel("");
		HowKillLabel.setBounds(27, 10, 142, 209);
		Image img = new ImageIcon(this.getClass().getResource("/how_to_murder_your_wife2.png")).getImage();
		HowKillLabel.setIcon(new ImageIcon(img));
		contentPane.add(HowKillLabel);
		
		JLabel HibernatusLabel = new JLabel("");
		HibernatusLabel.setBounds(206, 10, 142, 209);
		Image img2 = new ImageIcon(this.getClass().getResource("/hibernatus.png")).getImage();
		HibernatusLabel.setIcon(new ImageIcon(img2));
		contentPane.add(HibernatusLabel);
		
		JLabel JohnnyEnglishLabel = new JLabel("");
		JohnnyEnglishLabel.setBounds(389, 10, 142, 209);
		Image img3 = new ImageIcon(this.getClass().getResource("/johnnyenglish.png")).getImage();
		JohnnyEnglishLabel.setIcon(new ImageIcon(img3));
		contentPane.add(JohnnyEnglishLabel);
		
		JButton HowButton = new JButton("VIZIONEAZA");
		HowButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "How to Murder your Wife",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				comedie = bilet + pret;
				String rasp = "Ai cumparat " + comedie + "bilet(e) la filmul\t" +HM+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		HowButton.setBackground(Color.BLACK);
		HowButton.setForeground(Color.WHITE);
		HowButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		HowButton.setBounds(48, 229, 97, 21);
		contentPane.add(HowButton);
		
		JButton HibernatusButton = new JButton("VIZIONEAZA");
		HibernatusButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Hibernatus",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				comedie = bilet + pret;
				String rasp = "Ai cumparat " + comedie + "bilet(e) la filmul\t" +Hi+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		HibernatusButton.setForeground(Color.WHITE);
		HibernatusButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		HibernatusButton.setBackground(Color.BLACK);
		HibernatusButton.setBounds(228, 229, 97, 21);
		contentPane.add(HibernatusButton);
		
		JButton JEButton = new JButton("VIZIONEAZA");
		JEButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null, "Vrei un bilet la acest film?", "Johnny English",
						JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				String result2 = JOptionPane.showInputDialog("Cate bilete doriti?");
				int bilet = Integer.parseInt(result2);
				int pret = 0;
				comedie = bilet + pret;
				String rasp = "Ai cumparat " + comedie + "bilet(e) la filmul\t" +JE+ "\t!Vizionare placuta!";
				JOptionPane.showMessageDialog(null, rasp);
			}
		});
		JEButton.setForeground(Color.WHITE);
		JEButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		JEButton.setBackground(Color.BLACK);
		JEButton.setBounds(414, 229, 97, 21);
		contentPane.add(JEButton);
		
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
		InapoiButton.setBounds(535, 272, 97, 21);
		contentPane.add(InapoiButton);
	}

}
