package com.formation.vue;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import com.formation.controlleur.ClientControlleur;
import com.formation.vue.Clients;

import javax.swing.border.LineBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AjoutClient extends JPanel {
	private JTextField textCode;
	private JTextField textPrenom;
	private JTextField textAdresse;
	private JTextField textField;
	private JTextField textNom;
	private JTextField textVille;
	private JTextField textNumFixe;
	private JTextField textNumMobile;
	private JTextField textEmail;
	private JCheckBox chckbxCarteDeFidelite;
	private JTextArea textAreaRemarques;
	ClientControlleur cc = new ClientControlleur();

	/**
	 * Create the panel.
	 */
	public AjoutClient(Clients c) {
		setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 153, 255));
		panelMenu.setBounds(0, 0, 195, 622);
		add(panelMenu);
		panelMenu.setLayout(null);
		
		JLabel lblAjout = new JLabel("Ajout");
		lblAjout.setBounds(10, 11, 175, 64);
		lblAjout.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/client/User-Add-64.png")));
		lblAjout.setHorizontalAlignment(SwingConstants.CENTER);
		lblAjout.setFont(new Font("Tahoma", Font.BOLD, 16));
		panelMenu.add(lblAjout);
		
		JButton btnSauvegarder = new JButton("Sauvegarder");
		btnSauvegarder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean CarteFidélité = chckbxCarteDeFidelite.isSelected();
				String Prénom = textPrenom.getText();
				String Nom = textNom.getText();
				String adresse = textAdresse.getText();
				int fixe = Integer.parseInt(textNumFixe.getText());
				int mobile = Integer.parseInt(textNumMobile.getText());
				String mail = textEmail.getText();
				String remarque = textAreaRemarques.getText();
				cc.AjoutClient(CarteFidélité, Prénom, Nom, adresse, fixe, mobile, mail, remarque);
			}
		});
		btnSauvegarder.setHorizontalAlignment(SwingConstants.LEADING);
		btnSauvegarder.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/Save-48.png")));
		btnSauvegarder.setBackground(new Color(0, 153, 255));
		btnSauvegarder.setForeground(Color.WHITE);
		btnSauvegarder.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSauvegarder.setBounds(10, 86, 175, 43);
		panelMenu.add(btnSauvegarder);
		
		JButton btnAnnuler = new JButton("Annuler");
		btnAnnuler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.setVisible(false);
				Clients cl = new Clients();
				cl.setVisible(true);
			}
		});
		btnAnnuler.setBackground(new Color(0, 153, 255));
		btnAnnuler.setHorizontalAlignment(SwingConstants.LEADING);
		btnAnnuler.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/Cancel-48.png")));
		btnAnnuler.setForeground(Color.WHITE);
		btnAnnuler.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAnnuler.setBounds(10, 557, 175, 43);
		panelMenu.add(btnAnnuler);
		
		JButton btnApercu = new JButton("Aper\u00E7u");
		btnApercu.setBackground(new Color(0, 153, 255));
		btnApercu.setHorizontalAlignment(SwingConstants.LEADING);
		btnApercu.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setForeground(Color.WHITE);
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApercu.setBounds(10, 320, 175, 43);
		panelMenu.add(btnApercu);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBackground(new Color(0, 153, 255));
		btnImprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnImprimer.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setBounds(10, 374, 175, 43);
		panelMenu.add(btnImprimer);
		
		JButton btnExport = new JButton("Export");
		btnExport.setIcon(new ImageIcon(AjoutClient.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setForeground(Color.WHITE);
		btnExport.setHorizontalAlignment(SwingConstants.LEADING);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setBackground(new Color(0, 153, 255));
		btnExport.setBounds(10, 428, 175, 43);
		panelMenu.add(btnExport);
		
		JPanel panelAjoutClient = new JPanel();
		panelAjoutClient.setBackground(new Color(102, 204, 255));
		panelAjoutClient.setBounds(195, 0, 720, 622);
		add(panelAjoutClient);
		panelAjoutClient.setLayout(null);
		
		JPanel panelClient = new JPanel();
		panelClient.setBackground(new Color(102, 204, 255));
		panelClient.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Client", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelClient.setBounds(10, 11, 693, 74);
		panelAjoutClient.add(panelClient);
		panelClient.setLayout(null);
		
		textCode = new JTextField();
		textCode.setBounds(93, 31, 198, 20);
		panelClient.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblCreele = new JLabel("Cr\u00E9e le");
		lblCreele.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreele.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreele.setBounds(301, 29, 73, 23);
		panelClient.add(lblCreele);
		
		chckbxCarteDeFidelite = new JCheckBox("Carte de Fid\u00E9lit\u00E9");
		chckbxCarteDeFidelite.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCarteDeFidelite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCarteDeFidelite.setBackground(new Color(102, 204, 255));
		chckbxCarteDeFidelite.setBounds(567, 29, 123, 23);
		panelClient.add(chckbxCarteDeFidelite);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(10, 29, 73, 23);
		panelClient.add(lblCode);
		
		JFormattedTextField formattedTCreele = new JFormattedTextField();
		formattedTCreele.setBounds(384, 31, 177, 20);
		panelClient.add(formattedTCreele);
		
		JPanel panelEtatCivil = new JPanel();
		panelEtatCivil.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Etat Civil", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelEtatCivil.setBackground(new Color(102, 204, 255));
		panelEtatCivil.setBounds(10, 96, 693, 106);
		panelAjoutClient.add(panelEtatCivil);
		panelEtatCivil.setLayout(null);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setHorizontalAlignment(SwingConstants.LEFT);
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrenom.setBounds(10, 23, 73, 20);
		panelEtatCivil.add(lblPrenom);
		
		textPrenom = new JTextField();
		textPrenom.setBounds(77, 24, 260, 20);
		panelEtatCivil.add(textPrenom);
		textPrenom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.LEFT);
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresse.setBounds(10, 49, 73, 20);
		panelEtatCivil.add(lblAdresse);
		
		textAdresse = new JTextField();
		textAdresse.setBounds(77, 50, 607, 20);
		panelEtatCivil.add(textAdresse);
		textAdresse.setColumns(10);
		
		JLabel lblCodePostal = new JLabel("Code Postal");
		lblCodePostal.setHorizontalAlignment(SwingConstants.LEFT);
		lblCodePostal.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodePostal.setBounds(10, 75, 73, 20);
		panelEtatCivil.add(lblCodePostal);
		
		textField = new JTextField();
		textField.setBounds(77, 76, 260, 20);
		panelEtatCivil.add(textField);
		textField.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setBounds(347, 23, 70, 20);
		panelEtatCivil.add(lblNom);
		
		textNom = new JTextField();
		textNom.setBounds(427, 24, 257, 20);
		panelEtatCivil.add(textNom);
		textNom.setColumns(10);
		
		JLabel lblVille = new JLabel("Ville");
		lblVille.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVille.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblVille.setBounds(347, 75, 70, 20);
		panelEtatCivil.add(lblVille);
		
		textVille = new JTextField();
		textVille.setBounds(427, 76, 257, 20);
		panelEtatCivil.add(textVille);
		textVille.setColumns(10);
		
		JPanel panelCoordonnees = new JPanel();
		panelCoordonnees.setBackground(new Color(102, 204, 255));
		panelCoordonnees.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Coordonn\u00E9es", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelCoordonnees.setBounds(10, 213, 693, 95);
		panelAjoutClient.add(panelCoordonnees);
		panelCoordonnees.setLayout(null);
		
		JLabel lblNumFixe = new JLabel("Fixe");
		lblNumFixe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumFixe.setBounds(10, 24, 38, 20);
		panelCoordonnees.add(lblNumFixe);
		
		textNumFixe = new JTextField();
		textNumFixe.setBounds(46, 25, 273, 20);
		panelCoordonnees.add(textNumFixe);
		textNumFixe.setColumns(10);
		
		JLabel lblNumMobile = new JLabel("Mobile");
		lblNumMobile.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumMobile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumMobile.setBounds(329, 24, 55, 20);
		panelCoordonnees.add(lblNumMobile);
		
		textNumMobile = new JTextField();
		textNumMobile.setBounds(394, 25, 294, 20);
		panelCoordonnees.add(textNumMobile);
		textNumMobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(10, 55, 38, 20);
		panelCoordonnees.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(46, 56, 642, 20);
		panelCoordonnees.add(textEmail);
		textEmail.setColumns(10);
		
		JPanel panelRemarques = new JPanel();
		panelRemarques.setBackground(new Color(102, 204, 255));
		panelRemarques.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "Remarques", TitledBorder.LEADING, TitledBorder.TOP, null, Color.BLACK));
		panelRemarques.setBounds(10, 319, 693, 290);
		panelAjoutClient.add(panelRemarques);
		panelRemarques.setLayout(null);
		
		JScrollPane scrollRemarques = new JScrollPane();
		scrollRemarques.setBounds(10, 26, 673, 253);
		panelRemarques.add(scrollRemarques);
		
		textAreaRemarques = new JTextArea();
		scrollRemarques.setViewportView(textAreaRemarques);

	}
}
