package porHerencia;

public class Hilo extends Thread
{
	//Atributos de la clase
	private String nombre;
	private int retardo;

	//Método constructor
	public Hilo(String nombre, int retardo)
	{
		this.nombre = nombre;
		this.retardo = retardo;
	}

	//Retrasarla ejecución tanto como indique retardo
	public void run()
	{
		try
		{
			Thread.sleep(retardo);
		} 
		catch (InterruptedException e)
		{

		}
		
		//Imprimir el nombre
		System.out.println("Hola "+nombre+"  " +retardo);
	}

}
