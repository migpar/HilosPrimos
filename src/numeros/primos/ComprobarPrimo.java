package numeros.primos;

import java.util.Date;

public class ComprobarPrimo implements Runnable {

	private long num;

	public ComprobarPrimo(long num) {
		this.num = num;
	}

	public void run() {
		long inicio = new Date().getTime();
		String resultado = " Es primo";
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				resultado = " Nos es primo";
				break;
			}
		}
		long duracion = new Date().getTime() - inicio;
		System.out.println("El numero: " + num + resultado + " duracion: " + duracion + " milisegundos");
	}

}
