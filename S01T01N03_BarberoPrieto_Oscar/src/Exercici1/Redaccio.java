package Exercici1;

import java.util.*;

public abstract class Redaccio {

	public static ArrayList<Redactor> bbddRedactors = new ArrayList<>();

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		boolean sortir = false;
		int opcioMenu;
		System.out.println("--------MENÚ ---------");
		while (!sortir) {
			System.out.println("\n1. Introduir redactor.");
			System.out.println("2. Eliminar redactor.");
			System.out.println("3. Introduïr notícia a un redactor.");
			System.out.println("4. Eliminar notícia.");
			System.out.println("5. Mostrar totes les notícies per redactor.");
			System.out.println("6. Calcular puntuació de la notícia.");
			System.out.println("7. Calcular preu notícia.");
			System.out.println("8. Sortir.\n");

			try {
				opcioMenu = introNumber("Escull una opció: ");
				switch (opcioMenu) {
				case 1:
					introduirRedactor();
				case 2:
					eliminarRedactor();
				case 3:
					menu2();
				case 4:
					eliminarNoticia();
				case 5:
					getNoticies();
				case 6:
					puntuacioNoticia();
				case 7:
					preuNoticia();
				case 8:
					sortir = true;
				default:
					System.out.println("Solament números entre 1 i 8.\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("Cal ficar un número.\n");
			}
		}
	}

	public static void menu2() {
		boolean sortir = false;
		int opcioMenu;
		System.out.println("Tipo de notícia : ");
		while (!sortir) {
			System.out.println("\n1. Futbol.");
			System.out.println("2. Bàsquet.");
			System.out.println("3. Tenis.");
			System.out.println("4. Fórmula 1.");
			System.out.println("5. Motociclisme.");
			System.out.println("6. Sortir.\n");

			try {
				opcioMenu = introNumber("Escull una opció: ");
				switch (opcioMenu) {
				case 1:
					addNoticiaFutbol();
				case 2:
					addNoticiaBasquet();
				case 3:
					addNoticiaTenis();
				case 4:
					addNoticiaF1();
				case 5:
					addNoticiaMotociclisme();
				case 6:
					sortir = true;
				default:
					System.out.println("Solament números entre 1 i 6.\n");
				}
			} catch (InputMismatchException e) {
				System.out.println("Cal ficar un número.\n");
			}
		}
	}

	public static void introduirRedactor() {

		bbddRedactors.add(new Redactor(introWord("Nom editor : "), introWord("DNI : ")));

	}

	public static int buscarRedactor(String dni) {

		int posicio = 0;
		if (bbddRedactors.size() > 0) {

			for (int i = 0; i < bbddRedactors.size(); i++) {

				if (bbddRedactors.get(i).getDNI().equals(dni))
					posicio = (i);
			}
		} else {
			System.out.println("No existeix la base de dades.");
		}
		return posicio;
	}

	public static void eliminarRedactor() {

		int posicio = buscarRedactor(introWord("Dni : "));

		bbddRedactors.remove(bbddRedactors.get(posicio));

	}

	public static void addNoticiaFutbol() {

		Futbol futbol = new Futbol(introWord("Titular : "), introWord("Competició : "), introWord("Club : "),
				introWord("Jugador : "));

		int posicio = buscarRedactor(introWord("Dni del reporter : "));
		Redactor reporter = bbddRedactors.get(posicio);
		reporter.addNoticia(futbol);
	}

	public static void addNoticiaBasquet() {

		Basquet basquet = new Basquet(introWord("Titular : "), introWord("Competició : "), introWord("Club : "));

		int posicio = buscarRedactor(introWord("Dni del reporter : "));
		Redactor reporter = bbddRedactors.get(posicio);
		reporter.addNoticia(basquet);
	}

	public static void addNoticiaTenis() {

		Tenis tenis = new Tenis(introWord("Titular : "), introWord("Competició : "), introWord("Jugador : "));

		int posicio = buscarRedactor(introWord("Dni del reporter : "));
		Redactor reporter = bbddRedactors.get(posicio);
		reporter.addNoticia(tenis);
	}

	public static void addNoticiaF1() {

		F1 f1 = new F1(introWord("Titular : "), introWord("Escuderia : "));

		int posicio = buscarRedactor(introWord("Dni del reporter : "));
		Redactor reporter = bbddRedactors.get(posicio);
		reporter.addNoticia(f1);
	}

	public static void addNoticiaMotociclisme() {

		Motociclisme motos = new Motociclisme(introWord("Titular : "), introWord("Escuderia : "));

		int posicio = buscarRedactor(introWord("Dni del reporter : "));
		Redactor reporter = bbddRedactors.get(posicio);
		reporter.addNoticia(motos);
	}

	public static void eliminarNoticia() {

		int posicio = buscarRedactor(introWord("Dni : "));
		String news = introWord("Titular : ");
		Redactor reporter = bbddRedactors.get(posicio);

		if (reporter.getBbddNoticies().size() > 0) {

			for (int i = 0; i < reporter.getBbddNoticies().size(); i++) {

				if (reporter.getBbddNoticies().get(i).getTitular().equals(news))
					reporter.getBbddNoticies().remove(i);

			}
		} else {
			System.out.println("No existeix la base de dades.");
		}
	}

	public static Noticia recuperarNoticia() {

		int posicio = buscarRedactor(introWord("Dni : "));
		String news = introWord("Titular : ");
		Noticia noticia = null;
		Redactor reporter = bbddRedactors.get(posicio);

		if (reporter.getBbddNoticies().size() > 0) {

			for (int i = 0; i < reporter.getBbddNoticies().size(); i++) {

				if (reporter.getBbddNoticies().get(i).getTitular().equals(news))
					noticia = reporter.getBbddNoticies().get(i);

			}
		} else {
			System.out.println("No existeix la base de dades.");
		}
		return noticia;
	}

	public static void getNoticies() {

		int posicio = buscarRedactor(introWord("Dni : "));
		Redactor reporter = bbddRedactors.get(posicio);

		if (reporter.getBbddNoticies().size() > 0) {

			for (Noticia news : reporter.getBbddNoticies()) {

				System.out.println(news);

			}
		} else {
			System.out.println("No existeix la base de dades.");
		}
	}

	public static void puntuacioNoticia() {

		Noticia noticia = recuperarNoticia();
		System.out.println(noticia.calcularPuntuacio());
	}

	public static void preuNoticia() {

		Noticia noticia = recuperarNoticia();
		System.out.println(noticia.calcularPreuNoticia());
	}

	public static String introWord(String missatge) {
		Scanner sc = new Scanner(System.in);
		System.out.println(missatge);
		return sc.next();
	}

	public static int introNumber(String missatge) {
		Scanner sc = new Scanner(System.in);
		System.out.println(missatge);
		return sc.nextInt();
	}
}