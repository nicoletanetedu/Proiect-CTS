import java.util.*;

public class Cos_cumparaturi {
	
	List<Produs> cos=new ArrayList<Produs>();
	
	public void adauga(Produs e){
		cos.add(e);
	}
	
	public void sterge(Produs p)
	{
		cos.remove(p);
	}
	
	public double total()
	{
		double suma=0;
		for(Produs p:cos)
		{
			suma+=p.getPret();
		}
		return suma;
		
	}
	public void plateste(Mod_de_plata mod)
	{
		mod.plateste(total());
	}

}
