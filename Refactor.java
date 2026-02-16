package Entornos;

import java.util.Scanner;

public class Refactor {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce tu nombre, por favor:");
		String nombre1 = sc.nextLine();
		System.out.println("Hola " + nombre1 + "!");
		boolean name = false;
		int tipo1;
		while (!name) {
			System.out.println("\nElige una opción " + nombre1 + "\n\n1. Positivo - Negativo\n"
					+ "2. Par - Impar \n3. Arrays\n4. Factorial\n5. Salir\n*--------------------*");
			tipo1 = sc.nextInt();
			switch (tipo1) {
			case 1:
				positivoNegativo();
				break;

			case 2:
				parImpar();
				break;
			case 3:
				Scanner teclado = new Scanner(System.in);
				arrays(teclado);
				break;
			case 4:
				factorialMenu();
				break;
			case 5:
				name = mensaje();
				break;
			default:
				System.out.println("\nIntroduzca una opción válida.");
				break;
			}
		}
	}

	private static boolean mensaje() {
		boolean name;
		System.out.println("Gracias por usar el programa");
		name = true;
		return name;
	}
	/**
	 * Pide un número y muestra su factorial
	 */
	private static void factorialMenu() {
		System.out.println("Introduce un número entero para calcular su factorial:");
		int factorial = sc.nextInt();
		int factorial2 = calculafactorial(factorial);
		System.out.println("El factorial de " + factorial + " es " + factorial2);
	}
/**
 * Genera dos arrays y muestra su multiplicación
 */
	private static void arrays(Scanner teclado) {
		System.out.println("Introduce el tamaño del array (entre 2 y 15): ");
		int tamaño = sc.nextInt();
		while (tamaño <= 0 || tamaño > 15) {
			System.out.println("Introduce un número válido (entre 2 y 15):");
			tamaño = teclado.nextInt();
		}
		int[] num = new int[tamaño];
		int[] num2
		= new int[tamaño];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 100);
		}
		for (int i = 0; i < num2.length; i++) {
			num2[i] = (int) (Math.random() * 100);
		}
		int[] aws = new int[tamaño];
		for (int i = 0; i < num.length; i++) {
			aws[i] = num[i] * num[i];
			System.out.println("El producto de " + num[i] + " * " + num2[i] + " es " + aws[i]);
		}
	}
	/**
	 * Comprueba si un número es par o impar
	 */
	private static void parImpar() {
		System.out.println("Introduce un número entero: ");
		int numero2 = sc.nextInt();
		if (numero2 % 2 == 0) {
			System.out.println(numero2 + " es par.");
		} else {
			System.out.println(numero2 + " es impar.");
		}
	}
	/**
	 * Comprueba si un número es positivo o negativo
	 */
	private static void positivoNegativo() {
		System.out.println("Introduce un número entero: ");
		int numero1 = sc.nextInt();
		if (numero1 >= 0) {
			System.out.println(numero1 + " es positivo.");
		} else {
			System.out.println(numero1 + " es negativo.");
		}
	}
	/**
	 * Calcula el factorial de un número
	 */
	static int calculafactorial(int numero) {
		if (numero == 1) {
			return 1;
		}
		return numero * calculafactorial(numero - 1);
	}
}