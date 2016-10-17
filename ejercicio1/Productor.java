package ejercicio1;



public class Productor extends Thread
{
	private Bufer ubicacionCompartida;//Referencia al objeto compartido
	
	public Productor(Bufer compartido)
	{
		super("Productor");
		ubicacionCompartida=compartido;
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<5;i++)
		{
			try
			{
	            Thread.sleep( ( int ) ( Math.random() * 3001 ) );
	            ubicacionCompartida.establecer( i );
				
			}
			catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
	}
}
