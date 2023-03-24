package Exercici1;

public abstract class Instrument {

	// Atributs
	
	private String nom;
	private double preu;


	// Mètodes

	public abstract void tocar();
	
	
	
	public String getNom() {
		return nom;
	}

	public double getPreu() {
		return preu;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPreu(double preu) {
		this.preu = preu;
	}


}