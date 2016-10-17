package ejercicio1;



public class Consumidor extends Thread
{
	private Bufer ubicacionCompartida;
	
	public Consumidor(Bufer compartido)
	{
		super("Consumidor");
		ubicacionCompartida=compartido;
		
	}
	
	@Override
	public void run()
	{
		int acumulador=0;
		
		for(int i=0; i<5;i++)
		{
			try
			{
	            Thread.sleep( ( int ) ( Math.random() * 3001 ) );
	            acumulador+=ubicacionCompartida.obtener();
				
			}
			catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
	}

}
