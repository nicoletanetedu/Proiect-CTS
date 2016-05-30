
public  class Produs {


	String denumire;
	String id;
	double pret;
	public Produs(String denumire, String i, double d) {
		super();
		this.denumire = denumire;
		this.id = i;
		this.pret = d;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public double getPret() {
		return pret;
	}
	public void setPret(float pret) {
		this.pret = pret;
	}
	
	
}
