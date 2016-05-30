
public class Program {

	public static void main(String[]args)
	{
		Factory panificatie=new Factory();
		
		Paine paine=(Paine)panificatie.fabrica_produs("Paine");
		Covrigi covrigi=(Covrigi)panificatie.fabrica_produs("Covrigi");
		Cornuri cornuri=(Cornuri)panificatie.fabrica_produs("Cornuri");
		//Produs_panificatie p1=panificatie.getProdus_panificatie("Paine");
		
		///Produs_panificatie p2=panificatie.getProdus_panificatie("Covrigi");
		
		//p1.prepara();
		
		//p2.prepara();
		paine.prepara();
		System.out.println("------------------------------------");

		covrigi.prepara();
		System.out.println("------------------------------------");

		cornuri.prepara();
		
		Produs p11=new Produs(paine.getTip_produs(),"1",paine.getPret());
		Produs p12=new Produs(covrigi.getTip_produs(),"2",covrigi.getPret());
		Produs p3=new Produs(cornuri.getTip_produs(),"3",cornuri.getPret());
		Produs p4=new Produs("mere","1",2.5);
		
		
		Cos_cumparaturi cosc=new Cos_cumparaturi();
		cosc.adauga(p11);
		cosc.adauga(p12);
		cosc.adauga(p3);
		cosc.adauga(p4);
		
		Card card=new Card("5555666223365","Moisescu","16/16");
		System.out.println("------------------------------------");

		cosc.plateste(card);
		
		Corn corn=new Cornuri();
		
		Corn corn_ciocolata=new Corn_cu_ciocolata(new Cornuri());
		
		Corn corn_vanilie=new Corn_cu_vanilie(new Cornuri());
		
		Corn corn_gem=new Corn_cu_gem(new Cornuri());
		
		corn.prepara();
		
		System.out.println("------------------------------------");
		corn_ciocolata.prepara();
		System.out.println("------------------------------------");

		corn_vanilie.prepara();
		System.out.println("------------------------------------");

		corn_gem.prepara();
		
		System.out.println("Modulul de producere a aluatului");
		System.out.println("------------------------------------");

		
		Malaxor m=new Malaxor();
		m.prepara_aluat("Paine");
		System.out.println("------------------------------------");

		
		m.prepara_aluat("Covrigi");
		System.out.println("------------------------------------");

		
		m.prepara_aluat("Cornuri");
		System.out.println("------------------------------------");

		
	}
}
