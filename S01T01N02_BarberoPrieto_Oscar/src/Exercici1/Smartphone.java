package Exercici1;

public class Smartphone extends Telefon implements Camera, Rellotge {

	public Smartphone() {

	}

	@Override
	public void alarma() {

		System.out.println("Està sonant l'alarma");
	}

	@Override
	public void fotografiar() {

		System.out.println("S'està fent una foto");
	}

}
