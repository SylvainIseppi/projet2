package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;

public class Clients extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Clients frame = new Clients();
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
	public Clients() {
		setTitle("Gestion des Clients");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 775, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelWest = new JPanel();
		panelWest.setBackground(new Color(0, 153, 255));
		contentPane.add(panelWest, BorderLayout.WEST);
		panelWest.setLayout(new MigLayout("", "[]", "[][][][][][88.00][][][][][][][]"));
		
		JLabel lblClient = new JLabel("Clients");
		lblClient.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblClient.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/client/People-64-actif.png")));
		panelWest.add(lblClient, "cell 0 0");
		
		JButton btnAjouter = new JButton("Ajouter        ");
		btnAjouter.setBackground(new Color(0, 153, 255));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouter.setForeground(Color.WHITE);
		btnAjouter.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Add-New-48.png")));
		panelWest.add(btnAjouter, "cell 0 1");
		
		JButton btnRechercher = new JButton("Rechercher  ");
		btnRechercher.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Search-48.png")));
		btnRechercher.setBackground(new Color(0, 153, 255));
		btnRechercher.setForeground(Color.WHITE);
		btnRechercher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelWest.add(btnRechercher, "cell 0 2");
		
		JButton btnModifier = new JButton("Modifier        ");
		btnModifier.setBackground(new Color(0, 153, 255));
		btnModifier.setForeground(Color.WHITE);
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnModifier.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Data-Edit-48.png")));
		panelWest.add(btnModifier, "cell 0 3");
		
		JButton btnSupprimer = new JButton("Supprimer    ");
		btnSupprimer.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setBackground(new Color(0, 153, 255));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSupprimer.setForeground(Color.WHITE);
		panelWest.add(btnSupprimer, "cell 0 4");
		
		JButton btnApercu = new JButton("Aper\u00E7u         ");
		btnApercu.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setBackground(new Color(0, 153, 255));
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApercu.setForeground(Color.WHITE);
		panelWest.add(btnApercu, "cell 0 6");
		
		JButton btnImprimer = new JButton("Imprimer      ");
		btnImprimer.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setBackground(new Color(0, 153, 255));
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setForeground(Color.WHITE);
		panelWest.add(btnImprimer, "cell 0 7");
		
		JButton btnExport = new JButton("Export         ");
		btnExport.setBackground(new Color(0, 153, 255));
		btnExport.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setForeground(Color.WHITE);
		panelWest.add(btnExport, "cell 0 8");
	}

}
