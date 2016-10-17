package porInterfaz;

public class Hilo2 implements Runnable
{
	//Atributos de la clase
	private String nombre;
	private int retardo;
	
	//M�todo constructor
	public Hilo2(String nombre, int retardo)
	{
		this.nombre=nombre;
		this.retardo=retardo;
	}

	//M�todo obligatorio por la interfaz
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
