package personnages;
import personnages.*;

public class Yakuza extends Humain {
	private String clan;
	private int reputation;
	
	public Yakuza(String nom, String boissonFavorite, int money, String clan, int reputation) {
		super(nom, boissonFavorite, money);
		this.clan=clan;
		this.reputation=4;
	}
	
	public String getClan() {
		return clan;
	}
	
	public int getReput() {
		return reputation;
	}
	
	public void estorquer (Commercant victime) {
		money = money + victime.getMoney();
		victime.seFaireEstorquer();
		parler("J’ai piqué les " + victime.getMoney() + " sous de " + victime.getNom() + ", ce"
				+ " qui me fait " + getMoney() + " sous dans ma poche. Hi ! Hi !");
		reputation++;
	}
	
	public void gagner(int gain) {
		money = money + gain;
		parler("Ce ronin pensait vraiment battre " + getNom() + " du clan de " + getClan() + " ? Je l'ai dépouillé de ses " + gain + " sous");
	}
	
	public void perdre() {
		parler("J’ai perdu mon duel et mes " + money + " sous, snif... J'ai déshonoré le clan de " + clan);
		money = 0;
	}
	
}