package personnages;
import personnages.*;


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
	
	public void provoquer(Yakuza adversaire) {
		parler(" Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand !");
		if (2*honneur > adversaire.getReput()) {
			money = money + adversaire.getMoney();
			parler("Je t’ai eu petit yakusa !");
			adversaire.perdre();
		} else {
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
			adversaire.gagner(money);
			money=0;
		}
	}
	
}
