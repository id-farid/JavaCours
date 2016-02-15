
public class Cadena 
{
	private int combi;
	private boolean ouvert=false;
	
	public Cadena(int combi)
	{
		this.combi=combi;
	}

	public int getCombi() {
		return combi;
	}

	public void setCombi(int combi) {
		this.combi = combi;
	}
	public boolean OuvrirCadna(Cle c1)
	{
		int code=c1.getCombi();
		if(code==this.combi)
		{
			ouvert=true;
			System.out.println("Cadena ouvert...");
		}
		else
		{
			System.out.println("Combinaison incorrecte...");
		}
		return ouvert;
	}

	public boolean isOuvert() {
		return ouvert;
	}
	
	
}
