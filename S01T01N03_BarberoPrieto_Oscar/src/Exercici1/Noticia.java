package Exercici1;

public abstract class Noticia {

	protected String titular;
	protected static String text;
	protected int puntuacio;
	protected int preu;

	public Noticia(String titular) {
		this.titular = titular;
		puntuacio = 0;
		preu=0;
	}

	public abstract int calcularPreuNoticia();
	
	public abstract int calcularPuntuacio();

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getText() {
		return text;
	}

	static {
		
		text = "";
	}

	public int getPuntuacio() {
		return puntuacio;
	}

	public void setPuntuacio(int puntuacio) {
		this.puntuacio = puntuacio;
	}

	public int getPreu() {
		return preu;
	}

	public void setPreu(int preu) {
		this.preu = preu;
	}

	@Override
	public String toString() {
		return "Noticia [titular=" + titular + ", puntuacio=" + puntuacio + ", preu=" + preu + "]";
	}
}
