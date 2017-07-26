package com.formation.requete;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.basesql.ConnexionBdd;

public class RequeteArticle {
	static Connection connexion = ConnexionBdd.getInstance();
	public  static ResultSet getAllArticle(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from article");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static  ResultSet getUnArticle(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from article where id="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static  ResultSet delArticle(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("DELETE FROM `article` WHERE id="+id);
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static  ResultSet addArticle(int codeCat, String desi,int quantiteStock,int prixUnitaire){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("INSERT INTO `article`(`codeCategorie`, `designation`, `quantitestock`, `prixUnitaire`) VALUES ("+codeCat+",'"+desi+"',"+quantiteStock+","+prixUnitaire+")");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static  ResultSet updateArticle(int codeCat, String desi,int quantiteStock,int prixUnitaire ,int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("UPDATE `article` SET `codeCategorie`="+codeCat+",`designation`='"+desi+"',`quantitestock`="+quantiteStock+",`prixUnitaire`="+prixUnitaire+" WHERE id="+id+")");
			/* Exécution d'une requête de lecture */
	

			/* Récupération des données du résultat de la requête de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
