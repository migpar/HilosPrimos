package basico;

public class PruebaHiloThread {

	
	public static void main(String[] args) {
		
		//Podemos crear un objeto hilo con new
		//este objeto sera capaz de aarancar un hilo
		HiloThreads hilo1 = new HiloThreads("valor 1");
		hilo1.setName("Hilo1");//le ponemos nombre al hilo
		
		HiloThreads hilo2 = new HiloThreads("valor 2");
		hilo2.setName("Hilo2");//le ponemos nombre al hilo
		
		try {
			//Duerme el hilo que pase por aqui durante un tiempo
			//en este caso, siempre sera el main
			System.out.println("Esperando 5 segundos a arrancar");
			Thread.sleep(5000);//5 segundos
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		hilo1.start();
		hilo2.start();
		System.out.println("hilo principal parando");
		
	
	}
}
