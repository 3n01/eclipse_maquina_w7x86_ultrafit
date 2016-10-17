package porHerencia;

public class MultiHola
{

	public static void main(String[] args)
	{
		Hilo h1,h2,h3;
		
		//Crear los hilos
		h1=new Hilo("Hilo1 Herencia",(int)(Math.random()*2000));
		h2=new Hilo("Hilo2 Herencia",(int)(Math.random()*2000));
		h3=new Hilo("Hilo3 Herencia",(int)(Math.random()*2000));
		
		//Arrancar los hilos
		h1.start();
		h2.start();
		h3.start();
	}

}
