package com.formation.vue;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class CommandeExistante extends JPanel {
	private JTable table;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public CommandeExistante() {
		setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(255, 153, 0));
		panelMenu.setBounds(10, 11, 301, 628);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblCommandes = new JLabel("Commandes");
		lblCommandes.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommandes.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommandes.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCommandes.setBounds(67, 23, 167, 64);
		panelMenu.add(lblCommandes);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnSupprimer.setBackground(new Color(255, 153, 0));
		btnSupprimer.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSupprimer.setBounds(10, 98, 281, 46);
		panelMenu.add(btnSupprimer);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBackground(new Color(255, 153, 0));
		btnAccueil.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Home-48.png")));
		btnAccueil.setHorizontalAlignment(SwingConstants.LEADING);
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAccueil.setBounds(10, 560, 281, 57);
		panelMenu.add(btnAccueil);
		
		JButton btnApercu = new JButton("Aper\u00E7u");
		btnApercu.setBackground(new Color(255, 153, 0));
		btnApercu.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setHorizontalAlignment(SwingConstants.LEADING);
		btnApercu.setForeground(Color.WHITE);
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApercu.setBounds(10, 261, 281, 46);
		panelMenu.add(btnApercu);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBackground(new Color(255, 153, 0));
		btnImprimer.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setBounds(10, 318, 281, 46);
		panelMenu.add(btnImprimer);
		
		JButton btnExport = new JButton("Export");
		btnExport.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setHorizontalAlignment(SwingConstants.LEADING);
		btnExport.setForeground(Color.WHITE);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setBackground(new Color(255, 153, 0));
		btnExport.setBounds(10, 375, 281, 46);
		panelMenu.add(btnExport);
		
		JPanel panelCommandeEx = new JPanel();
		panelCommandeEx.setBackground(new Color(255, 255, 153));
		panelCommandeEx.setBounds(310, 11, 630, 628);
		add(panelCommandeEx);
		panelCommandeEx.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 610, 547);
		panelCommandeEx.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblTotalCommande = new JLabel("Total des Commandes");
		lblTotalCommande.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTotalCommande.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTotalCommande.setBounds(10, 583, 154, 21);
		panelCommandeEx.add(lblTotalCommande);
		
		JLabel lblPrixTotal = new JLabel("0.00\u20AC");
		lblPrixTotal.setHorizontalAlignment(SwingConstants.CENTER);
		lblPrixTotal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrixTotal.setBounds(174, 583, 123, 21);
		panelCommandeEx.add(lblPrixTotal);
		
		textField = new JTextField();
		textField.setBounds(435, 584, 185, 21);
		panelCommandeEx.add(textField);
		textField.setColumns(10);
		
		JLabel lblRecherche = new JLabel("Recherche");
		lblRecherche.setIcon(new ImageIcon(CommandeExistante.class.getResource("/images/gestion/Search-32.png")));
		lblRecherche.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRecherche.setBounds(320, 583, 105, 21);
		panelCommandeEx.add(lblRecherche);

	}
}
