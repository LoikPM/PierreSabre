package personnages;
import personnages.*;

public class Traître extends Samouraï {
	public int traitrise = 0;
	public Traître(String nom, String boissonFavorite, String seigneur, int money, int traitrise) {
		super(nom, boissonFavorite, seigneur, money);
		this.traitrise=traitrise;
	}
	
	@Override
	public void direBonjour(){
		parler("Bonjour ! Je m’appelle " + getNom() + " et j'aime boire du " + getBoisson() + " !\n"
				+ "Je suis fier de servir le seigneur " + getSeigneur() + "\n"
				+ "Mais je suis un traître et mon niveau de traîtrise est : " + traitrise +". Chut !\n");
	}
	
	public void ranconner(Commercant victime) {
		if (this.traitrise < 3) {
		int argentRanconne = victime.getMoney()*2/10;
		this.gagnerArgent(argentRanconne);
		victime.perdreArgent(argentRanconne);
		this.parler(" Si tu veux ma protection contre les Yakuzas, il va falloir payer ! "
				+ "Donne-moi " + argentRanconne +" sous ou gare à toi !\n");
		victime.parler("Tout de suite grand " + this.getNom() + ".\n");
		traitrise++;
		} else {
			parler(" Mince je ne peux plus rançonner personne sinon un samouraï risque de me démasquer !\n");
		}
	}
}