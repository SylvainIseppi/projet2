package com.formation.requete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.formation.basesql.ConnexionBdd;


public class RequeteClient {
	 Connection connexion=ConnexionBdd.getInstance();
	
	public   ResultSet getAllClient(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from client");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet getUnClient(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from client where code="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet AjoutClient(boolean carte,String prenom,String nom,String adresse,int fixe,int mobile,String mail,String remarque){
		Date date =new Date();
			
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("INSERT INTO `client`(`dateCreation`, `cartedefidélité`, `prenom`, `nom`, `adresse`, `fixe`, `mobile`, `email`, `remarques`) VALUES ("+new SimpleDateFormat("yyyy-MM-dd").format(date)+","+carte+","+prenom+","+nom+","+adresse+","+fixe+","+mobile+","+mail+","+remarque+") ");
			/* Exécution d'une requête de lecture */
			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet DelClient(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("DELETE FROM `client` WHERE code="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public  void UpdateClient(int id,boolean carte,String prenom,String nom,String adresse,int fixe,int mobile,String mail,String remarque){
		Date date =new Date();
			
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("UPDATE `client` SET `cartedefidélité`="+carte+",`prenom`="+prenom+",`nom`="+nom+",`adresse`="+adresse+",`fixe`="+fixe+",`mobile`="+mobile+",`email`="+mail+",`remarques`="+remarque+" WHERE code="+id+") ");
			/* Exécution d'une requête de lecture */
			/* Récupération des données du résultat de la requête de lecture */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
