
public class Voiture 
{
	//Attributs
	private String marque;
	private String model;
	private Long nSerie;
	private double prixCat;
	private double prixReel;
	
	//Constructeurs
	public Voiture(String mar, String mod, long nSer, double pCat)
	{
		this.marque=mar;
		this.model=mod;
		this.nSerie=nSer;
		this.prixCat=pCat;
	}
	
	public Voiture()
	{
		
	}
	
	public String getMarque() {
		return marque;
	}


	public void setMarque(String marque) {
		this.marque = marque;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public Long getnSerie() {
		return nSerie;
	}


	public void setnSerie(Long nSerie) {
		this.nSerie = nSerie;
	}


	public double getPrixCat() {
		return prixCat;
	}


	public void setPrixCat(double prixCat) {
		this.prixCat = prixCat;
	}


	public double getPrixReel() {
		return prixReel;
	}


	public void CalculPrixReel(double taux) {
		// Calcul du prix reel sur base du prix catalogue et du taux de redution
		if ((0<=taux)&&(taux<=25)) 
		{
			this.prixReel=this.prixCat-((this.prixCat*taux)/100);
		}
		else 
		{
			System.out.println("Le taux doit etre compris entre 0 et 25 %");
			this.prixReel=this.prixCat;
		}
		
	}
	public void Afficher() {
		// Afficher l'ensemble de des information de la voiture
		System.out.println(this.marque);
		System.out.println(this.model);
		System.out.println(this.nSerie);
		System.out.println(this.prixCat);
		System.out.println(this.prixReel);
	}
	
	
	
	
	

}
