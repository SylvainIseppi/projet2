package com.formation.controlleur;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.formation.dao.ClientDao;
import com.formation.model.ClientModel;

public class ClientControlleur {
	ClientDao cd = new ClientDao();

	public Object[][] lesClients() {
		ResultSet resultat = cd.getAllClient();
		int taille = 0;

		try {
			while (resultat.next()) {
				taille++;
			}
			while (resultat.previous()) {

			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		int compteur = 0;

		try {
			System.out.println(taille);
			Object[][] obj = new Object[taille][5];

			while (resultat.next()) {
				obj[compteur] = new Object[] { resultat.getInt("code"), resultat.getInt("dateCreation"),
						resultat.getInt("cartedefidélité"), resultat.getString("prenom"), resultat.getString("nom"),
						resultat.getString("adresse"), resultat.getInt("fixe"), resultat.getInt("mobile"),
						resultat.getString("email"), resultat.getString("remarques") };
				compteur++;
			}

			return obj;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public ClientModel selecUnClient(int id) {
		ResultSet resultat = cd.getUnClient(id);

		try {
			while (resultat.next()) {
				return new ClientModel(id, resultat.getInt("fixe"), resultat.getInt("mobile"), resultat.getString("nom"), resultat.getString("prenom"), resultat.getString("adresse"), resultat.getString("dateCreation"), resultat.getString("email"), resultat.getString("remarques"), resultat.getBoolean("cartedefidélité"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public void updateClient(int id, boolean carte, String prenom, String nom, String adresse, int fixe, int mobile,
			String mail, String remarque) {
			cd.UpdateClient(id, carte, prenom, nom, adresse, fixe, mobile, mail, remarque);
	}
	
	public void DelClient(int id){
		cd.DelClient(id);
	}
	
	public void AjoutClient(int id, boolean carte, String prenom, String nom, String adresse, int fixe, int mobile,
			String mail, String remarque) {
		cd.AjoutClient(carte, prenom, nom, adresse, fixe, mobile, mail, remarque);
	}
}