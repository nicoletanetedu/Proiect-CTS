
public class Corn_cu_vanilie extends CornDecorat{

	public Corn_cu_vanilie(Corn corndecorat) {
		super(corndecorat);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepara() {
		// TODO Auto-generated method stub
		super.prepara();
		adauga_crema(corndecorat);
		
	}
	private void adauga_crema(Corn corndecorat) {
		// TODO Auto-generated method stub
		 System.out.println("Crema de vanilie");
	}

	
}
