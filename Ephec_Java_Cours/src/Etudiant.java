
public class Etudiant {

	
	private String nom;
	private int noMa;
	
	//Compteur d�fini au niveau de la classe
	private static int cptNoMa=0;
	
	public boolean equals()
	{
		return true;
	}
	
	public Etudiant(String nom)
	{
		this.nom=nom;
		this.noMa=cptNoMa++;
		
	}

	public String getNom() {
		return nom;
	}

	public int getNoMa() {
		return noMa;
	}
	
	

}
