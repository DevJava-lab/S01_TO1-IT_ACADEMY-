package Exercici1;

public class F1 extends Noticia {

	private String escuderia;

	public F1(String titular, String escuderia) {
		super(titular);
		this.escuderia=escuderia;
		super.puntuacio = calcularPuntuacio();
		super.preu = 100;
	}

	public int calcularPreuNoticia() {

		int preuEscuderia = 0;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes"))
			preuEscuderia = 50;

		return super.preu + preuEscuderia;
	}

	public int calcularPuntuacio() {

		int valor = 4;

		if (escuderia.equalsIgnoreCase("Ferrari") || escuderia.equalsIgnoreCase("Mercedes"))
			valor = 2;

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
		return super.toString() + "F1 [escuderia=" + escuderia + "]";
	}

}
