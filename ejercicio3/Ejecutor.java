package ejercicio3;



public class Ejecutor
{
	
	public static void main(String[] args)
	{
		Almacen bns=new Almacen();
		
		Escritor p=new Escritor(bns);
		Lector c=new Lector(bns);
		
		p.start();
		c.start();
	}

}
