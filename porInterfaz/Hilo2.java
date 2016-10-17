package porInterfaz;

public class Hilo2 implements Runnable
{
	//Atributos de la clase
	private String nombre;
	private int retardo;
	
	//Método constructor
	public Hilo2(String nombre, int retardo)
	{
		this.nombre=nombre;
		this.retardo=retardo;
	}

	//Método obligatorio por la interfaz
	public void run()
	{
		try
		{
			Thread.sleep(retardo);
		}
		catch (InterruptedException e)
		{
			
		}
		
		System.out.println("Hola "+nombre+" "+retardo);
		
	}

}
