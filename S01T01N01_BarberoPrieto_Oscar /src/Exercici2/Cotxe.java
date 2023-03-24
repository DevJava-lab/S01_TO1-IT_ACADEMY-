package Exercici2;

public class Cotxe {
	
	// Atributs
	private static final String MARCA ;
	private static String model;
	private final double POTENCIA;

	// Constructor
	
	public Cotxe(double potencia) {
		POTENCIA = potencia;
	}
	

	// Bloc inicialització
	
	static {
		MARCA="SEAT";
	}
	
	
	// Mètodes
	
	public static String getModel() {
		return model;
	}

	public static void setModel(String model) {
		Cotxe.model = model;
	}

	public static String getMarca() {
		return MARCA;
	}

	public double getPOTENCIA() {
		return POTENCIA;
	}

	
	

	
	public static void  frenar() {
		
		System.out.println("El vehicle està frenant");
	}
	
	public void accelerar() {
		
		System.out.println("El vehicle està accelerant");
	}
	
}
