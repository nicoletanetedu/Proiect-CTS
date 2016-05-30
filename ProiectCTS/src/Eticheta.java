
public abstract class Eticheta {
	
	abstract void creeaza_eticheta();
	abstract void lipeste_eticheta();
	
	public final void ambaleaza(){
		creeaza_eticheta();
		
		lipeste_eticheta();
	}

}
