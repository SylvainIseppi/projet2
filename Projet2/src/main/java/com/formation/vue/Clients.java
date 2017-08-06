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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.formation.controlleur.ClientControlleur;
import com.formation.model.ArticleModel;
import com.formation.model.ClientModel;

public class Clients extends JFrame {

	private JPanel contentPane;
	private JTable tableClients;
	private JTextField textCode;
	private JTextField textCreeLe;
	private JTextField textPrenom;
	private JTextField textNom;
	private JTextField textAdresse;
	private JTextField textNumFixe;
	private JTextField textNumMobile;
	private JTextField textEmail;
	private Clients cli;
	ClientControlleur cc = new ClientControlleur();
	private int idClient;

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
		cli = this;
		setTitle("Gestion des Clients");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelWest = new JPanel();
		panelWest.setBounds(0, 0, 184, 611);
		panelWest.setBackground(new Color(0, 153, 255));
		contentPane.add(panelWest);
		panelWest.setLayout(new MigLayout("", "[]", "[][][][][][][][][][][][][25.00][][][][][][][][]"));
		
		JLabel lblClient = new JLabel("Clients");
		lblClient.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClient.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/client/People-64-actif.png")));
		panelWest.add(lblClient, "cell 0 0");
		
		JButton btnAjouter = new JButton("Ajouter        ");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				AjoutClient ac=new AjoutClient(cli);
				setContentPane(ac);
				
			}
		});
		btnAjouter.setBackground(new Color(0, 153, 255));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAjouter.setForeground(Color.WHITE);
		btnAjouter.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Add-New-48.png")));
		panelWest.add(btnAjouter, "cell 0 1");
		
		JButton btnRechercher = new JButton("Rechercher  ");
		btnRechercher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				contentPane.setVisible(false);
				RechercherClient rc = new RechercherClient(cli);
				setContentPane(rc);
			}
		});
		btnRechercher.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Search-48.png")));
		btnRechercher.setBackground(new Color(0, 153, 255));
		btnRechercher.setForeground(Color.WHITE);
		btnRechercher.setFont(new Font("Tahoma", Font.PLAIN, 14));
		panelWest.add(btnRechercher, "cell 0 2");
		
		JButton btnModifier = new JButton("Modifier        ");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				contentPane.setVisible(false);
				AjoutClient ac=new AjoutClient(cli);
				setContentPane(ac);
			}
		});
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
		panelWest.add(btnApercu, "cell 0 9");
		
		JButton btnImprimer = new JButton("Imprimer      ");
		btnImprimer.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setBackground(new Color(0, 153, 255));
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnImprimer.setForeground(Color.WHITE);
		panelWest.add(btnImprimer, "cell 0 11");
		
		JButton btnExport = new JButton("Export         ");
		btnExport.setBackground(new Color(0, 153, 255));
		btnExport.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Data-Export-48.png")));
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setForeground(Color.WHITE);
		panelWest.add(btnExport, "cell 0 13");
		
		JButton btnAccueil = new JButton("Accueil          ");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil a=new Accueil();
				a.setVisible(true);
				fermerClient();
			}
		});
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAccueil.setBackground(new Color(0, 153, 255));
		btnAccueil.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Home-48.png")));
		panelWest.add(btnAccueil, "cell 0 15");
		
		JPanel panelClients = new JPanel();
		panelClients.setBounds(184, 0, 726, 611);
		panelClients.setBackground(new Color(102, 204, 255));
		contentPane.add(panelClients);
		panelClients.setLayout(null);
		
		JPanel panelClientRens = new JPanel();
		panelClientRens.setBackground(new Color(102, 204, 255));
		panelClientRens.setBorder(new LineBorder(new Color(0, 0, 0)));
		panelClientRens.setBounds(10, 11, 706, 286);
		panelClients.add(panelClientRens);
		panelClientRens.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setBounds(10, 11, 74, 25);
		panelClientRens.add(lblCode);
		
		textCode = new JTextField();
		textCode.setEnabled(false);
		textCode.setBounds(94, 14, 178, 20);
		panelClientRens.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblCreeLe = new JLabel("Cr\u00E9\u00E9 le");
		lblCreeLe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCreeLe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCreeLe.setBounds(282, 12, 74, 25);
		panelClientRens.add(lblCreeLe);
		
		textCreeLe = new JTextField();
		textCreeLe.setEnabled(false);
		textCreeLe.setBounds(366, 14, 178, 20);
		panelClientRens.add(textCreeLe);
		textCreeLe.setColumns(10);
		
		JCheckBox chckbxCarteDeFidelite = new JCheckBox("Carte de Fid\u00E9lit\u00E9");
		chckbxCarteDeFidelite.setForeground(Color.BLACK);
		chckbxCarteDeFidelite.setEnabled(false);
		chckbxCarteDeFidelite.setBackground(new Color(102, 204, 255));
		chckbxCarteDeFidelite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		chckbxCarteDeFidelite.setHorizontalAlignment(SwingConstants.CENTER);
		chckbxCarteDeFidelite.setBounds(565, 13, 131, 23);
		panelClientRens.add(chckbxCarteDeFidelite);
		
		JLabel lblPrenom = new JLabel("Pr\u00E9nom");
		lblPrenom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrenom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrenom.setBounds(10, 44, 74, 20);
		panelClientRens.add(lblPrenom);
		
		textPrenom = new JTextField();
		textPrenom.setEnabled(false);
		textPrenom.setBounds(94, 45, 178, 20);
		panelClientRens.add(textPrenom);
		textPrenom.setColumns(10);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNom.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNom.setBounds(282, 42, 74, 25);
		panelClientRens.add(lblNom);
		
		textNom = new JTextField();
		textNom.setEnabled(false);
		textNom.setBounds(366, 45, 330, 20);
		panelClientRens.add(textNom);
		textNom.setColumns(10);
		
		JLabel lblAdresse = new JLabel("Adresse");
		lblAdresse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAdresse.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblAdresse.setBounds(10, 77, 74, 17);
		panelClientRens.add(lblAdresse);
		
		textAdresse = new JTextField();
		textAdresse.setEnabled(false);
		textAdresse.setBounds(94, 76, 602, 20);
		panelClientRens.add(textAdresse);
		textAdresse.setColumns(10);
		
		JLabel lblNumFixe = new JLabel("Fixe");
		lblNumFixe.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumFixe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumFixe.setBounds(10, 108, 74, 17);
		panelClientRens.add(lblNumFixe);
		
		textNumFixe = new JTextField();
		textNumFixe.setEnabled(false);
		textNumFixe.setBounds(94, 107, 178, 20);
		panelClientRens.add(textNumFixe);
		textNumFixe.setColumns(10);
		
		JLabel lblNumMobile = new JLabel("Mobile");
		lblNumMobile.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumMobile.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumMobile.setBounds(283, 104, 73, 25);
		panelClientRens.add(lblNumMobile);
		
		textNumMobile = new JTextField();
		textNumMobile.setEnabled(false);
		textNumMobile.setBounds(366, 107, 330, 20);
		panelClientRens.add(textNumMobile);
		textNumMobile.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmail.setBounds(11, 135, 73, 25);
		panelClientRens.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setEnabled(false);
		textEmail.setBounds(94, 138, 602, 20);
		panelClientRens.add(textEmail);
		textEmail.setColumns(10);
		
		JLabel lblRemarques = new JLabel("Remarques");
		lblRemarques.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRemarques.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRemarques.setBounds(11, 168, 73, 25);
		panelClientRens.add(lblRemarques);
		
		JScrollPane scrollRemarques = new JScrollPane();
		scrollRemarques.setBounds(94, 169, 602, 106);
		panelClientRens.add(scrollRemarques);
		
		JTextArea textAreaRemq = new JTextArea();
		textAreaRemq.setEnabled(false);
		scrollRemarques.setViewportView(textAreaRemq);
		
		JScrollPane scrollClients = new JScrollPane();
		scrollClients.setBounds(10, 308, 706, 262);
		panelClients.add(scrollClients);
		ClientControlleur cc = new ClientControlleur();
		Object[][] modele = cc.lesClients();
		tableClients = new JTable();
		tableClients.setColumnSelectionAllowed(true);
		tableClients.setCellSelectionEnabled(true);
		tableClients.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tableClients.setModel(new DefaultTableModel(modele,
			new String[] {
				"Code", "Nom", "Pr\u00E9nom", "Carte Fid\u00E9lit\u00E9", "Date Cr\u00E9ation"
			}
		));
		tableClients.getColumnModel().getColumn(1).setPreferredWidth(106);
		tableClients.getColumnModel().getColumn(2).setPreferredWidth(106);
		tableClients.getColumnModel().getColumn(3).setPreferredWidth(84);
		tableClients.getColumnModel().getColumn(4).setPreferredWidth(93);
		tableClients.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				int numLigne =tableClients.getSelectedRow();
				System.out.println(numLigne);
				if(numLigne >=0 ){
					int id=Integer.parseInt(modele[numLigne][0].toString());
					ClientModel c=cc.selecUnClient(id);
					textCode.setText(String.valueOf(c.getId()));
					textCreeLe.setText(String.valueOf(c.getDateCréation()));
					textPrenom.setText(String.valueOf(c.getPrénom()));
					textNom.setText(String.valueOf(c.getNom()));
					textAdresse.setText(String.valueOf(c.getAdresse()));
					textNumFixe.setText(String.valueOf(c.getFixe()));
					textNumMobile.setText(String.valueOf(c.getMobile()));
					textEmail.setText(String.valueOf(c.getEmail()));
					updateid(id);
					
				}
			}
		});
		scrollClients.setViewportView(tableClients);
		
		JLabel lblListe = new JLabel("Trier la liste par");
		lblListe.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblListe.setIcon(new ImageIcon(Clients.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		lblListe.setBounds(20, 581, 126, 14);
		panelClients.add(lblListe);
		
		JComboBox comboListe = new JComboBox();
		comboListe.setBounds(156, 579, 81, 20);
		panelClients.add(comboListe);
	}
	private void fermerClient(){
		this.setVisible(false);
	}
	
	private void updateid(int id){
		this.idClient=id;
	}
}
