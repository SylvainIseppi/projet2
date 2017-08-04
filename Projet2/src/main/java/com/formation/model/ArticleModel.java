package com.formation.model;

public class ArticleModel {
	int id, codeCategorie, quantitestock, prixUnitaire;
	String  categorie,designation;
	public ArticleModel(int id, int codeCategorie, int quantitestock, int prixUnitaire, String categorie,
			String designation) {
		super();
		this.id = id;
		this.codeCategorie = codeCategorie;
		this.quantitestock = quantitestock;
		this.prixUnitaire = prixUnitaire;
		this.categorie = categorie;
		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(int codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public int getQuantitestock() {
		return quantitestock;
	}
	public void setQuantitestock(int quantitestock) {
		this.quantitestock = quantitestock;
	}
	public int getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
}
