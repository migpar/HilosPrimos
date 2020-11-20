package basico;

public class PruebaHiloRunable {

	public static void main(String[] args) {
		// Creamos un objeto que implemente Runnable
		HiloRunable hilo1 = new HiloRunable("Valor 1");

		// Creamos un objeto de tipo Thread (que es realmente el objeto que
		// es capaz de crear hilos) y le pasamos un objeto de tipo Runnable
		Thread t1 = new Thread(hilo1);
		
		//ahora trabajamos con el onjeto de tipo Thread ( que es el objeto que es capaz de 
		//crear hilos 

		HiloRunable hilo2 = new HiloRunable("Valor 1");

		// Creamos un objeto de tipo Thread (que es realmente el objeto que
		// es capaz de crear hilos) y le pasamos un objeto de tipo Runnable
		Thread t2 = new Thread(hilo2);
		
		try {
			//Duerme el hilo que pase por aqui durante un tiempo
			//en este caso, siempre sera el main
			System.out.println("Esperando 5 segundos a arrancar");
			Thread.sleep(5000);//5 segundos
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		t1.start();
		t2.start();
		System.out.println("hilo principal parando");
		
	}

}
