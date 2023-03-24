package Exercici1;

public class Percussio extends Instrument {


	// Constructors

	public Percussio() {
		super();

	}

	// Mètode implementat

	@Override
	public void tocar() {

		System.out.println("Està sonant un instrument de percussio");

	}

	// Bloc inicialització

	{
		tocar();
	}

}
