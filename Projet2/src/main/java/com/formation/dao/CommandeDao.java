package com.formation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.formation.util.ConnexionBdd;
public class CommandeDao {
	 Connection connexion=ConnexionBdd.getInstance();
	
	public  ResultSet getAllCommande(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from commande");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet getUneCommande(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from commande where id="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet getLastCommande(int idclient){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from commande where idclient="+idclient+" and id = (select max(id) from commande where idclient="+idclient+")");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   ResultSet detailCommande(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from commandecreer,article  where idcommande="+id+" and article.id=commandecreer.idarticle");
			/* Exécution d'une requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   void delCommande(String libelle){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("DELETE FROM `commande` WHERE libelle='"+libelle+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public   void updateCommande(int id, int idArticle,int quantite){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("UPDATE `commandecreer` SET `idArticle`="+idArticle+",`quantité`="+quantite+" WHERE id="+id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public   ResultSet addArticledansCommande(int idCommande, int idArticle,int quantite){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("INSERT INTO `commandecreer`(`idcommande`, `idArticle`, `quantité`) VALUES ("+idCommande+","+idArticle+","+quantite+")");
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public   void delArticledansCommande(int idArticle){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("DELETE FROM `commandecreer` where id="+idArticle);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void addCommande(String libelle, int idclient,Date datecommande ){
		Statement state;
		try {
			state = connexion.createStatement();
			int resultat= state.executeUpdate("INSERT INTO `commande`(`libelle`, `idclient`, `datecommande`) VALUES ("+libelle+","+idclient+","+datecommande+")");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
