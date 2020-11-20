package basico;
// La clase es un copyPaste de HiloThreads
public class HiloRunable implements Runnable {
	
	private String valorImprimir;

	public HiloRunable(String valorImprimir) {
		this.valorImprimir = valorImprimir;
	}

	// aqui escribes todo lo que hace el hilo y al acabar muere
	public void run() {
		// aqui nace el hilo
		System.out.println("Arrancando el hilo: " + Thread.currentThread().getName());// obtenemos el nombre del hilo
		for (int i = 0; i < 20; i++) {
			try {
				// este metodo duerme el hilo que este pasando en esta linea dirante un triempo
				// en milisegundos
				Thread.sleep(500);// simulamos una tarea que tarda 500 milisegundos
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println(
					"Hilo: " + Thread.currentThread().getName() + ", dice: " + valorImprimir + " ciclo: " + i + "\n");
		}

		System.out.println("Hilo: " + Thread.currentThread().getName() + " acabado");
		// aqui morira el hilo
	}
}
