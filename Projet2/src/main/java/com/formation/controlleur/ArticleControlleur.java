package com.formation.controlleur;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.formation.dao.ArticleDao;
import com.formation.model.ArticleModel;

public class ArticleControlleur {
	ArticleDao ad=new ArticleDao();
	
	public Object[][] lesArticles() {
		ResultSet resultat=ad.getAllArticle();
		int compteur=0;
		try {
			Object[][] obj=new Object[resultat.getMetaData().getColumnCount()][5];
			
			while(resultat.next()){
				obj[compteur]=new Object[] {resultat.getInt("id"),resultat.getInt("codeCategorie"),resultat.getString("designation"),resultat.getInt("quantitestock"),resultat.getInt("prixUnitaire")};
				compteur++;
			}
			return obj;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public ArticleModel selecUnArticle(int id){
		ResultSet resultat=ad.getUnArticle(id);
		try {
			while(resultat.next()){
				return new ArticleModel(id, resultat.getInt("codeCategorie"), resultat.getInt("quantitestock"), resultat.getInt("prixUnitaire"), resultat.getString("categorie"), resultat.getString("designation"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public void updateArticle(int id, int codeCat, int quantiteStock, int prixUnitaire,String desi, String categorie){
		int resultat=ad.updateArticle(codeCat, desi, quantiteStock, prixUnitaire, id,categorie);
	}
	public void addArticle(int codeCat,String categorie,String desi,int quantiteStock,int prixUnitaire){
		ad.addArticle(codeCat, categorie, desi, quantiteStock, prixUnitaire);
	}
}
