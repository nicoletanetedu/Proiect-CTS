
public class Malaxor {
	
	Apa a;
	Faina f;
	Zahar z;
	Drojdie d;
	Sare s;
	Seminte sem;
	Crema c;
	
	
	public Malaxor()
	{
		a=new Apa();
		f=new Faina();
		z=new Zahar();
		d=new Drojdie();
		s=new Sare();
		sem=new Seminte();
		c=new Crema();
	}
	
	public void prepara_aluat(String produs)
	{
		System.out.println("Se prepara "+produs+"...");
		if(produs.equalsIgnoreCase("paine"))
		{
			a.seteazaApa(3);
			f.seteazaFaina(6);
			z.seteazaZahar(100);
			d.seteazaDrojdia(150);
			s.seteazaSare(100);	
			sem.seteazaSeminte(0);
			c.seteazaCrema(0);
			
		}
		else if(produs.equalsIgnoreCase("Covrigi"))
		{
			a.seteazaApa(3);
			f.seteazaFaina(6);
			z.seteazaZahar(150);
			d.seteazaDrojdia(150);
			s.seteazaSare(100);
			sem.seteazaSeminte(50);
			c.seteazaCrema(0);
		}
		else if(produs.equalsIgnoreCase("Cornuri"))
		{
			a.seteazaApa(3);
			f.seteazaFaina(6);
			z.seteazaZahar(1000);
			d.seteazaDrojdia(150);
			s.seteazaSare(100);
			sem.seteazaSeminte(0);
			c.seteazaCrema(50);
		}
	}

}
