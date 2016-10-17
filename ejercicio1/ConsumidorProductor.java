package ejercicio1;

public class ConsumidorProductor
{

	public static void main(String[] args)
	{
		BuferNoSincronizado bns=new BuferNoSincronizado();
		
		Productor p=new Productor(bns);
		Consumidor c=new Consumidor(bns);
		
		p.start();
		c.start();
	}

}
