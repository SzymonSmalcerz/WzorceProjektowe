package smalcerz.kaczka;

public abstract class Kaczka {

	protected LatanieInterface latanieInterface;
	protected KwakanieInterface kwakanieInterface;
	
	
	public abstract void wyswietl();
	
	public void lec() {
		latanieInterface.lec();
	}
	
	public void kwacz() {
		kwakanieInterface.kwacz();
	}
	
	public void plywaj() {
		System.out.println("Wszystkie kaczki plywaja ! :o");
	}
	
	
};
