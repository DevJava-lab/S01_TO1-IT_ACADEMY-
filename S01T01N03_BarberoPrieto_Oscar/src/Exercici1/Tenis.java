package Exercici1;

public class Tenis extends Noticia {

	private String competicio;
	private String jugador;

	public Tenis(String titular, String competicio, String jugador) {
		super(titular);
		this.competicio = competicio;
		this.jugador = jugador;
		super.puntuacio = calcularPuntuacio();
		super.preu = 150;
	}

	public int calcularPreuNoticia() {

		int preuJugador = 0;

		if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal")
				|| jugador.equalsIgnoreCase("Djokovic"))
			preuJugador = 100;

		return super.preu + preuJugador;
	}

	public int calcularPuntuacio() {

		int valor = 4;

		if (jugador.equalsIgnoreCase("Federer") || jugador.equalsIgnoreCase("Nadal")
				|| jugador.equalsIgnoreCase("Djokovic"))
			valor = 3;

		return valor;
	}

	public String getCompeticio() {
		return competicio;
	}

	public void setCompeticio(String competicio) {
		this.competicio = competicio;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	@Override
	public String toString() {
		return super.toString() + "Tenis [competicio=" + competicio + ", jugador=" + jugador + "]";
	}

}
