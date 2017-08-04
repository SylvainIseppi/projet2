package com.formation.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.formation.util.ConnexionBdd;

public class ArticleDao {
	Connection connexion = ConnexionBdd.getInstance();
	public ResultSet getAllArticle(){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from article");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public  ResultSet getUnArticle(int id){
		try {
			Statement state= connexion.createStatement();
			ResultSet resultat= state.executeQuery("select * from article where id="+id);
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public  int delArticle(int id){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("DELETE FROM `article` WHERE id="+id);
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public   int addArticle(int codeCat,String categorie, String desi,int quantiteStock,int prixUnitaire){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("INSERT INTO `article`(`codeCategorie`,`categorie`, `designation`, `quantitestock`, `prixUnitaire`) VALUES ("+codeCat+",'"+categorie+"','"+desi+"',"+quantiteStock+","+prixUnitaire+")");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
	public   int updateArticle(int codeCat, String desi,int quantiteStock,int prixUnitaire ,int id,String categorie){
		try {
			Statement state= connexion.createStatement();
			int resultat= state.executeUpdate("UPDATE `article` SET `categorie`="+categorie+",`codeCategorie`="+codeCat+",`designation`='"+desi+"',`quantitestock`="+quantiteStock+",`prixUnitaire`="+prixUnitaire+" WHERE id="+id+")");
			/* Ex�cution d'une requ�te de lecture */
	

			/* R�cup�ration des donn�es du r�sultat de la requ�te de lecture */
			return resultat;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
	}
}
