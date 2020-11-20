package numeros.primos;

import java.util.Scanner;

public class ClasePrincipal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introdudca tres numero a analizar");
		System.out.println("Numero 1: ");
		long n1 = Long.parseLong(sc.nextLine());
		System.out.println("Numero 2: ");
		long n2 = Long.parseLong(sc.nextLine());
		System.out.println("Numero 3: ");
		long n3 = Long.parseLong(sc.nextLine());
		
		ComprobarPrimo hilo1 = new ComprobarPrimo(n1);
		Thread t1 = new Thread(hilo1);
		ComprobarPrimo hilo2 = new ComprobarPrimo(n2);
		Thread t2 = new Thread(hilo2);	
		ComprobarPrimo hilo3 = new ComprobarPrimo(n3);
		Thread t3 = new Thread(hilo3);
		
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Fin del hilo principal");
	}

}
