
public class Factory {
	
	public Produs_panificatie fabrica_produs(String tip)
	{
		if(tip==null)
		{
			return null;
		}
		if(tip.equalsIgnoreCase("Paine")){
			return new Paine();
		}else 
			if(tip.equalsIgnoreCase("covrigi"))
			{
				return new Covrigi();
			}
			else 
				if(tip.equalsIgnoreCase("cornuri"))
				{
					return new Cornuri();
				}
					
		
		return null;
	}

}
