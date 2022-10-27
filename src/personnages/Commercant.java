package personnages;
import personnages.Humain;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boissonFavorite, int money) {
		super(nom, boissonFavorite, money);
	}
	
	
	
	public void recevoir(int argent) {
		money = getMoney() + argent;
	}
	
	public int seFaireEstorquer() {
		money = 0;
		System.out.printf("J’ai tout perdu ! Le monde est trop injuste...\n");
		return 0;
	}
	
}