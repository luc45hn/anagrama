package anagrama;

import java.util.Arrays;

public class Palabra implements Comparable<Palabra> {

	private String cadena;
	private String signatura;
	  
	public Palabra(String p) {
		cadena = p.toLowerCase();
		char [] s = p.toCharArray();
		Arrays.sort(s);
		signatura = new String(s);
	}
	
	public boolean esAnagrama(Palabra p) {
		return signatura.equals(p.signatura);
	}
	
	public boolean equals(Object p) {
		return cadena.equalsIgnoreCase(((Palabra) p).getPalabra());
	}
	
	public int hashCode() {
		return cadena.hashCode();
	}
	
	public String toString() {
		String std = new String(cadena);
		return std;  
	}
	
	@Override
	public int compareTo(Palabra s) {
		return cadena.compareToIgnoreCase(s.cadena);
	}
	 
	public String getPalabra() {
		return cadena;
	}
	
	public String getSignatura() {
		return signatura;
	}
	
	
}
