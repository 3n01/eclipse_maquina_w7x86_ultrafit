package ejercicio2;




public class Ejecutor
{
	
	public static void main(String[] args)
	{
		Dato bns=new Dato();
		
		Escritor p=new Escritor(bns);
		Lector c=new Lector(bns);
		
		p.start();
		c.start();
	}

}
