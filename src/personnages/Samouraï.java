package personnages;

public class Samouraï extends Humain {
	private String seigneur;
	
	public Samouraï(String nom, String boissonFavorite, String seigneur, int money) {
		super(nom, boissonFavorite, money);
		this.seigneur=seigneur;
	}
	
	public String getSeigneur() {
		return seigneur;
	}
	
	
	@Override
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j'aime boire du " + getBoisson() + " !\nJe suis fier de servir le seigneur " + getSeigneur() + "\n");
	}
	
	
	public void boire(String boisson) {
		parler("Qu'est-ce que je vais choisir comme boisson ? Tiens je vais prendre " + boisson + ".\n");
	}
}