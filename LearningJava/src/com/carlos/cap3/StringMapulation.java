package com.carlos.cap3;

import com.carlos.cap3.utils.Pais;

public class StringMapulation {
	public static void main(String[] args) {
		// Seccion para concatenacion
		System.out.println("Concatenacion #1: " + 2 + "1");
		System.out.println(1 + 2 + " " + "c");
		
		String s = "1";
		s += "2";
		s += 3;
		System.out.println("Concatenacion #3: " + s);
		
		// Seccion para inmutabilidad
		Pais elSalvador = new Pais("El Salvador", "America", "Paz");
		
		hacerAlgo(s);
		System.out.println("Cadena s: " + s);
		hacerAlgo(elSalvador);
		System.out.println("Pais elSalvador: " + elSalvador.getNombre() + " - " + elSalvador.getContinente());
		
		// Seccion para manejo de String Pool
		String s1 = "pajarito";
		String s2 = "perro";
		String s3 = "casa";
		String s4 = new String("Pajarito");
		System.out.println("[String Pool]: s1.equals(s4): " + s1.equalsIgnoreCase(s4));
		System.out.println("[String Pool]: s1 == s4: " + (s1 == s4));
		System.out.println("[String Pool]: s1.equals(s2): " + s1.equals(s2));
		System.out.println("[String Pool]: s1 == s2: " + (s1 == s2));
		
		// Seccion Metodos de Cadenas
		String animalsInfo = " a n i m a l s ";
		String indexInfo =   "0 1 2 3 4 5 6 7";
		String animals = "animals    ";
		System.out.println("[Metodos de Cadenas]: animals.length(): " + animals.length());
		System.out.println("[Metodos de Cadenas]: animals.charAt(3): " + animals.charAt(3));
		System.out.println("[Metodos de Cadenas]: animals.indexOf('i'): " + animals.indexOf('i'));
		System.out.println("[Metodos de Cadenas]: animals.indexOf('a'): " + animals.indexOf('a'));
		System.out.println("[Metodos de Cadenas]: animals.substring(0,5): " + animals.substring(0,5));
		System.out.println("[Metodos de Cadenas]: animals.substring(animals.length()-3,animals.length()): " + animals.substring(animals.length()-3,animals.length()));
		System.out.println("[Metodos de Cadenas]: animals.toUpperCase(): " + animals.toUpperCase());
		System.out.println("[Metodos de Cadenas]: animals.startsWith(): " + animals.startsWith("ani"));
		System.out.println("[Metodos de Cadenas]: animals.endsWith(): " + animals.endsWith("als"));
		System.out.println("[Metodos de Cadenas]: animals.contains(): " + animals.contains("mal"));
		System.out.println("[Metodos de Cadenas]: animals.replace(): " + animals.replace("a","x"));
		System.out.println("[Metodos de Cadenas]: animals.trim(): " + animals.trim());
		String nuevaCadena = animals.toUpperCase().substring(3).trim();
		System.out.println("[Metodos de Cadenas]: nuevaCadena: " + nuevaCadena);

		String cuentas = "10001;10002;10003;10004;";
		String[] arrayCuentas = cuentas.split(";");
		for(String cuenta : arrayCuentas) {
			System.out.println("[Metodos de Cadenas]: [split] cuenta: " + cuenta);
		}
		
		
		String name = "Fluffy";
		String name2 = new String("Fluffy");
	}
	
	public static void hacerAlgo(String a) {
		a = a + " - Hola Mundo";
		System.out.println("Cadena a: " + a);
	}
	
	public static void hacerAlgo(Pais p) {
		p = new Pais("Reino Unido", "Europa", "Paz");
		System.out.println("Pais p: " + p.getNombre() + " - " + p.getContinente());
	}
}
