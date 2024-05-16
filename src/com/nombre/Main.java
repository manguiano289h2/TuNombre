package com.nombre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Escribe tu nombre: ");
		
		String nombre = scanner.next();
		
		System.out.println("Hola " + nombre + ", perteneces a la generación del futuro.");
	}
}
