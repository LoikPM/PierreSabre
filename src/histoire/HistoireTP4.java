package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof;
		prof = new Humain ("Prof","kombucha",54);
		Commercant marco;
		marco = new Commercant("Marco", "thé", 20);
		
//		prof.direBonjour();
//		prof.acheter("une boisson",12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("kimono",50);
		
		marco.direBonjour();
		marco.seFaireEstorquer();
		marco.recevoir(15);
		marco.boire();
	}
	
	
}
