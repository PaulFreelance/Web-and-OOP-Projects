package appClasses;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import appUI.MainCinema;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;

public class Snacks extends JFrame {

	private JPanel contentPane;
	String titlu = "Snacks";
	int suma;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Snacks frame = new Snacks();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Snacks() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setTitle(titlu);
		contentPane = new JPanel();
		contentPane.setBackground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<- INAPOI");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		btnNewButton.setBackground(Color.RED);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainCinema mc = new MainCinema();
				mc.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBounds(330, 232, 85, 21);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("OFERTELE ZILEI");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel.setBounds(170, 40, 85, 21);
		contentPane.add(lblNewLabel);
		
		JLabel PopcornLabel = new JLabel("");
		PopcornLabel.setBounds(69, 71, 98, 146);
		Image img = new ImageIcon(this.getClass().getResource("/Popcorn.png")).getImage();
		PopcornLabel.setIcon(new ImageIcon(img));
		contentPane.add(PopcornLabel);
		
		JLabel PepsiLabel = new JLabel("");
		PepsiLabel.setBounds(248, 71, 98, 146);
		Image img2 = new ImageIcon(this.getClass().getResource("/pepsi.png")).getImage();
		PepsiLabel.setIcon(new ImageIcon(img2));
		contentPane.add(PepsiLabel);
		
		JButton PopcornButton = new JButton("Meniu Popcorn");
		PopcornButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog("Ce fel de meniu doriti?\n1.Mic:10Lei\t2.Mediu:12Lei\t3.Mare:15Lei");
				String popcorn = result;
				int pop = Integer.parseInt(result);
				 result = JOptionPane.showInputDialog("Cate meniuri doriti?");
				int pop2 = Integer.parseInt(result);
				suma = pop + pop2;
				String raspuns = "Ai comandat\t" +suma+ "\tmeniu(ri)\t" +popcorn;
				JOptionPane.showMessageDialog(null, raspuns);
			}
		});
		PopcornButton.setBackground(Color.RED);
		PopcornButton.setForeground(Color.YELLOW);
		PopcornButton.setFont(new Font("Tahoma", Font.BOLD, 9));
		PopcornButton.setBounds(69, 227, 98, 21);
		contentPane.add(PopcornButton);
		
		JButton PepsiButton = new JButton("Pepsi");
		PepsiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String result = JOptionPane.showInputDialog("Ce fel de meniu doriti?\n1.Pahar:3Lei\t2.Mediu:5Lei");
				String pepsi = result;
				int pep = Integer.parseInt(result);
				 result = JOptionPane.showInputDialog("Cate meniuri doriti?");
				int pep2 = Integer.parseInt(result);
				suma = pep + pep2;
				String raspuns = "Ai comandat\t" +suma+ "\tmeniu(ri)\t" +pepsi;
				JOptionPane.showMessageDialog(null, raspuns);
			}
		});
		PepsiButton.setBackground(Color.RED);
		PepsiButton.setForeground(Color.YELLOW);
		PepsiButton.setBounds(235, 227, 85, 21);
		contentPane.add(PepsiButton);
	}

}
