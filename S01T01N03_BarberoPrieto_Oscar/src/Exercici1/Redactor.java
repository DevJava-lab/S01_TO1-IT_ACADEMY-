package Exercici1;

import java.util.ArrayList;

public class Redactor {

	private String nom;
	private final String DNI;
	private static int sou;
	private ArrayList<Noticia> bbddNoticies;

	public Redactor(String nom, String dni) {
		this.nom = nom;
		this.DNI = dni;
		bbddNoticies = new ArrayList<>();
	}

	public void addNoticia(Noticia noticia) {
		bbddNoticies.add(noticia);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDNI() {
		return DNI;
	}

	public static int getSou() {
		return sou;
	}

	static {
		sou = 1500;
	}
	

	public ArrayList<Noticia> getBbddNoticies() {
		return bbddNoticies;
	}

	public void setBbddNoticies(ArrayList<Noticia> bbddNoticies) {
		this.bbddNoticies = bbddNoticies;
	}

	@Override
	public String toString() {
		return "Redactor [nom=" + nom + ", dni=" + DNI + ", sou=" + sou + "]";
	}

}
