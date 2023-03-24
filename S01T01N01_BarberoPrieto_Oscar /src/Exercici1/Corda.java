package Exercici1;

public class Corda extends Instrument {


	// Constructors


	public Corda() {
		super();

	}

	// Mètode implementat

	@Override
	public void tocar() {

		System.out.println("Està sonant un instrument de corda");

	}

	// Bloc inicialització

	{
		tocar();
	}

}
