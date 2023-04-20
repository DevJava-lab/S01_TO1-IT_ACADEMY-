package Exercici1;

public class Basquet extends Noticia {

	private String competicio;
	private String club;

	public Basquet(String titular, String competicio, String club) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		super.puntuacio = calcularPuntuacio();
		super.preu = 250;
	}

	@Override
	public int calcularPreuNoticia() {

		int preuCompeticio = 0;
		int preuClub = 0;
		if (competicio.equalsIgnoreCase("Eurolliga"))
			preuCompeticio = 75;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
			preuClub = 75;

		return super.preu + preuCompeticio + preuClub;
	}

	public int calcularPuntuacio() {

		int valor = 4;

		if (competicio.equalsIgnoreCase("Eurolliga"))
			valor = 3;
		if (competicio.equalsIgnoreCase("ACB"))
			valor = 2;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
			valor = 1;

		valor = 1;

		return valor;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	@Override
	public String toString() {
		return super.toString() + "Basquet [competicio=" + competicio + ", club=" + club + "]";
	}

}
