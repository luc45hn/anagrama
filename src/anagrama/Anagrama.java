package anagrama;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Anagrama {
	private Map<Palabra, Set<Palabra>> anagramas;
	
	public Anagrama() {
		anagramas = new TreeMap<Palabra, Set<Palabra>>();
	}
	
	public void nuevaPalabra(String nuevaPalabra) {
		Palabra palabra = new Palabra(nuevaPalabra);
		if(!anagramas.containsKey(palabra)) {
			Set<Palabra> conjunto = new TreeSet<Palabra>();
			anagramas.put(palabra, conjunto);
		   
			for(Palabra p: anagramas.keySet()) {
				if(palabra.esAnagrama(p) && (!palabra.equals(p))) {
					Set<Palabra> conjuntoPropio = anagramas.get(p);
					conjuntoPropio.add(palabra);
					Set<Palabra> conjuntoExterno = anagramas.get(palabra);
					conjuntoExterno.add(p);
				}  
		   }
		 }
	}
	
	public void mostrarEnConsola() {
		for( Palabra p : anagramas.keySet()) {
			System.out.print(p + "\t (" );
			for (Palabra p2 : anagramas.get(p)) {
				if(!p.equals(p2)) System.out.print(p2 + " ");
			}
			System.out.println(")");
		}
	}
	
	
}
