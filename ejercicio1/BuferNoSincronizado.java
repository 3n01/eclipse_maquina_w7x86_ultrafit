package ejercicio1;



public class BuferNoSincronizado implements Bufer
{
	private int bufer=-1;//compartido por los procesos 
	
	public void establecer(int valor)
	{
		System.out.println(Thread.currentThread().getName() +" escribe "+valor);
		bufer=valor;
	}
	
	public int obtener()
	{
		System.out.println(Thread.currentThread().getName()+ " lee "+ bufer);
		return bufer;
		
	}
}
