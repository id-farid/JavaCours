
public class Point 
{
	private char nom;
	private double abcisse;
	
	
	//Constructeur
	
	public Point(char name, double abcisse)
	{
		this.nom=name;
		this.abcisse=abcisse;
	}
	public void Afficher()
	{
		System.out.println("Nom : "+this.nom);
		System.out.println("Abcisse : "+abcisse);
	}
	
	//deplacer les axes
	public void Translate(double abci)
	{
		this.abcisse=abci;
		
	}
	
	
	
	
}
