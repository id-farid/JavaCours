
public class Coffre 
{
	private Cadena cad;
	public Coffre(Cadena cad)
	{
		this.cad=cad;
	}
	public void EtatCoffre()
	{
		if(cad.isOuvert())
		{
			System.out.println("Coffre ouvert...");
		}
		else
		{
			System.out.println("Coffre fermé...");
		}
	}
	public void OuvrirCoffre(Cle clef)
	{
		if(cad.OuvrirCadna(clef))
		{
			System.out.println("Coffre ouvert...");
		}
		else
		{
			System.out.println("Coffre fermé...");
		}
	}
}
