package com.formation.requete;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.Locale;

import javax.swing.JOptionPane;

import com.formation.basesql.ConnexionBdd;
import com.formation.objet.User;
import com.formation.vue.Accueil;
import com.formation.vue.Connexion;

public class RequeteConnexion {
	static Connection connexion=ConnexionBdd.getInstance();
	public static  boolean getUser(String login, String mdp){
		
		try {
			System.out.println(login + mdp);
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select login,role from user where login='"+login+"' and pass='"+mdp+"'");
			/* Exécution d'une requête de lecture */
			/* Récupération des données du résultat de la requête de lecture */
			if(resultat.next()!=false){
				User droit=User.getUser(resultat.getInt( "role" ), resultat.getString( "login" ));
				return true;
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
}
