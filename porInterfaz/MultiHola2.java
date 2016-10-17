package porInterfaz;

public class MultiHola2
{

	public static void main(String[] args)
	{
		//Crear objetos de la clase Hilo2
		Hilo2 h1,h2,h3;
		
		//Instanciarlos
		h1=new Hilo2("Hilo1 Interfaz",(int)(Math.random()*2000));
		h2=new Hilo2("Hilo2 Interfaz",(int)(Math.random()*2000));
		h3=new Hilo2("Hilo3 Interfaz",(int)(Math.random()*2000));
		
		//Arrancarlos
		new Thread(h1).start();
		new Thread(h2).start();
		new Thread(h3).start();

	}

}
