package com.formation.vue;

import javax.swing.JPanel;
import java.awt.Color;

public class AjoutClient extends JPanel {

	/**
	 * Create the panel.
	 */
	public AjoutClient() {
		setLayout(null);
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(new Color(0, 153, 255));
		panelMenu.setBounds(0, 0, 180, 650);
		add(panelMenu);

	}

}
