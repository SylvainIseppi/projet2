package com.formation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import com.formation.util.ConnexionBdd;


public class ClientDao {
	 Connection connexion=ConnexionBdd.getInstance();
	
	public   ResultSet getAllClient(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from client");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
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
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   void AjoutClient(boolean carte,String prenom,String nom,String adresse,int fixe,int mobile,String mail,String remarque){
		Date date =new Date();
			
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("INSERT INTO `client`(`dateCreation`, `cartedefid�lit�`, `prenom`, `nom`, `adresse`, `fixe`, `mobile`, `email`, `remarques`) VALUES ('"+new SimpleDateFormat("yyyy-MM-dd").format(date)+"',"+carte+",'"+prenom+"','"+nom+"','"+adresse+"',"+fixe+","+mobile+",'"+mail+"','"+remarque+"')");
			/* Ex�cution d'une requ�te de lecture */
			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public   void DelClient(int id){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("DELETE FROM `client` WHERE code="+id);
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public  void UpdateClient(int id,boolean carte,String prenom,String nom,String adresse,int fixe,int mobile,String mail,String remarque){
		Date date =new Date();
			
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("UPDATE `client` SET `cartedefid�lit�`="+carte+",`prenom`="+prenom+",`nom`="+nom+",`adresse`="+adresse+",`fixe`="+fixe+",`mobile`="+mobile+",`email`="+mail+",`remarques`="+remarque+" WHERE code="+id+") ");
			/* Ex�cution d'une requ�te de lecture */
			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public ResultSet searchUnClient(String nom){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("SELECT code FROM client where nom='"+nom+"'");
			/* Ex�cution d'une requ�te de lecture */
			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
