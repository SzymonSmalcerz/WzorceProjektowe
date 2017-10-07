package smalcerz.stacjameteo.obserwatorzy;

public interface Obserwator {
	public void aktualizacja(float temp, float wiglotnosc, float cisnienie);
}
