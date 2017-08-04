package com.formation.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexionBdd {
	private Connection instance;
	static String url = "jdbc:mysql://localhost:3306/projet";
	static String utilisateur = "root";
	static String mdp = "";
	static Connection connexion = null;
	private static Connection ConnexionBdd() {
		try {
		    Class.forName( "com.mysql.jdbc.Driver" );
		    connexion = DriverManager.getConnection( url, utilisateur, mdp );
		} catch ( ClassNotFoundException e ) {
			System.out.println("probleme class");
		    /* G�rer les �ventuelles erreurs ici. */
		} catch (SQLException e) {
			System.out.println("probleme sql");
			e.printStackTrace();
		}
		return connexion;
	}
	public static Connection getInstance() {
        if (null == connexion) {
            connexion =ConnexionBdd();
        }
        return connexion;
    }
	
	
}
