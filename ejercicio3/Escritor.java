package ejercicio3;



public class Escritor extends Thread
{
	private Almacen objetoAlmacen;// Referencia al objeto compartido
	private int [] vector={1,1,1,1,1}; //Vector inicial antes de ser manipulado por el Productor
	private int escrituras=0;//Recoje el número de accesos del productor
	
	public Escritor(Almacen compartido)
	{
		super("Escritor");
		objetoAlmacen = compartido;
	}

	@Override
	public void run()
	{	
		
		for (int i = 0; i < 600; i++)
		{
			try
			{

				Thread.sleep((int) (Math.random() * 10));
				
				//Intercambio posiciones
				intercambiaPosicionesP(vector);
			
				objetoAlmacen.escribir(vector);

			} catch (InterruptedException e)
			{
				// TODO: handle exception
			}
		}
		System.out.println("El número de escrituras es "+escrituras);
	}
	
	//Método que intercambia las posiciones según el enunciado
	public void intercambiaPosicionesP(int [] vector)
	{
		
		for (int i=0; i<vector.length; i++)
		{
			//Si se encuentra un 1 y no estamos en la última posición
			if (vector[i]==1 && i<4)
			{
				vector[i+1]=1;//Se pone un 1 en la siguiene posición
				escrituras++;
				break;//Y se sale del bucle
			}
		}
		
	}

}
