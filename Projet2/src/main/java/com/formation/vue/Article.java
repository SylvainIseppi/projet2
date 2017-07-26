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

public class Article extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

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
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 193, 710, 357);
		panelArticle.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 255, 153));
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 710, 171);
		panelArticle.add(panel);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(528, 11, 172, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCategorie = new JLabel("Cat\u00E9gorie");
		lblCategorie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCategorie.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCategorie.setBounds(445, 11, 73, 20);
		panel.add(lblCategorie);
		
		textField_1 = new JTextField();
		textField_1.setBounds(130, 11, 291, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCode = new JLabel("Code");
		lblCode.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCode.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCode.setBounds(47, 10, 73, 20);
		panel.add(lblCode);
		
		textField_2 = new JTextField();
		textField_2.setBounds(130, 42, 570, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblDesignation = new JLabel("D\u00E9signation");
		lblDesignation.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDesignation.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDesignation.setBounds(47, 41, 73, 20);
		panel.add(lblDesignation);
		
		textField_3 = new JTextField();
		textField_3.setBounds(528, 73, 154, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblEuro = new JLabel("\u20AC");
		lblEuro.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEuro.setBounds(682, 73, 18, 20);
		panel.add(lblEuro);
		
		JLabel lblPrixUnitaire = new JLabel("Prix Unitaire");
		lblPrixUnitaire.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrixUnitaire.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrixUnitaire.setBounds(445, 72, 73, 20);
		panel.add(lblPrixUnitaire);
		
		textField_4 = new JTextField();
		textField_4.setBounds(367, 73, 54, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		JSlider slider = new JSlider();
		slider.setBounds(130, 73, 227, 20);
		panel.add(slider);
		
		JLabel lblQuantite = new JLabel("Quantit\u00E9");
		lblQuantite.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQuantite.setHorizontalAlignment(SwingConstants.RIGHT);
		lblQuantite.setBounds(47, 72, 73, 20);
		panel.add(lblQuantite);
		
		JToolBar toolBarArticle = new JToolBar();
		toolBarArticle.setBackground(new Color(204, 255, 153));
		toolBarArticle.setBounds(181, 104, 460, 56);
		panel.add(toolBarArticle);
		
		JButton btnAjouter = new JButton("Ajouter");
		btnAjouter.setBackground(new Color(204, 255, 153));
		btnAjouter.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Add-New-48.png")));
		btnAjouter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnAjouter);
		
		JButton btnModifier = new JButton("Modifier");
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
		btnEffacer.setBackground(new Color(204, 255, 153));
		btnEffacer.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Cancel-48.png")));
		btnEffacer.setFont(new Font("Tahoma", Font.PLAIN, 12));
		toolBarArticle.add(btnEffacer);
		
		JLabel lblTrierPar = new JLabel("Trier par");
		lblTrierPar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTrierPar.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Sort-Ascending-32.png")));
		lblTrierPar.setHorizontalAlignment(SwingConstants.CENTER);
		lblTrierPar.setBounds(53, 561, 97, 29);
		panelArticle.add(lblTrierPar);
		
		textField_5 = new JTextField();
		textField_5.setBounds(487, 566, 233, 20);
		panelArticle.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblRechercher = new JLabel("Rechercher");
		lblRechercher.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblRechercher.setIcon(new ImageIcon(Article.class.getResource("/images/gestion/Search-32.png")));
		lblRechercher.setHorizontalAlignment(SwingConstants.CENTER);
		lblRechercher.setBounds(366, 561, 111, 29);
		panelArticle.add(lblRechercher);
		
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
	}
}
