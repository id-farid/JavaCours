
public class Point 
{
	private double x,y;
	
	//Initialiser les axes
	public void Init()
	{
		this.x=0;
		this.y=0;
	}
	
	//deplacer les axes
	public void Deplacer(double abs, double ord)
	{
		this.x=abs;
		this.y=ord;
	}
	
	//Afficher les axes
	public void Afficher()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	
}
