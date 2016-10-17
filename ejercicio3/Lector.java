package ejercicio3;


public class Lector extends Thread
{
	private Almacen objetoAlmacen;
	private int lecturas=0; //Recoje el n�mero de accesos del consumidor
	private int [] vector;//Vector local que ser� manipulado

	public Lector(Almacen compartido)
	{
		super("Lector");
		this.objetoAlmacen = compartido;

	}

	@Override
	public void run()
	{
		
		for (int i = 0; i < 600; i++)
		{
			try
			{
				Thread.sleep((int) (Math.random() * 10));	
			
				this.vector=objetoAlmacen.leer();
				
				//Alterar el vector
				intercambioPosiciones(vector);
				
				
				

			}
			catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
		
		System.out.println("El n�mero de lecturas es "+lecturas);
	}
	
	//M�todo intercambia posiciones+
	public void intercambioPosiciones(int [] vector)
	{
		
		for (int i=0; i<vector.length; i++)
		{
			if (vector[i]==1)
			{
				ruedaIzquierda(vector);
				vector[4]=0;
				lecturas++;
				break;
			}
		}
		
	}
	
	//M�todo que corre hacia la izquierda todos los elementos
	public void ruedaIzquierda(int []vector)
	{
		
		for (int i=0; i<vector.length-1; i++)
		{
			vector[i]=vector[i+1];
		}
		
	}
}
