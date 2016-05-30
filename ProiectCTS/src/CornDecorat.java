
public abstract class CornDecorat implements Corn{
	
	protected Corn corndecorat;
	
	public CornDecorat(Corn corndecorat)
	{
		this.corndecorat=corndecorat;
	}
	
	public void prepara()
	{
		corndecorat.prepara();
	}

}
