import java.util.Date;

public class Paine extends Eticheta implements Produs_panificatie{

	int gramaj;
	String tip_produs="";
	String producator;
	Date datafab;
	Date dataexp;
	String ingrediente;
	double pret;
	
	public Paine(){}
	
	
	
	/*public void seteazaeticheta()
	{
		this.gramaj=300;
		producator="SC.SABUS SRL";
		this.datafab=new Date();
		this.dataexp=new Date();
		int date=datafab.getDay();
		dataexp.setDate(date);
		this.ingrediente="Faina, sare, apa, drojdie";
		
		System.out.println("Produs de "+producator);
		System.out.println("Masa neta "+gramaj);
		System.out.println("Ingrediente  "+ingrediente);
		System.out.println("Produs la "+datafab);
		System.out.println("Expira la "+dataexp);
		
		
	}*/
	

	@Override
	
	void creeaza_eticheta() {
		// TODO Auto-generated method stub
		this.gramaj=300;
		this.tip_produs="Paine";
		this.producator="SC.SABUS SRL";
		this.datafab=new Date();
		this.dataexp=new Date();
		int date=datafab.getDay()+3;
		dataexp.setDate(date);
		this.ingrediente="Faina, sare, apa, drojdie";
		setPret(1.00);
		
	}

	public int getGramaj() {
		return gramaj;
	}



	public void setGramaj(int gramaj) {
		this.gramaj = gramaj;
	}



	public String getTip_produs() {
		return tip_produs;
	}



	public void setTip_produs(String tip_produs) {
		this.tip_produs = tip_produs;
	}



	public String getProducator() {
		return producator;
	}



	public void setProducator(String producator) {
		this.producator = producator;
	}



	public Date getDatafab() {
		return datafab;
	}



	public void setDatafab(Date datafab) {
		this.datafab = datafab;
	}



	public Date getDataexp() {
		return dataexp;
	}



	public void setDataexp(Date dataexp) {
		this.dataexp = dataexp;
	}



	public String getIngrediente() {
		return ingrediente;
	}



	public void setIngrediente(String ingrediente) {
		this.ingrediente = ingrediente;
	}



	public double getPret() {
		return pret;
	}



	public void setPret(double pret) {
		this.pret = pret;
	}



	@Override
	void lipeste_eticheta() {
		// TODO Auto-generated method stub
		creeaza_eticheta();
		System.out.println("Produs de "+producator);
		System.out.println("Tip produs: "+tip_produs);
		System.out.println("Masa neta "+gramaj);
		System.out.println("Ingrediente  "+ingrediente);
		System.out.println("Produs la "+datafab);
		System.out.println("Expira la "+dataexp);
		System.out.println("Pret: "+getPret());

	}
	
	@Override
	public void prepara() {
		//System.out.println()
		//System.out.println("S-a preparat "+tip_produs);
		lipeste_eticheta();
		
	}

}
