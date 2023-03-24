package Exercici1;

public class Vent extends Instrument {

	// Constructors

	public Vent() {
		super();

	}

	// Mètode implementat

	@Override
	public void tocar() {

		System.out.println("Està sonant un instrument de vent");

	}

	// Bloc inicialització

	{
		tocar();
	}

}
