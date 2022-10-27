package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	public int money;
	
	public Humain(String nom, String boissonFavorite, int money) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.money=money;
	}

	
	private String prendreParole() {
		return "(" + nom + ") ";
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "- «" + texte + "»");
		}

	
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boissonFavorite;
	}
	
	public int getMoney() {
		return money;
	}
	
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j'aime boire du " + getBoisson() + " !");
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !");
	}
	
	public void gagnerArgent(int gain) {
		money = getMoney() + gain;
	}
	
	public void perdreArgent(int perte) {
		money = getMoney() - perte;
	}
	
	public void acheter(String bien, int prix){
		if (getMoney()<=prix) {
			parler("Je n'ai plus que " + getMoney() + " sous en poche. Je ne peux même pas m'offrir " + bien + " à " + prix + " sous");
		}
		else {
			parler("J'ai " + getMoney() + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			this.perdreArgent(prix);
		}
	}
	
}
