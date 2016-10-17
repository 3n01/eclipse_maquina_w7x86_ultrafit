package ejercicio2;



public class Escritor extends Thread
{
	private Dato datoCompartido;// Referencia al objeto compartido

	public Escritor(Dato compartido)
	{
		super("Escritor");
		datoCompartido = compartido;
	}

	@Override
	public void run()
	{
		for (int i = 0; i < 300; i++)
		{
			try
			{
				Thread.sleep((int) (Math.random() * 31));
				datoCompartido.escribir(i);//Escribe 1,2,3,4,5,6,etc en Dato

			} catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
	}

}
