package com.formation.vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Accueil extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Accueil frame = new Accueil();
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
	public Accueil() {
		setResizable(false);
		setTitle("Accueil");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 489);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmParamtres = new JMenuItem("Param\u00E8tres");
		mnFichier.add(mntmParamtres);
		
		JMenuItem mntmVues = new JMenuItem("Vues");
		menuBar.add(mntmVues);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panelAction = new JPanel();
		panelAction.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panelAction, BorderLayout.WEST);
		
		JLabel lblSociete = new JLabel("SARL Luna");
		lblSociete.setHorizontalAlignment(SwingConstants.CENTER);
		lblSociete.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnQuitter.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnQuitter.setIcon(new ImageIcon(Accueil.class.getResource("/images/connection/Stop-48.png")));
		
		JLabel lblOptions = new JLabel("Affichage option");
		lblOptions.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptions.setForeground(Color.WHITE);
		GroupLayout gl_panelAction = new GroupLayout(panelAction);
		gl_panelAction.setHorizontalGroup(
			gl_panelAction.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panelAction.createSequentialGroup()
					.addGap(22)
					.addGroup(gl_panelAction.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnQuitter, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblSociete, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(24, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panelAction.createSequentialGroup()
					.addContainerGap(44, Short.MAX_VALUE)
					.addComponent(lblOptions)
					.addGap(46))
		);
		gl_panelAction.setVerticalGroup(
			gl_panelAction.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_panelAction.createSequentialGroup()
					.addGap(25)
					.addComponent(lblSociete, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(lblOptions, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
					.addGap(276)
					.addComponent(btnQuitter)
					.addGap(28))
		);
		panelAction.setLayout(gl_panelAction);
		
		JPanel panelBoutons = new JPanel();
		contentPane.add(panelBoutons, BorderLayout.CENTER);
		panelBoutons.setLayout(new MigLayout("", "[][][]", "[][][]"));
		
		JButton btnArticle = new JButton("");
		btnArticle.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Product-128.png")));
		panelBoutons.add(btnArticle, "cell 1 0");
		
		JButton btnClient = new JButton("");
		btnClient.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnClient.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/People-128.png")));
		panelBoutons.add(btnClient, "cell 0 1");
		
		JButton btnStatistique = new JButton("");
		btnStatistique.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Diagram-128.png")));
		panelBoutons.add(btnStatistique, "cell 1 1");
		
		JButton btnCommande = new JButton("");
		btnCommande.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Shopping-Bag-128.png")));
		panelBoutons.add(btnCommande, "cell 2 1");
		
		JButton btnParametres = new JButton("");
		btnParametres.setIcon(new ImageIcon(Accueil.class.getResource("/images/accueil/Settings-02-128.png")));
		panelBoutons.add(btnParametres, "cell 1 2");
	}
}
