package Exercici1;

public class Motociclisme extends Noticia {

	private String escuderia;

	public Motociclisme(String titular, String escuderia) {
		super(titular);
		this.escuderia=escuderia;
		super.puntuacio = calcularPuntuacio();
		super.preu = 100;
	}

	public int calcularPreuNoticia() {

		int preuEscuderia = 0;

		if (escuderia.equalsIgnoreCase("Honda") || escuderia.equalsIgnoreCase("Yamaha"))
			preuEscuderia = 50;

		return super.preu + preuEscuderia;
	}

	public int calcularPuntuacio() {

		int valor = 3;

		if (escuderia.equalsIgnoreCase("Honda") || escuderia.equalsIgnoreCase("Yamaha"))
			valor = 3;

		return valor;
	}

	public String getEscuderia() {
		return escuderia;
	}

	public void setEscuderia(String escuderia) {
		this.escuderia = escuderia;
	}

	@Override
	public String toString() {
		return super.toString() + "Motociclisme [escuderia=" + escuderia + "]";
	}

}
