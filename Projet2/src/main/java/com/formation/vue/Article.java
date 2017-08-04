package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.JSlider;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

import com.formation.controlleur.ArticleControlleur;
import com.formation.model.ArticleModel;

import javax.swing.ListSelectionModel;


public class Article extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textCategorie;
	private JTextField textCode;
	private JTextField textDesignation;
	private JTextField textPrixUnitaire;
	private JTextField textQuantite;
	private JTextField textRechercher;
	ArticleControlleur ac=new ArticleControlleur();
	private int idArticle;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Article frame = new Article();
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
	public Article() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 926, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panelWest = new JPanel();
		panelWest.setBackground(new Color(102, 153, 0));
		contentPane.add(panelWest, BorderLayout.WEST);
		
		JLabel lblArticles = new JLabel("Articles");
		lblArticles.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/article/Product-64-actif.png")));
		lblArticles.setHorizontalAlignment(SwingConstants.CENTER);
		lblArticles.setFont(new Font("Tahoma", Font.BOLD, 16));
		
		JButton btnApercu = new JButton("Aper\u00E7u");
		btnApercu.setBackground(new Color(102, 153, 0));
		btnApercu.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Preview-48.png")));
		btnApercu.setForeground(Color.WHITE);
		btnApercu.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnImprimer = new JButton("Imprimer");
		btnImprimer.setBackground(new Color(102, 153, 0));
		btnImprimer.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Printer-48.png")));
		btnImprimer.setForeground(Color.WHITE);
		btnImprimer.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JButton btnExport = new JButton("Export");
		btnExport.setBackground(new Color(102, 153, 0));
		btnExport.setForeground(Color.WHITE);
		btnExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExport.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Data-Export-48.png")));
		
		JButton btnAccueil = new JButton("Accueil");
		btnAccueil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Accueil a=new Accueil();
				a.setVisible(true);
				fermerArticle();
			}
		});
		btnAccueil.setBackground(new Color(102, 153, 0));
		btnAccueil.setForeground(Color.WHITE);
		btnAccueil.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAccueil.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Home-48.png")));
		GroupLayout gl_panelWest = new GroupLayout(panelWest);
		gl_panelWest.setHorizontalGroup(
			gl_panelWest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWest.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panelWest.createParallelGroup(Alignment.LEADING)
						.addComponent(btnAccueil, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(lblArticles, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(btnExport, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(btnImprimer, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
						.addComponent(btnApercu, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
					.addContainerGap())
		);
		gl_panelWest.setVerticalGroup(
			gl_panelWest.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWest.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblArticles)
					.addGap(132)
					.addComponent(btnApercu)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnImprimer)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnExport)
					.addPreferredGap(ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
					.addComponent(btnAccueil)
					.addContainerGap())
		);
		panelWest.setLayout(gl_panelWest);
		
		JPanel panelArticle = new JPanel();
		panelArticle.setBackground(new Color(204, 255, 153));
		contentPane.add(panelArticle, BorderLayout.CENTER);
		panelArticle.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 710, 171);
		panelArticle.add(panel);
		panel.setLayout(null);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setBounds(47, 10, 73, 20);
		panel.add(lblCode);
		
		textCode = new JTextField();
		textCode.setBounds(130, 11, 291, 20);
		panel.add(textCode);
		textCode.setColumns(10);
		
		JLabel lblCategorie = new JLabel("Cat\u00E9gorie");
		lblCategorie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCategorie.setBounds(445, 11, 73, 20);
		panel.add(lblCategorie);
		
		textCategorie = new JTextField();
		textCategorie.setBounds(528, 11, 172, 20);
		panel.add(textCategorie);
		textCategorie.setColumns(10);
		
		JLabel lblDesignation = new JLabel("D\u00E9signation");
		lblDesignation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesignation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDesignation.setBounds(47, 41, 73, 20);
		panel.add(lblDesignation);
		
		textDesignation = new JTextField();
		textDesignation.setBounds(130, 42, 570, 20);
		panel.add(textDesignation);
		textDesignation.setColumns(10);
		
		JLabel lblQuantite = new JLabel("Quantit\u00E9");
		lblQuantite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantite.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantite.setBounds(47, 72, 73, 20);
		panel.add(lblQuantite);
		
		JSlider sliderQuantite = new JSlider();
		sliderQuantite.setMaximum(500);
		sliderQuantite.setBounds(130, 73, 227, 20);
		panel.add(sliderQuantite);
		
		textQuantite = new JTextField();
		textQuantite.setBounds(367, 73, 54, 20);
		panel.add(textQuantite);
		textQuantite.setColumns(10);
		
		JLabel lblPrixUnitaire = new JLabel("Prix Unitaire");
		lblPrixUnitaire.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrixUnitaire.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrixUnitaire.setBounds(445, 72, 73, 20);
		panel.add(lblPrixUnitaire);
		
		textPrixUnitaire = new JTextField();
		textPrixUnitaire.setBounds(528, 73, 154, 20);
		panel.add(textPrixUnitaire);
		textPrixUnitaire.setColumns(10);
		
		JLabel lblEuro = new JLabel("\u20AC");
		lblEuro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEuro.setBounds(682, 73, 18, 20);
		panel.add(lblEuro);
		
		JToolBar toolBarArticle = new JToolBar();
		toolBarArticle.setBackground(new Color(204, 255, 153));
		toolBarArticle.setBounds(181, 104, 460, 56);
		panel.add(toolBarArticle);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int codeCat=Integer.parseInt(textCode.getText());
				String cat=textCategorie.getText();
				String desi=textDesignation.getText();
				int quantite=Integer.parseInt(textQuantite.getText());
				int prixUnitaire=Integer.parseInt(textPrixUnitaire.getText());
				ac.addArticle(codeCat, cat, desi, quantite, prixUnitaire);
				refresh();
				
			}
		});
		btnAjouter.setBackground(new Color(204, 255, 153));
		btnAjouter.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Add-New-48.png")));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnModifier.setBackground(new Color(204, 255, 153));
		btnModifier.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Data-Edit-48.png")));
		btnModifier.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnModifier);
		
		JButton btnSupprimer = new JButton("Supprimer");
		btnSupprimer.setBackground(new Color(204, 255, 153));
		btnSupprimer.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Garbage-Open-48.png")));
		btnSupprimer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnSupprimer);
		
		JButton btnEffacer = new JButton("Effacer");
		btnEffacer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textCode.setText("");
				textCategorie.setText("");
				textDesignation.setText("");
				textQuantite.setText("");
				textPrixUnitaire.setText("");
			}
		});
		btnEffacer.setBackground(new Color(204, 255, 153));
		btnEffacer.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Cancel-48.png")));
		btnEffacer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnEffacer);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 193, 710, 357);
		panelArticle.add(scrollPane);
		ArticleControlleur ac=new ArticleControlleur();
		Object[][] modele=ac.lesArticles();
		table = new JTable();
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setModel(new DefaultTableModel(
			modele,
			new String[] {
				"code", "Code Cat\u00E9gorie", "D\u00E9signation", "Quantit\u00E9", "Prix Unitaire"
			}
		));
		table.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent evt){
				int numLigne =table.getSelectedRow();
				if(numLigne >=0 ){
					int id=Integer.parseInt(modele[numLigne][0].toString());
					ArticleModel a=ac.selecUnArticle(id);
					textCode.setText(String.valueOf(a.getCodeCategorie()));
					textCategorie.setText(String.valueOf(a.getCategorie()));
					textDesignation.setText(String.valueOf(a.getDesignation()));
					textPrixUnitaire.setText(String.valueOf(a.getPrixUnitaire()));
					textQuantite.setText(String.valueOf(a.getQuantitestock()));
					updateid(id);
					
				}
			}
		});
		table.getColumnModel().getColumn(1).setPreferredWidth(118);
		table.getColumnModel().getColumn(2).setPreferredWidth(125);
		table.getColumnModel().getColumn(4).setPreferredWidth(110);
		scrollPane.setViewportView(table);
		
		JLabel lblTrierPar = new JLabel("Trier par");
		lblTrierPar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTrierPar.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		lblTrierPar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrierPar.setBounds(53, 561, 97, 29);
		panelArticle.add(lblTrierPar);
		
		JRadioButton rdbtnCode = new JRadioButton("Code");
		rdbtnCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnCode.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCode.setBackground(new Color(204, 255, 153));
		rdbtnCode.setBounds(156, 565, 73, 23);
		panelArticle.add(rdbtnCode);
		
		JRadioButton rdbtnCategorie = new JRadioButton("Cat\u00E9gorie");
		rdbtnCategorie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		rdbtnCategorie.setHorizontalAlignment(SwingConstants.CENTER);
		rdbtnCategorie.setBackground(new Color(204, 255, 153));
		rdbtnCategorie.setBounds(231, 565, 89, 23);
		panelArticle.add(rdbtnCategorie);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRechercher.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Search-32.png")));
		lblRechercher.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercher.setBounds(366, 561, 111, 29);
		panelArticle.add(lblRechercher);
		
		textRechercher = new JTextField();
		textRechercher.setBounds(487, 566, 233, 20);
		panelArticle.add(textRechercher);
		textRechercher.setColumns(10);
	}
	private void fermerArticle(){
		this.setVisible(false);
	}
	private void refresh(){
		Article a=new Article();
		a.setVisible(true);
		this.setVisible(false);
	}
	private void updateid(int id){
		this.idArticle=id;
	}
}
