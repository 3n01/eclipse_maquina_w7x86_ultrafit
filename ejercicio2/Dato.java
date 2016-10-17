package ejercicio2;

public class Dato 
{
	private int datoCompartido = -1;// compartido por los procesos,valor inicial -1
	private int escrituras=0;

	public void escribir(int valor)
	{
		escrituras++;
		System.out.println("Escrituras :"+escrituras);
		datoCompartido = valor;
	}

	public int leer()
	{
		
		return datoCompartido;

	}
}
