
public class Cash implements Mod_de_plata {
	
	String nume;
	String adresa;
	String telefon;
	
	
	
	public Cash(String nume, String adresa, String telefon) {
		super();
		this.nume = nume;
		this.adresa = adresa;
		this.telefon = telefon;
	}



	public String getNume() {
		return nume;
	}



	public void setNume(String nume) {
		this.nume = nume;
	}



	public String getAdresa() {
		return adresa;
	}



	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}



	public String getTelefon() {
		return telefon;
	}



	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}



	@Override
	public void plateste(double total) {
		// TODO Auto-generated method stub
		System.out.println("S-a ales metoda de plata ramburs");
	}

}
