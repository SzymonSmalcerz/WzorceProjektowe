package smalcerz.stacjameteo.podmiot;

import smalcerz.stacjameteo.obserwatorzy.*;

public interface Podmiot {
	public void zarejestrujObserwatora(Obserwator obserwator);
	public void usunObserwatora(Obserwator obserwator);
	public void powiadomObserwatorow();
}
