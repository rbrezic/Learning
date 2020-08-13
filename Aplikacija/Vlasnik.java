package edunova;

public class Vlasnik {
	private int sifra;
	private String ime;
	private String prezime;
	private String kontakt;
	private String oib;
	private String spol;
	
	
	public Vlasnik(int sifra, String ime, String prezime, String kontakt, String oib, String spol) {
		super();
			this.sifra   = sifra;
			this.ime     = ime;
			this.prezime = prezime;
			this.kontakt = kontakt;
			this.oib     = oib;
			this.spol    = spol;
	}

	public Vlasnik(){
		
	}

	public int getSifra() {
		return sifra;
	}

	public void setSifra(int sifra) {
		this.sifra = sifra;
	}
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}


	public String getPrezime() {
		return prezime;
	}


	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getKontakt() {
		return kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}

	public String getOib() {
		return oib;
	}

	public void setOib(String oib) {
		this.oib = oib;
	}

	public String getSpol() {
		return spol;
	}

	public void setSpol(String spol) {
		this.spol = spol;
	}
	
	@Override
	public String toString() {
		
		return prezime + " " + ime;
	}

}
