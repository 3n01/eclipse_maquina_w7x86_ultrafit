package ejercicio2;



public class Lector extends Thread
{
	private Dato datoCompartido;
	private int datoLeido=-2;//Es imposible que se repita para que el primero "siempre lea bien"
	private int correctos = 0;//El primero siempre lo leer� bien
	

	public Lector(Dato compartido)
	{
		super("Lector");
		datoCompartido = compartido;
		
	}

	@Override
	public void run()
	{

		int datoTemporal;
		for (int i = 0; i < 300; i++)
		{
			try
			{
				Thread.sleep((int) (Math.random() * 31));
				datoTemporal=datoCompartido.leer();
						
				//Si el �ltimo dato es diferente al pen�ltimo, la lectura es correcta
				if (datoLeido!=datoTemporal)correctos++;
				
				//Igualar el �ltimo al pen�ltimo
				datoLeido=datoTemporal;
				

			}
			catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
		
		System.out.println("El n�mero de lecturas correctas es: "+correctos);
	}
}
