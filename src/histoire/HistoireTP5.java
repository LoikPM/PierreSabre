package histoire;

import personnages.*;

public class HistoireTP5 {
	public static void main(String[] args) {
		 Commercant marco; 
		 marco = new Commercant("Marco", "thé", 20);
		 Commercant chonin;
		 chonin = new Commercant("Chonin","thé", 40);
		 Commercant kumi;
		 kumi = new Commercant("Kumi","thé", 10);
		 Yakuza yaku;
		 yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong", 0);
		 Ronin roro;
		 roro = new Ronin("Roro", "shochu", 60, 1);
		
		 marco.faireConnaissanceAvec(roro);
		 marco.faireConnaissanceAvec(yaku);
		 marco.faireConnaissanceAvec(chonin);
		 marco.faireConnaissanceAvec(kumi);
		 
		 marco.listerConnaissance();
		 roro.listerConnaissance();
		 yaku.listerConnaissance();
	}
}