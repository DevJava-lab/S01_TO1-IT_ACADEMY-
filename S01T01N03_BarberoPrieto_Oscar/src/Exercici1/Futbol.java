package Exercici1;

public class Futbol extends Noticia {

	private String competicio;
	private String club;
	private String jugador;

	public Futbol(String titular, String competicio, String club, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.club = club;
		this.jugador = jugador;
		super.puntuacio = calcularPuntuacio();
		super.preu = 300;
	}

	public int calcularPreuNoticia() {

		int preuCompeticio = 0;
		int preuClub = 0;
		int preuJugador = 0;
		
		if (competicio.equalsIgnoreCase("Lliga de Campions"))
			preuCompeticio = 100;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
			preuClub = 100;
		if (jugador.equalsIgnoreCase("Torres") || jugador.equalsIgnoreCase("Benzema"))
			preuJugador = 50;

		return super.preu + preuCompeticio + preuClub + preuJugador;
	}

	public int calcularPuntuacio() {

		int valor = 5;
		
		if (competicio.equalsIgnoreCase("Lliga de Campions"))
			valor = 3;
		if (competicio.equalsIgnoreCase("Lliga"))
			valor = 2;
		if (club.equalsIgnoreCase("Barça") || club.equalsIgnoreCase("Madrid"))
			valor = 1;
		if (jugador.equalsIgnoreCase("Torres") || jugador.equalsIgnoreCase("Benzema"))
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

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return super.toString() + " Futbol [competicio=" + competicio + ", club=" + club + ", jugador=" + jugador + "]";
	}

}
