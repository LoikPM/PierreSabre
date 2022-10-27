package personnages;

public class Ronin extends Humain {
	private int honneur;
	
	public Ronin(String nom, String boissonFavorite, int money, int honneur) {
		super(nom, boissonFavorite, money);
		this.honneur = 1;
	}
	
	public void donner(Commercant beneficiaire) {
		parler(beneficiaire.getNom() + ", prends ces " + money/10 + " sous.");
		beneficiaire.recevoir(money/10);
		money = money / 10;
	}
}
