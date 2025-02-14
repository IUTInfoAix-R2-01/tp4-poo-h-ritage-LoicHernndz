package cycles;

public class VeloElec extends Velo{

	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	
	public VeloElec(double braquet, double diamRoue, double coupleMoteur) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = coupleMoteur; 
	}
	
	public VeloElec(double braquet, double diamRoue) {
		super(braquet, diamRoue);
		facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public VeloElec() {
		super();
		facteurPuissanceMoteur = DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getDEFAUT_COUPLE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public void setDEFAUT_COUPLE_MOTEUR(double DEFAUT_COUPLE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = DEFAUT_COUPLE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur=" + facteurPuissanceMoteur + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale) * facteurPuissanceMoteur;
	}
	
	public static void main(String[] args) {
		VeloElec veloElec1 = new VeloElec(15, 34, 84000);
		VeloElec veloElec2 = new VeloElec(12, 3);
		VeloElec veloElec3 = new VeloElec();
		
		System.out.println(veloElec1);
		System.out.println(veloElec2);
		System.out.println(veloElec3);
		
		veloElec1.setFacteurPuissanceMoteur(DEFAUT_FACTEUR_PUISSANCE_MOTEUR);
		
		System.out.println("\nBraquet : " + veloElec1.getBraquet());
		System.out.println("Diametre Roue : " + veloElec1.getDiamRoue());
		System.out.println("Aléatoire : " + veloElec1.getGenAlea().nextDouble());
		System.out.println("facteurPuissanceMoteur : " + veloElec1.getFacteurPuissanceMoteur());
		System.out.println("Puissance : " + veloElec1.getPuissance(1000000));
	}

}
