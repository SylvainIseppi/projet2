package com.formation.model;

public class ClientModel 
{
	int id, fixe, mobile;
	String Nom, Prénom, Adresse, DateCréation, Email, Remarques;
	boolean CarteFidélité;
	
	public ClientModel(int id, int fixe, int mobile, String nom, String prénom, String adresse, String dateCréation,
			String email, String remarques, boolean carteFidélité) {
		super();
		this.id = id;
		this.fixe = fixe;
		this.mobile = mobile;
		this.Nom = nom;
		this.Prénom = prénom;
		this.Adresse = adresse;
		this.DateCréation = dateCréation;
		this.Email = email;
		this.Remarques = remarques;
		this.CarteFidélité = carteFidélité;
	}
	
	public int getFixe() {
		return fixe;
	}

	public void setFixe(int fixe) {
		this.fixe = fixe;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getAdresse() {
		return Adresse;
	}

	public void setAdresse(String adresse) {
		Adresse = adresse;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getRemarques() {
		return Remarques;
	}

	public void setRemarques(String remarques) {
		Remarques = remarques;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() 
	{
		return Nom;
	}

	public void setNom(String nom) 
	{
		Nom = nom;
	}

	public String getPrénom() 
	{
		return Prénom;
	}

	public void setPrénom(String prénom) 
	{
		Prénom = prénom;
	}

	public boolean getCarteFidélité() 
	{
		return CarteFidélité;
	}

	public void setCarteFidélité(boolean carteFidélité) 
	{
		CarteFidélité = carteFidélité;
	}

	public String getDateCréation() 
	{
		return DateCréation;
	}

	public void setDateCréation(String dateCréation) 
	{
		DateCréation = dateCréation;
	}
	
}