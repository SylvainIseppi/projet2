package com.formation.controlleur;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.formation.dao.ClientDao;
import com.formation.dao.CommandeDao;
import com.mysql.fabric.xmlrpc.base.Array;

public class CommandeControlleur {
	public String[] lesClients(){
		
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
	
	
	
	public ResultSet infoCommande(String nom){
		int id=0;
		ClientDao cl=new ClientDao();
		ResultSet test=cl.searchUnClient(nom);
		try {
			while(test.next()){
				id=test.getInt("code");
				System.out.println(id);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CommandeDao cd=new CommandeDao();
		ResultSet resultat=null;
//		List<String> infosCommande= new ArrayList<String>();
//
		resultat = cd.getLastCommande(id);
		try {
			if(resultat.next()){
				System.out.println(resultat.getString("libelle"));
				return resultat;
			}
			else{
				System.out.println("résultat vide");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	
	
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
	public String modifierLibelle(String nom){
		ResultSet value=infoCommande(nom);
		if(value!=null){
			String libelle="";
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
