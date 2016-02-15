
public class Programme {

	public static void main(String[] args) 
	{
		
		/*
		Etudiant e1=new Etudiant("Jules");
		Etudiant e2=new Etudiant("Jean");
		Etudiant e3=new Etudiant("Simon");
		Etudiant e4=new Etudiant("Albert");
		
		System.out.println(e1.getNoMa()+"-"+e1.getNom());
		System.out.println(e2.getNoMa()+"-"+e2.getNom());
		System.out.println(e3.getNoMa()+"-"+e3.getNom());
		System.out.println(e4.getNoMa()+"-"+e4.getNom());
		
		
		
		Voiture v1=new Voiture("Seat","Leon",25566526,15449.52);
		Voiture v2=new Voiture("VW","Sharan",156255,49012);
		v1.CalculPrixReel(18);
		v1.Afficher();
		v2.CalculPrixReel(35);
		v2.Afficher();
		
		Point x=new Point('x',2.78);
		x.Afficher();
		x.Translate(54.26);
		x.Afficher();
		*/
		
		
		Cadena cad1=new Cadena(1234);
		Coffre cof1=new Coffre(cad1);
		Cle cle1=new Cle(1234);
		cof1.OuvrirCoffre(cle1);
	}

}
