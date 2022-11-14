package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFavorite, int money) {
		super(nom, boissonFavorite, money);
	}

	
	public void recevoir(int argent) {
		money = getMoney() + argent;
		parler(argent + " sous ! Je te remercie, généreux donateur !");
	}
	
	public int seFaireEstorquer() {
		money = 0;
		parler("J’ai tout perdu ! Le monde est trop injuste...");
		return 0;
	}
	
}