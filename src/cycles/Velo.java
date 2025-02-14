package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet; 
	private double diamRoue;
	private Random genAlea;
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public Velo (double braquet, double diamRoue) {
		this.braquet = braquet;
		this.diamRoue = diamRoue;
		genAlea = new Random();
	}
	
	public Velo (double braquet) {
		this.braquet = braquet;
		genAlea = new Random();
	}
	
	public Velo () {
		braquet = DEFAUT_BRAQUET;
		genAlea = new Random();
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	public double getBraquet() {
		return braquet;
	}
	
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public String toString() {
		return "Velo [braquet=" + braquet + ", diamRoue=" + diamRoue + "]";
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale * braquet * diamRoue * genAlea.nextDouble();
	}
	
	public static void main(String[] args) {
		
		Velo velo1 = new Velo(15, 34);
		Velo velo2 = new Velo(12);
		Velo velo3 = new Velo();
		
		System.out.println(velo1);
		System.out.println(velo2);
		System.out.println(velo3);
		
		velo1.setBraquet(DEFAUT_BRAQUET);
		velo1.setDiamRoue(2);
		
		System.out.println("\nBraquet : " + velo1.getBraquet());
		System.out.println("Diametre Roue : " + velo1.getDiamRoue());
		System.out.println("Aléatoire : " + velo1.getGenAlea().nextDouble());
		System.out.println("Puissance : " + velo1.getPuissance(1000000));
		
	}
}
