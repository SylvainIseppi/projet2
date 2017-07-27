package com.formation.vue;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;

public class RechercherClient extends JPanel {
	private JTextField textCode;
	private JTextField textCreeLe;
	private JTextField textPrenom;
	private JTextField textNom;
	private JTextField textAdresse;
	private JTextField textField;
	private JTextField textNumMobile;
	private JTextField textEmail;

	/**
	 * Create the panel.
	 */
	public RechercherClient() {
		setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 153, 255));
		panelMenu.setBounds(0, 0, 195, 622);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/client/User-Find-64.png")));
		lblRechercher.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblRechercher.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercher.setBounds(10, 11, 175, 64);
		panelMenu.add(lblRechercher);
		
		JButton btnRechercher = new JButton("Rechercher");
		btnRechercher.setBackground(new Color(0, 153, 255));
		btnRechercher.setHorizontalAlignment(SwingConstants.LEADING);
		btnRechercher.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Search-48.png")));
		btnRechercher.setForeground(Color.WHITE);
		btnRechercher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRechercher.setBounds(10, 86, 175, 43);
		panelMenu.add(btnRechercher);
		
		JButton btnApercu = new JButton("Aper\u00E7u");
		btnApercu.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setHorizontalAlignment(SwingConstants.LEADING);
		btnApercu.setForeground(Color.WHITE);
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApercu.setBackground(new Color(0, 153, 255));
		btnApercu.setBounds(10, 320, 175, 43);
		panelMenu.add(btnApercu);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setBackground(new Color(0, 153, 255));
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnImprimer.setBounds(10, 374, 175, 43);
		panelMenu.add(btnImprimer);
		
		JButton btnExport = new JButton("Export");
		btnExport.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setHorizontalAlignment(SwingConstants.LEADING);
		btnExport.setForeground(Color.WHITE);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setBackground(new Color(0, 153, 255));
		btnExport.setBounds(10, 428, 175, 43);
		panelMenu.add(btnExport);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Cancel-48.png")));
		btnAnnuler.setHorizontalAlignment(SwingConstants.LEADING);
		btnAnnuler.setForeground(Color.WHITE);
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnuler.setBackground(new Color(0, 153, 255));
		btnAnnuler.setBounds(10, 557, 175, 43);
		panelMenu.add(btnAnnuler);
		
		JPanel panelRechercherClient = new JPanel();
		panelRechercherClient.setBackground(new Color(102, 204, 255));
		panelRechercherClient.setBounds(193, 0, 720, 622);
		add(panelRechercherClient);
		panelRechercherClient.setLayout(null);
		
		JPanel panelClientRens = new JPanel();
		panelClientRens.setBackground(new Color(102, 204, 255));
		panelClientRens.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelClientRens.setBounds(10, 11, 700, 286);
		panelRechercherClient.add(panelClientRens);
		panelClientRens.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(10, 11, 74, 25);
		panelClientRens.add(lblCode);
		
		textCode = new JTextField();
		textCode.setBounds(94, 14, 178, 20);
		panelClientRens.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblCreeLe = new JLabel("Cr\u00E9\u00E9 le");
		lblCreeLe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreeLe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreeLe.setBounds(282, 11, 66, 25);
		panelClientRens.add(lblCreeLe);
		
		textCreeLe = new JTextField();
		textCreeLe.setEnabled(false);
		textCreeLe.setBounds(358, 14, 178, 20);
		panelClientRens.add(textCreeLe);
		textCreeLe.setColumns(10);
		
		JCheckBox chckbxCarteDeFidelite = new JCheckBox("Carte de Fid\u00E9lit\u00E9");
		chckbxCarteDeFidelite.setForeground(Color.BLACK);
		chckbxCarteDeFidelite.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCarteDeFidelite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCarteDeFidelite.setEnabled(false);
		chckbxCarteDeFidelite.setBackground(new Color(102, 204, 255));
		chckbxCarteDeFidelite.setBounds(565, 13, 123, 23);
		panelClientRens.add(chckbxCarteDeFidelite);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrenom.setBounds(10, 44, 74, 20);
		panelClientRens.add(lblPrenom);
		
		textPrenom = new JTextField();
		textPrenom.setBounds(94, 45, 178, 20);
		panelClientRens.add(textPrenom);
		textPrenom.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setBounds(282, 42, 64, 25);
		panelClientRens.add(lblNom);
		
		textNom = new JTextField();
		textNom.setBounds(358, 45, 330, 20);
		panelClientRens.add(textNom);
		textNom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresse.setBounds(10, 77, 74, 17);
		panelClientRens.add(lblAdresse);
		
		textAdresse = new JTextField();
		textAdresse.setEnabled(false);
		textAdresse.setBounds(94, 76, 594, 20);
		panelClientRens.add(textAdresse);
		textAdresse.setColumns(10);
		
		JLabel lblNumFixe = new JLabel("Fixe");
		lblNumFixe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumFixe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumFixe.setBounds(10, 108, 74, 17);
		panelClientRens.add(lblNumFixe);
		
		textField = new JTextField();
		textField.setEnabled(false);
		textField.setBounds(94, 107, 178, 20);
		panelClientRens.add(textField);
		textField.setColumns(10);
		
		JLabel lblNumMobile = new JLabel("Mobile");
		lblNumMobile.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumMobile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumMobile.setBounds(282, 104, 66, 25);
		panelClientRens.add(lblNumMobile);
		
		textNumMobile = new JTextField();
		textNumMobile.setEnabled(false);
		textNumMobile.setBounds(358, 107, 330, 20);
		panelClientRens.add(textNumMobile);
		textNumMobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(11, 135, 73, 25);
		panelClientRens.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setEnabled(false);
		textEmail.setBounds(94, 138, 594, 20);
		panelClientRens.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblRemarques = new JLabel("Remarques");
		lblRemarques.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemarques.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRemarques.setBounds(11, 168, 73, 25);
		panelClientRens.add(lblRemarques);
		
		JScrollPane scrollRemarques = new JScrollPane();
		scrollRemarques.setBounds(94, 169, 594, 106);
		panelClientRens.add(scrollRemarques);
		
		JTextArea textAreaRemarques = new JTextArea();
		scrollRemarques.setViewportView(textAreaRemarques);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 308, 700, 262);
		panelRechercherClient.add(scrollPane);
		
		JLabel lblListe = new JLabel("Trier la liste par");
		lblListe.setIcon(new ImageIcon(RechercherClient.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		lblListe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListe.setBounds(20, 581, 126, 14);
		panelRechercherClient.add(lblListe);
		
		JComboBox comboListe = new JComboBox();
		comboListe.setBounds(156, 579, 81, 20);
		panelRechercherClient.add(comboListe);

	}
}
