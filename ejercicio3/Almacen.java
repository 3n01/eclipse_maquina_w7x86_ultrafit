package ejercicio3;

public class Almacen 
{
	public int [] bufer ;// compartido por los procesos

	public void escribir(int [] datos)
	{
	
		//Igualar el bufer a los datos
		this.bufer=datos;
		
		//Mostrar quién ha alterado el array y el propio array
		System.out.println(Thread.currentThread().getName() +" ha escrito ->");
		muestraBufer();
		
	}

	public int [] leer()
	{
		
		//Mostrar quién ha alterado el array y el propio array
		System.out.println(Thread.currentThread().getName() +" ha leido y alterado a  ->");
		muestraBufer();
		
		//Mostrar quién ha alterado el array y el propio array	
		return this.bufer;

	}
	
	//Método que escribe en pantalla el contenido del búfer
	public void muestraBufer()
	{
		for(int i=0; i<bufer.length; i++)
		{
			System.out.print(bufer[i] + " ");
		}
		
		System.out.println();
	}
	
	

}
