package histoire;
import personnages.*;


public class HistoireTP4 {
	
	public static void main(String[] args) {
		Humain prof;
		prof = new Humain ("Prof","kombucha",54);
		Commercant marco;
		marco = new Commercant("Marco", "thé", 20);
		Yakuza yaku;
		yaku = new Yakuza("Yaku le Noir","whisky",30,"Warsong",4);
		Ronin roro;
		roro = new Ronin("Roro","shocku",60,1);
		
//		prof.direBonjour();
//		prof.acheter("une boisson",12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("kimono",50);
		
//		marco.direBonjour();
//		marco.seFaireEstorquer();
//		marco.recevoir(15);
//		marco.boire();

//		yaku.direBonjour();
//		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
//		yaku.parler(" Marco, si tu tiens à la vie donne moi ta bourse !");
//		yaku.estorquer(marco);

//		roro.direBonjour();
//		roro.donner(marco);

		roro.provoquer(yaku);
		
	}
	
	
}
