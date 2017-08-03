package com.formation.controlleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.formation.dao.ArticleDao;
import com.formation.dao.ClientDao;
import com.formation.dao.CommandeDao;

public class CommandeControlleur {
	public String[] lesClients(){
		//déclare les Dao nécessaire
		CommandeDao co=new CommandeDao();
		ArticleDao ad=new ArticleDao();
		ClientDao cd=new ClientDao();
		ResultSet resultat=cd.getAllClient();
		//int compteur =0;
		int index=0;
		int taille=0;
		try {
			taille = resultat.getMetaData().getColumnCount();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		String clients[] =new String[taille];
		try {
			while(resultat.next()){
				clients[index]=resultat.getString("nom");
				index++;
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clients;
	}
	
	
	// retourne la derniere commande d'un client
	public ResultSet infoCommande(String nom){
		int id=0;
		ClientDao cl=new ClientDao();
		ResultSet test=cl.searchUnClient(nom);
		try {
			while(test.next()){
				id=test.getInt("code");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommandeDao cd=new CommandeDao();
		ResultSet resultat=null;
		resultat = cd.getLastCommande(id);
		try {
			if(resultat.next()){
				return resultat;
			}
			else{
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	//creer une méthode pour retourner tout les articles d'une commande afin de les afficher dans la table
	public Object[][] getArticlesCommande(int idCommande){
		int taille=0;
		int compteur=0;
		CommandeDao cd=new CommandeDao();
		ResultSet resultat=cd.detailCommande(idCommande);
		if(resultat!=null){
			try {
				taille = resultat.getMetaData().getColumnCount();
				Object[][] obj =new Object[taille][];
				while(resultat.next()){
					String[] contenu=new String[6];
					obj[compteur][0]=resultat.getInt("idArticle");
					obj[compteur][1]=resultat.getInt("codeCategorie");
					obj[compteur][2]=resultat.getInt("designation");
					obj[compteur][3]=resultat.getInt("quantite");
					obj[compteur][4]=resultat.getInt("prixUnitaire");
					obj[compteur][5]=resultat.getInt("quantite")*resultat.getInt("prixUnitaire");
					compteur++;
					
				}
				return obj;
			} catch (SQLException e1) {
				
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return new Object[0][];
		
	}
	
	
	// permet de modifier la date pour l'afficher
	public String modifierDate(String nom){
		ResultSet value=infoCommande(nom);
		if(value!=null){
			String libelle="";
			try {
				return new SimpleDateFormat("dd-MM-yyyy").format(value.getDate("datecommande"));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return "";
		}
		else{
			return "";
		}
	}
	// permet d'afficher le libelle de la commande
	public String modifierLibelle(String nom){
		ResultSet value=infoCommande(nom);
		if(value!=null){
			try {
				return value.getString("libelle").toString();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
		else{
			return "pas de commande";
		}
	}
}
