package anagrama;

public class MainAnagrama {

	public static void main(String[] args) {
		String[] palabras = new String[]{"amor", "astro", "caso", "cosa", "lió", "lío", "mora", "olí", "ostra", "ramo", "roma", "saco"};
		System.out.println("Relaciones:");
		Anagrama anagrama = new Anagrama();
		for (String palabra: palabras) {
			anagrama.nuevaPalabra(palabra);
		}
		anagrama.mostrarEnConsola();
	}

}
