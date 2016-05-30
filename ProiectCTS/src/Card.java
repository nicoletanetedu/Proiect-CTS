
public class Card implements Mod_de_plata{

	String numar;
	String nume;
	String dataexp;
	
	
	public Card(String numar, String nume, String dataexp) {
		super();
		this.numar = numar;
		this.nume = nume;
		this.dataexp = dataexp;
	}


	public String getNumar() {
		return numar;
	}


	public void setNumar(String numar) {
		this.numar = numar;
	}


	public String getNume() {
		return nume;
	}


	public void setNume(String nume) {
		this.nume = nume;
	}


	public String getDataexp() {
		return dataexp;
	}


	public void setDataexp(String dataexp) {
		this.dataexp = dataexp;
	}


	@Override
	public void plateste(double total) {
		// TODO Auto-generated method stub
		System.out.println("S-a ales metoda de plata card");
		System.out.println("Se retrage din cont suma de "+total);
	}
	
	

}
