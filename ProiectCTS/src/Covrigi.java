import java.util.Date;

public class Covrigi extends Eticheta implements Produs_panificatie {

	int gramaj;
	String tip_produs;
	String producator;
	Date datafab;
	Date dataexp;
	String ingrediente;
	double pret;
	
	
	public Covrigi(){
	
	}
	
	
	
	public double getPret() {
		return pret;
	}



	public void setPret(double pret) {
		this.pret = pret;
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



	public void creeaza_eticheta() {
		// TODO Auto-generated method stub
		setGramaj(300);
		setTip_produs("Covrigi");
		setProducator("SC.SABUS SRL");
		setDatafab(new Date());
		setDataexp(new Date());
		int date=datafab.getDay();
		dataexp.setDate(date);
		setIngrediente("Faina, sare, apa, drojdie, seminte");
		setPret(0.70);
		
	}



	@Override
	public void prepara() {
		// TODO Auto-generated method stub
		lipeste_eticheta();
		
	}



	@Override
	void lipeste_eticheta() {
		// TODO Auto-generated method stub
		creeaza_eticheta();
		System.out.println("Produs de "+getProducator());
		System.out.println("Tip produs: "+tip_produs);
		System.out.println("Masa neta "+getGramaj());
		System.out.println("Ingrediente  "+getIngrediente());
		System.out.println("Produs la "+getDatafab());
		System.out.println("Expira la "+getDataexp());
		System.out.println("Pret "+getPret());

	}
	

}
