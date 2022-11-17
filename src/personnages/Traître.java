package personnages;
import personnages.*;

public class Traître extends Samouraï {
	public int traitrise = 0;
	public Traître(String nom, String boissonFavorite, String seigneur, int money) {
		super(nom, boissonFavorite, seigneur, money);
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
	
	public void faireLeGentil() {
			if (nbConnaissances<1) {
				parler("Je ne peux faire ami ami avec personne car je ne connais personne ! Snif.\n");
			} else {
				int don = this.getMoney() / 20;
				Humain ami = this.memoire[nbConnaissances-1];
				String nomAmi = ami.getNom();
				parler("Il faut absolument remonter ma cote de confiance. Je vais faire ami-ami avec "
						+ nomAmi + ".\n");
				parler("Bonjour l'ami, je voudrais vous aider en vous donnant " + don + " sous.\n");
				ami.gagnerArgent(don);
				this.perdreArgent(don);
				ami.parler("Merci " + this.getNom() + ". Vous êtes quelqu'un de bien.\n");
				if (traitrise>1) {
					traitrise--;
				}
			}
	}
}