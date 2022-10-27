package personnages;
import personnages.Commercant;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int money, String clan, int reputation) {
		super(nom, boissonFavorite, money);
		this.clan=clan;
		this.reputation=0;
	}
	
	
	
	public void estorquer (Commercant victime) {
		money = money + victime.getMoney();
		victime.seFaireEstorquer();
		parler("J’ai piqué les " + victime.getMoney() + " sous de " + victime.getNom() + ", ce"
				+ " qui me fait " + getMoney() + " sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
}