package com.formation.model;

public class ClientModel 
{
	int id, fixe, mobile;
	String Nom, Pr�nom, Adresse, DateCr�ation, Email, Remarques;
	boolean CarteFid�lit�;
	
	public ClientModel(int id, int fixe, int mobile, String nom, String pr�nom, String adresse, String dateCr�ation,
			String email, String remarques, boolean carteFid�lit�) {
		super();
		this.id = id;
		this.fixe = fixe;
		this.mobile = mobile;
		this.Nom = nom;
		this.Pr�nom = pr�nom;
		this.Adresse = adresse;
		this.DateCr�ation = dateCr�ation;
		this.Email = email;
		this.Remarques = remarques;
		this.CarteFid�lit� = carteFid�lit�;
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

	public String getPr�nom() 
	{
		return Pr�nom;
	}

	public void setPr�nom(String pr�nom) 
	{
		Pr�nom = pr�nom;
	}

	public boolean getCarteFid�lit�() 
	{
		return CarteFid�lit�;
	}

	public void setCarteFid�lit�(boolean carteFid�lit�) 
	{
		CarteFid�lit� = carteFid�lit�;
	}

	public String getDateCr�ation() 
	{
		return DateCr�ation;
	}

	public void setDateCr�ation(String dateCr�ation) 
	{
		DateCr�ation = dateCr�ation;
	}
	
}