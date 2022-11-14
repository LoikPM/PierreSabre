package personnages;

public class Humain {
	private String nom;
	private String boissonFavorite;
	public int money;
	public int nbConnaissances = 0;
	private String[] memoire=new String[30];
	
	public Humain(String nom, String boissonFavorite, int money) {
		this.nom=nom;
		this.boissonFavorite=boissonFavorite;
		this.money=money;
	}

	//____________________________________GETTERS__________________________________________________
	
	public String getNom() {
		return nom;
	}
	
	public String getBoisson() {
		return boissonFavorite;
	}
	
	public int getMoney() {
		return money;
	}
	
	//_________________________________PARLER______________________________________________________
	
	private String prendreParole() {
		return "(" + nom + ") ";
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "- " + texte);
		}
	
	public void direBonjour() {
		parler("Bonjour ! Je m’appelle " + getNom() + " et j'aime boire du " + getBoisson() + " !");
	}
	
	//_________________________________BOIRE______________________________________________________
	
	public void boire() {
		parler("Mmmm, un bon verre de " + getBoisson() + " ! GLOUPS !");
	}
	
	
	//_________________________________ARGENT_____________________________________________________
	
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
	
	
	//________________________________MEMOIRE______________________________________________________
	
	public void memoriser(Humain autreHumain) {
		if (nbConnaissances < memoire.length) {
			memoire[nbConnaissances]=autreHumain.getNom();
			nbConnaissances+=1;
		} else {
			for (int i=0; i<(memoire.length-1); i++) {
				memoire[i]=memoire[i+1];
			}
			memoire[memoire.length-1]=autreHumain.getNom();
		}		
	}

	public void repondre(Humain autreHumain){
		this.direBonjour();
		memoriser(autreHumain);
	}
	
	public void faireConnaissanceAvec(Humain autreHumain) {
		System.out.printf("Le " + this.getClass() + " rencontre le " + autreHumain.getClass());
		this.direBonjour();
		autreHumain.repondre(this);
		this.memoriser(autreHumain);
		
	}
	
	public void listerConnaissance() {
		System.out.print("\n");
		System.out.printf("(" + this.getNom() + ") - Je connais beaucoup de monde dont :");
		for (int i=0; i<nbConnaissances; i++) {
			if (i==nbConnaissances-1) {
				System.out.printf(" %s.", memoire[i]);
			} else {
				System.out.printf(" %s,", memoire[i]);
			}
		}
	}
}
