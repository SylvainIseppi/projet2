package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import net.miginfocom.swing.MigLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JToolBar;

public class Commande extends JFrame {

	private JPanel contentPane;
	private JTextField textCommandeencours;
	private JTextField textDate;
	private JTable table;
	private JTextField textCategorie;
	private JTextField textCode;
	private JTextField textMontant;
	private JTextField textDesignation;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Commande frame = new Commande();
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
	public Commande() {
		setTitle("Commande");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 950, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelWest = new JPanel();
		panelWest.setBackground(new Color(255, 153, 0));
		panelWest.setBounds(5, 5, 300, 601);
		contentPane.add(panelWest);
		panelWest.setLayout(null);
		
		JLabel lblCommande = new JLabel("Commande");
		lblCommande.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/commande/Shopping-Bag-64-actif.png")));
		lblCommande.setHorizontalAlignment(SwingConstants.CENTER);
		lblCommande.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblCommande.setBounds(60, 11, 180, 64);
		panelWest.add(lblCommande);
		
		JButton btnCommandeExistantes = new JButton("Commande existantes");
		btnCommandeExistantes.setHorizontalAlignment(SwingConstants.LEADING);
		btnCommandeExistantes.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/commande/Receipt-48.png")));
		btnCommandeExistantes.setForeground(Color.WHITE);
		btnCommandeExistantes.setBackground(new Color(255, 153, 0));
		btnCommandeExistantes.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCommandeExistantes.setBounds(10, 87, 280, 44);
		panelWest.add(btnCommandeExistantes);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBackground(new Color(255, 153, 0));
		btnSupprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnSupprimer.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Cancel-48.png")));
		btnSupprimer.setForeground(Color.WHITE);
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSupprimer.setBounds(10, 142, 280, 44);
		panelWest.add(btnSupprimer);
		
		JButton btnSupprimerall = new JButton("Supprimer toutes les lignes");
		btnSupprimerall.setBackground(new Color(255, 153, 0));
		btnSupprimerall.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimerall.setHorizontalAlignment(SwingConstants.LEADING);
		btnSupprimerall.setForeground(Color.WHITE);
		btnSupprimerall.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnSupprimerall.setBounds(10, 197, 280, 44);
		panelWest.add(btnSupprimerall);
		
		JButton btnValiderCommande = new JButton("Valider la commande");
		btnValiderCommande.setHorizontalAlignment(SwingConstants.LEADING);
		btnValiderCommande.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnValiderCommande.setForeground(Color.WHITE);
		btnValiderCommande.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnValiderCommande.setBackground(new Color(255, 153, 0));
		btnValiderCommande.setBounds(10, 252, 280, 44);
		panelWest.add(btnValiderCommande);
		
		JButton btnApercu = new JButton("Aper\u00E7u");
		btnApercu.setBackground(new Color(255, 153, 0));
		btnApercu.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setHorizontalAlignment(SwingConstants.LEADING);
		btnApercu.setForeground(Color.WHITE);
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnApercu.setBounds(10, 336, 280, 44);
		panelWest.add(btnApercu);
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBackground(new Color(255, 153, 0));
		btnImprimer.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setHorizontalAlignment(SwingConstants.LEADING);
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setBounds(10, 391, 280, 44);
		panelWest.add(btnImprimer);
		
		JButton btnExport = new JButton("Export");
		btnExport.setHorizontalAlignment(SwingConstants.LEADING);
		btnExport.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setForeground(Color.WHITE);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setBackground(new Color(255, 153, 0));
		btnExport.setBounds(10, 446, 280, 44);
		panelWest.add(btnExport);
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.setBackground(new Color(255, 153, 0));
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAccueil.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Home-48.png")));
		btnAccueil.setHorizontalAlignment(SwingConstants.LEADING);
		btnAccueil.setBounds(10, 533, 280, 57);
		panelWest.add(btnAccueil);
		
		JPanel panelCommande = new JPanel();
		panelCommande.setBackground(new Color(255, 255, 153));
		panelCommande.setBounds(303, 5, 631, 601);
		contentPane.add(panelCommande);
		panelCommande.setLayout(null);
		
		JPanel panelInfos = new JPanel();
		panelInfos.setBackground(new Color(255, 255, 153));
		panelInfos.setBounds(10, 11, 611, 90);
		panelCommande.add(panelInfos);
		panelInfos.setForeground(Color.GRAY);
		panelInfos.setBorder(new TitledBorder(new LineBorder(new Color(255, 153, 0)), "Informations g\u00E9n\u00E9rales", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelInfos.setLayout(null);
		
		JLabel lblCommandeencours = new JLabel("Commande en cours");
		lblCommandeencours.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCommandeencours.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCommandeencours.setBounds(46, 21, 155, 21);
		panelInfos.add(lblCommandeencours);
		
		textCommandeencours = new JTextField();
		textCommandeencours.setBounds(211, 22, 190, 20);
		panelInfos.add(textCommandeencours);
		textCommandeencours.setColumns(10);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDate.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDate.setBounds(411, 21, 35, 21);
		panelInfos.add(lblDate);
		
		textDate = new JTextField();
		textDate.setBounds(456, 22, 145, 20);
		panelInfos.add(textDate);
		textDate.setColumns(10);
		
		JLabel lblNomDuClient = new JLabel("S\u00E9lectionner le nom du client");
		lblNomDuClient.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomDuClient.setHorizontalAlignment(SwingConstants.CENTER);
		lblNomDuClient.setBounds(33, 53, 168, 21);
		panelInfos.add(lblNomDuClient);
		
		JComboBox comboNomClient = new JComboBox();
		comboNomClient.setToolTipText("");
		comboNomClient.setBounds(211, 54, 190, 20);
		panelInfos.add(comboNomClient);
		
		JPanel panelValCommande = new JPanel();
		panelValCommande.setBackground(new Color(255, 255, 153));
		panelValCommande.setBounds(10, 112, 611, 370);
		panelCommande.add(panelValCommande);
		panelValCommande.setForeground(Color.GRAY);
		panelValCommande.setBorder(new TitledBorder(new LineBorder(new Color(255, 153, 0)), "Valeurs de la commande", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelValCommande.setLayout(null);
		
		JLabel lblSelectArticle = new JLabel("S\u00E9lectionner un article");
		lblSelectArticle.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSelectArticle.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelectArticle.setBounds(209, 15, 168, 21);
		panelValCommande.add(lblSelectArticle);
		
		JComboBox comboArticle = new JComboBox();
		comboArticle.setBounds(411, 16, 190, 20);
		panelValCommande.add(comboArticle);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.CENTER);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(219, 46, 62, 20);
		panelValCommande.add(lblCode);
		
		textCode = new JTextField();
		textCode.setBounds(291, 47, 86, 20);
		panelValCommande.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblCategorie = new JLabel("Cat\u00E9gorie");
		lblCategorie.setHorizontalAlignment(SwingConstants.CENTER);
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCategorie.setBounds(387, 46, 62, 20);
		panelValCommande.add(lblCategorie);
		
		textCategorie = new JTextField();
		textCategorie.setBounds(459, 47, 142, 20);
		panelValCommande.add(textCategorie);
		textCategorie.setColumns(10);
		
		JLabel lblDesignation = new JLabel("D\u00E9signation");
		lblDesignation.setHorizontalAlignment(SwingConstants.CENTER);
		lblDesignation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDesignation.setBounds(10, 77, 86, 20);
		panelValCommande.add(lblDesignation);
		
		textDesignation = new JTextField();
		textDesignation.setBounds(106, 78, 103, 20);
		panelValCommande.add(textDesignation);
		textDesignation.setColumns(10);
		
		JLabel lblMontant = new JLabel("Montant");
		lblMontant.setHorizontalAlignment(SwingConstants.CENTER);
		lblMontant.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMontant.setBounds(219, 77, 62, 20);
		panelValCommande.add(lblMontant);
		
		textMontant = new JTextField();
		textMontant.setBounds(290, 78, 86, 20);
		panelValCommande.add(textMontant);
		textMontant.setColumns(10);
		
		JLabel lblQuantite = new JLabel("Quantit\u00E9");
		lblQuantite.setHorizontalAlignment(SwingConstants.CENTER);
		lblQuantite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantite.setBounds(387, 77, 62, 20);
		panelValCommande.add(lblQuantite);
		
		JSpinner spinnerQuantite = new JSpinner();
		spinnerQuantite.setBounds(459, 78, 142, 20);
		panelValCommande.add(spinnerQuantite);
		
		JToolBar toolBarCommande = new JToolBar();
		toolBarCommande.setBackground(new Color(255, 255, 153));
		toolBarCommande.setBounds(126, 109, 380, 63);
		panelValCommande.add(toolBarCommande);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBackground(new Color(255, 255, 153));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAjouter.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Add-New-48.png")));
		toolBarCommande.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.setBackground(new Color(255, 255, 153));
		btnModifier.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarCommande.add(btnModifier);
		
		JButton btnSupprimer_1 = new JButton("Supprimer");
		btnSupprimer_1.setBackground(new Color(255, 255, 153));
		btnSupprimer_1.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/Cancel-48.png")));
		btnSupprimer_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarCommande.add(btnSupprimer_1);
		
		JScrollPane scrollCommande = new JScrollPane();
		scrollCommande.setBounds(10, 183, 591, 176);
		panelValCommande.add(scrollCommande);
		
		table = new JTable();
		scrollCommande.setViewportView(table);
		
		JLabel lblModePaiement = new JLabel("Mode de Paiement");
		lblModePaiement.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/commande/ATM-32.png")));
		lblModePaiement.setHorizontalAlignment(SwingConstants.CENTER);
		lblModePaiement.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblModePaiement.setBounds(90, 503, 171, 25);
		panelCommande.add(lblModePaiement);
		
		JComboBox comboPaiement = new JComboBox();
		comboPaiement.setBounds(271, 506, 114, 20);
		panelCommande.add(comboPaiement);
		
		JLabel lblPanier = new JLabel("0.00\u20AC");
		lblPanier.setBackground(new Color(255, 153, 51));
		lblPanier.setHorizontalAlignment(SwingConstants.CENTER);
		lblPanier.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPanier.setBounds(464, 499, 81, 30);
		panelCommande.add(lblPanier);
		
		JButton btnValiderCommande_1 = new JButton("Valider la commande");
		btnValiderCommande_1.setBackground(new Color(255, 255, 153));
		btnValiderCommande_1.setIcon(new ImageIcon(Commande.class.getResource("/images/gestion/commande/Shopping-Cart-05-48.png")));
		btnValiderCommande_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnValiderCommande_1.setBounds(405, 556, 216, 34);
		panelCommande.add(btnValiderCommande_1);
	}
}
